package com.example.epidemicscenarioapplication.view.fragment;


import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.epidemicscenarioapplication.R;
import com.example.epidemicscenarioapplication.adapter.WikipediaDiagnoseAdapter;
import com.example.epidemicscenarioapplication.base.BaseFragment;
import com.example.epidemicscenarioapplication.domain.API;
import com.example.epidemicscenarioapplication.domain.DiagnoseDataBean;
import com.example.epidemicscenarioapplication.presenter.impl.RumorPresenter;
import com.example.epidemicscenarioapplication.utils.Constants;
import com.example.epidemicscenarioapplication.utils.RetrofitManager;
import com.example.epidemicscenarioapplication.utils.ToastUtil;
import com.example.epidemicscenarioapplication.view.IRumorView;
import com.example.epidemicscenarioapplication.view.activity.EpidemicMapActivity;

import java.net.HttpURLConnection;
import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * @author sly
 * @version 1.0
 * @date 2020/6/28
 * @description com.example.epidemicscenarioapplication.view.fragment
 */
public class RumorFragment extends BaseFragment implements IRumorView {
    private static final String TAG = "RumorFragment";
    private RumorPresenter mRumorPresenter;
    private RecyclerView mRvDiagnoseList;
    private WikipediaDiagnoseAdapter mWikipediaDiagnoseAdapter;

    @Override
    protected void initListener() {

    }

    @Override
    protected void initData() {
        RetrofitManager instance = RetrofitManager.getInstance(Constants.BASE_URL);
        Retrofit retrofit = instance.getRetrofit();
        API api = retrofit.create(API.class);
//        返回20条数据
        Call<DiagnoseDataBean> diagnoseList = api.getDiagnoseList(20);
        diagnoseList.enqueue(new Callback<DiagnoseDataBean>() {
            @Override
            public void onResponse(Call<DiagnoseDataBean> call, Response<DiagnoseDataBean> response) {
                Log.d(TAG, "onResponse: 百科知识检查返回码==>" + response.code());
                if (response.code() == HttpURLConnection.HTTP_OK) {
                    String s = response.body().toString();
                    Log.d(TAG, "onResponse: 百科知识检查==>" + s);
                    ArrayList<DiagnoseDataBean.DataBean.DocsBean> docsBeans;
//                    返回的就是docs集合对象
                    docsBeans = (ArrayList<DiagnoseDataBean.DataBean.DocsBean>) response.body().getData().getDocs();
                    mWikipediaDiagnoseAdapter = new WikipediaDiagnoseAdapter();
                    Log.d(TAG, "onResponse: 对象");
                    Log.d(TAG, "initListener: 监听");
                    mWikipediaDiagnoseAdapter.setOnItemListener(position -> {
                        Intent intent = new Intent(mRootView.getContext(), EpidemicMapActivity.class);
                        intent.putExtra("url",docsBeans.get(position).getH5url());
                        startActivity(intent);
                    });

                    mWikipediaDiagnoseAdapter.setDataBeans(docsBeans);
                    //设置布局管理器
                    LinearLayoutManager manager = new LinearLayoutManager(mRootView.getContext());
                    manager.setOrientation(LinearLayoutManager.VERTICAL);
                    mRvDiagnoseList.setLayoutManager(manager);

//设置分割线
                    mRvDiagnoseList.addItemDecoration(new RecyclerView.ItemDecoration() {
                        @Override
                        public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
                            outRect.bottom = 10;
                            outRect.top = 10;
                            outRect.left = 25;
                            outRect.right = 25;
                        }
                    });

//设置动画
                    mRvDiagnoseList.setItemAnimator(new DefaultItemAnimator());
//设置Adapter
                    mRvDiagnoseList.setAdapter(mWikipediaDiagnoseAdapter);

                }
            }

            @Override
            public void onFailure(Call<DiagnoseDataBean> call, Throwable t) {
                Log.d(TAG, "onFailure: 百科知识检查请求失败==>" + t.getMessage());
            }
        });
    }

    @Override
    protected void initPresenter() {
        mRumorPresenter = new RumorPresenter(this);
    }

    @Override
    protected void initView() {
        mRvDiagnoseList = mRootView.findViewById(R.id.rv_DiagnoseList);
    }

    @Override
    protected int getResId() {
        return R.layout.rumor_fragment;
    }

    @Override
    public void showSuccessView() {
        Log.d(TAG, "showSuccessView: 加载成功");
        ToastUtil.showToast(mRootView.getContext(), "数据加载成功");
    }

    @Override
    public void showErrorTips() {
        Log.d(TAG, "showSuccessView: 加载失败");
        ToastUtil.showToast(mRootView.getContext(), "数据加载失败");
    }
}

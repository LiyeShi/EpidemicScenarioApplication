package com.example.epidemicscenarioapplication.view.fragment;

import android.graphics.Rect;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.epidemicscenarioapplication.adapter.WikipediaPageFragmentAdapter;
import com.example.epidemicscenarioapplication.base.BaseFragment;
import com.example.epidemicscenarioapplication.databinding.FragmentWikipediaDiagnosisBinding;
import com.example.epidemicscenarioapplication.domain.API;
import com.example.epidemicscenarioapplication.domain.WikipediaDataBean;
import com.example.epidemicscenarioapplication.presenter.impl.RumorPresenter1;
import com.example.epidemicscenarioapplication.utils.ConstantsUtils;
import com.example.epidemicscenarioapplication.utils.RetrofitManager;
import com.example.epidemicscenarioapplication.view.IRumorPager1View;
import com.example.epidemicscenarioapplication.view.activity.PageLoadingActivity;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * @author sly
 * @version 1.0
 * @date 2020/7/6
 * @description com.example.epidemicscenarioapplication.view.fragment
 */
public class WikipediaDiagnosisPageFragment extends BaseFragment implements IRumorPager1View {

    private static final String TAG = "RumorFragment";
    private RumorPresenter1 mRumorPresenter;
    private WikipediaPageFragmentAdapter mWikipediaDiagnoseAdapter;
    private LinearLayout mTengxun1FragmentBindingRoot;
    private FragmentWikipediaDiagnosisBinding mTengxun1FragmentBinding;

    @Override
    protected void initListener() {

    }

    @Override
    protected void initData() {
        Log.d(TAG, "initData: 百科详情页初始化数据");
        RetrofitManager instance = RetrofitManager.getInstance(ConstantsUtils.BASE_URL);
        Retrofit retrofit = instance.getRetrofit();
        API api = retrofit.create(API.class);
//        返回20条数据
        Call<WikipediaDataBean> diagnoseList = api.getDiagnoseList(20);
        diagnoseList.enqueue(new Callback<WikipediaDataBean>() {
            @Override
            public void onResponse(Call<WikipediaDataBean> call, Response<WikipediaDataBean> response) {
                Log.d(TAG, "onResponse: 百科知识检查返回码==>" + response.code());
                if (response.code() == HttpURLConnection.HTTP_OK) {
                    String s = response.body().toString();
                    Log.d(TAG, "onResponse: 百科知识检查==>" + s);
                    ArrayList<WikipediaDataBean.DataBean.DocsBean> docsBeans;
//                    返回的就是docs集合对象
                    docsBeans = (ArrayList<WikipediaDataBean.DataBean.DocsBean>) response.body().getData().getDocs();
                    mWikipediaDiagnoseAdapter = new WikipediaPageFragmentAdapter();
                    Log.d(TAG, "onResponse: 对象");
                    Log.d(TAG, "initListener: 监听");
                    mWikipediaDiagnoseAdapter.setOnItemListener(position -> {
                        PageLoadingActivity.start(mTengxun1FragmentBindingRoot.getContext(),docsBeans.get(position).getH5url());
                    });

                    mWikipediaDiagnoseAdapter.setDataBeans(docsBeans);
                    //设置布局管理器
                    LinearLayoutManager manager = new LinearLayoutManager(mTengxun1FragmentBindingRoot.getContext());
                    manager.setOrientation(LinearLayoutManager.VERTICAL);
                    mTengxun1FragmentBinding.rvDiagnoseList.setLayoutManager(manager);

//设置分割线
                    mTengxun1FragmentBinding.rvDiagnoseList.addItemDecoration(new RecyclerView.ItemDecoration() {
                        @Override
                        public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
                            outRect.bottom = 10;
                            outRect.top = 10;
                            outRect.left = 25;
                            outRect.right = 25;
                        }
                    });

//设置动画
                    mTengxun1FragmentBinding.rvDiagnoseList.setItemAnimator(new DefaultItemAnimator());
//设置Adapter
                    mTengxun1FragmentBinding.rvDiagnoseList.setAdapter(mWikipediaDiagnoseAdapter);
                    setViewState(ViewState.SUCCESS);

                }
            }

            @Override
            public void onFailure(Call<WikipediaDataBean> call, Throwable t) {
                Log.d(TAG, "onFailure: 百科知识检查请求失败==>" + t.getMessage());
                setViewState(ViewState.ERROR);
            }
        });
    }

    @Override
    protected void initPresenter() {
        mRumorPresenter = new RumorPresenter1(this);
    }

    @Override
    protected void initView() {

    }

    @Override
    protected View getSuccessView(LayoutInflater inflater, ViewGroup container) {
        mTengxun1FragmentBinding = FragmentWikipediaDiagnosisBinding.inflate(inflater, container, false);
        mTengxun1FragmentBindingRoot = mTengxun1FragmentBinding.getRoot();
        return mTengxun1FragmentBindingRoot;
    }


//    @Override
//    public void showSuccessView() {
//        Log.d(TAG, "showSuccessView: 加载成功");
////        ToastUtil.showToast(mSuccessView.getContext(), "数据加载成功");
//    }
//
//    @Override
//    public void showErrorTips() {
//        Log.d(TAG, "showSuccessView: 加载失败");
////        ToastUtil.showToast(mSuccessView.getContext(), "数据加载失败");
//    }


    @Override
    public void showSuccessView(List list) {

    }

    @Override
    public void showErrorView() {

    }
}

package com.example.epidemicscenarioapplication.view.fragment;

import android.content.Intent;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.epidemicscenarioapplication.R;
import com.example.epidemicscenarioapplication.adapter.WikipediaPageFragmentAdapter;
import com.example.epidemicscenarioapplication.base.BaseFragment;
import com.example.epidemicscenarioapplication.domain.API;
import com.example.epidemicscenarioapplication.domain.DiagnoseDataBean;
import com.example.epidemicscenarioapplication.utils.Constants;
import com.example.epidemicscenarioapplication.utils.RetrofitManager;
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
 * @date 2020/7/6
 * @description com.example.epidemicscenarioapplication.view.fragment
 */
public class WikipediaPreventionPageFragment extends BaseFragment {
    private static final String TAG = "Tengxun1Fragment2";
    private RecyclerView mRecyclerView;

    @Override
    protected void initListener() {

    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void initData() {
        RetrofitManager instance = RetrofitManager.getInstance(Constants.BASE_URL);
        Retrofit retrofit = instance.getRetrofit();
        API api = retrofit.create(API.class);
//        返回20条数据
        Call<DiagnoseDataBean> getGuideListList = api.getGuideListList(20);
        getGuideListList.enqueue(new Callback<DiagnoseDataBean>() {
            @Override
            public void onResponse(Call<DiagnoseDataBean> call, Response<DiagnoseDataBean> response) {
                if (response.code() == HttpURLConnection.HTTP_OK) {
                    DiagnoseDataBean body = response.body();
                    Log.d(TAG, "onResponse: 数据为==>" + body);
                    WikipediaPageFragmentAdapter adapter = new WikipediaPageFragmentAdapter();
                    adapter.setOnItemListener(position -> {
                        Intent intent = new Intent(mSuccessView.getContext(), EpidemicMapActivity.class);
                        intent.putExtra("url", response.body().getData().getDocs().get(position).getH5url());
                        startActivity(intent);
                    });
                    adapter.setDataBeans((ArrayList<DiagnoseDataBean.DataBean.DocsBean>) response.body().getData().getDocs());
//                    设置布局管理器 智障！忘了几次了
                    //设置布局管理器
                    LinearLayoutManager manager = new LinearLayoutManager(mSuccessView.getContext());
                    manager.setOrientation(LinearLayoutManager.VERTICAL);
                    mRecyclerView.setLayoutManager(manager);
                    //设置分割线
                    mRecyclerView.addItemDecoration(new RecyclerView.ItemDecoration() {
                        @Override
                        public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
                            outRect.bottom = 10;
                            outRect.top = 10;
                            outRect.left = 25;
                            outRect.right = 25;
                        }
                    });

//设置动画
                    mRecyclerView.setItemAnimator(new DefaultItemAnimator());
                    mRecyclerView.setAdapter(adapter);
                    setViewState(ViewState.SUCCESS);

                }
            }

            @Override
            public void onFailure(Call<DiagnoseDataBean> call, Throwable t) {
                setViewState(ViewState.ERROR);
            }

        });
    }

    @Override
    protected void initView() {
        mRecyclerView = mSuccessView.findViewById(R.id.rv_GuideList);
    }

    @Override
    protected int getResId() {
        return R.layout.tengxun1_fragment2;
    }
}

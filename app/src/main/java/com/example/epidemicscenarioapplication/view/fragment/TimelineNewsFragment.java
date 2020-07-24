package com.example.epidemicscenarioapplication.view.fragment;

import android.graphics.Rect;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.epidemicscenarioapplication.adapter.TimelineServicePageFragmentAdapter;
import com.example.epidemicscenarioapplication.base.BaseFragment;

import com.example.epidemicscenarioapplication.databinding.NewsFragmentEpidemicBinding;
import com.example.epidemicscenarioapplication.domain.TimelineServiceDataBean;
import com.example.epidemicscenarioapplication.presenter.impl.TimelineNewsPageFragmentPresenter;
import com.example.epidemicscenarioapplication.view.INewsView;
import com.example.epidemicscenarioapplication.view.activity.WebPageActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sly
 * @version 1.0
 * @date 2020/7/8
 * @description com.example.epidemicscenarioapplication.view.fragment
 */
public class TimelineNewsFragment extends BaseFragment implements INewsView<List> {
    private static final String TAG = "TimelineServiceFragment";
    private TimelineNewsPageFragmentPresenter mTimelineNewsPageFragmentPresenter;
    private LinearLayout mTimeLineNewsBindingRoot;
    private NewsFragmentEpidemicBinding mTimeLineNewsBinding;

    @Override
    protected void initListener() {
        mNetworkErrorBinding.llNetwork.setOnClickListener((v) -> {
            mTimelineNewsPageFragmentPresenter.loadData();
        });
    }

    @Override
    protected void initPresenter() {
        mTimelineNewsPageFragmentPresenter = new TimelineNewsPageFragmentPresenter(this);
    }

    @Override
    protected void initView() {
    }

    @Override
    protected View getSuccessView(LayoutInflater inflater, ViewGroup container) {
        mTimeLineNewsBinding = NewsFragmentEpidemicBinding.inflate(inflater, container, false);
        mTimeLineNewsBindingRoot = mTimeLineNewsBinding.getRoot();
        return mTimeLineNewsBindingRoot;
    }


    @Override
    protected void initData() {
        Log.d(TAG, "initData: 加载数据");
        mTimelineNewsPageFragmentPresenter.loadData();
    }

    @Override
    public void showLoadingView() {
        setViewState(ViewState.LOADING);
    }


    @Override
    public void showSuccessView(List list) {
        LinearLayoutManager layoutManager = new LinearLayoutManager(mTimeLineNewsBindingRoot.getContext());
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        TimelineServicePageFragmentAdapter adapter = new TimelineServicePageFragmentAdapter();
        adapter.setOnItemListener(position ->
                WebPageActivity.start(mTimeLineNewsBindingRoot.getContext(), ((ArrayList<TimelineServiceDataBean>) list).get(position).getSourceUrl()));
        adapter.setData((ArrayList<TimelineServiceDataBean>) list);
        mTimeLineNewsBinding.rvTimeNewsList.setLayoutManager(layoutManager);
        //设置分割线
        mTimeLineNewsBinding.rvTimeNewsList.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
                outRect.bottom = 10;
                outRect.top = 10;
                outRect.left = 25;
                outRect.right = 25;
            }
        });
        mTimeLineNewsBinding.rvTimeNewsList.setAdapter(adapter);
        setViewState(ViewState.SUCCESS);

    }


    @Override
    public void showErrorView() {
        setViewState(ViewState.ERROR);
    }

}

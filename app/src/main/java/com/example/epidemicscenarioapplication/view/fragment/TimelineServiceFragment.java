package com.example.epidemicscenarioapplication.view.fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.epidemicscenarioapplication.base.BaseFragment;
import com.example.epidemicscenarioapplication.databinding.TimeLineNewsBinding;
import com.example.epidemicscenarioapplication.domain.TimelineServiceDataBean;
import com.example.epidemicscenarioapplication.presenter.impl.TimelineNewsPageFragmentPresenter;
import com.example.epidemicscenarioapplication.view.ITimeLineServiceView;

import java.util.ArrayList;

/**
 * @author sly
 * @version 1.0
 * @date 2020/7/8
 * @description com.example.epidemicscenarioapplication.view.fragment
 */
public class TimelineServiceFragment extends BaseFragment implements ITimeLineServiceView {
    private static final String TAG = "TimelineServiceFragment";
    private RecyclerView mRvTimelineSerview;
    private TimelineNewsPageFragmentPresenter mPresenter;
    private LinearLayout mTimeLineNewsBindingRoot;

    @Override
    protected void initListener() {

    }

    @Override
    protected void initPresenter() {
        mPresenter = new TimelineNewsPageFragmentPresenter(this);
    }

    @Override
    protected void initView() {
//        mRvTimelineSerview = mRootView.findViewById(R.id.rv_time_news_list);
    }

    @Override
    protected View getSuccessView(LayoutInflater inflater, ViewGroup container) {
        TimeLineNewsBinding timeLineNewsBinding = TimeLineNewsBinding.inflate(inflater, container, false);
        mTimeLineNewsBindingRoot = timeLineNewsBinding.getRoot();
        return mTimeLineNewsBindingRoot;
    }





    @Override
    protected void initData() {
        Log.d(TAG, "initData: 加载数据");
        mPresenter.loadData();
    }

    @Override
    public void showSuccessView(ArrayList<TimelineServiceDataBean> list) {
        LinearLayoutManager layoutManager = new LinearLayoutManager(mTimeLineNewsBindingRoot.getContext());
        layoutManager.setOrientation(RecyclerView.VERTICAL);

    }

    @Override
    public void showErrorView() {

    }
}

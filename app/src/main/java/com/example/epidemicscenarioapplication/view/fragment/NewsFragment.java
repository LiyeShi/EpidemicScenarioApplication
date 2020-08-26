package com.example.epidemicscenarioapplication.view.fragment;


import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.epidemicscenarioapplication.adapter.NewsFragmentAdapter;
import com.example.epidemicscenarioapplication.base.BaseFragment;

import com.example.epidemicscenarioapplication.databinding.NewsFragmentContainerBinding;
import com.example.epidemicscenarioapplication.view.activity.HomeActivity;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;


/**
 * @author sly
 * @version 1.0
 * @date 2020/7/8
 * @description com.example.epidemicscenarioapplication.view.fragment
 */
public class NewsFragment extends BaseFragment {
    private static final String TAG = "NewsFragment";
    private NewsFragmentContainerBinding mFragmentBinding;
    private LocalNewsPageFragment mLocalNewsPageFragment;
    private TimelineNewsFragment mTimelineServiceFragment;

    @Override
    protected void initListener() {
    }

    @Override
    protected void initPresenter() {


    }

    @Override
    protected void initView() {
        setViewState(ViewState.SUCCESS);
        mFragmentBinding.vp2News.requestDisallowInterceptTouchEvent(true);
    }

    @Override
    protected View getSuccessView(LayoutInflater inflater, ViewGroup container) {
        mFragmentBinding = NewsFragmentContainerBinding.inflate(inflater, container, false);
        return mFragmentBinding.getRoot();
    }

    @Override
    protected void initData() {
        Log.d(TAG, "initData: called");
        mTimelineServiceFragment = new TimelineNewsFragment();
        mLocalNewsPageFragment = new LocalNewsPageFragment();
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(mTimelineServiceFragment);
        fragments.add(mLocalNewsPageFragment);
        NewsFragmentAdapter adapter = new NewsFragmentAdapter(getActivity());
        adapter.setData(fragments);
        mFragmentBinding.vp2News.setAdapter(adapter);
        ArrayList<String> title = new ArrayList<>();
        title.add("疫情新闻");
        title.add("本地新闻");
        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(mFragmentBinding.tlNewsTitle, mFragmentBinding.vp2News, (tab, position) -> {
            tab.setText(title.get(position));
        });
        tabLayoutMediator.attach();

    }

}

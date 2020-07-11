package com.example.epidemicscenarioapplication.view.fragment;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.epidemicscenarioapplication.adapter.NewsFragmentAdapter;
import com.example.epidemicscenarioapplication.base.BaseFragment;
import com.example.epidemicscenarioapplication.base.IBaseView;
import com.example.epidemicscenarioapplication.databinding.NewsPageFragmentBinding;
import com.example.epidemicscenarioapplication.presenter.impl.NewsPagePresent;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;



/**
 * @author sly
 * @version 1.0
 * @date 2020/7/8
 * @description com.example.epidemicscenarioapplication.view.fragment
 */
public class NewsFragment extends BaseFragment implements IBaseView {
    private static final String TAG = "NewsFragment";
    private @NotNull NewsPageFragmentBinding mFragmentBinding;

    @Override
    protected void initListener() {

    }

    @Override
    protected void initPresenter() {
        NewsPagePresent pagePresent = new NewsPagePresent(this);

    }

    @Override
    protected void initView() {
        setViewState(ViewState.SUCCESS);
        mFragmentBinding.vp2News.requestDisallowInterceptTouchEvent(true);
    }

    @Override
    protected View getSuccessView(LayoutInflater inflater, ViewGroup container) {
        mFragmentBinding = NewsPageFragmentBinding.inflate(inflater, container, false);
        return mFragmentBinding.getRoot();
    }

    @Override
    protected void initData() {
        TimelineServiceFragment timelineServiceFragment = new TimelineServiceFragment();
        LocalNewsPageFragment localNewsPageFragment = new LocalNewsPageFragment();
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(timelineServiceFragment);
        fragments.add(localNewsPageFragment);
        NewsFragmentAdapter adapter = new NewsFragmentAdapter(getActivity());
        adapter.setData(fragments);
        mFragmentBinding.vp2News.setAdapter(adapter);
        ArrayList<String> title = new ArrayList<>();
        title.add("新闻");
        title.add("本地新闻");

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(mFragmentBinding.tlNewsTitle, mFragmentBinding.vp2News, (tab, position) -> {
            tab.setText(title.get(position));
        });
        tabLayoutMediator.attach();

    }


    @Override
    public void loading() {

    }

    @Override
    public void loadSuccess() {

    }

    @Override
    public void loadError() {

    }



}

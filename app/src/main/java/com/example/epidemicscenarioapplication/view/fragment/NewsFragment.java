package com.example.epidemicscenarioapplication.view.fragment;


import android.util.Log;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import com.example.epidemicscenarioapplication.R;
import com.example.epidemicscenarioapplication.adapter.NewsFragmentAdapter;
import com.example.epidemicscenarioapplication.base.BaseFragment;
import com.example.epidemicscenarioapplication.base.IBaseView;
import com.example.epidemicscenarioapplication.presenter.impl.NewsPagePresent;

import java.util.ArrayList;



/**
 * @author sly
 * @version 1.0
 * @date 2020/7/8
 * @description com.example.epidemicscenarioapplication.view.fragment
 */
public class NewsFragment extends BaseFragment implements IBaseView {
    private static final String TAG = "NewsFragment";
    private ViewPager2 mVp2Container;

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
        mVp2Container = mRootView.findViewById(R.id.vp2_news);
        mVp2Container.requestDisallowInterceptTouchEvent(true);
        Log.d(TAG, "initView: mVp2Container==>"+mVp2Container);

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
        mVp2Container.setAdapter(adapter);
    }

    @Override
    protected int getResId() {
        return R.layout.news_page_fragment;
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

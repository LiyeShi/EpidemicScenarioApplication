package com.example.epidemicscenarioapplication.view.fragment;

import android.util.Log;

import com.example.epidemicscenarioapplication.R;
import com.example.epidemicscenarioapplication.adapter.HomePageBannerAdapter;
import com.example.epidemicscenarioapplication.base.BaseFragment;
import com.example.epidemicscenarioapplication.presenter.impl.HomePagePresenter;
import com.example.epidemicscenarioapplication.view.IHomepageView;
import com.youth.banner.Banner;
import com.youth.banner.indicator.CircleIndicator;
import com.youth.banner.listener.OnBannerListener;

import java.util.List;

/**
 * @author sly
 * @version 1.0
 * @date 2020/6/28
 * @description com.example.epidemicscenarioapplication.view.fragment
 */
public class HomeFragment extends BaseFragment implements IHomepageView, OnBannerListener {

    private static final String TAG = "HomeFragment";
    private Banner mHomepageBanner;
    private HomePagePresenter mHomePagePresenter;

    @Override
    protected void initListener() {
        Log.d(TAG, "initListener: 首页轮播图设置监听");
//        mHomepageBanner.setOnBannerListener(this);
//        开始轮播 start方法一定要在Click方法之后，不然会无法触发Click事件
        mHomepageBanner.start();
    }

    @Override
    protected void initPresenter() {
        mHomePagePresenter = new HomePagePresenter(this);
    }

    @Override
    protected void initView() {
        mHomepageBanner = (Banner) mRootView.findViewById(R.id.homepager_banner);

    }

    @Override
    protected int getResId() {
        return R.layout.home_fragment;
    }

    @Override
    protected void initData() {
        //假装加载
        mHomePagePresenter.loadBanner();
    }

    @Override
    public void showBanner(List data) {
        mHomepageBanner.setAdapter(new HomePageBannerAdapter(data));
//        设置圆点指示器
        mHomepageBanner.setIndicator(new CircleIndicator(mRootView.getContext()));
//          轮播间隔时间
        mHomepageBanner.setDelayTime(5000);
        mHomepageBanner.setOnBannerListener(this);
//        设置指示器默认颜色
//        mHomepageBanner.setIndicatorNormalColor()
//        设置指示器选中颜色
//        mHomepageBanner.setIndicatorSelectedColor()
    }

    @Override
    public void OnBannerClick(Object data, int position) {
        Log.d(TAG, "OnBannerClick: haha");
    }
}

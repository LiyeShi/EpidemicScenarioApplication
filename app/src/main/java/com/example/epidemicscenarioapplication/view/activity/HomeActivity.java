package com.example.epidemicscenarioapplication.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import com.example.epidemicscenarioapplication.R;
import com.example.epidemicscenarioapplication.adapter.HomeActivityViewpagerAdapter;
import com.example.epidemicscenarioapplication.base.BaseActivity;
import com.example.epidemicscenarioapplication.presenter.impl.RumorPresenter;
import com.example.epidemicscenarioapplication.utils.SpUtils;
import com.example.epidemicscenarioapplication.view.fragment.FullPlatformDataFragment;
import com.example.epidemicscenarioapplication.view.fragment.HomeFragment;
import com.example.epidemicscenarioapplication.view.fragment.RumorFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class HomeActivity extends BaseActivity {


    private BottomNavigationView mBanner;
    private HomeFragment mHomeFragment;
    private RumorFragment mLaJiFragment;
    private FullPlatformDataFragment mAboutUsFragment;
    private static final String TAG = "HomeActivity";
    private RumorPresenter mRumorPresenter;
    private ViewPager2 mVpContainer;
    private ArrayList<Fragment> mFragmentArrayList = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        isShowGuidePage();
        initFragment();
        initListener();
    }

    @Override
    protected void initData() {

    }

    private void isShowGuidePage() {
        boolean isFirst = SpUtils.getBoolean(this, "isFirst", true);
        if (isFirst) {
           startActivity(new Intent(this,IntroActivity.class));
           SpUtils.putBoolean(this,"isFirst",false);
        }
    }

    @Override
    protected int getViewId() {
        return R.layout.activity_home;
    }

    private void initListener() {
        Log.d(TAG, "initListener: 设置监听");
        mBanner.setItemIconTintList(null);

        mBanner.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.item_home:
                   mVpContainer.setCurrentItem(0);
                    break;
                case R.id.item_daiding:
                    mVpContainer.setCurrentItem(1);
                    break;
                case R.id.item_daiding1:
                    mVpContainer.setCurrentItem(2);
                    break;
                default:
                    break;
            }
            return true;
        });
        //注册页面切换监听
        mVpContainer.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
//                这个地方只能这么写吗 好别扭
                mBanner.setSelectedItemId(mBanner.getMenu().getItem(position).getItemId());
            }
        });
    }



    private void initFragment() {
        mHomeFragment = new HomeFragment();
        mLaJiFragment = new RumorFragment();
        mAboutUsFragment = new FullPlatformDataFragment();
        mFragmentArrayList.add(mHomeFragment);
        mFragmentArrayList.add(mLaJiFragment);
        mFragmentArrayList.add(mAboutUsFragment);
        mVpContainer.setCurrentItem(0);
    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void initView() {
        mVpContainer = findViewById(R.id.vp_container);
        mBanner = this.findViewById(R.id.bnv_home);
        HomeActivityViewpagerAdapter viewpagerAdapter = new HomeActivityViewpagerAdapter(this);
        viewpagerAdapter.setData(mFragmentArrayList);
        mVpContainer.setAdapter(viewpagerAdapter);
    }


}
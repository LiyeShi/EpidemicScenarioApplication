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
import com.example.epidemicscenarioapplication.utils.NXStatusBar;
import com.example.epidemicscenarioapplication.utils.SpUtils;
import com.example.epidemicscenarioapplication.view.fragment.AboutUsFragment;
import com.example.epidemicscenarioapplication.view.fragment.HomeFragment;
import com.example.epidemicscenarioapplication.view.fragment.NewsFragment;
import com.example.epidemicscenarioapplication.view.fragment.WikipediaFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

/**
 * @author 鑫宇
 */
public class HomeActivity extends BaseActivity {

    private BottomNavigationView mNavigationView;
    private HomeFragment mHomePageFragment;
    private WikipediaFragment mWikipediaPageFragment;
    private AboutUsFragment mAboutUsFragment;
    private NewsFragment mNewsPagerFragment;
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
    protected void setStatusBarColor() {
        NXStatusBar.setStatusBarDarkMode(this);
    }

    @Override
    protected void initData() {

    }

    private void isShowGuidePage() {
        boolean isFirst = SpUtils.getBoolean(this, "isFirst", true);
        if (isFirst) {
            startActivity(new Intent(this, IntroActivity.class));
            SpUtils.putBoolean(this, "isFirst", false);
        }
    }

    @Override
    protected int getViewId() {
        return R.layout.activity_home;
    }

    private void initListener() {
        Log.d(TAG, "initListener: 设置监听");
        mNavigationView.setItemIconTintList(null);

        mNavigationView.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.item_home:
                    mVpContainer.setCurrentItem(0);
                    break;
                case R.id.item_xinwen:
                    mVpContainer.setCurrentItem(1);
                    break;
                case R.id.item_daiding:
                    mVpContainer.setCurrentItem(2);
                    break;
                case R.id.item_daiding1:
                    mVpContainer.setCurrentItem(3);
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
                Log.d(TAG, "onPageSelected: position==>"+position);
                int id = mNavigationView.getMenu().getItem(position).getItemId();
                Log.d(TAG, "onPageSelected: id==>"+id);
//                这个地方只能这么写吗 好别扭  神奇了又 底部导航栏添加一个选项 莫名爆炸 更换下面方式实现
//                mNavigationView.setSelectedItemId(id);
                mNavigationView.getMenu().getItem(position).setChecked(true);
            }
        });
    }


    private void initFragment() {
        mHomePageFragment = new HomeFragment();
        mWikipediaPageFragment = new WikipediaFragment();
        mAboutUsFragment = new AboutUsFragment();
        mNewsPagerFragment = new NewsFragment();
        mFragmentArrayList.add(mHomePageFragment);
        mFragmentArrayList.add(mNewsPagerFragment);
        mFragmentArrayList.add(mWikipediaPageFragment);
        mFragmentArrayList.add(mAboutUsFragment);
        mVpContainer.setCurrentItem(0);
    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void initView() {
        mVpContainer = findViewById(R.id.vp_container);
        mNavigationView = this.findViewById(R.id.bnv_home);
        HomeActivityViewpagerAdapter viewpagerAdapter = new HomeActivityViewpagerAdapter(this);
        viewpagerAdapter.setData(mFragmentArrayList);
        mVpContainer.setAdapter(viewpagerAdapter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
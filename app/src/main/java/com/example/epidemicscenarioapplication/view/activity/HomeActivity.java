package com.example.epidemicscenarioapplication.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import com.example.epidemicscenarioapplication.R;
import com.example.epidemicscenarioapplication.adapter.HomeActivityViewpagerAdapter;
import com.example.epidemicscenarioapplication.base.BaseActivity;
import com.example.epidemicscenarioapplication.databinding.ActivityHomeBinding;
import com.example.epidemicscenarioapplication.presenter.impl.WikipediaPresenter;
import com.example.epidemicscenarioapplication.utils.SpUtils;
import com.example.epidemicscenarioapplication.view.fragment.AboutUsFragment;
import com.example.epidemicscenarioapplication.view.fragment.HomeFragment;
import com.example.epidemicscenarioapplication.view.fragment.NewsFragment;
import com.example.epidemicscenarioapplication.view.fragment.WikipediaFragment;

import java.util.ArrayList;

/**
 * @author 鑫宇
 */
public class HomeActivity extends BaseActivity {
    private static  final String PREF_ISFIRST="isFirst";
    private HomeFragment mHomeFragment;
    private WikipediaFragment mWikipediaFragment;
    private AboutUsFragment mAboutUsFragment;
    private NewsFragment mNewsFragment;
    private static final String TAG = "HomeActivity";
    private WikipediaPresenter mRumorPresenter;
    private ArrayList<Fragment> mFragmentArrayList = new ArrayList();
    private ActivityHomeBinding mHomeBinding;



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
        boolean isFirst = SpUtils.getBoolean(this, PREF_ISFIRST, true);
        if (isFirst) {
            startActivity(new Intent(this, GuideActivity.class));
            SpUtils.putBoolean(this, PREF_ISFIRST, false);
        }
    }

    @Override
    protected View getView() {
        mHomeBinding = ActivityHomeBinding.inflate(getLayoutInflater());
        LinearLayout view = mHomeBinding.getRoot();
        return view;
    }

    private void initListener() {
        Log.d(TAG, "initListener: 设置监听");
        mHomeBinding.bnvHome.setItemIconTintList(null);

        mHomeBinding.bnvHome.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.item_home:
                    mHomeBinding.vpContainer.setCurrentItem(0, false);
                    break;
                case R.id.item_xinwen:
                    mHomeBinding.vpContainer.setCurrentItem(1, false);
                    break;
                case R.id.item_daiding:
                    mHomeBinding.vpContainer.setCurrentItem(2, false);
                    break;
                case R.id.item_daiding1:
                    mHomeBinding.vpContainer.setCurrentItem(3, false);
                    break;
                default:
                    break;
            }
            return true;
        });
        //注册页面切换监听
        mHomeBinding.vpContainer.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                mHomeBinding.bnvHome.getMenu().getItem(position).setChecked(true);
            }
        });
    }



    private void initFragment() {
        mHomeFragment = new HomeFragment();
        mWikipediaFragment = new WikipediaFragment();
        mAboutUsFragment = new AboutUsFragment();
        mNewsFragment = new NewsFragment();
        mFragmentArrayList.add(mHomeFragment);
        mFragmentArrayList.add(mNewsFragment);
        mFragmentArrayList.add(mWikipediaFragment);
        mFragmentArrayList.add(mAboutUsFragment);
        mHomeBinding.vpContainer.setCurrentItem(0);
    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void initView() {
        HomeActivityViewpagerAdapter viewpagerAdapter = new HomeActivityViewpagerAdapter(this);
        viewpagerAdapter.setData(mFragmentArrayList);
        mHomeBinding.vpContainer.setAdapter(viewpagerAdapter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
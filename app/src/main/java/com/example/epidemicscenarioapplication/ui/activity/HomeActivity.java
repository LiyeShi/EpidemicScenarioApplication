package com.example.epidemicscenarioapplication.ui.activity;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.example.epidemicscenarioapplication.R;
import com.example.epidemicscenarioapplication.base.BaseActivity;
import com.example.epidemicscenarioapplication.ui.fragment.FullPlatformDataFragment;
import com.example.epidemicscenarioapplication.ui.fragment.HomeFragment;
import com.example.epidemicscenarioapplication.ui.fragment.LaJiFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends BaseActivity {

    private FrameLayout mFlContainer;
    private BottomNavigationView mBnv;
    private HomeFragment mHomeFragment;
    private LaJiFragment mLaJiFragment;
    private FullPlatformDataFragment mAboutUsFragment;
    private static final String TAG = "HomeActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initFragment();
        initListener();
    }

    @Override
    protected int getViewId() {
        return R.layout.activity_home;

    }

    private void initListener() {
        Log.d(TAG, "initListener: 设置监听");
        mBnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.item_home:
                        switchFragment(mHomeFragment);
                        break;
                    case R.id.item_daiding:
                        switchFragment(mLaJiFragment);
                        break;
                    case R.id.item_daiding1:
                        switchFragment(mAboutUsFragment);
                        break;
                    default:
                        break;
                }
                return true;
            }
        });
    }

    public void switchFragment(Fragment targetFragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.fl_container, targetFragment);
        transaction.commit();
    }

    private void initFragment() {
        mHomeFragment = new HomeFragment();
        mLaJiFragment = new LaJiFragment();
        mAboutUsFragment = new FullPlatformDataFragment();
        //默认显示一个
        switchFragment(mHomeFragment);
    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void initView() {
        mFlContainer = this.findViewById(R.id.fl_container);
        mBnv = this.findViewById(R.id.bnv_home);
        Log.d(TAG, "initView: 初始化视图"+mFlContainer);
    }
}
package com.example.epidemicscenarioapplication.base;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.example.epidemicscenarioapplication.databinding.DefaultBaseFragmentLayoutBinding;

/**
 * @author sly
 * @version 1.0
 * @date 2020/6/28
 * @description com.example.epidemicscenarioapplication.base
 */
public abstract class BaseActivity extends AppCompatActivity {

    private DefaultBaseFragmentLayoutBinding mBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view = getView();
        setContentView(view);
//        setContentView(viewId);
        initView();
        initPresenter();
        initData();
        setImmersionMode();
        setStatusBarColor();
//        NXStatusBar.addStatusViewWhite(this,savedInstanceState.G);

    }

    protected abstract void setStatusBarColor();

    protected abstract void initData();

    private void setImmersionMode() {
        if (Build.VERSION.SDK_INT >= 21) {
            View decorView = getWindow().getDecorView();
            int option = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
            decorView.setSystemUiVisibility(option);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }

    protected abstract View getView();

    protected abstract void initView();

    protected abstract void initPresenter();


    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}

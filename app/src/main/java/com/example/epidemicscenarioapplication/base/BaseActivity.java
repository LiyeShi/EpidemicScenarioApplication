package com.example.epidemicscenarioapplication.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * @author sly
 * @version 1.0
 * @date 2020/6/28
 * @description com.example.epidemicscenarioapplication.base
 */
public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int viewId = getViewId();
        setContentView(viewId);
        initView();
        initPresenter();
    }

    protected abstract int getViewId();

    protected abstract void initView();

    protected abstract void initPresenter();


    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}

package com.example.epidemicscenarioapplication.base;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.epidemicscenarioapplication.R;

import com.gyf.immersionbar.ImmersionBar;

/**
 * @author sly
 * @version 1.0
 * @date 2020/6/28
 * @description com.example.epidemicscenarioapplication.base
 */
public abstract class BaseActivity extends AppCompatActivity {
    private static final String TAG = "BaseActivity";
    private View mView;
    protected ImmersionBar mImmersionBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mView = getView();
        setContentView(mView);
//        适配状态栏 这个地方还必须在setContentView之后进行
        InitImmersionBar();
        initView();
        initPresenter();
        initData();
        Log.d(TAG, "onCreate: finish");
    }

    protected void InitImmersionBar() {
        mImmersionBar = ImmersionBar.with(this);
        mImmersionBar.fitsSystemWindows(true)
                .statusBarColor(R.color.colorPrimaryDark).init();
    }


    protected abstract void initData();


    protected abstract View getView();

    protected abstract void initView();

    protected abstract void initPresenter();


    @Override
    protected void onDestroy() {
        super.onDestroy();
        ImmersionBar.destroy(this,null);
    }
}

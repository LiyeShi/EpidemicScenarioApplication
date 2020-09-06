package com.example.epidemicscenarioapplication.view.activity;

import android.os.Bundle;
import android.view.View;

import com.example.epidemicscenarioapplication.R;
import com.example.epidemicscenarioapplication.base.BaseActivity;
import com.example.epidemicscenarioapplication.databinding.ActivitySearchBinding;
import com.gyf.immersionbar.ImmersionBar;

public class SearchActivity extends BaseActivity {

    private ActivitySearchBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void InitImmersionBar() {
        super.InitImmersionBar();
        mImmersionBar = ImmersionBar.with(this);
        mImmersionBar.fitsSystemWindows(true)
                .statusBarColor(R.color.white)
                //状态栏字体是深色，不写默认为亮色
                .statusBarDarkFont(true)
                //导航栏图标是深色，不写默认为亮色
                .navigationBarDarkIcon(false).init();
    }

    @Override
    protected View getView() {
        mBinding = ActivitySearchBinding.inflate(getLayoutInflater());
        return mBinding.getRoot();
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initPresenter() {

    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.home_activity_translate_in, R.anim.search_activity_translate_out);
    }
}

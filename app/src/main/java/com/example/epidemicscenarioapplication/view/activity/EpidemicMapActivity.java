package com.example.epidemicscenarioapplication.view.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.example.epidemicscenarioapplication.R;
import com.example.epidemicscenarioapplication.base.BaseActivity;
import com.example.epidemicscenarioapplication.presenter.impl.EpidemicMapPresenter;
import com.example.epidemicscenarioapplication.utils.Constants;
import com.example.epidemicscenarioapplication.utils.NXStatusBar;
import com.example.epidemicscenarioapplication.view.IEpidemicMapView;
import com.just.agentweb.AgentWeb;

/**
 * @author 鑫宇
 */
public class EpidemicMapActivity extends BaseActivity implements IEpidemicMapView {
    private String url;


    private WebView mWvHomeMap;
    private EpidemicMapPresenter mEpidemicMapPresenter;
    private String mUrl;


    @Override
    protected void setStatusBarColor() {
        NXStatusBar.setStatusBarDarkMode(this);
    }

    @Override
    protected void initData() {
        Intent intent = getIntent();
        mUrl = intent.getStringExtra("url");
        LinearLayout r = new LinearLayout(this);
        LinearLayout.LayoutParams btnParams = new LinearLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);

        setContentView(r);
        @SuppressLint("ResourceAsColor") AgentWeb mAgentWeb = AgentWeb.with(this)
                .setAgentWebParent(r, new LinearLayout.LayoutParams(-1, -1))
                .useDefaultIndicator(R.color.colorPrimary,2)
                .createAgentWeb()
                .ready()
                .go(this.mUrl);

    }


    @Override
    protected int getViewId() {
        return R.layout.activity_epidemic_map;
    }

    @Override
    protected void initView() {
        mWvHomeMap = findViewById(R.id.wv_home_map);
    }

    @Override
    protected void initPresenter() {
        mEpidemicMapPresenter = new EpidemicMapPresenter(this);
    }

    @Override
    public void showMap() {

    }

    @Override
    public void showErrorTips() {

    }
}
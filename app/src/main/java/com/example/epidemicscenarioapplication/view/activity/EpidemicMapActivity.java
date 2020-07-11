package com.example.epidemicscenarioapplication.view.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.example.epidemicscenarioapplication.R;
import com.example.epidemicscenarioapplication.base.BaseActivity;
import com.example.epidemicscenarioapplication.databinding.ActivityEpidemicMapBinding;
import com.example.epidemicscenarioapplication.presenter.impl.EpidemicMapPresenter;
import com.example.epidemicscenarioapplication.view.IEpidemicMapView;
import com.just.agentweb.AgentWeb;

/**
 * @author 鑫宇
 */
public class EpidemicMapActivity extends BaseActivity implements IEpidemicMapView {
    private String url;
    private static final String TAG = "EpidemicMapActivity";

    private WebView mWvHomeMap;
    private EpidemicMapPresenter mEpidemicMapPresenter;
    private String mUrl;
    @SuppressLint("ResourceAsColor")
    private AgentWeb mAgentWeb;


    @SuppressLint("ResourceAsColor")
    @Override
    protected void initData() {
        Intent intent = getIntent();
        mUrl = intent.getStringExtra("url");
        LinearLayout r = new LinearLayout(this);

        setContentView(r);
        mAgentWeb = AgentWeb.with(this)
                .setAgentWebParent(r, new LinearLayout.LayoutParams(-1, -1))
                .useDefaultIndicator(R.color.colorPrimary,2)
                .createAgentWeb()
                .ready()
                .go(this.mUrl);
        Log.d(TAG, "initData: mAgentWeb.back()==>"+mAgentWeb.back());
//     true表示AgentWeb处理了该事件
//        if (mAgentWeb.back()){
//          this.finish();
//        }

    }

    /**
     * @param keyCode 重写这个方法竟然能实现返回上一页
     * @param event
     * @return
     */
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (mAgentWeb.handleKeyEvent(keyCode, event)) {
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    protected void onPause() {
        mAgentWeb.getWebLifeCycle().onPause();
        super.onPause();

    }

    @Override
    protected void onResume() {
        mAgentWeb.getWebLifeCycle().onResume();
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        mAgentWeb.getWebLifeCycle().onDestroy();
        super.onDestroy();
    }

    @Override
    protected View getView() {
        ActivityEpidemicMapBinding epidemicMapBinding = ActivityEpidemicMapBinding.inflate(getLayoutInflater());
        LinearLayout mapBindingRoot = epidemicMapBinding.getRoot();
        return mapBindingRoot;
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
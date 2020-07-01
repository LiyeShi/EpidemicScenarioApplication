package com.example.epidemicscenarioapplication.view.activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.epidemicscenarioapplication.R;
import com.example.epidemicscenarioapplication.base.BaseActivity;
import com.example.epidemicscenarioapplication.presenter.impl.EpidemicMapPresenter;
import com.example.epidemicscenarioapplication.view.IEpidemicMapView;
import com.just.agentweb.AgentWeb;

/**
 * @author 鑫宇
 */
public class EpidemicMapActivity extends BaseActivity implements IEpidemicMapView {


    private WebView mWvHomeMap;
    private EpidemicMapPresenter mEpidemicMapPresenter;

    @Override
    protected void initData() {
        LinearLayout r = new LinearLayout(this);
        LinearLayout.LayoutParams btnParams = new LinearLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,           //  wrap_content
                RelativeLayout.LayoutParams.WRAP_CONTENT);          //  wrap_content

        setContentView(r);
        AgentWeb mAgentWeb = AgentWeb.with(this)
                .setAgentWebParent(r, new LinearLayout.LayoutParams(-1, -1))
                .useDefaultIndicator()
                .createAgentWeb()
                .ready()
                .go("https://lzxue.github.io/yiqingditu/");

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
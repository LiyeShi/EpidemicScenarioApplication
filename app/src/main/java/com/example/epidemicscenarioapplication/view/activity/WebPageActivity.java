package com.example.epidemicscenarioapplication.view.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.core.content.ContextCompat;

import com.example.epidemicscenarioapplication.R;
import com.example.epidemicscenarioapplication.base.BaseActivity;

import com.example.epidemicscenarioapplication.databinding.ActivityWebBinding;
import com.example.epidemicscenarioapplication.view.IEpidemicMapView;
import com.gyf.immersionbar.ImmersionBar;
import com.just.agentweb.AgentWeb;


/**
 * 所有网页的浏览都在这里实现
 * @author 鑫宇
 */
public class WebPageActivity extends BaseActivity implements IEpidemicMapView {
    private static final String EXTRA_URL="url";
    private static final String TAG = "PageLoadingActivity";

    private String mUrl;
    @SuppressLint("ResourceAsColor")
    private AgentWeb mAgentWeb;
    private LinearLayout mMapBindingRoot;


    @SuppressLint("ResourceAsColor")
    @Override
    protected void initData() {
        Intent intent = getIntent();
        mUrl = intent.getStringExtra(EXTRA_URL);
        mAgentWeb = AgentWeb.with(this)
                .setAgentWebParent(mMapBindingRoot, new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT))
                .useDefaultIndicator(ContextCompat.getColor(this,R.color.colorPrimaryDark), 2)
                .createAgentWeb()
                .ready()
                .go(this.mUrl);
        Log.d(TAG, "initData: mAgentWeb.back()==>" + mAgentWeb.back());
//     true表示AgentWeb处理了该事件
//        if (mAgentWeb.back()){
//          this.finish();
//        }

    }

    public static void start(Context context, String url) {
        Intent starter = new Intent(context, WebPageActivity.class);
        starter.putExtra("url", url);
        context.startActivity(starter);
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
        ActivityWebBinding epidemicMapBinding = ActivityWebBinding.inflate(getLayoutInflater());
        mMapBindingRoot = epidemicMapBinding.getRoot();
        return mMapBindingRoot;
    }

    @Override
    protected void InitImmersionBar() {
        mImmersionBar = ImmersionBar.with(this);
        mImmersionBar.fitsSystemWindows(true)
                .statusBarColor(R.color.white)
                //状态栏字体是深色，不写默认为亮色
                .statusBarDarkFont(true)
                //导航栏图标是深色，不写默认为亮色
                .navigationBarDarkIcon(false).init();
    }

    @Override
    protected void initView() {


    }

    @Override
    protected void initPresenter() {

    }

    @Override
    public void showMap() {

    }

    @Override
    public void showErrorTips() {

    }
}
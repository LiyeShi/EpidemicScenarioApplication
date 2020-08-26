package com.example.epidemicscenarioapplication.base;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import com.example.epidemicscenarioapplication.R;
import com.example.epidemicscenarioapplication.databinding.BaseFragmentDefaultBinding;
import com.example.epidemicscenarioapplication.databinding.BaseFragmentNetworkErrorBinding;
import com.example.epidemicscenarioapplication.databinding.BaseFragmentNetworkLoadingBinding;

import com.example.epidemicscenarioapplication.view.activity.HomeActivity;
import com.gyf.immersionbar.ImmersionBar;

/**
 * @author sly
 * @version 1.0
 * @date 2020/6/28
 * @description com.example.epidemicscenarioapplication.base
 */
public abstract class BaseFragment extends Fragment {
    //默认所有页面都是 加载状态
    private static final String TAG = "BaseFragment";
    private ViewState mCurrentState = ViewState.LOADING;
    protected View mErrorView;
    private View mLoadingView;
    private View mSuccessView;
    protected BaseFragmentDefaultBinding mBaseFragmentLayoutBinding;
    private FrameLayout mBaseFragmentRootview;
    protected ImmersionBar mImmersionBar;
    protected BaseFragmentNetworkErrorBinding mNetworkErrorBinding;


    /**
     * 控制View可不可见的类 即在不同网络状态下显示哪一个view
     */
    public enum ViewState {
        // 在第一行显式地列出枚举实例(枚举值)，系统会自动添加 public static final 修饰
        SUCCESS, ERROR, LOADING;
    }

    @Override
    public void onResume() {
        super.onResume();
//        initData();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        InitImmersionBar();
//       一走进这个方法就加载默认的布局，如果子类重写该方法，显示子类的布局
        loadRootView(inflater, container);
        loadStateView(inflater, container);
        initView();
        initPresenter();
//        initData();
        HomeActivity activity = (HomeActivity)getActivity();
//        确保获得地址后才去加载数据
        initData();
        initListener();
//        返回根布局 因为每一个根布局里面都放了不同状态下的布局 在状态设置中控制这些不同的view显示那一个
        return mBaseFragmentLayoutBinding.getRoot();
    }

    protected void initData() {

    }

    @SuppressLint("ResourceAsColor")
    protected void InitImmersionBar() {
        mImmersionBar = ImmersionBar.with(this);
        mImmersionBar.fitsSystemWindows(true)
                .statusBarColor(R.color.colorPrimaryDark).init();
    }



    public void setViewState(ViewState state) {
//        这里只是控制显示View 并不影响数据加载 深入理解面向对象 对于每一个继承自basefragment的fragment在创建时都会经历这些过程
        this.mCurrentState = state;
        mSuccessView.setVisibility(mCurrentState == ViewState.SUCCESS ? View.VISIBLE : View.GONE);
        mLoadingView.setVisibility(mCurrentState == ViewState.LOADING ? View.VISIBLE : View.GONE);
        mErrorView.setVisibility(mCurrentState == ViewState.ERROR ? View.VISIBLE : View.GONE);
    }

    /**
     * @param inflater
     * @param container 向容器中添加不同状态下的View
     */
    protected void loadStateView(LayoutInflater inflater, ViewGroup container) {
        mSuccessView = loadSuccessView(inflater, container);
        mBaseFragmentLayoutBinding.baseFlContainer.addView(mSuccessView);
        mErrorView = loadErrorView(inflater, container);
        mBaseFragmentLayoutBinding.baseFlContainer.addView(mErrorView);
        mLoadingView = loadLoadingView(inflater, container);
        mBaseFragmentLayoutBinding.baseFlContainer.addView(mLoadingView);
        setViewState(mCurrentState);
    }

    //加载根布局
    protected View loadRootView(LayoutInflater inflater, ViewGroup container) {
//       默认 只有一个FrameLayout 子类重写走子类 HomeFragment重写
//       使用ViewBinding的写法
        mBaseFragmentLayoutBinding = BaseFragmentDefaultBinding.inflate(inflater, container, false);
        mBaseFragmentRootview = mBaseFragmentLayoutBinding.getRoot();
        return mBaseFragmentRootview;
    }

    private View loadLoadingView(LayoutInflater inflater, ViewGroup container) {
        BaseFragmentNetworkLoadingBinding inflate = BaseFragmentNetworkLoadingBinding.inflate(inflater, container, false);
        return inflate.getRoot();
    }

    private View loadErrorView(LayoutInflater inflater, ViewGroup container) {
        mNetworkErrorBinding = BaseFragmentNetworkErrorBinding.inflate(inflater, container, false);
        return mNetworkErrorBinding.getRoot();
    }

    private View loadSuccessView(LayoutInflater inflater, ViewGroup container) {
        View view = getSuccessView(inflater, container);
        return view;
    }

    protected  void initListener(){

    }

    protected abstract void initPresenter();


    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mImmersionBar != null) {
            ImmersionBar.destroy(this);
        }
    }

    protected abstract void initView();

    protected abstract View getSuccessView(LayoutInflater inflater, ViewGroup container);
}

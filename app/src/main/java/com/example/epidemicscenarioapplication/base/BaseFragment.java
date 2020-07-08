package com.example.epidemicscenarioapplication.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.epidemicscenarioapplication.R;

/**
 * @author sly
 * @version 1.0
 * @date 2020/6/28
 * @description com.example.epidemicscenarioapplication.base
 */
public abstract class BaseFragment extends Fragment {

    private FrameLayout mFlContainer;
    private ViewState mCurrentState=ViewState.LOADING;
    private View mErrorView;
    private View mLoadingView;
    public View mSuccessView;
    protected View mRootView;

    // 控制View可不可见的类 即在不同网络状态下显示哪一个view
    public enum ViewState {
        // 在第一行显式地列出枚举实例(枚举值)，系统会自动添加 public static final 修饰
        SUCCESS, ERROR, LOADING;
    }



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//       一走进这个方法就加载默认的布局，如果子类重写该方法，显示子类的布局
        mRootView = loadRootView(inflater, container);
        mFlContainer = mRootView.findViewById(R.id.base_fl_container);
        loadStateView(inflater, container);
        initView();
        initPresenter();
        initData();
        initListener();
//        返回根布局 因为每一个根布局里面都放了不同状态下的布局 在状态设置中控制这些不同的view显示那一个
        return mRootView;
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
     * @param container
     * 向容器中添加不同状态下的View
     */
    protected void loadStateView(LayoutInflater inflater, ViewGroup container) {
        loadSuccessView(inflater, container);
        mFlContainer.addView(mSuccessView);
        mErrorView = loadErrorView(inflater, container);
        mFlContainer.addView(mErrorView);
        mLoadingView = loadLoadingView(inflater, container);
        mFlContainer.addView(mLoadingView);
        setViewState(mCurrentState);
    }

    //加载根布局
    protected View loadRootView(LayoutInflater inflater, ViewGroup container) {
//       默认 只有一个FrameLayout 子类重写走子类 HomeFragment重写
        return inflater.inflate(R.layout.default_base_fragment_layout, container, false);
    }

    private View loadLoadingView(LayoutInflater inflater, ViewGroup container) {
        return inflater.inflate(R.layout.network_loading_layout, container, false);
    }

    private View loadErrorView(LayoutInflater inflater, ViewGroup container) {
             return inflater.inflate(R.layout.network_error_layout, container, false);

    }

    private View loadSuccessView(LayoutInflater inflater, ViewGroup container) {
        int id = getResId();
        mSuccessView = inflater.inflate(id, container, false);
        return mSuccessView;
    }

    protected abstract void initListener();

    protected abstract void initPresenter();



    protected void initData() {

    }

    protected abstract void initView();

    protected abstract int getResId();
}

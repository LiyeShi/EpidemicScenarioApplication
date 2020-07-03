package com.example.epidemicscenarioapplication.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/**
 * @author sly
 * @version 1.0
 * @date 2020/6/28
 * @description com.example.epidemicscenarioapplication.base
 */
public abstract class BaseFragment extends Fragment {
    // 控制View可不可见的类
    public enum ViewState {
        // 在第一行显式地列出枚举实例(枚举值)，系统会自动添加 public static final 修饰
        SUCCESS, ERROR, LOADING;
    }
    public View mRootView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//       一走进这个方法就加载默认的布局，如果子类重写该方法，显示子类的布局
        loadRootView(inflater,container);
        loadView(inflater, container);
        initView();
        initPresenter();
        initListener();
        initData();
        return mRootView;
    }

    protected void loadRootView(LayoutInflater inflater, ViewGroup container) {

    }

    protected abstract void initListener();

    protected abstract void initPresenter();

    protected void loadView(LayoutInflater inflater, @Nullable ViewGroup container) {
            int id = getResId();
            mRootView = inflater.inflate(id, container, false);
    }

    protected void initData() {

    }

    protected abstract void initView();

    protected abstract int getResId();
}

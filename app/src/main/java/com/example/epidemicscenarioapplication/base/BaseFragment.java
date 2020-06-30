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
    public View mRootView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        loadView(inflater, container);
        initView();
        initPresenter();
        initListener();
        initData();
        return mRootView;
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

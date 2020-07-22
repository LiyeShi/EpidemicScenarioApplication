package com.example.epidemicscenarioapplication.view.fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.epidemicscenarioapplication.base.BaseFragment;

import com.example.epidemicscenarioapplication.databinding.FragmentNewsLocalBinding;


/**
 * @author sly
 * @version 1.0
 * @date 2020/7/8
 * @description com.example.epidemicscenarioapplication.view.fragment
 */
public class LocalNewsPageFragment extends BaseFragment {

    private ConstraintLayout mLocalNewsLayoutBindingRoot;

    @Override
    protected void initListener() {

    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected View getSuccessView(LayoutInflater inflater, ViewGroup container) {
        FragmentNewsLocalBinding localNewsLayoutBinding = FragmentNewsLocalBinding.inflate(inflater, container, false);
        mLocalNewsLayoutBindingRoot = localNewsLayoutBinding.getRoot();
        return mLocalNewsLayoutBindingRoot;

    }


}

package com.example.epidemicscenarioapplication.view.fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.epidemicscenarioapplication.base.BaseFragment;

import com.example.epidemicscenarioapplication.databinding.MineFragmentBinding;


/**
 * @author sly
 * @version 1.0
 * @date 2020/6/28
 * @description com.example.epidemicscenarioapplication.view.fragment
 */

public class AboutUsFragment extends BaseFragment {

    private MineFragmentBinding mMineFragmentBinding;

    @Override
    protected void initListener() {

    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void initView() {
        setViewState(ViewState.SUCCESS);
        mMineFragmentBinding.itemone.setTextViewText("致谢");
        mMineFragmentBinding.itemtwo.setTextViewText("致谢");
        mMineFragmentBinding.itemone.setTextViewText("致谢");
        MyListener myListener = new MyListener();

    }

    @Override
    protected void initData() {
        super.initData();

    }

    @Override
    protected View getSuccessView(LayoutInflater inflater, ViewGroup container) {
        mMineFragmentBinding = MineFragmentBinding.inflate(inflater, container, false);
        return mMineFragmentBinding.getRoot();
    }



    class MyListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                default:
                    break;
            }
        }
    }
}

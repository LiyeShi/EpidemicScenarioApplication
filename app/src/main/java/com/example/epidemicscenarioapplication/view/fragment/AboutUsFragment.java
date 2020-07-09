package com.example.epidemicscenarioapplication.view.fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.epidemicscenarioapplication.base.BaseFragment;
import com.example.epidemicscenarioapplication.databinding.FullPlatformDataFragmentBinding;

/**
 * @author sly
 * @version 1.0
 * @date 2020/6/28
 * @description com.example.epidemicscenarioapplication.view.fragment
 */
public class AboutUsFragment extends BaseFragment {
    @Override
    protected void initListener() {

    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void initView() {
        MyListener myListener = new MyListener();

    }

    @Override
    protected View getSuccessView(LayoutInflater inflater, ViewGroup container) {
        FullPlatformDataFragmentBinding fullPlatformDataFragmentBinding = FullPlatformDataFragmentBinding.inflate(inflater, container, false);
        return fullPlatformDataFragmentBinding.getRoot();
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

package com.example.epidemicscenarioapplication.view.fragment;

import android.view.View;

import com.example.epidemicscenarioapplication.R;
import com.example.epidemicscenarioapplication.base.BaseFragment;

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
    protected int getResId() {
        return R.layout.full_platform_data_fragment;
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

package com.example.epidemicscenarioapplication.ui.fragment;

import android.view.View;

import com.example.epidemicscenarioapplication.R;
import com.example.epidemicscenarioapplication.base.BaseFragment;

/**
 * @author sly
 * @version 1.0
 * @date 2020/6/28
 * @description com.example.epidemicscenarioapplication.ui.fragment
 */
public class FullPlatformDataFragment extends BaseFragment {
    @Override
    protected void initView() {
        MyListener myListener = new MyListener();
        RootView.findViewById(R.id.btn_alijiankang).setOnClickListener(myListener);
        RootView.findViewById(R.id.btn_baidu).setOnClickListener(myListener);
        RootView.findViewById(R.id.btn_tengxun).setOnClickListener(myListener);
        RootView.findViewById(R.id.btn_diyicaijing).setOnClickListener(myListener);
        RootView.findViewById(R.id.btn_zhihu).setOnClickListener(myListener);
        RootView.findViewById(R.id.btn_meisi).setOnClickListener(myListener);
        RootView.findViewById(R.id.btn_kuake).setOnClickListener(myListener);
        RootView.findViewById(R.id.btn_dingxiangyuan).setOnClickListener(myListener);
    }

    @Override
    protected int getResId() {
        return R.layout.full_platform_data_fragment;
    }

    class MyListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_alijiankang:
                    break;
                case R.id.btn_meisi:
                    break;
                case R.id.btn_baidu:
                    break;
                case R.id.btn_dingxiangyuan:
                    break;
                case R.id.btn_kuake:
                    break;
                case R.id.btn_tengxun:
                    break;
                case R.id.btn_zhihu:
                    break;
                case R.id.btn_diyicaijing:
                    break;
                default:
                    break;
            }
        }
    }
}

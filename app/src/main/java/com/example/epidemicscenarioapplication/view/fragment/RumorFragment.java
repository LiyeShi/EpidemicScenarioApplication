package com.example.epidemicscenarioapplication.view.fragment;


import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.epidemicscenarioapplication.R;
import com.example.epidemicscenarioapplication.base.BaseFragment;
import com.example.epidemicscenarioapplication.presenter.impl.RumorPresenter;
import com.example.epidemicscenarioapplication.utils.ToastUtil;
import com.example.epidemicscenarioapplication.view.IRumorView;

/**
 * @author sly
 * @version 1.0
 * @date 2020/6/28
 * @description com.example.epidemicscenarioapplication.view.fragment
 */
public class RumorFragment extends BaseFragment implements IRumorView {
    private static final String TAG = "RumorFragment";
    private RumorPresenter mRumorPresenter;

    @Override
    protected void initListener() {

    }

    @Override
    protected void initPresenter() {
        mRumorPresenter = new RumorPresenter(this);
    }

    @Override
    protected void initView() {
        mRootView.findViewById(R.id.btn_load_data).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mRumorPresenter.load();
            }
        });
    }

    @Override
    protected int getResId() {
        return R.layout.rumor_fragment;
    }

    @Override
    public void showSuccessView() {
        Log.d(TAG, "showSuccessView: 加载成功");
        ToastUtil.showToast(mRootView.getContext(), "数据加载成功");
    }

    @Override
    public void showErrorTips() {
        Log.d(TAG, "showSuccessView: 加载失败");
        ToastUtil.showToast(mRootView.getContext(), "数据加载失败");
    }
}

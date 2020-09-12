package com.example.epidemicscenarioapplication.view.fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.epidemicscenarioapplication.R;
import com.example.epidemicscenarioapplication.base.BaseFragment;

import com.example.epidemicscenarioapplication.custom.TipsDialog;
import com.example.epidemicscenarioapplication.databinding.MineFragmentBinding;
import com.example.epidemicscenarioapplication.view.activity.WebPageActivity;


/**
 * @author sly
 * @version 1.0
 * @date 2020/6/28
 * @description com.example.epidemicscenarioapplication.view.fragment
 */

public class AboutUsFragment extends BaseFragment {

    private MineFragmentBinding mMineFragmentBinding;
    private MyListener mMyListener;

    @Override
    protected void initListener() {
        mMineFragmentBinding.itemone.setOnClickListener(mMyListener);
        mMineFragmentBinding.projectAddress.setOnClickListener(mMyListener);
        mMineFragmentBinding.itemthree.setOnClickListener(mMyListener);
    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void initView() {
        setViewState(ViewState.SUCCESS);
        mMineFragmentBinding.itemone.setTextViewText("致谢");
        mMineFragmentBinding.projectAddress.setTextViewText("项目地址");
        mMineFragmentBinding.itemone.setTextViewText("致谢");
        mMyListener = new MyListener();

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
                case R.id.itemone:
                    TipsDialog tipsDialog = new TipsDialog(getContext(), R.layout.base_tips_dialog);
                    tipsDialog.setHead("致谢");
                    tipsDialog.setBody("感谢LiangWuCode提供的数据支持，本软件大多数数据均来自改接口，仓库地址https://github.com/LiangWuCode/2019-nCov-api");
                    tipsDialog.show();
                    break;
                case R.id.project_address:
                    WebPageActivity.start(getContext(),"https://github.com/Stone-s/EpidemicScenarioApplication");
                    break;
                default:
                    break;
            }
        }
    }
}

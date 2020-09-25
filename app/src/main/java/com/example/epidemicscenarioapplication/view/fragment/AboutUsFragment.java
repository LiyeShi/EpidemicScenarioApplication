package com.example.epidemicscenarioapplication.view.fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.epidemicscenarioapplication.R;
import com.example.epidemicscenarioapplication.base.BaseFragment;

import com.example.epidemicscenarioapplication.custom.TipsDialog;
import com.example.epidemicscenarioapplication.custom.TipsDialog_ThankYou;
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
        mMineFragmentBinding.tvThankYou.setOnClickListener(mMyListener);
        mMineFragmentBinding.tvProjectAddress.setOnClickListener(mMyListener);
        mMineFragmentBinding.tvAboutUs.setOnClickListener(mMyListener);
    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void initView() {
        setViewState(ViewState.SUCCESS);
        mMineFragmentBinding.tvThankYou.setTextViewText("致谢");
        mMineFragmentBinding.tvProjectAddress.setTextViewText("项目开源地址");
        mMineFragmentBinding.tvAboutUs.setTextViewText("联系我们");
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


    public class MyListener implements View.OnClickListener {

        private TipsDialog_ThankYou mTipsDialog;

        @Override
        public void onClick(View v) {
            mTipsDialog = TipsDialog_ThankYou.getInstance(getContext(), R.style.custom_dialog);
            mTipsDialog.setOkOnclickListener("确认", () -> {
                mTipsDialog.dismiss();
            });
            switch (v.getId()) {
                case R.id.tv_thank_you:
                    mTipsDialog.setHead("致谢");
                    mTipsDialog.setBody("感谢LiangWuCode提供的数据支持，本软件大多数据均来自该接口，仓库地址https://github.com/LiangWuCode/2019-nCov-api,以及其他所有在该软件出现的互联网资源的提供者。");
                    mTipsDialog.setCanceledOnTouchOutside(false);
                    mTipsDialog.show();
                    break;
                case R.id.tv_project_address:
                    WebPageActivity.start(getContext(), "https://github.com/Stone-s/EpidemicScenarioApplication");
                    break;
                case R.id.tv_about_us:
                    mTipsDialog.setHead("联系我们");
                    mTipsDialog.setBody("山东省济南市历城区旅游路4516号山东商业职业技术学院智能制造与服务学院物联网协会");
                    mTipsDialog.setCanceledOnTouchOutside(false);
                    mTipsDialog.show();
                    break;
                default:
                    break;
            }
        }
    }
}

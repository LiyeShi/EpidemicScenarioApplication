package com.example.epidemicscenarioapplication.view.fragment;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.example.epidemicscenarioapplication.R;
import com.example.epidemicscenarioapplication.databinding.HomeDoctorsFragmentBinding;
import com.example.epidemicscenarioapplication.view.activity.WebPageActivity;

/**
 * @author : 鑫宇
 * e-mail : 1769314609@qq.com
 * time   : 2020/09/10
 * desc   :
 * version: 1.0
 */
public class GratitudeFragment extends DialogFragment implements View.OnClickListener {

    private HomeDoctorsFragmentBinding mBinding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = HomeDoctorsFragmentBinding.inflate(inflater, container, false);
        initListener();
        return mBinding.getRoot();
    }

    private void initListener() {
        mBinding.cdQin1.setOnClickListener(this);
        mBinding.cdJi1.setOnClickListener(this);
        mBinding.cdGan.setOnClickListener(this);
        mBinding.cdLongjiang.setOnClickListener(this);
        mBinding.cdJi2.setOnClickListener(this);
        mBinding.cdLu.setOnClickListener(this);
        mBinding.cdYun.setOnClickListener(this);
        mBinding.cdShu.setOnClickListener(this);
        mBinding.cdWan.setOnClickListener(this);
        mBinding.cdGui1.setOnClickListener(this);
        mBinding.cdLiao.setOnClickListener(this);
        mBinding.cdQin1.setOnClickListener(this);
        mBinding.cdYu1.setOnClickListener(this);
        mBinding.cdZhe.setOnClickListener(this);
        mBinding.cdSu.setOnClickListener(this);
        mBinding.cdMin.setOnClickListener(this);
        mBinding.cdHu.setOnClickListener(this);
        mBinding.cdYu2.setOnClickListener(this);
        mBinding.cdJin1.setOnClickListener(this);
        mBinding.cdYue.setOnClickListener(this);
        mBinding.cdJin2.setOnClickListener(this);
        mBinding.cdXiang.setOnClickListener(this);
        mBinding.cdMeng.setOnClickListener(this);
        mBinding.cdGui2.setOnClickListener(this);
    }

    @Override
    public void onStart() {
        super.onStart();
        Window win = getDialog().getWindow();
        // 一定要设置Background，如果不设置，window属性设置无效
        win.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        DisplayMetrics dm = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(dm);

        WindowManager.LayoutParams params = win.getAttributes();
        params.gravity = Gravity.CENTER;
        // 使用ViewGroup.LayoutParams，以便Dialog 宽度充满整个屏幕
//        params.width =  ViewGroup.LayoutParams.MATCH_PARENT;
//        params.height = ViewGroup.LayoutParams.WRAP_CONTENT;
        win.setAttributes(params);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.cd_qin1:
                WebPageActivity.start(getContext(), "https://mp.weixin.qq.com/s/7VgjiKSOs7r9-wg-qIKc1g");
                break;
            case R.id.cd_ji1:
                WebPageActivity.start(getContext(), "https://mp.weixin.qq.com/s/Sx16K03D3RI_1FEq-BbdgA");
                break;
            case R.id.cd_gan:
                WebPageActivity.start(getContext(), "https://mp.weixin.qq.com/s/B-HbWIhZDabS2PXBhdEj1w");
                break;
            case R.id.cd_longjiang:
                WebPageActivity.start(getContext(), "https://mp.weixin.qq.com/s/df3FJaUbSX0VPVo6QtTtcw");
                break;
            case R.id.cd_ji2:
                WebPageActivity.start(getContext(), "https://mp.weixin.qq.com/s/IV0N4CY8nGA-XHOkxuqDCw");
                break;
            case R.id.cd_lu:
                WebPageActivity.start(getContext(), "https://mp.weixin.qq.com/s/Sl-ekQpliXAzodEcQumAzw");
                break;
            case R.id.cd_yun:
                WebPageActivity.start(getContext(), "https://mp.weixin.qq.com/s/X9l-DQQRxD2SoJxwD2IlyQ");
                break;
            case R.id.cd_shu:
                WebPageActivity.start(getContext(), "https://mp.weixin.qq.com/s/QjVB6FL98MST7cbXoaFMXw");
                break;
            case R.id.cd_wan:
                WebPageActivity.start(getContext(), "https://mp.weixin.qq.com/s/j1PnAGovi9RxsbcaAXQsig");
                break;
            case R.id.cd_gui1:
                WebPageActivity.start(getContext(), "https://mp.weixin.qq.com/s/hfUo2CINiBF2E-mAKjzBrQ");
                break;
            case R.id.cd_liao:
                WebPageActivity.start(getContext(), "https://mp.weixin.qq.com/s/x9ls8R24S-YoRO6ZyysvJA");
                break;
            case R.id.cd_yu1:
                WebPageActivity.start(getContext(), "https://mp.weixin.qq.com/s/ctvVuNl-Eq_KRn2LJt65Dg");
                break;
            case R.id.cd_zhe:
                WebPageActivity.start(getContext(), "https://mp.weixin.qq.com/s/ZWp3l_AIB7qsgypjuQXUEA");
                break;
            case R.id.cd_su:
                WebPageActivity.start(getContext(), "https://mp.weixin.qq.com/s/IBfIP5bcGTNi6yLXEmTqVA");
                break;
            case R.id.cd_min:
                WebPageActivity.start(getContext(), "https://mp.weixin.qq.com/s/3LaYlEmaHU9cah7B86VdoA");
                break;
            case R.id.cd_hu:
                WebPageActivity.start(getContext(), "https://mp.weixin.qq.com/s/6P7j7P9zimMylk9n70vrwQ");
                break;
            case R.id.cd_yu2:
                WebPageActivity.start(getContext(), "https://mp.weixin.qq.com/s/DSgqfJ7vxkzTPgbGRyJIQA");
                break;
            case R.id.cd_jin1:
                WebPageActivity.start(getContext(), "https://mp.weixin.qq.com/s/ToQvsWdic0X2voy-BKfw-Q");
                break;
            case R.id.cd_yue:
                WebPageActivity.start(getContext(), "https://mp.weixin.qq.com/s/PkhPo1fcN6Wb854b6SjdPg");
                break;
            case R.id.cd_jin2:
                WebPageActivity.start(getContext(), "https://mp.weixin.qq.com/s/-m40tEGdH8qI34KBqJytVA");
                break;
            case R.id.cd_xiang:
                WebPageActivity.start(getContext(), "https://mp.weixin.qq.com/s/Vnv-irtICL8h2FdRkNCE0w");
                break;
            case R.id.cd_meng:
                WebPageActivity.start(getContext(), "https://mp.weixin.qq.com/s/upAkdeLVQNDsSE9WAm-dNQ");
                break;
            case R.id.cd_gui2:
                WebPageActivity.start(getContext(), "https://mp.weixin.qq.com/s/vMGf8D09Qs_-vnjadn3GDQ");
                break;
            default:
                break;
        }
    }
}

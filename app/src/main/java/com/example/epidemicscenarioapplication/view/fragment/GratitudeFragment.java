package com.example.epidemicscenarioapplication.view.fragment;

import android.app.Dialog;
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
import androidx.fragment.app.Fragment;

import com.example.epidemicscenarioapplication.R;
import com.example.epidemicscenarioapplication.databinding.HomeDoctorsFragmentBinding;

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
        mBinding.cdYu.setOnClickListener(this);
        mBinding.cdZhe.setOnClickListener(this);
        mBinding.cdSu.setOnClickListener(this);
        mBinding.cdMin.setOnClickListener(this);
        mBinding.cdHu.setOnClickListener(this);
        mBinding.cdYv.setOnClickListener(this);
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
                break;
            case R.id.cd_ji1:
                break;
            case R.id.cd_gan:
                break;
            case R.id.cd_longjiang:
                break;
            case R.id.cd_ji2:
                break;
            case R.id.cd_lu:
                break;
            case R.id.cd_yun:
                break;
            case R.id.cd_shu:
                break;
            case R.id.cd_wan:
                break;
            case R.id.cd_gui1:
                break;
            case R.id.cd_liao:
                break;
            case R.id.cd_qin2:
                break;
            case R.id.cd_yv:
                break;
            case R.id.cd_zhe:
                break;
            case R.id.cd_su:
                break;
            case R.id.cd_min:
                break;
            case R.id.cd_hu:
                break;
            case R.id.cd_yu:
                break;
            case R.id.cd_jin1:
                break;
            case R.id.cd_yue:
                break;
            case R.id.cd_jin2:
                break;
            case R.id.cd_xiang:
                break;
            case R.id.cd_meng:
                break;
            case R.id.cd_gui2:
                break;

            default:
                break;
        }
    }
}

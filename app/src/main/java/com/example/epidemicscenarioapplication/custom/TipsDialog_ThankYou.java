package com.example.epidemicscenarioapplication.custom;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;

import com.example.epidemicscenarioapplication.databinding.BaseTipsDialogBinding;
import com.example.epidemicscenarioapplication.databinding.BaseTipsDialogThankBinding;

/**
 * @author : 鑫宇
 * e-mail : 1769314609@qq.com
 * time   : 2020/09/07
 * desc   :
 * version: 1.0
 */
public class TipsDialog_ThankYou extends Dialog {
    private String mCancel;
    private  String mNext;
    private  static String mHead;
    private static String mBody;
    private OnCancelClickListener mOnCancelListener;
    private OnOkClickListener mOnOkListener;
    private BaseTipsDialogThankBinding mBinding;
    private static TipsDialog_ThankYou instance;
    private static TipsDialog_ThankYou sDialog;


    public static TipsDialog_ThankYou getInstance(Context context, int styleId){
        if (instance == null) {
            sDialog = new TipsDialog_ThankYou(context, styleId);
        }
        return sDialog;
    }


    public TipsDialog_ThankYou(@NonNull Context context, int themeResId) {
        super(context,  themeResId);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = BaseTipsDialogThankBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());
        initData();
        initEvent();

    }

    private void initEvent() {
        mBinding.tvDialogNext.setOnClickListener(v -> {
            if (mOnOkListener != null) {
                mOnOkListener.onOKClick();
            }
        });
    }

    private void initData() {
        if (mHead != null) {
            mBinding.tvDialogHead.setText(mHead);
        }
        if (mBody != null) {
            mBinding.tvDialogBody.setText(mBody);
        }
        if (mNext != null) {
            mBinding.tvDialogNext.setText(mNext);
        }
    }

    public void setCancel(String cancel) {
        mCancel = cancel;
    }

    public void setNext(String next) {
        mNext = next;
    }

    public void setHead(String head) {
        mHead = head;
    }

    public void setBody(String body) {
        mBody = body;
    }

    public interface OnOkClickListener {
        void onOKClick();
    }

    public interface OnCancelClickListener {
        void onCancelClick();
    }

    public void setCancelOnclickListener(String str, OnCancelClickListener cancelOnclickListener) {
        if (str != null) {
            mCancel = str;
        }
        this.mOnCancelListener = cancelOnclickListener;
    }

    public void setOkOnclickListener(String str, OnOkClickListener onOkClickListener) {
        if (str != null) {
            mNext = str;
        }
        this.mOnOkListener = onOkClickListener;
    }
}

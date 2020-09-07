package com.example.epidemicscenarioapplication.custom;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;


import androidx.annotation.NonNull;

import com.example.epidemicscenarioapplication.R;
import com.example.epidemicscenarioapplication.databinding.BaseTipsDialogBinding;

/**
 * @author : 鑫宇
 * e-mail : 1769314609@qq.com
 * time   : 2020/09/07
 * desc   :
 * version: 1.0
 */
public class TipsDialog extends Dialog {
    private String mCancel;
    private  String mNext;
    private  static String mHead;
    private static String mBody;
    private OnCancelClickListener mOnCancelListener;
    private OnOkClickListener mOnOkListener;
    private BaseTipsDialogBinding mBinding;
    private static TipsDialog instance;
    private static TipsDialog sDialog;


    public static TipsDialog getInstance(Context context,int styleId,String head,String body){
        mHead=head;
        mBody=body;
        if (instance == null) {
            sDialog = new TipsDialog(context, styleId);
        }
        return sDialog;
    }

    public TipsDialog(@NonNull Context context, int themeResId) {
        super(context,  themeResId);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding =BaseTipsDialogBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());
        initData();
        initEvent();

    }

    private void initEvent() {
        mBinding.tvDialogCancel.setOnClickListener(v -> {
            if (mOnCancelListener != null) {
                mOnCancelListener.onCancelClick();
            }
        });
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
        if (mCancel != null) {
            mBinding.tvDialogCancel.setText(mCancel);
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

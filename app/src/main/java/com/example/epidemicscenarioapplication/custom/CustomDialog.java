package com.example.epidemicscenarioapplication.custom;

import android.app.Dialog;
import android.content.Context;
import android.view.View;

import com.example.epidemicscenarioapplication.R;
import com.example.epidemicscenarioapplication.databinding.ViewDialogBinding;

/**
 * @author sly
 * @version 1.0
 * @date 2020/7/6
 * @description com.example.epidemicscenarioapplication.custom
 */
public class CustomDialog extends Dialog {

    public  View mMView;

    public   ViewDialogBinding mMBinding;

    public CustomDialog(Context context, int layoutId) {
        //使用自定义Dialog样式
        super(context, R.style.custom_dialog);
//使用ViewBinding的写法
        mMBinding = ViewDialogBinding.inflate(getLayoutInflater());
        mMView = mMBinding.getRoot();

        setContentView(mMView);

        //点击外部不可消失
        //setCancelable(false);
    }
}

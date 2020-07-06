package com.example.epidemicscenarioapplication.custom;

import android.app.Dialog;
import android.content.Context;

import androidx.annotation.NonNull;

import com.example.epidemicscenarioapplication.R;

/**
 * @author sly
 * @version 1.0
 * @date 2020/7/6
 * @description com.example.epidemicscenarioapplication.custom
 */
public class CustomDialog extends Dialog {
    public CustomDialog(Context context,int layoutId) {

        //使用自定义Dialog样式
        super(context, R.style.custom_dialog);
        //指定布局
        setContentView(layoutId);

        //点击外部不可消失
        //setCancelable(false);
    }
}

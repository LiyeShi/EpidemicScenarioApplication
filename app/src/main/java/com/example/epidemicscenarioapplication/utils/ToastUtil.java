package com.example.epidemicscenarioapplication.utils;

import android.content.Context;
import android.widget.Toast;


/**
 * @author sly
 * @version 1.0
 * @date 2020/6/28
 * @description 解决Toast重复弹出的问题
 */
public class ToastUtil {
    static Toast sToast;

    public static void showToast(Context context, String content) {
        if (sToast == null) {
            sToast = Toast.makeText(context.getApplicationContext(), content, Toast.LENGTH_SHORT);
        } else {
            sToast.setText(content);
        }
        sToast.show();
    }

    public static void showLongToast(Context context, String content) {
        if (sToast == null) {
            sToast = Toast.makeText(context.getApplicationContext(), content, Toast.LENGTH_SHORT);
        } else {
            sToast.setText(content);
        }
        sToast.show();
    }

}

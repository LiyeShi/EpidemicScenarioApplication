package com.example.epidemicscenarioapplication.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * @author sly
 * @version 1.0
 * @date 2020/6/29
 * @description com.example.epidemicscenarioapplication.utils
 */
public class SpUtils {
    public static void putString(Context context, String key, String value) {
        SharedPreferences sp = context.getSharedPreferences("info", Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = sp.edit();
        edit.putString(key, value);
        edit.apply();
    }

    public static String getString(Context context, String key, String defValue) {
        SharedPreferences sp = context.getSharedPreferences("info", Context.MODE_PRIVATE);
        String string = sp.getString(key, defValue);
        return string;
    }

    public  static void putBoolean(Context context, String key, boolean value) {
        SharedPreferences sp = context.getSharedPreferences("info", Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = sp.edit();
        edit.putBoolean(key, value);
        edit.apply();
    }

    public  static boolean getBoolean(Context context, String key, boolean defValue) {
        SharedPreferences sp = context.getSharedPreferences("info", Context.MODE_PRIVATE);
        boolean value = sp.getBoolean(key, defValue);
        return  value;
    }
}

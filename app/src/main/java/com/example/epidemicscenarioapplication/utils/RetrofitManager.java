package com.example.epidemicscenarioapplication.utils;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author sly
 * @version 1.0
 * @date 2020/6/28
 * @description com.example.epidemicscenarioapplication.utils
 */
public class RetrofitManager {
    //单例模式 具体为什么这么写以后再学习
    private static final RetrofitManager ourInstance = new RetrofitManager();
    private final Retrofit mRetrofitManager;

    private RetrofitManager() {
//        创建 retrofit
        mRetrofitManager = new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public Retrofit getRetrofit() {
        return mRetrofitManager;
    }
}

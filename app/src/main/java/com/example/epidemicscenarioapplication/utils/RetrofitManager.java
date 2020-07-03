package com.example.epidemicscenarioapplication.utils;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author sly
 * @version 1.0
 * @date 2020/6/28
 * @description com.example.epidemicscenarioapplication.utils 这里的单例模式应该是有问题的吧烦死了
 */
public class RetrofitManager {

    private final Retrofit mRetrofit;

    public static RetrofitManager getInstance(String baseUrl) {
        return new RetrofitManager(baseUrl);
    }

    private RetrofitManager(String baseUrl) {
        mRetrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public Retrofit getRetrofit() {
        return mRetrofit;
    }
}

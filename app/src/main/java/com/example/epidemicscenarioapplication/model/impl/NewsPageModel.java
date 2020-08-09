package com.example.epidemicscenarioapplication.model.impl;


import android.content.Context;
import android.util.Log;

import com.example.epidemicscenarioapplication.domain.API;
import com.example.epidemicscenarioapplication.domain.LocalNewsDataBean;
import com.example.epidemicscenarioapplication.model.ILocalNewsModel;
import com.example.epidemicscenarioapplication.presenter.ILocalNewsFragmentPresenter;
import com.example.epidemicscenarioapplication.utils.ConstantsUtils;
import com.example.epidemicscenarioapplication.utils.RetrofitManager;
import com.example.epidemicscenarioapplication.utils.SpUtils;

import java.net.HttpURLConnection;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * @author sly
 * @version 1.0
 * @date 2020/7/8
 * @description com.example.epidemicscenarioapplication.model.impl
 */
public class NewsPageModel implements ILocalNewsModel {
    private static final String TAG = "NewsPageModel";
    ILocalNewsFragmentPresenter newsPresenter;

    public NewsPageModel(ILocalNewsFragmentPresenter newsPresenter) {
        this.newsPresenter = newsPresenter;
    }


    @Override
    public void loadData(Context context) {
        RetrofitManager manager = RetrofitManager.getInstance(ConstantsUtils.BASE_URL);
        Retrofit retrofit = manager.getRetrofit();
        API api = retrofit.create(API.class);
        String cityName = SpUtils.getString(context, ConstantsUtils.LOCATION_CITY, "临沂");
        Call<LocalNewsDataBean> news = api.getLocalNews(cityName);
        news.enqueue(new Callback<LocalNewsDataBean>() {
            @Override
            public void onResponse(Call<LocalNewsDataBean> call, Response<LocalNewsDataBean> response) {
                Log.d(TAG, "onResponse: ");
                if (response.code() == HttpURLConnection.HTTP_OK) {
                    LocalNewsDataBean newsDataBean = response.body();
                    Log.d(TAG, "onResponse: 本地新闻结果==>"+newsDataBean);
                    newsPresenter.onloadDataSuccess(newsDataBean);
                }
            }

            @Override
            public void onFailure(Call<LocalNewsDataBean> call, Throwable t) {
                        newsPresenter.onloadDataError();
            }
        });
    }
}

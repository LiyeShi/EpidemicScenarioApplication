package com.example.epidemicscenarioapplication.model.impl;

import android.content.Context;
import android.util.Log;

import com.example.epidemicscenarioapplication.R;
import com.example.epidemicscenarioapplication.domain.API;
import com.example.epidemicscenarioapplication.domain.VerticalBannerDataBeans;
import com.example.epidemicscenarioapplication.model.IHomepageModel;
import com.example.epidemicscenarioapplication.presenter.impl.HomePagePresenter;
import com.example.epidemicscenarioapplication.utils.ConstantsUtils;
import com.example.epidemicscenarioapplication.utils.RetrofitManager;
import com.example.epidemicscenarioapplication.utils.SpUtils;

import java.net.HttpURLConnection;
import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * @author sly
 * @version 1.0
 * @date 2020/6/30
 * @description com.example.epidemicscenarioapplication.model.impl
 */
public class HomepageModel implements IHomepageModel {
    private static final String TAG = "HomepageModel";
    private HomePagePresenter homePagePresenter;
    private String mLocation;

    public HomepageModel(HomePagePresenter homePagePresenter) {
        this.homePagePresenter = homePagePresenter;
    }

    @Override
    public void loadBanner() {
        ArrayList<Integer> bannerList = new ArrayList<>();
        bannerList.add(R.drawable.bannerone);
        bannerList.add(R.drawable.banner);
        bannerList.add(R.drawable.bannerfour);
        //假装下载成功了
        homePagePresenter.loadBannerSuccess(bannerList);

    }

    /**
     * 首页竖直轮播图请求天气
     * @param context
     */
    @Override
    public void loadVerticalBannerWeatherInfo(Context context,String location) {
        mLocation=location;
        Retrofit retrofit = RetrofitManager.getInstance(ConstantsUtils.WEATHER_API).getRetrofit();
        API api = retrofit.create(API.class);
        Call<VerticalBannerDataBeans.WeatherDataBean> weatherJson = api.getWeatherJson(location);
        weatherJson.enqueue(new Callback<VerticalBannerDataBeans.WeatherDataBean>() {
            @Override
            public void onResponse(Call<VerticalBannerDataBeans.WeatherDataBean> call, Response<VerticalBannerDataBeans.WeatherDataBean> response) {
                int code = response.code();
                Log.d(TAG, "onResponse: 天气返回码==》" + code);
                if (code == HttpURLConnection.HTTP_OK) {
                    String s = response.body().toString();
                    Log.d(TAG, "onResponse: 数据==》" + s);
                    homePagePresenter.loadVerticalBannerWeatherSuccess(response.body());
                }
            }

            @Override
            public void onFailure(Call<VerticalBannerDataBeans.WeatherDataBean> call, Throwable t) {
                Log.d(TAG, "onFailure: 失败==>" + t.getMessage());
            }

        });

    }

    @Override
    public void loadCountyList() {
        Retrofit retrofit = RetrofitManager.getInstance(ConstantsUtils.BASE_URL).getRetrofit();
        API api = retrofit.create(API.class);
        Call<VerticalBannerDataBeans.CountyListDataBean> countyList = api.getCountyList(mLocation);
        countyList.enqueue(new Callback<VerticalBannerDataBeans.CountyListDataBean>() {
            @Override
            public void onResponse(Call<VerticalBannerDataBeans.CountyListDataBean> call, Response<VerticalBannerDataBeans.CountyListDataBean> response) {
                if (response.code() == HttpURLConnection.HTTP_OK) {
                    VerticalBannerDataBeans.CountyListDataBean dataBean = response.body();
                    Log.d(TAG, "onResponse: 返回结果：==>" + dataBean);
                    homePagePresenter.loadCountyListSuccess(dataBean);
                }
            }

            @Override
            public void onFailure(Call<VerticalBannerDataBeans.CountyListDataBean> call, Throwable t) {
                homePagePresenter.loadBannerError();
            }
        });
    }
}

package com.example.epidemicscenarioapplication.presenter;

import android.content.Context;

import com.example.epidemicscenarioapplication.domain.VerticalBannerDataBeans;

import java.util.List;

/**
 * @author sly
 * @version 1.0
 * @date 2020/6/30
 * @description com.example.epidemicscenarioapplication.presenter
 */
public interface IHomepagePresnter {
    void loadBanner();

    void loadBannerSuccess(List data);

    void loadBannerError();

    void loadVerticalBannerWeatherSuccess(VerticalBannerDataBeans.WeatherDataBean dataBean);

    void loadVerticalBannerWeatherError();

    void loadVerticalBannerWeather(Context context);

}

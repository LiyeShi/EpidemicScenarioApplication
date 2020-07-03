package com.example.epidemicscenarioapplication.view;

import com.example.epidemicscenarioapplication.domain.VerticalBannerDataBeans;

import java.util.List;

/**
 * @author sly
 * @version 1.0
 * @date 2020/6/30
 * @description com.example.epidemicscenarioapplication.view
 */
public interface IHomepageView {
    void showBanner(List data);

    void showBannerTipWeather(VerticalBannerDataBeans.WeatherDataBean dataBeans);
}

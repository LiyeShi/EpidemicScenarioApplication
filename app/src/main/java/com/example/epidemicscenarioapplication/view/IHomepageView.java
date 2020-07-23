package com.example.epidemicscenarioapplication.view;

import com.example.epidemicscenarioapplication.base.IBaseView;
import com.example.epidemicscenarioapplication.domain.VerticalBannerDataBeans;

/**
 * @author sly
 * @version 1.0
 * @date 2020/6/30
 * @description com.example.epidemicscenarioapplication.view
 */
public interface IHomepageView<T> extends IBaseView<T> {

    void showBannerTipWeather(VerticalBannerDataBeans.WeatherDataBean dataBeans);
}

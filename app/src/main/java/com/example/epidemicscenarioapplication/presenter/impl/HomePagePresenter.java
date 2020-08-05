package com.example.epidemicscenarioapplication.presenter.impl;

import android.content.Context;

import com.example.epidemicscenarioapplication.domain.VerticalBannerDataBeans;
import com.example.epidemicscenarioapplication.model.impl.HomepageModel;
import com.example.epidemicscenarioapplication.presenter.IHomepagePresnter;
import com.example.epidemicscenarioapplication.view.IHomepageView;

import java.util.ArrayList;
import java.util.List;


/**
 * @author sly
 * @version 1.0
 * @date 2020/6/30
 * @description com.example.epidemicscenarioapplication.presenter.impl
 */
public class HomePagePresenter implements IHomepagePresnter {
    private IHomepageView mIHomepageview;
    private  HomepageModel mHomepageModel;

    public HomePagePresenter(IHomepageView iHomepageView) {
        this.mIHomepageview=iHomepageView;
        mHomepageModel = new HomepageModel(this);
    }


    @Override
    public void loadBanner() {
        mHomepageModel.loadBanner();
    }



    @Override
    public void loadBannerSuccess(List data) {
        mIHomepageview.showSuccessView((ArrayList) data);
    }

    @Override
    public void loadBannerError() {

    }


    @Override
    public void loadVerticalBannerWeatherSuccess(VerticalBannerDataBeans.WeatherDataBean dataBean) {
        mIHomepageview.showBannerTipWeather(dataBean);
    }

    @Override
    public void loadVerticalBannerWeatherError() {

    }

    @Override
    public void loadVerticalBannerWeather(Context context) {
        mHomepageModel.loadVerticalBannerWeatherInfo(context);
    }

    @Override
    public void loadCountyList() {
        mHomepageModel.loadCountyList();
    }

    @Override
    public void loadCountyListSuccess(VerticalBannerDataBeans.CountyListDataBean dataBean) {
        mIHomepageview.showCountyListMessage(dataBean);
    }

    @Override
    public void loadCountyListError() {

    }
}

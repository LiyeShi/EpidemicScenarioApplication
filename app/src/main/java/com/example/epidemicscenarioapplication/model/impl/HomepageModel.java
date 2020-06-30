package com.example.epidemicscenarioapplication.model.impl;

import com.example.epidemicscenarioapplication.R;
import com.example.epidemicscenarioapplication.adapter.DataBean;
import com.example.epidemicscenarioapplication.model.IHomepageModel;
import com.example.epidemicscenarioapplication.presenter.impl.HomePagePresenter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sly
 * @version 1.0
 * @date 2020/6/30
 * @description com.example.epidemicscenarioapplication.model.impl
 */
public class HomepageModel implements IHomepageModel {
    private HomePagePresenter homePagePresenter;

    public HomepageModel(HomePagePresenter homePagePresenter) {
        this.homePagePresenter = homePagePresenter;
    }

    @Override
    public void loadBanner() {
        ArrayList<DataBean> bannerList = new ArrayList<>();
        bannerList.add(new DataBean(R.drawable.bannerone));
        bannerList.add(new DataBean(R.drawable.bannertwo));
        bannerList.add(new DataBean(R.drawable.bannerfour));

        //假装下载成功了
        homePagePresenter.loadBannerSuccess(bannerList);

    }
}

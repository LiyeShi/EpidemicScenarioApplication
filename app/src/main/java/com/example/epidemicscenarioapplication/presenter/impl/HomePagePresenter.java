package com.example.epidemicscenarioapplication.presenter.impl;

import com.example.epidemicscenarioapplication.model.impl.HomepageModel;
import com.example.epidemicscenarioapplication.presenter.IHomepagePresnter;
import com.example.epidemicscenarioapplication.view.IHomepageView;

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
        mIHomepageview.showBanner(data);
    }

    @Override
    public void loadBannerError() {

    }
}

package com.example.epidemicscenarioapplication.presenter.impl;

import android.content.Context;

import com.example.epidemicscenarioapplication.domain.LocalNewsDataBean;
import com.example.epidemicscenarioapplication.model.impl.NewsPageModel;
import com.example.epidemicscenarioapplication.presenter.ILocalNewsFragmentPresenter;
import com.example.epidemicscenarioapplication.view.INewsView;

/**
 * author : 鑫宇
 * e-mail : 1769314609@qq.com
 * time   : 2020/07/24
 * desc   :
 * version: 1.0
 */
public class LocalNewsPresenter implements ILocalNewsFragmentPresenter {
    INewsView mINewsView;
    private final NewsPageModel mNewsPageModel;

    public LocalNewsPresenter(INewsView INewsView) {
        mINewsView = INewsView;
        mNewsPageModel = new NewsPageModel(this);
    }



    @Override
    public void loadData(Context context) {
        mINewsView.showLoadingView();
        mNewsPageModel.loadData(context);
    }

    @Override
    public void onloadDataSuccess(LocalNewsDataBean dataBeans) {
        mINewsView.showSuccessView(dataBeans);
    }


    @Override
    public void onloadDataError() {
        mINewsView.showErrorView();
    }
}

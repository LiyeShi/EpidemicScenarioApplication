package com.example.epidemicscenarioapplication.model.impl;

import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.epidemicscenarioapplication.model.IEpidemicMapModel;
import com.example.epidemicscenarioapplication.presenter.impl.EpidemicMapPresenter;

/**
 * @author sly
 * @version 1.0
 * @date 2020/7/1
 * @description com.example.epidemicscenarioapplication.model.impl
 */
public class EpidemicMapModel implements IEpidemicMapModel {
    EpidemicMapPresenter epidemicMapPresenter;

    public EpidemicMapModel(EpidemicMapPresenter epidemicMapPresenter) {
        this.epidemicMapPresenter = epidemicMapPresenter;
    }

    @Override
    public void loadWebview() {

            }}

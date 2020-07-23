package com.example.epidemicscenarioapplication.presenter.impl;

import com.example.epidemicscenarioapplication.base.IBasePresenter;
import com.example.epidemicscenarioapplication.domain.WikipediaDataBean;
import com.example.epidemicscenarioapplication.model.IEpidemicMapModel;
import com.example.epidemicscenarioapplication.model.impl.EpidemicMapModel;
import com.example.epidemicscenarioapplication.model.impl.WikipediaModel;
import com.example.epidemicscenarioapplication.view.IEpidemicMapView;

/**
 * @author sly
 * @version 1.0
 * @date 2020/7/1
 * @description com.example.epidemicscenarioapplication.presenter.impl
 */
public class EpidemicMapPresenter implements IBasePresenter {
    private IEpidemicMapView EpidemicMapActivity;
    private final IEpidemicMapModel mEpidemicMapModel;

    public EpidemicMapPresenter(IEpidemicMapView epidemicMapActivity) {
        EpidemicMapActivity = epidemicMapActivity;
        mEpidemicMapModel = new EpidemicMapModel(this);
    }

    @Override
    public void loadData(WikipediaModel.WikipediaType diagonsis) {
        mEpidemicMapModel.loadWebview();
    }

    @Override
    public void loadDataSuccess(WikipediaDataBean body) {

    }

    @Override
    public void loadDataError() {

    }
}

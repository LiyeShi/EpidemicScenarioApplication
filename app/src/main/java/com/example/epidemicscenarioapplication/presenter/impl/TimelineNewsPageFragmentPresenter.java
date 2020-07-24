package com.example.epidemicscenarioapplication.presenter.impl;

import com.example.epidemicscenarioapplication.domain.TimelineServiceDataBean;
import com.example.epidemicscenarioapplication.model.INewsPagerFragmentModel;
import com.example.epidemicscenarioapplication.model.impl.TimelineNewsPagerFragmentModel;
import com.example.epidemicscenarioapplication.presenter.INewsFragmentPresenter;
import com.example.epidemicscenarioapplication.view.INewsView;

import java.util.ArrayList;

/**
 * @author sly
 * @version 1.0
 * @date 2020/7/9
 * @description com.example.epidemicscenarioapplication.presenter
 */
public class TimelineNewsPageFragmentPresenter implements INewsFragmentPresenter<TimelineServiceDataBean> {
    INewsPagerFragmentModel mITimelineNewsPagerFragmentModel;
    INewsView mITimeLineServiceView;

    public TimelineNewsPageFragmentPresenter(INewsView iTimeLineServiceView) {
        mITimelineNewsPagerFragmentModel = new TimelineNewsPagerFragmentModel(this);
        mITimeLineServiceView = iTimeLineServiceView;
    }

    @Override
    public void loadData() {
        mITimelineNewsPagerFragmentModel.loadData();
    }

    @Override
    public void onloadDataSuccess(ArrayList<TimelineServiceDataBean> list) {
        mITimeLineServiceView.showSuccessView(list);
    }


    @Override
    public void onloadDataError() {
        mITimeLineServiceView.showErrorView();
    }
}

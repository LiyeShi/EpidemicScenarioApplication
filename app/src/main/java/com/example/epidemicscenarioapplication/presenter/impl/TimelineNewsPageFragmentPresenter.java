package com.example.epidemicscenarioapplication.presenter.impl;

import com.example.epidemicscenarioapplication.domain.TimelineServiceDataBean;
import com.example.epidemicscenarioapplication.model.ITimelineNewsPagerFragmentModel;
import com.example.epidemicscenarioapplication.model.impl.TimelineNewsPagerFragmentModel;
import com.example.epidemicscenarioapplication.presenter.ITimelineNewsPageFragmentPresenter;
import com.example.epidemicscenarioapplication.view.ITimeLineServiceView;

import java.util.ArrayList;

/**
 * @author sly
 * @version 1.0
 * @date 2020/7/9
 * @description com.example.epidemicscenarioapplication.presenter
 */
public class TimelineNewsPageFragmentPresenter implements ITimelineNewsPageFragmentPresenter {
ITimelineNewsPagerFragmentModel mITimelineNewsPagerFragmentModel;
ITimeLineServiceView mITimeLineServiceView;

    public TimelineNewsPageFragmentPresenter( ITimeLineServiceView ITimeLineServiceView) {
        mITimelineNewsPagerFragmentModel = new TimelineNewsPagerFragmentModel(this);
        mITimeLineServiceView = ITimeLineServiceView;
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

    }
}

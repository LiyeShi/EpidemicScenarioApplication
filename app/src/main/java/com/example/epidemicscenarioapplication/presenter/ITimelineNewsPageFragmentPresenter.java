package com.example.epidemicscenarioapplication.presenter;

import com.example.epidemicscenarioapplication.domain.TimelineServiceDataBean;

import java.util.ArrayList;

/**
 * @author sly
 * @version 1.0
 * @date 2020/7/9
 * @description com.example.epidemicscenarioapplication.presenter
 */
public interface ITimelineNewsPageFragmentPresenter {
    void loadData();

    void onloadDataSuccess(ArrayList<TimelineServiceDataBean> list);

    void onloadDataError();

}

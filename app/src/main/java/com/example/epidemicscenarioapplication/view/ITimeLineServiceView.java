package com.example.epidemicscenarioapplication.view;

import com.example.epidemicscenarioapplication.domain.TimelineServiceDataBean;

import java.util.ArrayList;

/**
 * @author sly
 * @version 1.0
 * @date 2020/7/9
 * @description com.example.epidemicscenarioapplication.view
 */
public interface ITimeLineServiceView {
    void showSuccessView(ArrayList<TimelineServiceDataBean> list);

    void showErrorView();
}

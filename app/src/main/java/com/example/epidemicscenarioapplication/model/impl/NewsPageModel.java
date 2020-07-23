package com.example.epidemicscenarioapplication.model.impl;

import com.example.epidemicscenarioapplication.base.IBaseModel;
import com.example.epidemicscenarioapplication.base.IBasePresenter;

import java.util.List;

/**
 * @author sly
 * @version 1.0
 * @date 2020/7/8
 * @description com.example.epidemicscenarioapplication.model.impl
 */
public class NewsPageModel implements IBaseModel<List> {
    IBasePresenter newsPresenter;

    public NewsPageModel(IBasePresenter newsPresenter) {
        this.newsPresenter = newsPresenter;
    }

    @Override
    public void loadData(List list) {

    }
}

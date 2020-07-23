package com.example.epidemicscenarioapplication.presenter.impl;

import com.example.epidemicscenarioapplication.base.IBaseModel;
import com.example.epidemicscenarioapplication.base.IBasePresenter;
import com.example.epidemicscenarioapplication.base.IBaseView;
import com.example.epidemicscenarioapplication.domain.WikipediaDataBean;
import com.example.epidemicscenarioapplication.model.impl.NewsPageModel;
import com.example.epidemicscenarioapplication.model.impl.WikipediaModel;

/**
 * @author sly
 * @version 1.0
 * @date 2020/7/8
 * @description com.example.epidemicscenarioapplication.presenter.impl
 */
public class NewsPagePresent implements IBasePresenter {
    IBaseView newsPage;
    private final IBaseModel mNewsPageModel;

    public NewsPagePresent(IBaseView newsPage) {
        this.newsPage = newsPage;
        mNewsPageModel = new NewsPageModel(this);
    }

    @Override
    public void loadData(WikipediaModel.WikipediaType diagonsis) {

    }

    @Override
    public void loadDataSuccess(WikipediaDataBean body) {

    }

    @Override
    public void loadDataError() {

    }
}

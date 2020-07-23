package com.example.epidemicscenarioapplication.presenter.impl;

import com.example.epidemicscenarioapplication.domain.WikipediaDataBean;
import com.example.epidemicscenarioapplication.model.impl.WikipediaModel;
import com.example.epidemicscenarioapplication.presenter.IWikipediapresenter;
import com.example.epidemicscenarioapplication.view.IWikipediaView;

import java.lang.reflect.WildcardType;

import javax.crypto.spec.IvParameterSpec;

/**
 * @author sly
 * @version 1.0
 * @date 2020/6/28
 * @description com.example.epidemicscenarioapplication.presenter.impl
 * P层应该持有 M V 层的引用
 */
public class WikipediaPresenter implements IWikipediapresenter {
    //m层的引用是自己在p层实例化拿到的
    private WikipediaModel mWikipediaModel;
    //v层的引用是实例化p层的时候传过来的
    private IWikipediaView mIWikipediaView;

    public WikipediaPresenter(IWikipediaView iWikipediaView) {
        mIWikipediaView = iWikipediaView;
        mWikipediaModel  = new WikipediaModel(this);
    }


    @Override
    public void loadData(WikipediaModel.WikipediaType wikipediaType) {
//        进入这个方法，View显示加载状态
        mIWikipediaView.showLoadingView();
        mWikipediaModel.loadData(wikipediaType);
    }

    @Override
    public void loadDataSuccess(WikipediaDataBean body) {
        mIWikipediaView.showSuccessView(body);
    }

    @Override
    public void loadDataError() {
        mIWikipediaView.showErrorView();
    }
}

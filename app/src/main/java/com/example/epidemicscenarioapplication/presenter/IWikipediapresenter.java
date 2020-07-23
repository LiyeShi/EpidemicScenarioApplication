package com.example.epidemicscenarioapplication.presenter;

import com.example.epidemicscenarioapplication.base.IBasePresenter;
import com.example.epidemicscenarioapplication.model.impl.WikipediaModel;

import java.lang.reflect.WildcardType;

/**
 * author : 鑫宇
 * e-mail : 1769314609@qq.com
 * time   : 2020/07/23
 * desc   :
 * version: 1.0
 */
public interface IWikipediapresenter extends IBasePresenter {

    @Override
    void loadData(WikipediaModel.WikipediaType wikipediaType) ;


}

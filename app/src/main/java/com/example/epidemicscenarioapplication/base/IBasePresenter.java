package com.example.epidemicscenarioapplication.base;

import com.example.epidemicscenarioapplication.domain.WikipediaDataBean;
import com.example.epidemicscenarioapplication.model.impl.WikipediaModel;

/**
 * @author sly
 * @version 1.0
 * @date 2020/7/1
 * @description com.example.epidemicscenarioapplication.base
 */
public interface IBasePresenter {

    /**
     * 加载数据
     * @param diagonsis
     */
    void loadData(WikipediaModel.WikipediaType diagonsis);

    /**
     * 数据加载成功
     * @param body
     */
    void loadDataSuccess(WikipediaDataBean body);

    /**
     * 数据加载失败
     */
    void loadDataError();
}

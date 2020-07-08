package com.example.epidemicscenarioapplication.base;

/**
 * @author sly
 * @version 1.0
 * @date 2020/7/1
 * @description com.example.epidemicscenarioapplication.base
 */
public interface IBasePresenter {

    /**
     * 加载数据
     */
    void loadData();

    /**
     * 数据加载成功
     */
    void loadDataSuccess();

    /**
     * 数据加载失败
     */
    void loadDataError();
}

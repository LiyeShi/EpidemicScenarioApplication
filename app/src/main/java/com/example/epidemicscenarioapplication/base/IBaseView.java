package com.example.epidemicscenarioapplication.base;

/**
 * @author sly
 * @version 1.0
 * @date 2020/7/8
 * @description com.example.epidemicscenarioapplication.base
 */
public interface IBaseView {

    /**
     * 请求中的view
     */
    void loading();

    /**
     * 请求中的view
     */
    void loadSuccess();

    /**
     * 请求失败的view
     */
    void loadError();
}

package com.example.epidemicscenarioapplication.presenter;

/**
 * @author sly
 * @version 1.0
 * @date 2020/6/28
 * @description com.example.epidemicscenarioapplication.presenter
 * 接口作为连接Model和View的中间桥梁 注意命名 接口前加I P层后加presenter
 */
public interface IRumorPresenter1 {
    /**
     * 执行加载的任务
     */
    void load();

    /**
     *加载成功
     */
    void loadSuccess();

    /**
     * 加载失败
     */
    void loadError();

}

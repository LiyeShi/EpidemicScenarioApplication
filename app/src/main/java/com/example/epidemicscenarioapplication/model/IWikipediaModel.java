package com.example.epidemicscenarioapplication.model;

import com.example.epidemicscenarioapplication.base.IBaseModel;
import com.example.epidemicscenarioapplication.model.impl.WikipediaModel;

/**
 * @author sly
 * @version 1.0
 * @date 2020/6/28
 * @description com.example.epidemicscenarioapplication.model
 * Model 接口定义所有需要实现的业务逻辑 谣言页面就一个任务 网络请求加载数据
 */
public interface IWikipediaModel {
    void loadData(WikipediaModel.WikipediaType type);
}

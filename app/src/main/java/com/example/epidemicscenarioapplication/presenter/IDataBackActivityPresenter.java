package com.example.epidemicscenarioapplication.presenter;


import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author : 鑫宇
 * e-mail : 1769314609@qq.com
 * time   : 2020/07/25
 * desc   :
 * version: 1.0
 */
public interface IDataBackActivityPresenter {

    /**
     * 加载数据
     */
    void loadData();

    /**
     * 数据加载成功
     */
    void loadDataSuccess(HashMap<String, ArrayList> dataMap);

    /**
     * 数据加载失败
     */
    void loadDataError();
}

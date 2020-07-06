package com.example.epidemicscenarioapplication.view;

/**
 * @author sly
 * @version 1.0
 * @date 2020/6/28
 * @description com.example.epidemicscenarioapplication.view
 * 接口定义所有需要实现的视图逻辑
 */
public interface IRumorPager1View {
    /**
     * 数据加载成功
     */
    void showSuccessView();

    /**
     * 显示加载失败提示
     */
    void showErrorTips();
}

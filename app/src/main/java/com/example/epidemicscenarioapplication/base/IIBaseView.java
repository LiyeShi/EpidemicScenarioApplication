package com.example.epidemicscenarioapplication.base;


import java.util.List;

/**
 * @author sly
 * @version 1.0
 * @date 2020/7/15
 * @description com.example.epidemicscenarioapplication.base
 */
public interface IIBaseView<T> {
    void showSuccessView(List<T> list);

    void showErrorView();
}

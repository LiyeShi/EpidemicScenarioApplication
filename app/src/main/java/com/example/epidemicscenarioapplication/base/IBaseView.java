package com.example.epidemicscenarioapplication.base;

import java.util.List;

/**
 * @author sly
 * @version 1.0
 * @date 2020/7/8
 * @description com.example.epidemicscenarioapplication.base
 */
public interface IBaseView<T> {

    void showLoadingView();

    void showSuccessView(T data);

    void showErrorView();
}

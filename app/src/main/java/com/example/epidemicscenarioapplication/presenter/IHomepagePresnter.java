package com.example.epidemicscenarioapplication.presenter;

import java.util.List;

/**
 * @author sly
 * @version 1.0
 * @date 2020/6/30
 * @description com.example.epidemicscenarioapplication.presenter
 */
public interface IHomepagePresnter {
    void loadBanner();

    void loadBannerSuccess(List data);

    void loadBannerError();
}

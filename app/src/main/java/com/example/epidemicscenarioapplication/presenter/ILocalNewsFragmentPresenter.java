package com.example.epidemicscenarioapplication.presenter;

import android.content.Context;

import com.example.epidemicscenarioapplication.domain.LocalNewsDataBean;

/**
 * author : 鑫宇
 * e-mail : 1769314609@qq.com
 * time   : 2020/07/24
 * desc   :
 * version: 1.0
 */
public interface ILocalNewsFragmentPresenter {
    void loadData(Context context);

    void onloadDataSuccess(LocalNewsDataBean dataBeans);

    void onloadDataError();
}

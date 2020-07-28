package com.example.epidemicscenarioapplication.presenter.impl;

import android.util.Log;

import com.example.epidemicscenarioapplication.base.IBaseModel;
import com.example.epidemicscenarioapplication.base.IBaseView;
import com.example.epidemicscenarioapplication.model.impl.DataBackActivityModel;
import com.example.epidemicscenarioapplication.presenter.IDataBackActivityPresenter;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * author : 鑫宇
 * e-mail : 1769314609@qq.com
 * time   : 2020/07/25
 * desc   :
 * version: 1.0
 */
public class DataBackActibityPresenter implements IDataBackActivityPresenter {
    IBaseView dabaBackView;
    private static final String TAG = "DataBackActibityPresent";
    private IBaseModel mDataBackModel;

    public DataBackActibityPresenter(IBaseView dabaBackView) {
        this.dabaBackView = dabaBackView;
        mDataBackModel = new DataBackActivityModel(this);
    }

    @Override
    public void loadData() {
        mDataBackModel.loadData();
    }

    @Override
    public void loadDataSuccess(HashMap<String, ArrayList> dataMap) {
        dabaBackView.showSuccessView(dataMap);
        Log.d(TAG, "loadDataSuccess: 数据传递");
    }

    @Override
    public void loadDataError() {

    }
}

package com.example.epidemicscenarioapplication.model.impl;

import android.os.SystemClock;
import android.util.Log;

import com.example.epidemicscenarioapplication.model.IRumorModel;
import com.example.epidemicscenarioapplication.presenter.IRumorPresenter;
import com.example.epidemicscenarioapplication.presenter.impl.RumorPresenter;

import java.util.Random;

/**
 * @author sly
 * @version 1.0
 * @date 2020/6/28
 * @description com.example.epidemicscenarioapplication.model.impl
 * 为啥要有P层的引用呢
 */
public class RumorModel implements IRumorModel {
    private static final String TAG = "RumorModel";
    private IRumorPresenter mIRumorPresenter;

    public RumorModel(IRumorPresenter IRumorPresenter) {
        mIRumorPresenter = IRumorPresenter;
    }

    @Override
    public void loadData() {
        int i = new Random().nextInt(5);
        Log.d(TAG, "loadData: 生成的随机数是==>"+i);

    }


}

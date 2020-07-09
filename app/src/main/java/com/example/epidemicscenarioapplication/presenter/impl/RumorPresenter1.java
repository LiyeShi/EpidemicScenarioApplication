package com.example.epidemicscenarioapplication.presenter.impl;

import com.example.epidemicscenarioapplication.model.IRumorModel;
import com.example.epidemicscenarioapplication.presenter.IRumorPresenter;
import com.example.epidemicscenarioapplication.view.IRumorPager1View;

/**
 * @author sly
 * @version 1.0
 * @date 2020/6/28
 * @description com.example.epidemicscenarioapplication.presenter.impl
 * P层应该持有 M V 层的引用
 */
public class RumorPresenter1 implements IRumorPresenter {
    //m层的引用是自己在p层实例化拿到的
    private IRumorModel mRumorModel;
    //v层的引用是实例化p层的时候传过来的
    private IRumorPager1View mIRumorView;

    public RumorPresenter1(IRumorPager1View IRumorView) {
//        mIRumorView = IRumorView;
////        mRumorModel = new RumorModel(this);
    }

    @Override
    public void load() {
        mRumorModel.loadData();
    }

    @Override
    public void loadSuccess() {
        mIRumorView.showSuccessView();
    }

    @Override
    public void loadError() {
        mIRumorView.showErrorTips();
    }
}

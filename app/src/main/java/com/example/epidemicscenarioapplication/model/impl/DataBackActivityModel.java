package com.example.epidemicscenarioapplication.model.impl;

import android.content.Context;
import android.util.Log;

import com.example.epidemicscenarioapplication.base.IBaseModel;
import com.example.epidemicscenarioapplication.domain.API;
import com.example.epidemicscenarioapplication.domain.ProvinceHistoryListDataBean;
import com.example.epidemicscenarioapplication.presenter.impl.DataBackActibityPresenter;
import com.example.epidemicscenarioapplication.utils.ConstantsUtils;
import com.example.epidemicscenarioapplication.utils.RetrofitManager;
import com.example.epidemicscenarioapplication.utils.SpUtils;
import com.example.epidemicscenarioapplication.utils.ToastUtils;

import java.util.ArrayList;
import java.util.HashMap;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * @author : 鑫宇
 * e-mail : 1769314609@qq.com
 * time   : 2020/07/25
 * desc   :
 * version: 1.0
 */
public class DataBackActivityModel implements IBaseModel {
    private static final String TAG = "DataBackActivityModel";
    private  DataBackActibityPresenter dataBackPresenter;

    public DataBackActivityModel(DataBackActibityPresenter dataBackPresenter) {
        this.dataBackPresenter=dataBackPresenter;
    }


    @Override
    public void loadData(Context context) {
        RetrofitManager manager = RetrofitManager.getInstance(ConstantsUtils.BASE_URL);
        Retrofit retrofit = manager.getRetrofit();
        API api = retrofit.create(API.class);
        String provinceName = SpUtils.getString(context,ConstantsUtils.LOCATION_PROVINCE, "山东");
        provinceName= provinceName.substring(0,provinceName.length()-1);
        Log.d(TAG, "loadData: provinceName==>"+provinceName);
        Call<ProvinceHistoryListDataBean> call = api.getProvinceHistoryList(provinceName);
        call.enqueue(new Callback<ProvinceHistoryListDataBean>() {
            @Override
            public void onResponse(Call<ProvinceHistoryListDataBean> call, Response<ProvinceHistoryListDataBean> response) {
                if (response.code() == 200) {
                    ProvinceHistoryListDataBean body = response.body();
                    Log.d(TAG, "onResponse: 疫情历史数据请求成功==>"+body);
                    try {
                        HashMap<String, ArrayList> listHashMap = handelData(body);
                        dataBackPresenter.loadDataSuccess(listHashMap);
                    } catch (Exception e) {
                        ToastUtils.showLongToast(context,"数据异常");
                        dataBackPresenter.loadDataError();
                    }

                }
            }

            private HashMap<String, ArrayList> handelData(ProvinceHistoryListDataBean body) {
                ArrayList<String> time=new ArrayList<>();
                ArrayList<Integer> confirm = new ArrayList<>();
                ArrayList<Integer> newConfirm = new ArrayList<>();
                ArrayList<Integer> confirmAdd = new ArrayList<>();
                ArrayList<String> deadCuts = new ArrayList<>();
                ArrayList<Integer> dead = new ArrayList<>();
                ArrayList<Integer> heal = new ArrayList<>();
                ArrayList<String> nowConfirmCuts = new ArrayList<>();
                ArrayList<String> healCuts = new ArrayList<>();
                ArrayList<Integer> newHeal = new ArrayList<>();
                int size = body.getData().size();
                for (int i = 0; i < size; i++) {
                    ProvinceHistoryListDataBean.DataBean bean = body.getData().get(i);
                    time.add(bean.getDate());
                    confirm.add(bean.getConfirm());
                    newConfirm.add(bean.getNewConfirm());
                    confirmAdd.add(bean.getNewConfirm());
                    deadCuts.add(bean.getDead_cuts());
                    dead.add(bean.getDead());
                    heal.add(bean.getHeal());
                    nowConfirmCuts.add(bean.getConfirm_cuts());
                    healCuts.add(bean.getHeal_cuts());
                    newHeal.add(bean.getNewHeal());
                }
                Log.d(TAG, "handelData: confirm大小==>"+confirm.size());
                HashMap<String, ArrayList> listHashMap = new HashMap<>(9);
                listHashMap.put("confirm",confirm);
                listHashMap.put("newConfirm",newConfirm);
                listHashMap.put("confirmAdd",confirmAdd);
                listHashMap.put("deadCuts",deadCuts);
                listHashMap.put("dead",dead);
                listHashMap.put("heal",heal);
                listHashMap.put("nowConfirmCuts",nowConfirmCuts);
                listHashMap.put("healCuts",healCuts);
                listHashMap.put("newHeal",newHeal);
                listHashMap.put("date", time);
                return listHashMap;

            }

            @Override
            public void onFailure(Call<ProvinceHistoryListDataBean> call, Throwable t) {
                    dataBackPresenter.loadDataError();
            }
        });
    }
}

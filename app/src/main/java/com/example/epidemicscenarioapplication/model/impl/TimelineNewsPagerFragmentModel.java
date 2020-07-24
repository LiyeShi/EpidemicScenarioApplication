package com.example.epidemicscenarioapplication.model.impl;

import android.content.Context;
import android.util.Log;

import com.example.epidemicscenarioapplication.domain.API;
import com.example.epidemicscenarioapplication.domain.TimelineServiceDataBean;
import com.example.epidemicscenarioapplication.model.INewsPagerFragmentModel;
import com.example.epidemicscenarioapplication.presenter.INewsFragmentPresenter;
import com.example.epidemicscenarioapplication.utils.ConstantsUtils;
import com.example.epidemicscenarioapplication.utils.RetrofitManager;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * @author sly
 * @version 1.0
 * @date 2020/7/9
 * @description com.example.epidemicscenarioapplication.model
 */

public class TimelineNewsPagerFragmentModel implements INewsPagerFragmentModel {
INewsFragmentPresenter mITimelineNewsPageFragmentPresenter;
    private static final String TAG = "TimelineNewsPagerFragme";

    public TimelineNewsPagerFragmentModel(INewsFragmentPresenter ITimelineNewsPageFragmentPresenter) {
        mITimelineNewsPageFragmentPresenter = ITimelineNewsPageFragmentPresenter;
    }
    @Override
    public void loadData() {
        RetrofitManager manager = RetrofitManager.getInstance(ConstantsUtils.HTTP_BASE_URL_SECOND);
        Retrofit retrofit = manager.getRetrofit();
        API api = retrofit.create(API.class);
        api.getTimeLineService().enqueue(new Callback<ResponseBody>() {

            private ArrayList<TimelineServiceDataBean> mList;

            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                Log.d(TAG, "onResponse: 返回码==》"+response.code());
                if (response.code() == HttpURLConnection.HTTP_OK) {
                    String result = null;
                    try {
                        result = response.body().string();
                        Gson gson = new Gson();
                        mList = new ArrayList<>();
                        Type listType = new TypeToken<List<TimelineServiceDataBean>>() {}.getType();
                        mList = gson.fromJson(result, listType);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    Log.d(TAG, "onResponse: 返回数据==》"+mList.size());
                    mITimelineNewsPageFragmentPresenter.onloadDataSuccess(mList);
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Log.e(TAG, "onFailure: 加载失败==》"+t.getMessage());
                mITimelineNewsPageFragmentPresenter.onloadDataError();
            }
        });

    }



}

package com.example.epidemicscenarioapplication.model.impl;

import android.util.Log;

import com.example.epidemicscenarioapplication.base.BaseFragment;
import com.example.epidemicscenarioapplication.domain.API;
import com.example.epidemicscenarioapplication.domain.WikipediaDataBean;
import com.example.epidemicscenarioapplication.model.IWikipediaModel;
import com.example.epidemicscenarioapplication.presenter.IWikipediapresenter;
import com.example.epidemicscenarioapplication.utils.ConstantsUtils;
import com.example.epidemicscenarioapplication.utils.RetrofitManager;

import java.net.HttpURLConnection;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * author : 鑫宇
 * e-mail : 1769314609@qq.com
 * time   : 2020/07/23
 * desc   :
 * version: 1.0
 */
public class WikipediaModel implements IWikipediaModel {
    private static final String TAG = "WikipediaModel";
    private IWikipediapresenter mIWikipediapresenter;

    /**
     * 百科页面有两种类型的数据 预防 诊断
     */
    public enum WikipediaType {
        // 在第一行显式地列出枚举实例(枚举值)，系统会自动添加 public static final 修饰
        PREVENTION, DIAGONSIS
    }


    public WikipediaModel(IWikipediapresenter IWikipediapresenter) {
        mIWikipediapresenter = IWikipediapresenter;

    }

    @Override
    public void loadData(WikipediaType type) {

        RetrofitManager instance = RetrofitManager.getInstance(ConstantsUtils.BASE_URL);
        Retrofit retrofit = instance.getRetrofit();
        API api = retrofit.create(API.class);
        if (type == WikipediaType.PREVENTION) {
            Call<WikipediaDataBean> getGuideListList = api.getGuideListList(20);
            getGuideListList.enqueue(new Callback<WikipediaDataBean>() {
                @Override
                public void onResponse(Call<WikipediaDataBean> call, Response<WikipediaDataBean> response) {
                    Log.d(TAG, "onResponse: 腾讯响应码==》" + response.code());
                    if (response.code() == HttpURLConnection.HTTP_OK) {
                        WikipediaDataBean body = response.body();
                        Log.d(TAG, "onResponse: 这个数据为==>" + body);
                        mIWikipediapresenter.loadDataSuccess(body);
                    }
                }
                @Override
                public void onFailure(Call<WikipediaDataBean> call, Throwable t) {
                    mIWikipediapresenter.loadDataError();
                }

            });
        } else {
            Call<WikipediaDataBean> diagnoseList = api.getDiagnoseList(20);
            diagnoseList.enqueue(new Callback<WikipediaDataBean>() {
                @Override
                public void onResponse(Call<WikipediaDataBean> call, Response<WikipediaDataBean> response) {
                    if (response.code() == HttpURLConnection.HTTP_OK) {
                        mIWikipediapresenter.loadDataSuccess(response.body());
                    }
                }

                @Override
                public void onFailure(Call<WikipediaDataBean> call, Throwable t) {
                    Log.d(TAG, "onFailure: 加载失败==》"+t.getMessage());
                    mIWikipediapresenter.loadDataError();
                }
            });

        }
    }
}

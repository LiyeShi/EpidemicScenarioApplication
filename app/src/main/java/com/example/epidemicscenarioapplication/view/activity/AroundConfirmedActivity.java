package com.example.epidemicscenarioapplication.view.activity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import com.example.epidemicscenarioapplication.R;
import com.example.epidemicscenarioapplication.adapter.NcovVillageListViewAdapter;
import com.example.epidemicscenarioapplication.base.BaseActivity;

import com.example.epidemicscenarioapplication.databinding.ConfirmedActivityBinding;
import com.example.epidemicscenarioapplication.domain.API;
import com.example.epidemicscenarioapplication.domain.NcovVillageDataBean;
import com.example.epidemicscenarioapplication.utils.ConstantsUtils;
import com.example.epidemicscenarioapplication.utils.RetrofitManager;
import com.example.epidemicscenarioapplication.utils.SpUtils;

import java.net.HttpURLConnection;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class AroundConfirmedActivity extends BaseActivity {
    private static final String TAG = "AroundConfirmedActivity";
    private ConfirmedActivityBinding mConfirmedActivityBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getView());
        ListView listView= findViewById(R.id.lv_ncov_village);
        RetrofitManager retrofitManager = RetrofitManager.getInstance(ConstantsUtils.WULIANG_API);
        Retrofit retrofit = retrofitManager.getRetrofit();
        Call<NcovVillageDataBean> village = retrofit.create(API.class).getVillageByCommunityName(SpUtils.getString(this, ConstantsUtils.LOCATION, "临沂市"));
        village.enqueue(new Callback<NcovVillageDataBean>() {
            @Override
            public void onResponse(Call<NcovVillageDataBean> call, Response<NcovVillageDataBean> response) {
                if (response.code() == HttpURLConnection.HTTP_OK) {
                    Log.d(TAG, "onResponse: 确诊信息==》"+response.body());
                    NcovVillageDataBean body = response.body();
                    List<NcovVillageDataBean.DataBean> data;
                    data = body.getData();
                    NcovVillageListViewAdapter ncovVillageListViewAdapter = new NcovVillageListViewAdapter(data);
                    listView.setAdapter(ncovVillageListViewAdapter);
                    Log.d(TAG, "onResponse: 设置适配器");
                    String location = SpUtils.getString(AroundConfirmedActivity.this, ConstantsUtils.LOCATION, "临沂市121");
                    mConfirmedActivityBinding.includeHead.tvTip.setText("当前位置是:"+location+"(累计确诊"+body.getData().size()+")人");
                }
            }

            @Override
            public void onFailure(Call<NcovVillageDataBean> call, Throwable t) {
                Log.d(TAG, "onFailure: 确诊信息请求失败==》"+t.getMessage());
            }
        });


    }


    @Override
    protected void initData() {

    }

    @Override
    protected View getView() {
        mConfirmedActivityBinding = ConfirmedActivityBinding.inflate(getLayoutInflater());
        View view= mConfirmedActivityBinding.getRoot();
        return view;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initPresenter() {

    }
}
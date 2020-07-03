package com.example.epidemicscenarioapplication.view.activity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.epidemicscenarioapplication.R;
import com.example.epidemicscenarioapplication.adapter.NcovVillageListViewAdapter;
import com.example.epidemicscenarioapplication.domain.API;
import com.example.epidemicscenarioapplication.domain.NcovVillageDataBean;
import com.example.epidemicscenarioapplication.utils.Constants;
import com.example.epidemicscenarioapplication.utils.RetrofitManager;
import com.example.epidemicscenarioapplication.utils.SpUtils;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity2 extends AppCompatActivity {
    private static final String TAG = "MainActivity2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ListView listView= findViewById(R.id.iv_ncov_village);
        RetrofitManager retrofitManager = RetrofitManager.getInstance(Constants.WULIANG_API);
        Retrofit retrofit = retrofitManager.getRetrofit();
        Call<NcovVillageDataBean> village = retrofit.create(API.class).getVillageByCommunityName(SpUtils.getString(this, Constants.LOCATION, "临沂市"));
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
                }
            }

            @Override
            public void onFailure(Call<NcovVillageDataBean> call, Throwable t) {
                Log.d(TAG, "onFailure: 确诊信息请求失败==》"+t.getMessage());
            }
        });


    }
    }

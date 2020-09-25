package com.example.epidemicscenarioapplication.view.activity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;

import com.example.epidemicscenarioapplication.R;
import com.example.epidemicscenarioapplication.adapter.SearchListViewAdapter;
import com.example.epidemicscenarioapplication.base.BaseActivity;
import com.example.epidemicscenarioapplication.databinding.ActivitySearchBinding;
import com.example.epidemicscenarioapplication.domain.API;
import com.example.epidemicscenarioapplication.domain.EpidemicAreaDataBean;
import com.example.epidemicscenarioapplication.utils.ConstantsUtils;
import com.example.epidemicscenarioapplication.utils.RetrofitManager;
import com.example.epidemicscenarioapplication.utils.ToastUtils;
import com.gyf.immersionbar.ImmersionBar;

import java.net.HttpURLConnection;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class SearchActivity extends BaseActivity {
    private static final String TAG = "SearchActivity";
    private ActivitySearchBinding mBinding;

    @Override
    protected void initData() {
        mBinding.btnSeatrch.setOnClickListener(v -> {
            Search();
        });

    }

    private void Search() {
        String content = mBinding.etSearchContent.getText().toString().trim();
        if (!TextUtils.isEmpty(content)) {
            mBinding.llSearchEmpty.setVisibility(View.GONE);
            mBinding.llSearchLoading.setVisibility(View.VISIBLE);
            mBinding.lsResult.setVisibility(View.GONE);
            RetrofitManager manager = RetrofitManager.getInstance(ConstantsUtils.BASE_URL);
            Retrofit retrofit = manager.getRetrofit();
            API api = retrofit.create(API.class);
            Call<EpidemicAreaDataBean> call = api.getVillageByCommunityName(content);
            call.enqueue(new Callback<EpidemicAreaDataBean>() {
                @Override
                public void onResponse(Call<EpidemicAreaDataBean> call, Response<EpidemicAreaDataBean> response) {
                    int code = response.code();
                    if (code == HttpURLConnection.HTTP_OK) {
                        EpidemicAreaDataBean body = response.body();
                        Log.d(TAG, "onResponse: 搜索结果==>" + body);
                        if (body.getData().size()==0) {
//                                返回的数据是空的，直接当做加载失败处理
                            mBinding.lsResult.setVisibility(View.GONE);
                            mBinding.llSearchLoading.setVisibility(View.GONE);
                            mBinding.llSearchEmpty.setVisibility(View.VISIBLE);
                        }else {
                            SearchListViewAdapter adapter = new SearchListViewAdapter(body);
                            mBinding.lsResult.setAdapter(adapter);
                            mBinding.llSearchLoading.setVisibility(View.GONE);
                            mBinding.llSearchEmpty.setVisibility(View.GONE);
                            mBinding.lsResult.setVisibility(View.VISIBLE);
                        }

                    }

                }

                @Override
                public void onFailure(Call<EpidemicAreaDataBean> call, Throwable t) {
                    mBinding.lsResult.setVisibility(View.GONE);
                    mBinding.llSearchLoading.setVisibility(View.GONE);
                    mBinding.llSearchEmpty.setVisibility(View.VISIBLE);
                }
            });

        } else {
            ToastUtils.showLongToast(this, "请输入小区名称！");
            return;
        }
    }

    @Override
    protected void InitImmersionBar() {
        super.InitImmersionBar();
        mImmersionBar = ImmersionBar.with(this);
        mImmersionBar.fitsSystemWindows(true)
                .statusBarColor(R.color.white)
                //状态栏字体是深色，不写默认为亮色
                .statusBarDarkFont(true)
                //导航栏图标是深色，不写默认为亮色
                .navigationBarDarkIcon(false).init();
    }

    @Override
    protected View getView() {
        mBinding = ActivitySearchBinding.inflate(getLayoutInflater());
        return mBinding.getRoot();
    }

    @Override
    protected void initView() {
        mBinding.etSearchContent.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (keyCode== KeyEvent.KEYCODE_ENTER) {
                    Search();
                }
                return false;
            }
        });

    }

    @Override
    protected void initPresenter() {

    }


    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.home_activity_translate_in, R.anim.search_activity_translate_out);
    }
}

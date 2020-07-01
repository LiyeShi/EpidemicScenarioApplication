package com.example.epidemicscenarioapplication.view.fragment;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.baidu.location.BDAbstractLocationListener;
import com.baidu.location.BDLocation;
import com.baidu.location.LocationClient;
import com.baidu.location.LocationClientOption;
import com.bumptech.glide.util.LogTime;
import com.example.epidemicscenarioapplication.R;
import com.example.epidemicscenarioapplication.adapter.HomePageBannerAdapter;
import com.example.epidemicscenarioapplication.base.BaseFragment;
import com.example.epidemicscenarioapplication.domain.Api.API;
import com.example.epidemicscenarioapplication.domain.WeatherDataBean;
import com.example.epidemicscenarioapplication.presenter.impl.HomePagePresenter;
import com.example.epidemicscenarioapplication.utils.ToastUtil;
import com.example.epidemicscenarioapplication.view.IHomepageView;
import com.example.epidemicscenarioapplication.view.activity.EpidemicMapActivity;
import com.youth.banner.Banner;
import com.youth.banner.indicator.CircleIndicator;
import com.youth.banner.listener.OnBannerListener;

import java.io.IOException;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author sly
 * @version 1.0
 * @date 2020/6/28
 * @description com.example.epidemicscenarioapplication.view.fragment
 */
public class HomeFragment extends BaseFragment implements IHomepageView, OnBannerListener {
    public LocationClient mLocationClient = null;
    private MyLocationListener myListener = new MyLocationListener();
    private static final String TAG = "HomeFragment";
    private Banner mHomepageBanner;
    private HomePagePresenter mHomePagePresenter;

    @Override
    protected void initListener() {
        Log.d(TAG, "initListener: 首页轮播图设置监听");
//        mHomepageBanner.setOnBannerListener(this);
//        开始轮播 start方法一定要在Click方法之后，不然会无法触发Click事件
//        mHomepageBanner.start();
    }

    @Override
    protected void initPresenter() {
        mHomePagePresenter = new HomePagePresenter(this);
    }

    @Override
    protected void initView() {
        mHomepageBanner = (Banner) mRootView.findViewById(R.id.homepager_banner);
        Button viewById = mRootView.findViewById(R.id.weather);
        viewById.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl(" https://www.mxnzp.com/api/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
                API api = retrofit.create(API.class);
                Call<WeatherDataBean> weatherJson = api.getWeatherJson();
                weatherJson.enqueue(new Callback<WeatherDataBean>() {
                    @Override
                    public void onResponse(Call<WeatherDataBean> call, Response<WeatherDataBean> response) {
                        if (response.code() == HttpsURLConnection.HTTP_OK) {
                            Log.d(TAG, "onResponse: 请求成功==》" + response.body());
                        }

                    }

                    @Override
                    public void onFailure(Call<WeatherDataBean> call, Throwable t) {
                        Log.e(TAG, "onFailure: 请求失败==>" + t.getMessage());
                    }
                });
            }
        });

    }

    @Override
    protected int getResId() {
        return R.layout.home_fragment;
    }

    @Override
    protected void initData() {
        //假装加载
        mHomePagePresenter.loadBanner();


        mLocationClient = new LocationClient(mRootView.getContext());
        //声明LocationClient类
        mLocationClient.registerLocationListener(myListener);
        LocationClientOption option = new LocationClientOption();
        option.setLocationMode(LocationClientOption.LocationMode.Hight_Accuracy);
//可选，设置定位模式，默认高精度
//LocationMode.Hight_Accuracy：高精度；
//LocationMode. Battery_Saving：低功耗；
//LocationMode. Device_Sensors：仅使用设备；

        option.setCoorType("bd09ll");
//可选，设置返回经纬度坐标类型，默认GCJ02
//GCJ02：国测局坐标；
//BD09ll：百度经纬度坐标；
//BD09：百度墨卡托坐标；
//海外地区定位，无需设置坐标类型，统一返回WGS84类型坐标

        option.setScanSpan(1000);
//可选，设置发起定位请求的间隔，int类型，单位ms
//如果设置为0，则代表单次定位，即仅定位一次，默认为0
//如果设置非0，需设置1000ms以上才有效

        option.setOpenGps(true);
//可选，设置是否使用gps，默认false
//使用高精度和仅用设备两种定位模式的，参数必须设置为true

        option.setLocationNotify(true);
//可选，设置是否当GPS有效时按照1S/1次频率输出GPS结果，默认false

        option.setIgnoreKillProcess(false);
//可选，定位SDK内部是一个service，并放到了独立进程。
//设置是否在stop的时候杀死这个进程，默认（建议）不杀死，即setIgnoreKillProcess(true)

        option.SetIgnoreCacheException(false);
//可选，设置是否收集Crash信息，默认收集，即参数为false

        option.setWifiCacheTimeOut(5 * 60 * 1000);
//可选，V7.2版本新增能力
//如果设置了该接口，首次启动定位时，会先判断当前Wi-Fi是否超出有效期，若超出有效期，会先重新扫描Wi-Fi，然后定位

        option.setEnableSimulateGps(false);
//        一开始定位不到，设置下面的操作就可以了
        option.setIsNeedAddress(true);
//可选，设置是否需要过滤GPS仿真结果，默认需要，即参数为false
        option.setNeedNewVersionRgc(true);
//可选，设置是否需要最新版本的地址信息。默认需要，即参数为true
        mLocationClient.setLocOption(option);
//mLocationClient为第二步初始化过的LocationClient对象
//需将配置好的LocationClientOption对象，通过setLocOption方法传递给LocationClient对象使用
//更多LocationClientOption的配置，请参照类参考中Locat
        mLocationClient.start();
    }

    @Override
    public void showBanner(List data) {
        mHomepageBanner.setAdapter(new HomePageBannerAdapter(data));
//        设置圆点指示器
        mHomepageBanner.setIndicator(new CircleIndicator(mRootView.getContext()));
//          轮播间隔时间
        mHomepageBanner.setDelayTime(5000);
        mHomepageBanner.setOnBannerListener(this);
        mHomepageBanner.start();
//        设置指示器默认颜色
//        mHomepageBanner.setIndicatorNormalColor()
//        设置指示器选中颜色
//        mHomepageBanner.setIndicatorSelectedColor()
    }

    @Override
    public void OnBannerClick(Object data, int position) {
        switch (position) {
            case 0:
                Log.d(TAG, "OnBannerClick: 点击了第一个");
                startActivity(new Intent(mRootView.getContext(), EpidemicMapActivity.class));
                break;
            case 1:
                Log.d(TAG, "OnBannerClick: 点击了第二个");

                break;
            case 2:
                Log.d(TAG, "OnBannerClick: 点击了第三个");

                break;
            case 3:
                Log.d(TAG, "OnBannerClick: 点击了第四个");

                break;
            default:
                Log.d(TAG, "OnBannerClick: 点击了第五个");
                break;

        }
    }


    public class MyLocationListener extends BDAbstractLocationListener {
        @Override
        public void onReceiveLocation(BDLocation location) {
            //此处的BDLocation为定位结果信息类，通过它的各种get方法可获取定位相关的全部结果
            //以下只列举部分获取地址相关的结果信息
            //更多结果信息获取说明，请参照类参考中BDLocation类中的说明
            int errorCode = location.getLocType();
            String addr = location.getAddrStr();    //获取详细地址信息
            String country = location.getCountry();    //获取国家
            String province = location.getProvince();    //获取省份
            String city = location.getCity();    //获取城市
            String district = location.getDistrict();    //获取区县
            String street = location.getStreet();    //获取街道信息
            String adcode = location.getAdCode();    //获取adcode
            String town = location.getTown();    //获取乡镇信息
            Log.d(TAG, "onReceiveLocation: 定位失败==>" + errorCode);
            Log.d(TAG, "onReceiveLocation: 您所在的地址是==》" + country + province + city + district + street + town);
            ToastUtil.showToast(getContext(), "onReceiveLocation: 您所在的地址是==》" + country + province + city + district + street + town);
            if (location.getAddrStr() == null) {
                mLocationClient.start();
            }
        }
    }
}

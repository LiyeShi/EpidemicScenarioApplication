package com.example.epidemicscenarioapplication.view.fragment;

import android.content.Intent;
import android.nfc.tech.NfcB;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.baidu.location.BDAbstractLocationListener;
import com.baidu.location.BDLocation;
import com.baidu.location.LocationClient;
import com.example.epidemicscenarioapplication.R;
import com.example.epidemicscenarioapplication.adapter.HomePageBannerAdapter;
import com.example.epidemicscenarioapplication.adapter.HomePageVerticalBannerAdapter;
import com.example.epidemicscenarioapplication.base.BaseFragment;
import com.example.epidemicscenarioapplication.domain.Api.API;
import com.example.epidemicscenarioapplication.domain.NcovVillageDataBean;
import com.example.epidemicscenarioapplication.domain.VerticalBannerDataBeans;
import com.example.epidemicscenarioapplication.presenter.impl.HomePagePresenter;
import com.example.epidemicscenarioapplication.utils.BaiduSDKutils;
import com.example.epidemicscenarioapplication.utils.Constants;
import com.example.epidemicscenarioapplication.utils.SpUtils;
import com.example.epidemicscenarioapplication.view.IHomepageView;
import com.example.epidemicscenarioapplication.view.activity.EpidemicMapActivity;
import com.example.epidemicscenarioapplication.view.activity.MainActivity2;
import com.youth.banner.Banner;
import com.youth.banner.indicator.CircleIndicator;
import com.youth.banner.listener.OnBannerListener;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.HTTP;

/**
 * @author sly
 * @version 1.0
 * @date 2020/6/28
 * @description com.example.epidemicscenarioapplication.view.fragment
 */
public class HomeFragment extends BaseFragment implements IHomepageView, OnBannerListener {
    private static final String TAG = "HomeFragment";
    public LocationClient mLocationClient = null;
    private MyLocationListener myListener = new MyLocationListener();
    private Banner mHomepageBanner;
    private HomePagePresenter mHomePagePresenter;
    private Banner mHomepageTipBanner;
    private ArrayList<VerticalBannerDataBeans> Datas;
    private FrameLayout mFlVerticaContainer;
    private Button mBtnGetCunzhen;


    @Override
    protected void initListener() {
        Log.d(TAG, "initListener: 首页轮播图设置监听");
        mHomepageBanner.setOnBannerListener(this);

    }

    @Override
    protected void initPresenter() {
        mHomePagePresenter = new HomePagePresenter(this);
    }

    @Override
    protected void initView() {
        mHomepageBanner = (Banner) mRootView.findViewById(R.id.homepager_banner);
        mHomepageTipBanner = mRootView.findViewById(R.id.banner_tips);
        //添加生命周期观察者
        mHomepageTipBanner.addBannerLifecycleObserver(this)
                .setOrientation(Banner.VERTICAL)
                .setDelayTime(6000)
                .isAutoLoop(true)
                .setBannerRound2(20)
                .start();
        mFlVerticaContainer = mRootView.findViewById(R.id.fl_home_vertical_container);
        mBtnGetCunzhen = mRootView.findViewById(R.id.btn_ncov_village);
        mBtnGetCunzhen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(mRootView.getContext(), MainActivity2.class));
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
        initLocationClient();
    }

    private void initLocationClient() {
        mLocationClient = new LocationClient(mRootView.getContext());
        mLocationClient.registerLocationListener(myListener);
        mLocationClient.setLocOption(BaiduSDKutils.initSDK());
//        打开定位
        mLocationClient.start();
    }

    @Override
    public void showBanner(List data) {
//添加生命周期观察者
        mHomepageBanner.addBannerLifecycleObserver(this)
                .setAdapter(new HomePageBannerAdapter(data))
                .setDelayTime(5000)
                .setOnBannerListener(this)
                .setIndicator(new CircleIndicator(mRootView.getContext()))
                .setIndicator(new CircleIndicator(mRootView.getContext()))
                .start();
//        设置指示器默认颜色
//        mHomepageBanner.setIndicatorNormalColor()
//        设置指示器选中颜色
//        mHomepageBanner.setIndicatorSelectedColor()
    }


    @Override
    public void showBannerTipWeather(VerticalBannerDataBeans.WeatherDataBean dataBeans) {
        Datas = new ArrayList<>();
//        构建首页垂直滑动的banner bean对象
        VerticalBannerDataBeans dataBeans1 = new VerticalBannerDataBeans(dataBeans, Constants.BANNER_TYPE_WEATER);
        VerticalBannerDataBeans dataBeans2 = new VerticalBannerDataBeans(dataBeans, Constants.BANNER_TYPE_YIQING);
        Datas.add(dataBeans1);
        Datas.add(dataBeans2);
        mHomepageTipBanner.setAdapter(new HomePageVerticalBannerAdapter(Datas));
        mHomepageTipBanner.setVisibility(View.VISIBLE);
// TODO: 2020/7/3 显示加载的进度条是不是还需要隐藏


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


    /**
     * 百度定位回调
     */
    public class MyLocationListener extends BDAbstractLocationListener {
        @Override
        public void onReceiveLocation(BDLocation location) {
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
            Log.d(TAG, "详细地址==>" + addr);
            // TODO: 2020/7/2  模拟器测试方便 别忘了这里改成成功获取定位后才请求天气信息
            if (district == null) {
                SpUtils.putString(mRootView.getContext(), Constants.LOCATION, district);
                mLocationClient.stop();
                mHomePagePresenter.loadVerticalBannerWeather(mRootView.getContext());

            }
//            Log.d(TAG, "onReceiveLocation: 定位失败==>" + errorCode);
//            Log.d(TAG, "onReceiveLocation: 您所在的地址是==》" + country + province + city + district + street + town);
//            ToastUtil.showToast(getContext(), "onReceiveLocation: 您所在的地址是==》" + country + province + city + district + street + town);
        }
    }
}

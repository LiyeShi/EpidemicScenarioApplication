package com.example.epidemicscenarioapplication.view.fragment;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.baidu.location.BDAbstractLocationListener;
import com.baidu.location.BDLocation;
import com.baidu.location.LocationClient;
import com.example.epidemicscenarioapplication.R;
import com.example.epidemicscenarioapplication.adapter.HomeFragmentBannerAdapter;
import com.example.epidemicscenarioapplication.adapter.HomeFragmentVerticalBannerAdapter;
import com.example.epidemicscenarioapplication.base.BaseFragment;
import com.example.epidemicscenarioapplication.custom.CustomDialog;
import com.example.epidemicscenarioapplication.custom.ImmersionFragment;
import com.example.epidemicscenarioapplication.databinding.HomeFragmentBinding;
import com.example.epidemicscenarioapplication.domain.VerticalBannerDataBeans;
import com.example.epidemicscenarioapplication.presenter.impl.HomePagePresenter;
import com.example.epidemicscenarioapplication.utils.BaiduSDKutils;
import com.example.epidemicscenarioapplication.utils.Constants;
import com.example.epidemicscenarioapplication.utils.SpUtils;
import com.example.epidemicscenarioapplication.utils.ToastUtil;
import com.example.epidemicscenarioapplication.view.IHomepageView;
import com.example.epidemicscenarioapplication.view.activity.EpidemicMapActivity;
import com.example.epidemicscenarioapplication.view.activity.MainActivity2;
import com.gyf.immersionbar.ImmersionBar;
import com.gyf.immersionbar.components.ImmersionOwner;
import com.gyf.immersionbar.components.ImmersionProxy;
import com.gyf.immersionbar.components.SimpleImmersionOwner;
import com.youth.banner.Banner;
import com.youth.banner.indicator.CircleIndicator;
import com.youth.banner.listener.OnBannerListener;

import java.util.ArrayList;
import java.util.List;

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
    private HomePagePresenter mHomePagePresenter;
    private ArrayList<VerticalBannerDataBeans> Datas;
    private CustomDialog mDialog;
    private WindowManager.LayoutParams mLp;
    private HomeFragmentBinding mHomeFragmentBinding;
    private LinearLayout mHomeFragmentBindingRoot;


    @Override
    protected void initListener() {
        Log.d(TAG, "initListener: 首页轮播图设置监听");
        mHomeFragmentBinding.homepagerBanner.setOnBannerListener(this);
        mHomeFragmentBinding.btnFullPlatformData.setOnClickListener(v -> {
            mLp = new WindowManager.LayoutParams();
            Window window = mDialog.getWindow();
            mLp.copyFrom(window.getAttributes());
            mLp.width = 1000;
            mLp.height = WindowManager.LayoutParams.WRAP_CONTENT;
            //注意要在Dialog show之后，再将宽高属性设置进去，才有效果
            mDialog.show();
            window.setAttributes(mLp);
            //设置点击屏幕其它地方不让消失弹窗，点击返回键对话框消失
            mDialog.setCanceledOnTouchOutside(false);
        });
        MyOnclickListener myOnclickListener = new MyOnclickListener();
        mDialog.mMBinding.llAliijiankang.setOnClickListener(myOnclickListener);
        mDialog.mMBinding.llBaidu.setOnClickListener(myOnclickListener);
        mDialog.mMBinding.llDingxiangyuan.setOnClickListener(myOnclickListener);
        mDialog.mMBinding.llKuake.setOnClickListener(myOnclickListener);
        mDialog.mMBinding.llXinlang.setOnClickListener(myOnclickListener);
        mDialog.mMBinding.llTengxun.setOnClickListener(myOnclickListener);
        mDialog.mMBinding.llZhihu.setOnClickListener(myOnclickListener);
        mDialog.mMBinding.llDiyixaijing.setOnClickListener(myOnclickListener);

    }

    @Override
    protected void initPresenter() {
        mHomePagePresenter = new HomePagePresenter(this);
    }

    public void startWebView(String url) {
        Intent intent = new Intent(mHomeFragmentBindingRoot.getContext(), EpidemicMapActivity.class);
        intent.putExtra("url", url);
        startActivity(intent);
    }


    @Override
    protected void initView() {
//        首页是不用显示不同网络请求状态下的view
        setViewState(ViewState.SUCCESS);
        initDialog();
        //添加生命周期观察者
        mHomeFragmentBinding.bannerTips.addBannerLifecycleObserver(this)
                .setOrientation(Banner.VERTICAL)
                .setDelayTime(6000)
                .isAutoLoop(true)
                .setBannerRound2(20)
                .start();
        mHomeFragmentBinding.btnNcovVillage.setOnClickListener(v -> startActivity(new Intent(mHomeFragmentBindingRoot.getContext(), MainActivity2.class)));

    }




    @Override
    protected View getSuccessView(LayoutInflater inflater, ViewGroup container) {
        mHomeFragmentBinding = HomeFragmentBinding.inflate(inflater, container, false);
        mHomeFragmentBindingRoot = mHomeFragmentBinding.getRoot();
        return mHomeFragmentBindingRoot;
    }

    private void initDialog() {
        mDialog = new CustomDialog(mHomeFragmentBindingRoot.getContext(), R.layout.view_dialog);
    }


    @Override
    protected void initData() {
        //假装加载
        mHomePagePresenter.loadBanner();
        initLocationClient();
    }

    private void initLocationClient() {
        mLocationClient = new LocationClient(mHomeFragmentBindingRoot.getContext());
        mLocationClient.registerLocationListener(myListener);
        mLocationClient.setLocOption(BaiduSDKutils.initSDK());
//        打开定位
        mLocationClient.start();
    }

    @Override
    public void showBanner(List data) {
//添加生命周期观察者
        mHomeFragmentBinding.homepagerBanner.addBannerLifecycleObserver(this)
                .setAdapter(new HomeFragmentBannerAdapter(data))
                .setDelayTime(5000)
                .setOnBannerListener(this)
                .setIndicator(new CircleIndicator(mHomeFragmentBindingRoot.getContext()))
                .setIndicator(new CircleIndicator(mHomeFragmentBindingRoot.getContext()))
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
        mHomeFragmentBinding.bannerTips.setAdapter(new HomeFragmentVerticalBannerAdapter(Datas));
        mHomeFragmentBinding.bannerTips.setVisibility(View.VISIBLE);
// TODO: 2020/7/3 显示加载的进度条是不是还需要隐藏


    }

    @Override
    public void OnBannerClick(Object data, int position) {
        switch (position) {
            case 0:
                Log.d(TAG, "OnBannerClick: 点击了第一个");
                Intent intent = new Intent(mHomeFragmentBindingRoot.getContext(), EpidemicMapActivity.class);
                intent.putExtra("url", Constants.HTTPS_LZXUE_GITHUB_IO_YIQINGDITU);
                startActivity(intent);
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

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    public class MyOnclickListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.ll_aliijiankang:
                    startWebView("https://alihealth.taobao.com/medicalhealth/influenzamap?chInfo=spring2020-stay-in");
                    Log.d(TAG, "onClick: 点击了阿里健康");
                    break;
                case R.id.ll_zhihu:
                    startWebView("https://www.zhihu.com/special/19681091");
                    break;
                case R.id.ll_diyixaijing:
                    startWebView("https://s3.pstatp.com/ies/douyin_wuhan/wuhan/index.html?hide_nav_bar=1&hide_status_bar=0&disableBounces=1&status_bar_color=000&use_wkwebview=1&enter_from=share&timestamp=1581054924&utm_source=copy&utm_campaign=client_share&utm_medium=android&share_app_name=douyin");
                    break;
                case R.id.ll_dingxiangyuan:
                    startWebView("https://ncov.dxy.cn/ncovh5/view/pneumonia");
                    break;
                case R.id.ll_tengxun:
                    startWebView("https://news.qq.com/zt2020/page/feiyan.htm#/area?pool=sd");
                    break;
                case R.id.ll_baidu:
                    startWebView("https://news.sina.cn/zt_d/yiqing0121");
                    break;
                case R.id.ll_kuake:
                    startWebView("https://broccoli.uc.cn/apps/pneumonia/routes/index");
                    break;
                case R.id.ll_xinlang:
                    startWebView("");
                    break;
                default:
                    break;
            }
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
                SpUtils.putString(mHomeFragmentBindingRoot.getContext(), Constants.LOCATION, district);
                mLocationClient.stop();
                mHomePagePresenter.loadVerticalBannerWeather(mHomeFragmentBindingRoot.getContext());

            }
//            Log.d(TAG, "onReceiveLocation: 定位失败==>" + errorCode);
//            Log.d(TAG, "onReceiveLocation: 您所在的地址是==》" + country + province + city + district + street + town);
            ToastUtil.showToast(getContext(), "onReceiveLocation: 您所在的地址是==》" + country + province + city + district + street + town);
        }
    }
}

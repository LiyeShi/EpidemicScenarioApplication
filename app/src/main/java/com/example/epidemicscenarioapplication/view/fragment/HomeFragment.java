package com.example.epidemicscenarioapplication.view.fragment;

import android.app.Dialog;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.baidu.location.BDAbstractLocationListener;
import com.baidu.location.BDLocation;
import com.baidu.location.LocationClient;
import com.example.epidemicscenarioapplication.R;
import com.example.epidemicscenarioapplication.adapter.HomeFragmentBannerAdapter;
import com.example.epidemicscenarioapplication.adapter.HomeFragmentVerticalBannerAdapter;
import com.example.epidemicscenarioapplication.base.BaseFragment;
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
    private Banner mHomepageBanner;
    private HomePagePresenter mHomePagePresenter;
    private Banner mHomepageTipBanner;
    private ArrayList<VerticalBannerDataBeans> Datas;
    private FrameLayout mFlVerticaContainer;
    private Button mBtnGetCunzhen;
    private Button mBtnFullPlatform;
    private View mView;
    private LinearLayout mLlKuake;
    private LinearLayout mLlAliijiankang;
    private LinearLayout mLlZhihu;
    private LinearLayout mLlTengxun;
    private LinearLayout mLlDingxiangyuan;
    private LinearLayout mLlBaidu;
    private LinearLayout mLlDiyixaijing;
    private LinearLayout mLlXinlang;
    private Dialog mDialog;
    private WindowManager.LayoutParams mLp;


    @Override
    protected void initListener() {
        Log.d(TAG, "initListener: 首页轮播图设置监听");
        mHomepageBanner.setOnBannerListener(this);
        mBtnFullPlatform.setOnClickListener(v -> {
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
        mLlAliijiankang.setOnClickListener(myOnclickListener);
        mLlBaidu.setOnClickListener(myOnclickListener);
        mLlDingxiangyuan.setOnClickListener(myOnclickListener);
        mLlKuake.setOnClickListener(myOnclickListener);
        mLlXinlang.setOnClickListener(myOnclickListener);
        mLlTengxun.setOnClickListener(myOnclickListener);
        mLlZhihu.setOnClickListener(myOnclickListener);
        mLlDiyixaijing.setOnClickListener(myOnclickListener);

    }

    @Override
    protected void initPresenter() {
        mHomePagePresenter = new HomePagePresenter(this);
    }

    public void startWebView(String url) {
        Intent intent = new Intent(mSuccessView.getContext(), EpidemicMapActivity.class);
        intent.putExtra("url", url);
        startActivity(intent);
    }
    @Override
    protected void initView() {
//        首页是不用显示不同网络请求状态下的view
        setViewState(ViewState.SUCCESS);
        initDialog();
        mLlKuake = mView.findViewById(R.id.ll_kuake);
        mLlAliijiankang = mView.findViewById(R.id.ll_aliijiankang);
        mLlZhihu = mView.findViewById(R.id.ll_zhihu);
        mLlBaidu = mView.findViewById(R.id.ll_baidu);
        mLlDiyixaijing = mView.findViewById(R.id.ll_diyixaijing);
        mLlXinlang = mView.findViewById(R.id.ll_xinlang);
        mLlDingxiangyuan = mView.findViewById(R.id.ll_dingxiangyuan);
        mLlTengxun = mView.findViewById(R.id.ll_tengxun);
        mBtnFullPlatform = mSuccessView.findViewById(R.id.btn_full_platform_data);
        mHomepageBanner = (Banner) mSuccessView.findViewById(R.id.homepager_banner);
        mHomepageTipBanner = mSuccessView.findViewById(R.id.banner_tips);
        //添加生命周期观察者
        mHomepageTipBanner.addBannerLifecycleObserver(this)
                .setOrientation(Banner.VERTICAL)
                .setDelayTime(6000)
                .isAutoLoop(true)
                .setBannerRound2(20)
                .start();
        mFlVerticaContainer = mSuccessView.findViewById(R.id.fl_home_vertical_container);
        mBtnGetCunzhen = mSuccessView.findViewById(R.id.btn_ncov_village);
        mBtnGetCunzhen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(mSuccessView.getContext(), MainActivity2.class));
            }
        });

    }

    private void initDialog() {
        mView = LayoutInflater.from(mSuccessView.getContext()).inflate(R.layout.view_dialog, null, false);
        mDialog = new Dialog(mSuccessView.getContext(), R.style.custom_dialog);
        mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        mDialog.setContentView(mView);
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
        mLocationClient = new LocationClient(mSuccessView.getContext());
        mLocationClient.registerLocationListener(myListener);
        mLocationClient.setLocOption(BaiduSDKutils.initSDK());
//        打开定位
        mLocationClient.start();
    }

    @Override
    public void showBanner(List data) {
//添加生命周期观察者
        mHomepageBanner.addBannerLifecycleObserver(this)
                .setAdapter(new HomeFragmentBannerAdapter(data))
                .setDelayTime(5000)
                .setOnBannerListener(this)
                .setIndicator(new CircleIndicator(mSuccessView.getContext()))
                .setIndicator(new CircleIndicator(mSuccessView.getContext()))
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
        mHomepageTipBanner.setAdapter(new HomeFragmentVerticalBannerAdapter(Datas));
        mHomepageTipBanner.setVisibility(View.VISIBLE);
// TODO: 2020/7/3 显示加载的进度条是不是还需要隐藏


    }

    @Override
    public void OnBannerClick(Object data, int position) {
        switch (position) {
            case 0:
                Log.d(TAG, "OnBannerClick: 点击了第一个");
                Intent intent = new Intent(mSuccessView.getContext(), EpidemicMapActivity.class);
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
                SpUtils.putString(mSuccessView.getContext(), Constants.LOCATION, district);
                mLocationClient.stop();
                mHomePagePresenter.loadVerticalBannerWeather(mSuccessView.getContext());

            }
//            Log.d(TAG, "onReceiveLocation: 定位失败==>" + errorCode);
//            Log.d(TAG, "onReceiveLocation: 您所在的地址是==》" + country + province + city + district + street + town);
//            ToastUtil.showToast(getContext(), "onReceiveLocation: 您所在的地址是==》" + country + province + city + district + street + town);
        }
    }
}

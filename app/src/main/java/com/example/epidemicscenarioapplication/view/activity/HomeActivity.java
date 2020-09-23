package com.example.epidemicscenarioapplication.view.activity;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.baidu.location.BDAbstractLocationListener;
import com.baidu.location.BDLocation;
import com.baidu.location.LocationClient;
import com.example.epidemicscenarioapplication.R;
import com.example.epidemicscenarioapplication.adapter.HomeActivityViewpagerAdapter;
import com.example.epidemicscenarioapplication.base.BaseActivity;
import com.example.epidemicscenarioapplication.custom.TipsDialog;
import com.example.epidemicscenarioapplication.databinding.ActivityHomeBinding;
import com.example.epidemicscenarioapplication.utils.BaiduSDKutils;
import com.example.epidemicscenarioapplication.utils.ConstantsUtils;
import com.example.epidemicscenarioapplication.utils.SpUtils;
import com.example.epidemicscenarioapplication.view.fragment.AboutUsFragment;
import com.example.epidemicscenarioapplication.view.fragment.HomeFragment;
import com.example.epidemicscenarioapplication.view.fragment.NewsFragment;
import com.example.epidemicscenarioapplication.view.fragment.WikipediaFragment;

import java.util.ArrayList;

import me.jessyan.autosize.AutoSize;
import permissions.dispatcher.NeedsPermission;
import permissions.dispatcher.OnNeverAskAgain;
import permissions.dispatcher.OnPermissionDenied;
import permissions.dispatcher.OnShowRationale;
import permissions.dispatcher.PermissionRequest;
import permissions.dispatcher.RuntimePermissions;

/**
 * @author 鑫宇
 */
@RuntimePermissions
public class HomeActivity extends BaseActivity {
    private static final String TAG = "HomeActivity";
    private static final String PREF_ISFIRST = "isFirst";
    private static final int SETTING_CODE = 0;
    private static final int GPS_REQUEST_CODE = 1;
    private static final int SHOW_GUILDEPAGE_CODE = 2;
    private static boolean isToSetting = false;
    private static boolean isFirstShowReason = true;
    private static int getLocationCount = 0;
    private HomeFragment mHomeFragment;
    private WikipediaFragment mWikipediaFragment;
    private AboutUsFragment mAboutUsFragment;
    private NewsFragment mNewsFragment;
    private ArrayList<Fragment> mFragmentArrayList = new ArrayList();
    private ActivityHomeBinding mHomeBinding;
    private HomeActivityViewpagerAdapter mViewpagerAdapter;
    public LocationClient mLocationClient;
    private MyLocationListener myListener = new MyLocationListener();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        isShowGuidePage();
        initListener();
    }

    /**
     * 检查GPS是否打开
     *
     * @return
     */
    private boolean checkGpsIsOpen() {
        boolean isOpen;
        LocationManager locationManager = (LocationManager) this.getSystemService(Context.LOCATION_SERVICE);
        isOpen = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);
        return isOpen;
    }

    /**
     * 初始化GPS
     */
    @NeedsPermission({Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION})
    public void initGPS() {
        if (!checkGpsIsOpen()) {
            TipsDialog instance = TipsDialog.getInstance(
                    this,
                    R.style.custom_dialog,
                    "全民战役需要使用GPS",
                    "检测到没有打开GPS，为了能够正常进行定位，请打开GPS功能");
            instance.setOkOnclickListener("去打开", () -> {
                //跳转到手机原生设置页面
                Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                startActivityForResult(intent, GPS_REQUEST_CODE);
                // TODO: 2020/9/7  还需要测试，这个地方为什么要主动取消显示，原来没有也是可以的
                instance.dismiss();
            });
            instance.setCancelOnclickListener("退出软件", () -> {
                finish();
            });
            instance.setCancelable(false);
            instance.show();
        } else {
            initLocationClient();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.d(TAG, "onActivityResult: requrequestCode==>" + requestCode);
        switch (requestCode) {
            case SHOW_GUILDEPAGE_CODE:
//                展示完引导页 开始判断是否已开启GPS
                HomeActivityPermissionsDispatcher.initGPSWithPermissionCheck(HomeActivity.this);
                Log.d(TAG, "引导页onActivityResult: 执行");
                break;
            case GPS_REQUEST_CODE:
                Log.d(TAG, "onActivityResult: 执行");
//                从设置界面返回后检查是否成功打开了GPS
                HomeActivityPermissionsDispatcher.initGPSWithPermissionCheck(HomeActivity.this);
                break;
            case SETTING_CODE:
                Log.d(TAG, "onActivityResult: 执行");
//                从设置界面返回后检查是否成功打开了GPS
                HomeActivityPermissionsDispatcher.initGPSWithPermissionCheck(HomeActivity.this);
                break;
            default:
                break;
        }
    }

    @Override
    protected void initData() {

    }

    /**
     * 这个方法是为了解决一个神奇的bug 当页面中含有WebView中，AndroidAutoSize屏幕适配会失效，导致布局错乱，而我现在用的WebView也是第三方库的
     * ，只能使用这个方法解决失效的问题，还有一种方法是重写WebView的setOverScrollMode(int mode)，并加入 AutoSize.autoConvertDensityOfGlobal(this);
     * @param name
     * @param context
     * @param attrs
     * @return
     */
    @Nullable
    @Override
    public View onCreateView(@NonNull String name, @NonNull Context context, @NonNull AttributeSet attrs) {
        AutoSize.autoConvertDensityOfGlobal(this);
        return super.onCreateView(name, context, attrs);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    private void isShowGuidePage() {
        boolean isFirst = SpUtils.getBoolean(this, PREF_ISFIRST, true);
        if (isFirst) {
//            第一次打开软件，展示引导页
            startActivityForResult(new Intent(this, GuideActivity.class), SHOW_GUILDEPAGE_CODE);
            SpUtils.putBoolean(this, PREF_ISFIRST, false);
        } else {
            Log.d(TAG, "isShowGuidePage: false");
//            不是第一次打开，一进入软件就得判断是否打开了GPS,进而获取地理位置 否则软件无法使用
            HomeActivityPermissionsDispatcher.initGPSWithPermissionCheck(HomeActivity.this);
        }
    }

    /**
     * 返回根布局
     *
     * @return
     */
    @Override
    protected View getView() {
        mHomeBinding = ActivityHomeBinding.inflate(getLayoutInflater());
        LinearLayout view = mHomeBinding.getRoot();
        return view;
    }

    @SuppressLint("WrongConstant")
    private void initListener() {
        Log.d(TAG, "initListener: 设置监听");
        mHomeBinding.bnvHome.setItemIconTintList(null);
//        底部导航栏item个数超过三个时设置 图标文字都显示
        mHomeBinding.bnvHome.setLabelVisibilityMode(1);
        mHomeBinding.bnvHome.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.item_home:
                    mHomeBinding.vpContainer.setCurrentItem(0, false);
                    break;
                case R.id.item_xinwen:
                    mHomeBinding.vpContainer.setCurrentItem(1, false);
                    break;
                case R.id.item_daiding:
                    mHomeBinding.vpContainer.setCurrentItem(2, false);
                    break;
                case R.id.item_daiding1:
                    mHomeBinding.vpContainer.setCurrentItem(3, false);
                    break;
                default:
                    break;
            }
            return true;
        });
        //注册页面切换监听
        mHomeBinding.vpContainer.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                mHomeBinding.bnvHome.getMenu().getItem(position).setChecked(true);
            }
        });
    }

    public void initLocationClient() {
        mLocationClient = new LocationClient(this);
        mLocationClient.registerLocationListener(myListener);
        mLocationClient.setLocOption(BaiduSDKutils.initSDK());
//        开始定位
        mLocationClient.start();
        Log.d(TAG, "initLocationClient: 开始定位");
    }


    public void initFragment() {
        Log.d(TAG, "initFragment: 执行");
        mHomeFragment = new HomeFragment();
        mNewsFragment = new NewsFragment();
        mWikipediaFragment = new WikipediaFragment();
        mAboutUsFragment = new AboutUsFragment();
        mFragmentArrayList.add(mHomeFragment);
        mFragmentArrayList.add(mNewsFragment);
        mFragmentArrayList.add(mWikipediaFragment);
        mFragmentArrayList.add(mAboutUsFragment);
        mHomeBinding.vpContainer.setCurrentItem(0);
        mViewpagerAdapter.setData(mFragmentArrayList);
        Log.d(TAG, "initView: fragmentdataSize==>" + mFragmentArrayList.size());
    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void initView() {
        mViewpagerAdapter = new HomeActivityViewpagerAdapter(this);
        mHomeBinding.vpContainer.setAdapter(mViewpagerAdapter);
//        去掉最外层ViewPager2阴影动画
        View child = mHomeBinding.vpContainer.getChildAt(0);
        if (child instanceof RecyclerView) {
            child.setOverScrollMode(View.OVER_SCROLL_NEVER);
        }
        Log.d(TAG, "initView: finish");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mLocationClient != null) {
            mLocationClient.unRegisterLocationListener(myListener);
        }
    }

    @SuppressLint("NeedOnRequestPermissionsResult")
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        HomeActivityPermissionsDispatcher.onRequestPermissionsResult(this, requestCode, grantResults);
    }

    /**
     * 解释为什么需要这些权限 在用户选择拒绝后，再次需要访问该权限时调用
     *
     * @param request
     */
    @OnShowRationale({Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION})
    void showReasonPermissions(final PermissionRequest request) {
        if (isFirstShowReason) {
//            每次只展示一次请求权限的原因
            TipsDialog dialog = TipsDialog.getInstance(
                    this,
                    R.style.custom_dialog,
                    "全民战役需要获取位置信息",
                    "为了正常显示所在地、疫情信息推送等服务，请允许全民战役使用位置信息，您可以通过系统“设置”进行权限的管理。"
            );
            dialog.setOkOnclickListener("去授予权限", () -> {
                // 再次执行权限请求
                request.proceed();
                isFirstShowReason = false;
            });
            dialog.setCancelOnclickListener("退出软件", new TipsDialog.OnCancelClickListener() {
                @Override
                public void onCancelClick() {
                    dialog.dismiss();
                    finish();
                }
            });
            dialog.setCancelable(false);
            dialog.show();
        } else {
//            下一次走到该方法直接请求
            request.proceed();
        }
    }


    /**
     * 当用户拒绝了权限时
     */
    @OnPermissionDenied({Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION})
    void OnPermissionDenied() {
        TipsDialog instance = TipsDialog.getInstance(
                this,
                R.style.custom_dialog,
                "警告！",
                "这是必要权限，如果不授权将无法使用软件"
        );
        instance.setOkOnclickListener("去授权", () -> {
            // 再次执行权限请求
            HomeActivityPermissionsDispatcher.initGPSWithPermissionCheck(HomeActivity.this);
        });
        instance.setCancelOnclickListener("退出软件", () -> {
            instance.dismiss();
            finish();
        });
        instance.setCancelable(false);
        instance.show();
    }

    /**
     * 当用户拒绝了权限并且选择不再询问时
     */
    @OnNeverAskAgain({Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION})
    void neverAskAgain() {
        TipsDialog instance = TipsDialog.getInstance(this,
                R.style.custom_dialog,
                "无法获得权限",
                "您拒绝了位置权限，且不再询问，请前往设置中心授权");
        instance.setOkOnclickListener("去设置", new TipsDialog.OnOkClickListener() {
            @Override
            public void onOKClick() {
                Intent intent = new Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
                intent.setData(Uri.parse("package:" + getPackageName())); // 根据包名打开对应的设置界面
                startActivityForResult(intent, SETTING_CODE);
                //                 说明进入设置界面了
                isToSetting = true;
            }
        });
        instance.setCancelOnclickListener("退出软件", new TipsDialog.OnCancelClickListener() {
            @Override
            public void onCancelClick() {
                instance.dismiss();
                finish();
            }
        });
        instance.setCancelable(false);
        instance.show();


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
            String town = location.getTown();    //获取乡镇信息
            String adcode = location.getAdCode();    //获取adcode
            Log.d(TAG, "详细地址==>" + addr);
//            ""  和 null 不是一回事 不要习惯性的写null
            // TODO: 2020/8/26 方便模拟器测试  发布的时候要改过来
            if (addr != null) {
                getLocationCount++;
                Log.d(TAG, "onReceiveLocation: 执行了" + location.getCity());
                mLocationClient.stop();
                mLocationClient.unRegisterLocationListener(myListener);
                Log.d(TAG, "onReceiveLocation: 关闭定位");
                SpUtils.putString(HomeActivity.this, ConstantsUtils.LOCATION_PROVINCE, province);
                SpUtils.putString(HomeActivity.this, ConstantsUtils.LOCATION_CITY, city);
                SpUtils.putString(HomeActivity.this, ConstantsUtils.LOCATION_DISTRICT, district);
//                因为这个百度定位如果在打开软件后才开启定位 即使定位成功，也无法正常关闭，所以目前只能采用这种办法 最终在这里初始化fragment
                if (getLocationCount == 1) {
                    initFragment();
                }
            }
//            ToastUtils.showToast(HomeActivity.this, "您所在的地址是==》" + country + province + city + district + street + town);
            Log.d(TAG, "onReceiveLocation: 定位失败==>" + errorCode);
        }


    }
}
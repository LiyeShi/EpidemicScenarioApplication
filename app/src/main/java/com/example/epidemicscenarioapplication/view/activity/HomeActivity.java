package com.example.epidemicscenarioapplication.view.activity;

import android.Manifest;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.baidu.location.BDAbstractLocationListener;
import com.baidu.location.BDLocation;
import com.baidu.location.LocationClient;
import com.example.epidemicscenarioapplication.R;
import com.example.epidemicscenarioapplication.adapter.HomeActivityViewpagerAdapter;
import com.example.epidemicscenarioapplication.base.BaseActivity;
import com.example.epidemicscenarioapplication.databinding.ActivityHomeBinding;
import com.example.epidemicscenarioapplication.utils.BaiduSDKutils;
import com.example.epidemicscenarioapplication.utils.ConstantsUtils;
import com.example.epidemicscenarioapplication.utils.SpUtils;
import com.example.epidemicscenarioapplication.utils.ToastUtils;
import com.example.epidemicscenarioapplication.view.fragment.AboutUsFragment;
import com.example.epidemicscenarioapplication.view.fragment.HomeFragment;
import com.example.epidemicscenarioapplication.view.fragment.NewsFragment;
import com.example.epidemicscenarioapplication.view.fragment.WikipediaFragment;

import java.util.ArrayList;

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
    private static final String PREF_ISFIRST = "isFirst";
    private static final int GPS_REQUEST_CODE = 1;
    private static final int SHOW_GUILDEPAGE_CODE = 2;
    private static boolean isToSetting = false;
    private static boolean isFirstShowReason = true;
    private HomeFragment mHomeFragment;
    private WikipediaFragment mWikipediaFragment;
    private AboutUsFragment mAboutUsFragment;
    private NewsFragment mNewsFragment;
    private static final String TAG = "HomeActivity";
    private ArrayList<Fragment> mFragmentArrayList = new ArrayList();
    private ActivityHomeBinding mHomeBinding;
    private HomeActivityViewpagerAdapter mViewpagerAdapter;
    public LocationClient mLocationClient = null;
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
    private void initGPS() {
        if (!checkGpsIsOpen()) {
            new AlertDialog.Builder(this).setTitle("警告:")
                    .setMessage("检测到没有打开GPS，无法正常使用软件!")
                    //  取消选项
                    .setNegativeButton("退出软件", (dialogInterface, i) -> {
                        // 关闭dialog
                        dialogInterface.dismiss();
                        finish();
                    })
                    //  确认选项
                    .setPositiveButton("去打开", (dialogInterface, i) -> {
                        //跳转到手机原生设置页面
                        Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                        startActivityForResult(intent, GPS_REQUEST_CODE);
                    })
                    .setCancelable(false)
                    .show();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.d(TAG, "onActivityResult: requrequestCode==>" + requestCode);
        switch (requestCode) {
            case SHOW_GUILDEPAGE_CODE:
//                引导页展示完 开始判断是否打开GPS
                initGPS();
                Log.d(TAG, "onActivityResult: 执行");
//              发起定位
                initLocationClient();
                break;
            case GPS_REQUEST_CODE:
                Log.d(TAG, "onActivityResult: 执行");
//                从设置界面返回看是否打开了GPS
                initGPS();
//              发起定位
                initLocationClient();
                break;
            default:
                break;
        }
    }

    @Override
    protected void initData() {

    }

    private void isShowGuidePage() {
        boolean isFirst = SpUtils.getBoolean(this, PREF_ISFIRST, true);
        if (isFirst) {
            startActivityForResult(new Intent(this, GuideActivity.class), SHOW_GUILDEPAGE_CODE);
            SpUtils.putBoolean(this, PREF_ISFIRST, false);
        } else {
            initGPS();
            initLocationClient();
        }
    }

    @Override
    protected View getView() {
        mHomeBinding = ActivityHomeBinding.inflate(getLayoutInflater());
        LinearLayout view = mHomeBinding.getRoot();
        return view;
    }

    private void initListener() {
        Log.d(TAG, "initListener: 设置监听");
        mHomeBinding.bnvHome.setItemIconTintList(null);

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
    }

    @NeedsPermission({Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION})
    public void initFragment() {
        Log.d(TAG, "initFragment: 执行");
        mHomeFragment = new HomeFragment();
        mWikipediaFragment = new WikipediaFragment();
        mAboutUsFragment = new AboutUsFragment();
        mNewsFragment = new NewsFragment();
        mFragmentArrayList.add(mHomeFragment);
        mFragmentArrayList.add(mNewsFragment);
        mFragmentArrayList.add(mWikipediaFragment);
        mFragmentArrayList.add(mAboutUsFragment);
        mHomeBinding.vpContainer.setCurrentItem(0);
        mViewpagerAdapter.setData(mFragmentArrayList);
        Log.d(TAG, "initView: dataSize==>" + mFragmentArrayList.size());
    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void initView() {
        mViewpagerAdapter = new HomeActivityViewpagerAdapter(this);
        HomeActivityPermissionsDispatcher.initFragmentWithPermissionCheck(this);
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
    }

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
            new AlertDialog.Builder(this)
                    .setMessage("请授予我们必要的权限，我们需要根据您的位置，向您提供相关疫情信息")
                    .setPositiveButton("知道了", (dialogInterface, i) -> {
                        // 再次执行权限请求
                        request.proceed();
                        isFirstShowReason = false;
                    })
                    .show();
        } else {
//            下一次走到该方法直接请求
            request.proceed();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (isToSetting) {
            HomeActivityPermissionsDispatcher.initFragmentWithPermissionCheck(this);
            isToSetting = false;
        }

    }

    /**
     * 当用户拒绝了权限时
     */
    @OnPermissionDenied({Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION})
    void OnPermissionDenied() {
        new AlertDialog.Builder(this)
                .setMessage("不会胡作非为的，你赶紧授权吧，不授权没法用")
                .setPositiveButton("知道了", (DialogInterface dialogInterface, int i) -> {
                    // 再次执行权限请求
                    HomeActivityPermissionsDispatcher.initFragmentWithPermissionCheck(HomeActivity.this);
                    ToastUtils.showLongToast(this, "请求结束");
                    Log.d(TAG, "OnPermissionDenied: finish");
                })
                .show();
    }

    /**
     * 当用户拒绝了权限并且选择不再询问时
     */
    @OnNeverAskAgain({Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION})
    void neverAskAgain() {
        new AlertDialog.Builder(this)
                .setMessage("您拒绝了位置权限，且不再询问，请前往设置中心授权")
                .setPositiveButton("去设置", (dialogInterface, i) -> {
                    Intent intent = new Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
                    intent.setData(Uri.parse("package:" + getPackageName())); // 根据包名打开对应的设置界面
                    startActivityForResult(intent, 0);
                    //                 说明进入设置界面了
                    isToSetting = true;
                })
                .setNegativeButton("退出程序", (dialog, which) -> finish())
                .show();


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
            if (location.getCity()!=" ") {
                Log.d(TAG, "onReceiveLocation: 执行了");
                mLocationClient.stop();
                SpUtils.putString(HomeActivity.this, ConstantsUtils.LOCATION_PROVINCE, province);
                SpUtils.putString(HomeActivity.this, ConstantsUtils.LOCATION_CITY, city);
                SpUtils.putString(HomeActivity.this, ConstantsUtils.LOCATION_DISTRICT, district);
//                拿到设备地址后 才可以发起所有的网络请求
                mHomeFragment.initNetworkRequest();
            }
            ToastUtils.showToast(HomeActivity.this, "您所在的地址是==》" + country + province + city + district + street + town);
            Log.d(TAG, "onReceiveLocation: 定位失败==>" + errorCode);
        }


    }
}
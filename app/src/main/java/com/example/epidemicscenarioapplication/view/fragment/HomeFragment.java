package com.example.epidemicscenarioapplication.view.fragment;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;


import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.example.epidemicscenarioapplication.R;
import com.example.epidemicscenarioapplication.adapter.HomeFragmentBannerAdapter;
import com.example.epidemicscenarioapplication.adapter.HomeFragmentVerticalBannerAdapter;
import com.example.epidemicscenarioapplication.base.BaseFragment;
import com.example.epidemicscenarioapplication.custom.HomeFragmentFreeClinic;
import com.example.epidemicscenarioapplication.custom.HomeFragmetPlatformDialog;


import com.example.epidemicscenarioapplication.databinding.HomeFragmentBinding;
import com.example.epidemicscenarioapplication.domain.VerticalBannerDataBeans;
import com.example.epidemicscenarioapplication.presenter.impl.HomePagePresenter;
import com.example.epidemicscenarioapplication.utils.ConstantsUtils;
import com.example.epidemicscenarioapplication.utils.SpUtils;
import com.example.epidemicscenarioapplication.view.IHomepageView;
import com.example.epidemicscenarioapplication.view.activity.DataBackActivity;
import com.example.epidemicscenarioapplication.view.activity.SearchActivity;
import com.example.epidemicscenarioapplication.view.activity.WebPageActivity;
import com.example.epidemicscenarioapplication.view.activity.AroundConfirmedActivity;
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
public class HomeFragment extends BaseFragment implements IHomepageView<List>, OnBannerListener {
    private static final String TAG = "HomeFragment";
    private HomePagePresenter mHomePagePresenter;
    private ArrayList<VerticalBannerDataBeans> Datas;
    private HomeFragmetPlatformDialog mDialog;
    private WindowManager.LayoutParams mLp;
    private HomeFragmentBinding mHomeFragmentBinding;
    private LinearLayout mHomeFragmentBindingRoot;


    @Override
    protected void initListener() {
        Log.d(TAG, "initListener: 首页轮播图设置监听");
        mHomeFragmentBinding.homepagerBanner.setOnBannerListener(this);
        MyOnclickListener myOnclickListener = new MyOnclickListener();
        mDialog.mMBinding.llAliijiankang.setOnClickListener(myOnclickListener);
        mDialog.mMBinding.llBaidu.setOnClickListener(myOnclickListener);
        mDialog.mMBinding.llDingxiangyuan.setOnClickListener(myOnclickListener);
        mDialog.mMBinding.llKuake.setOnClickListener(myOnclickListener);
        mDialog.mMBinding.llXinlang.setOnClickListener(myOnclickListener);
        mDialog.mMBinding.llTengxun.setOnClickListener(myOnclickListener);
        mDialog.mMBinding.llZhihu.setOnClickListener(myOnclickListener);
        mDialog.mMBinding.llDiyixaijing.setOnClickListener(myOnclickListener);
        mHomeFragmentBinding.llDataBack.setOnClickListener(myOnclickListener);
        mHomeFragmentBinding.llFullPlatformData.setOnClickListener(myOnclickListener);
        mHomeFragmentBinding.llCar.setOnClickListener(myOnclickListener);
        mHomeFragmentBinding.etSearch.setOnClickListener(myOnclickListener);
        mHomeFragmentBinding.llNcovMask.setOnClickListener(myOnclickListener);
        mHomeFragmentBinding.llRumor.setOnClickListener(myOnclickListener);
        mHomeFragmentBinding.llWjw.setOnClickListener(myOnclickListener);
        mHomeFragmentBinding.llFreeClinic.setOnClickListener(myOnclickListener);
    }

    @Override
    protected void initPresenter() {
        mHomePagePresenter = new HomePagePresenter(this);
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
        mHomeFragmentBinding.llNcovVillage.setOnClickListener(v -> startActivity(new Intent(mHomeFragmentBindingRoot.getContext(), AroundConfirmedActivity.class)));
    }


    @Override
    protected View getSuccessView(LayoutInflater inflater, ViewGroup container) {
        mHomeFragmentBinding = HomeFragmentBinding.inflate(inflater, container, false);
        mHomeFragmentBindingRoot = mHomeFragmentBinding.getRoot();
        return mHomeFragmentBindingRoot;
    }

    private void initDialog() {
        mDialog = new HomeFragmetPlatformDialog(mHomeFragmentBindingRoot.getContext(), R.layout.home_dialog_platform);
    }


    @Override
    public void initData() {
        //假装加载
        mHomePagePresenter.loadBanner();
        String location = SpUtils.getString(getContext(), ConstantsUtils.LOCATION_CITY, "");
        Log.d(TAG, "initNetworkRequest: 执行");
        Datas = new ArrayList<>();
//            获取所在市各个县区疫情数据
        mHomePagePresenter = new HomePagePresenter(HomeFragment.this);
//            获取首页天气
        // TODO: 2020/9/6 别忘了删除
        mHomePagePresenter.loadVerticalBannerWeather(getContext(),"济南");
        Log.d(TAG, "initNetworkRequest: 获取天气");
//        注意请求天气和请求各个县区的疫情数据一定得是这个先后关系，因为location是请求天气的时候才传过去的
        mHomePagePresenter.loadCountyList();
        RequestOptions options = new RequestOptions()
                .diskCacheStrategy(DiskCacheStrategy.RESOURCE);
    }


    @Override
    public void showLoadingView() {

    }


    @Override
    public void showSuccessView(List data) {
//添加生命周期观察者
        mHomeFragmentBinding.homepagerBanner.addBannerLifecycleObserver(this)
                .setAdapter(new HomeFragmentBannerAdapter(data))
                .setDelayTime(5000)
                .setOnBannerListener(this)
                .setIndicator(new CircleIndicator(mHomeFragmentBindingRoot.getContext()))
                .setIndicatorSelectedColorRes(R.color.colorPrimaryDark)
                .setIndicatorNormalColorRes(R.color.white)
                .setBannerRound2(15)
                .start();
    }


    @Override
    public void showBannerTipWeather(VerticalBannerDataBeans.WeatherDataBean dataBeans) {
//        构建首页垂直滑动的banner bean对象
        VerticalBannerDataBeans dataBean = new VerticalBannerDataBeans(dataBeans, ConstantsUtils.BANNER_TYPE_WEATER);
        Datas.add(dataBean);
        mHomeFragmentBinding.bannerTips.setAdapter(new HomeFragmentVerticalBannerAdapter(Datas));
        mHomeFragmentBinding.bannerTips.setVisibility(View.VISIBLE);
        mHomeFragmentBinding.pbLoading.setVisibility(View.GONE);
    }

    @Override
    public void showCountyListMessage(VerticalBannerDataBeans.CountyListDataBean countyListDataBean) {
        for (int i = 0; i < countyListDataBean.getData().getResult().getDistrict().getList().size(); i++) {
            VerticalBannerDataBeans beans = new VerticalBannerDataBeans(countyListDataBean.getData().getResult().getDistrict().getList().get(i), ConstantsUtils.BANNER_TYPE_YIQING);
            beans.setTime(countyListDataBean.getData().getResult().getRealtime().getTime());
            Datas.add(beans);
        }

    }

    @Override
    public void OnBannerClick(Object data, int position) {
        switch (position) {
            case 0:
                Log.d(TAG, "OnBannerClick: 点击了第一个");
                WebPageActivity.start(mHomeFragmentBindingRoot.getContext(), "https://lispczz.github.io/pneumonia/");
                break;
            case 1:
//               援鄂名单
                Log.d(TAG, "OnBannerClick: 点击了第二个");
                new GratitudeFragmentDialog().show(getFragmentManager(), "view");
                break;
            case 2:
                Log.d(TAG, "OnBannerClick: 点击了第三个");
                WebPageActivity.start(mHomeFragmentBindingRoot.getContext(), "https://ncov.deepeye.tech/");
                break;
            case 3:
                Log.d(TAG, "OnBannerClick: 点击了第四个");
                Uri uri = Uri.parse("http://www.chinacdc.cn/jkzt/crb/zl/szkb_11803/jszl_11815/202001/W020200128207842237479.pdf");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
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


    @Override
    public void showErrorView() {

    }

    public class MyOnclickListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.ll_aliijiankang:
                    WebPageActivity.start(getContext(), "https://alihealth.taobao.com/medicalhealth/influenzamap?chInfo=spring2020-stay-in");
                    break;
                case R.id.ll_zhihu:
                    WebPageActivity.start(getContext(), "https://www.zhihu.com/special/19681091");
                    break;
                case R.id.ll_diyixaijing:
                    WebPageActivity.start(getContext(), "https://s3.pstatp.com/ies/douyin_wuhan/wuhan/index.html?hide_nav_bar=1&hide_status_bar=0&disableBounces=1&status_bar_color=000&use_wkwebview=1&enter_from=share&timestamp=1581054924&utm_source=copy&utm_campaign=client_share&utm_medium=android&share_app_name=douyin");
                    break;
                case R.id.ll_dingxiangyuan:
                    WebPageActivity.start(getContext(), "https://ncov.dxy.cn/ncovh5/view/pneumonia");
                    break;
                case R.id.ll_tengxun:
                    WebPageActivity.start(getContext(), "https://news.qq.com/zt2020/page/feiyan.htm#/area?pool=sd");
                    break;
                case R.id.ll_baidu:
                    WebPageActivity.start(getContext(), "https://news.sina.cn/zt_d/yiqing0121");
                    break;
                case R.id.ll_kuake:
                    WebPageActivity.start(getContext(), "https://broccoli.uc.cn/apps/pneumonia/routes/index");
                    break;
                case R.id.ll_xinlang:
                    WebPageActivity.start(getContext(), "https://news.sina.cn/zt_d/yiqing0121");
                    break;
                case R.id.ll_car:
//                    去哪网提供同乘车辆查询
                    WebPageActivity.start(getContext(), "https://wxapp.qunar.com/site/feiyansearch/index.html?bd_source=hbzf#/?_k=vih3l0");
                    break;
                case R.id.ll_full_platform_data:
//                    全平台数据
                    setDialog();
                    break;
                case R.id.ll_data_back:
//                    数据回顾
                    startActivity(new Intent(getContext(), DataBackActivity.class));
                    break;
                case R.id.et_search:
//                    顶部搜索框
                    startActivity(new Intent(getContext(),SearchActivity.class));
                    getActivity().overridePendingTransition(R.anim.search_activity_translate_in, R.anim.home_activity_translate_out);
                    break;
                case R.id.ll_ncov_mask:
//                    口罩预约
                    WebPageActivity.start(getContext(),"https://ncov.html5.qq.com/mouthmask/index.html?channelid=6");
                    break;
                case R.id.ll_rumor:
//                    谣言
                   WebPageActivity.start(getContext(),"https://vp.fact.qq.com/home");
                    break;
                case R.id.ll_free_clinic:
//                    在线义诊
                    new HomeFragmentFreeClinic().show(getFragmentManager(), "view");
                    break;
                case R.id.ll_wjw:
//                    卫健委官方通告
                    WebPageActivity.start(getContext(),"http://www.nhc.gov.cn/xcs/yqtb/list_gzbd.shtml");
                    break;
                default:
                    break;
            }
        }
    }

    private void setDialog() {
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
    }
}


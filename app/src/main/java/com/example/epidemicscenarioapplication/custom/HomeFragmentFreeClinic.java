package com.example.epidemicscenarioapplication.custom;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.bumptech.glide.Glide;
import com.example.epidemicscenarioapplication.R;
import com.example.epidemicscenarioapplication.databinding.HomeFreeClinicFragmentDialogBinding;
import com.example.epidemicscenarioapplication.view.activity.WebPageActivity;

/**
 * @author : 鑫宇
 * e-mail : 1769314609@qq.com
 * time   : 2020/09/22
 * desc   :
 * version: 1.0
 */
public class HomeFragmentFreeClinic extends DialogFragment implements View.OnClickListener {

    private HomeFreeClinicFragmentDialogBinding mBinding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = HomeFreeClinicFragmentDialogBinding.inflate(inflater, container, false);
        initView();
        initListener();
        return mBinding.getRoot();
    }

    private void initView() {
        mBinding.ali.setDes("仅支持手机浏览器中打开或支付宝搜索“问专家 电脑端打开将跳转到天猫！");
        Glide.with(getActivity())
                .load("http://image.werty.cn/source_blog/20200126112649.png")
                .into(mBinding.ali.getIvIcon());
        mBinding.ali.setIcon(R.drawable.alijiankang);
        mBinding.ali.setTitle("阿里义诊");

        mBinding.nali.setDes("发热/肺炎咨询在线义诊，全国知名医院志愿专家团队，为您的健康保驾护航");
        Glide.with(getActivity())
                .load("http://image.werty.cn/source_blog/20200216183646.png")
                .into(mBinding.nali.getIvIcon());
        mBinding.nali.setTitle("纳里健康");

        mBinding.haodaifu.setDes("抗击疫情，线上义诊 全国专业医生7x24在线免费答疑");
        Glide.with(getActivity())
                .load("http://image.werty.cn/source_blog/20200126112738.jfif")
                .into(mBinding.haodaifu.getIvIcon());
        mBinding.haodaifu.setTitle("好大夫在线");

        mBinding.weiyi.setDes("抗击疫情，实时救助。紧急动员，集结全国权威三甲专家");
        Glide.with(getActivity())
                .load("http://image.werty.cn/source_blog/20200126113131.jfif")
                .into(mBinding.weiyi.getIvIcon());
        mBinding.weiyi.setTitle("微医互联网总医院");

        mBinding.jingdong.setDes("防范阻击新冠状病毒肺炎，京东健康提供免费图文及电话义诊服务");
        Glide.with(getActivity())
                .load("http://image.werty.cn/source_blog/20200126164535.jfif")
                .into(mBinding.jingdong.getIvIcon());
        mBinding.jingdong.setTitle("京东健康在线义诊");

        mBinding.hubei.setDes("丁香医生提供，需使用微信扫描小程序二维码");
        Glide.with(getActivity())
                .load("http://image.werty.cn/source_blog/20200126013715.png")
                .into(mBinding.hubei.getIvIcon());
        mBinding.hubei.setTitle("湖北免费义诊");

        mBinding.weibo.setDes("新浪微博提供的限量免费义诊服务");
        Glide.with(getActivity())
                .load("http://image.werty.cn/source_blog/20200126023140.jfif")
                .into(mBinding.weibo.getIvIcon());
        mBinding.weibo.setTitle("微博免费义诊");

        mBinding.chongai.setDes("宠爱抑生 X 壹点灵 面向全国因疫情而引发心理问题的人群免费开放心理咨询通道");
        Glide.with(getActivity())
                .load("http://image.werty.cn/source_blog/20200216185009.jpg")
                .into(mBinding.chongai.getIvIcon());
        mBinding.chongai.setTitle("宠爱抑生");


    }

    private void initListener() {
        mBinding.nali.setOnClickListener(this::onClick);
        mBinding.ali.setOnClickListener(this::onClick);
        mBinding.weibo.setOnClickListener(this::onClick);
        mBinding.weiyi.setOnClickListener(this::onClick);
        mBinding.jingdong.setOnClickListener(this::onClick);
        mBinding.hubei.setOnClickListener(this::onClick);
        mBinding.chongai.setOnClickListener(this::onClick);
        mBinding.haodaifu.setOnClickListener(this::onClick);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ali:
                WebPageActivity.start(getActivity(),"https://pages.tmall.com/wow/alijk/act/liugan?wh_biz=tm&spm=a2oua.alipayad.banner.feiyan");
                break;
            case R.id.nali:
                WebPageActivity.start(getActivity(),"https://status.ngarihealth.com/front/newpne.html");
                break;
            case R.id.jingdong:
                WebPageActivity.start(getActivity(),"https://promo.guahao.com/topic/pneumonia");
                break;
            case R.id.haodaifu:
                WebPageActivity.start(getActivity(),"https://m.haodf.com/");
                break;
            case R.id.weiyi:
                WebPageActivity.start(getActivity(),"https://promo.guahao.com/topic/pneumonia");
                break;
            case R.id.weibo:
                WebPageActivity.start(getActivity(),"https://passport.weibo.com/visitor/visitor?entry=miniblog&a=enter&url=https%3A%2F%2Fweibo.com%2F&domain=.weibo.com&sudaref=http%3A%2F%2Fweibo.com%2F&ua=php-sso_sdk_client-0.6.36&_rand=1600769643.72");
                break;
            case R.id.chongai:
                WebPageActivity.start(getActivity(),"https://m.ydl.com/zx/activity/commonweal?channel=antipneumonic-listen&unit_id=3268281&keyword_id=256013");
                break;
            case R.id.hubei:
                WebPageActivity.start(getActivity(),"https://img1.dxycdn.com/2020/0125/993/3392865907226580601-22.jpg");
                break;
            default:
                break;
        }

    }
}

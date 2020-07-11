package com.example.epidemicscenarioapplication.view.fragment;


import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager2.widget.ViewPager2;

import com.example.epidemicscenarioapplication.adapter.WikipediaFragmentAdapter;
import com.example.epidemicscenarioapplication.base.BaseFragment;
import com.example.epidemicscenarioapplication.databinding.RumorFragmentBinding;
import com.example.epidemicscenarioapplication.view.IRumorView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.gyf.immersionbar.ImmersionBar;

import java.util.ArrayList;

/**
 * @author sly
 * @version 1.0
 * @date 2020/6/28
 * @description com.example.epidemicscenarioapplication.view.fragment
 */

public class WikipediaFragment extends BaseFragment implements IRumorView {

    private ArrayList<Fragment> mFragments;
    private static final String TAG = "RumorFragment";
    private LinearLayout mRumorFragmentBindingRoot;
    private RumorFragmentBinding mRumorFragmentBinding;

    @Override
    protected void initListener() {

    }

    @Override
    protected void initPresenter() {


    }

    @Override
    protected void initView() {
//       viewpager 在gone状态下不初始化fragment
        setViewState(ViewState.SUCCESS);

    }

    @Override
    protected View getSuccessView(LayoutInflater inflater, ViewGroup container) {
        mRumorFragmentBinding = RumorFragmentBinding.inflate(inflater, container, false);
        mRumorFragmentBindingRoot = mRumorFragmentBinding.getRoot();
        return mRumorFragmentBindingRoot;
    }

    @Override
    protected void initData() {
        Log.d(TAG, "initData: 疫情百科初始化数据");
        FragmentManager manger = getFragmentManager();
        FragmentTransaction transaction = manger.beginTransaction();
        WikipediaFragmentAdapter tengxunAdapter = new WikipediaFragmentAdapter(getActivity());
        WikipediaDiagnosisPageFragment wikipediaDiagnosisPage = new WikipediaDiagnosisPageFragment();
        WikipediaPreventionPageFragment wikipediaPreventionPage = new WikipediaPreventionPageFragment();
        mFragments = new ArrayList<>();
        mFragments.add(wikipediaPreventionPage);
        mFragments.add(wikipediaDiagnosisPage);
        tengxunAdapter.setData(mFragments);
        mRumorFragmentBinding.vp2Yiqingchishangtengxun.setAdapter(tengxunAdapter);
//        这句话不知道有没有用
        mRumorFragmentBinding.vp2Yiqingchishangtengxun.requestDisallowInterceptTouchEvent(true);
        ArrayList<String> title = new ArrayList<>();
        title.add("预防指南");
        title.add("检查诊断");

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(mRumorFragmentBinding.tlChangshi, mRumorFragmentBinding.vp2Yiqingchishangtengxun, (tab, position) -> {
            tab.setText(title.get(position));
        });
        tabLayoutMediator.attach();

    }



    @Override
    public void showSuccessView() {

    }

    @Override
    public void showErrorTips() {

    }


}

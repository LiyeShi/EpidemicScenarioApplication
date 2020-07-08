package com.example.epidemicscenarioapplication.view.fragment;


import android.util.Log;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager2.widget.ViewPager2;

import com.example.epidemicscenarioapplication.R;
import com.example.epidemicscenarioapplication.adapter.WikipediaFragmentAdapter;
import com.example.epidemicscenarioapplication.base.BaseFragment;
import com.example.epidemicscenarioapplication.view.IRumorView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

/**
 * @author sly
 * @version 1.0
 * @date 2020/6/28
 * @description com.example.epidemicscenarioapplication.view.fragment
 */

public class WikipediaFragment extends BaseFragment implements IRumorView {

    private TabLayout mTlChangshi;
    private ViewPager2 mViewPager2;
    private ArrayList<Fragment> mFragments;
    private static final String TAG = "RumorFragment";
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
        mTlChangshi = mSuccessView.findViewById(R.id.tl_changshi);
        mViewPager2 = mSuccessView.findViewById(R.id.vp2_yiqingchishangtengxun);


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
        mViewPager2.setAdapter(tengxunAdapter);
//        这句话不知道有没有用
        mViewPager2.requestDisallowInterceptTouchEvent(true);
        ArrayList<String> title = new ArrayList<>();
        title.add("预防指南");
        title.add("检查诊断");

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(mTlChangshi, mViewPager2, (tab, position) -> {
            tab.setText(title.get(position));
        });
        tabLayoutMediator.attach();

    }

    @Override
    protected int getResId() {
        return R.layout.rumor_fragment;
    }

    @Override
    public void showSuccessView() {

    }

    @Override
    public void showErrorTips() {

    }
}

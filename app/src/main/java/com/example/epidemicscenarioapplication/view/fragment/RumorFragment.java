package com.example.epidemicscenarioapplication.view.fragment;


import android.util.Log;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager2.widget.ViewPager2;

import com.example.epidemicscenarioapplication.R;
import com.example.epidemicscenarioapplication.adapter.tengxunAdapter;
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
// TODO: 2020/7/5 tablayout 加 一个页面   适配状态栏 然后找接口 然后进行下一步
public class RumorFragment extends BaseFragment implements IRumorView {

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
        mTlChangshi = mRootView.findViewById(R.id.tl_changshi);
        mViewPager2 = mRootView.findViewById(R.id.vp2_yiqingchishangtengxun);


    }

    @Override
    protected void initData() {
        //TabLayout的基本使用
        for(int i=0;i<2;i++){
            TabLayout.Tab tab=mTlChangshi.newTab();
            tab.setTag(i);
            tab.setText("第"+i+"页");
            mTlChangshi.addTab(tab);
        }

        FragmentManager manger = getFragmentManager();
        FragmentTransaction transaction = manger.beginTransaction();
        tengxunAdapter tengxunAdapter = new tengxunAdapter(getActivity());
        Tengxun1Fragment tengxun1Fragment = new Tengxun1Fragment();
        Tengxun1Fragment2 tengxun1Fragment2 = new Tengxun1Fragment2();
        mFragments = new ArrayList<>();
        mFragments.add(tengxun1Fragment2);
        mFragments.add(tengxun1Fragment);
        tengxunAdapter.setData(mFragments);
        mViewPager2.setAdapter(tengxunAdapter);
//        mViewPager2.requestDisallowInterceptTouchEvent(true);
        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(mTlChangshi, mViewPager2, (tab, position) -> {
                tab.setText("sfdsdf"+position);
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

package com.example.epidemicscenarioapplication.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

/**
 * @author sly
 * @version 1.0
 * @date 2020/6/29
 * @description com.example.epidemicscenarioapplication.adapter
 * 之前一直报错，原因就是没有看清vp2的适配器应该继承自谁
 */
public class ViewpagerAdapter extends FragmentStateAdapter {
    ArrayList<Fragment> mFragmentArrayList = new ArrayList<>();

    public ViewpagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }


    public void setData(ArrayList<Fragment> fragmentArrayList) {
        mFragmentArrayList=fragmentArrayList;
    }




    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return mFragmentArrayList.get(position);
    }

    @Override
    public int getItemCount() {
        return mFragmentArrayList.size();
    }
}

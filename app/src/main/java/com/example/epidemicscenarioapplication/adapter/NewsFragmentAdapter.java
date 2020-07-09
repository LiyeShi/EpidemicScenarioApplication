package com.example.epidemicscenarioapplication.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

/**
 * @author sly
 * @version 1.0
 * @date 2020/7/8
 * @description com.example.epidemicscenarioapplication.adapter
 */
public class NewsFragmentAdapter extends FragmentStateAdapter {
    ArrayList<Fragment>mFragments;

    public NewsFragmentAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    public  void setData(ArrayList<Fragment> fragments) {
        if (mFragments == null) {
            mFragments = new ArrayList<>();
          mFragments=fragments;
        }

    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getItemCount() {
        return mFragments.size();
    }
}

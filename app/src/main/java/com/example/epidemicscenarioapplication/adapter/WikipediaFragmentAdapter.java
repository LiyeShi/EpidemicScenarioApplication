package com.example.epidemicscenarioapplication.adapter;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

/**
 * @author sly
 * @version 1.0
 * @date 2020/7/6
 * @description com.example.epidemicscenarioapplication.adapter
 */
public class WikipediaFragmentAdapter extends FragmentStateAdapter {
    private static final String TAG = "tengxunAdapter";
    ArrayList<Fragment> fragmentList=new ArrayList<>();

    public WikipediaFragmentAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }
    public void setData(ArrayList<Fragment> fragmentArrayList) {
        fragmentList=fragmentArrayList;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getItemCount() {
        Log.d(TAG, "getItemCount: Fragment集合大小==》"+fragmentList.size());
        return fragmentList.size();
    }
}

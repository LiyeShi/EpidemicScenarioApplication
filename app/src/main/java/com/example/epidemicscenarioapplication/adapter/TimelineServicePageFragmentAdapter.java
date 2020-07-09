package com.example.epidemicscenarioapplication.adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * @author sly
 * @version 1.0
 * @date 2020/7/9
 * @description com.example.epidemicscenarioapplication.adapter
 */
public class TimelineServicePageFragmentAdapter extends RecyclerView.Adapter<TimelineServicePageFragmentAdapter.InnerHolder> {
    @NonNull
    @Override
    public TimelineServicePageFragmentAdapter.InnerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull TimelineServicePageFragmentAdapter.InnerHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class InnerHolder extends RecyclerView.ViewHolder {
        public InnerHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}

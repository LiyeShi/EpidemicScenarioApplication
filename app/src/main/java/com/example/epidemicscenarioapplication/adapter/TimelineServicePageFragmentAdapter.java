package com.example.epidemicscenarioapplication.adapter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.epidemicscenarioapplication.R;

import com.example.epidemicscenarioapplication.databinding.RecycleItemLatestNewsBinding;
import com.example.epidemicscenarioapplication.domain.TimelineServiceDataBean;

import java.util.ArrayList;

/**
 * @author sly
 * @version 1.0
 * @date 2020/7/9
 * @description com.example.epidemicscenarioapplication.adapter
 */
public class TimelineServicePageFragmentAdapter extends RecyclerView.Adapter {
    private static final String TAG = "TimelineServicePageFrag";
    private static final int TYPE_LATEST_NEWS = 0;
    private static final int TYPE_NORMAL_NEWS = 1;
    private ArrayList<TimelineServiceDataBean> list;


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        if (viewType == TYPE_LATEST_NEWS) {
             view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_item_latest_news, parent, false);
            return new ContainTipViewHolder(view);
        }else {
             view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_item_news_page, parent, false);

        }
        return new NormalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        int viewType = holder.getItemViewType();
        if (viewType== TYPE_LATEST_NEWS){
            ContainTipViewHolder containTipViewHolder= (ContainTipViewHolder) holder;
            containTipViewHolder.mItemLatestNewsPageFragmentBinding.tvNewsTitlePage.setText(list.get(position).getTitle());
            containTipViewHolder.mItemLatestNewsPageFragmentBinding.tvNewsAbsPage.setText(list.get(position).getSummary());
            containTipViewHolder.mItemLatestNewsPageFragmentBinding.tvNewsAuthorPage.setText(list.get(position).getInfoSource());
            containTipViewHolder.mItemLatestNewsPageFragmentBinding.tvNewsUpdataTime.setText(list.get(position).getPubDateStr());
        }else {
            NormalViewHolder normalViewHolder= (NormalViewHolder) holder;
            normalViewHolder.mNewsPageFragmentBinding.tvNewsTitlePage.setText(list.get(position).getTitle());
            normalViewHolder.mNewsPageFragmentBinding. tvNewsAbsPage.setText(list.get(position).getSummary());
            normalViewHolder.mNewsPageFragmentBinding.tvNewsAuthorPage.setText(list.get(position).getInfoSource());
            normalViewHolder.mNewsPageFragmentBinding.  tvNewsUpdataTime.setText(list.get(position).getPubDateStr());
        }
    }


    @Override
    public int getItemViewType(int position) {
        if (position==0) {
            return TYPE_LATEST_NEWS;
        }else {
            return TYPE_NORMAL_NEWS;
        }
    }

    @Override
    public int getItemCount() {
        Log.d(TAG, "getItemCount: 新闻集合大小==>"+list.size());
        return list.size();
    }

    public void setData(ArrayList<TimelineServiceDataBean> list) {
        if (this.list == null) {
            this.list = new ArrayList<>();
            this.list=list;
        }

    }
    class ContainTipViewHolder extends RecyclerView.ViewHolder{

        private RecycleItemLatestNewsBinding mItemLatestNewsPageFragmentBinding;

        public ContainTipViewHolder(@NonNull View itemView) {
            super(itemView);
            mItemLatestNewsPageFragmentBinding = RecycleItemLatestNewsBinding.bind(itemView);
        }
    }
    class NormalViewHolder extends RecyclerView.ViewHolder{

        private RecycleItemLatestNewsBinding mNewsPageFragmentBinding;

        public NormalViewHolder(@NonNull View itemView) {
            super(itemView);
            mNewsPageFragmentBinding = RecycleItemLatestNewsBinding.bind(itemView);
        }
    }
}

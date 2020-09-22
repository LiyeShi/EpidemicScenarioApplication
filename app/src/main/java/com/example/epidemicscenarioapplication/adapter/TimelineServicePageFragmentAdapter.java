package com.example.epidemicscenarioapplication.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.epidemicscenarioapplication.R;
import com.example.epidemicscenarioapplication.databinding.NewsRecycleItemLatestBinding;
import com.example.epidemicscenarioapplication.databinding.NewsRecycleItemNormalBinding;
import com.example.epidemicscenarioapplication.domain.TimelineServiceDataBean;
import com.example.epidemicscenarioapplication.view.activity.WebPageActivity;

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
    private Context mContext;
    private View mView;
    private NormalViewHolder mHolder;
    private WikipediaPageFragmentAdapter.onItemCilckListener onItemCilckListener;

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        if (viewType == TYPE_LATEST_NEWS) {
            mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_recycle_item_latest, parent, false);
            ContainTipViewHolder viewHolder = new ContainTipViewHolder(mView);
//            viewHolder.itemView.setOnClickListener((v)->{
//                int position = viewHolder.getAdapterPosition();
//                WebPageActivity.start(mContext,list.get(position).getSourceUrl());
//            });
             return viewHolder;
        }else {
            mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_recycle_item_normal, parent, false);
            mHolder = new NormalViewHolder(mView);
//            mHolder.itemView.setOnClickListener(v -> {
//                int position = mHolder.getAdapterPosition();
//                Log.d(TAG, "onCreateViewHolder: position==>"+position);
////                这个地方还有问题 position怎么累计了
//                WebPageActivity.start(mContext,list.get(position-1).getSourceUrl());
//            });

        }
        return mHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (onItemCilckListener != null) {
            Log.d(TAG, "onBindViewHolder: 点击了==》" + position);
            holder.itemView.setOnClickListener(v -> onItemCilckListener.onItemCilck(position));
        }
        int viewType = holder.getItemViewType();
        if (viewType== TYPE_LATEST_NEWS){
            ContainTipViewHolder containTipViewHolder= (ContainTipViewHolder) holder;
            containTipViewHolder.mItemLatestNewsPageFragmentBinding.tvTitle.setText(list.get(position).getTitle());
            containTipViewHolder.mItemLatestNewsPageFragmentBinding.tvNewsAbs.setText(list.get(position).getSummary());
            containTipViewHolder.mItemLatestNewsPageFragmentBinding.tvNewsAuthorPage.setText(list.get(position).getInfoSource());
            containTipViewHolder.mItemLatestNewsPageFragmentBinding.tvNewsUpdataTime.setText(list.get(position).getPubDateStr());
        }else {
            NormalViewHolder normalViewHolder= (NormalViewHolder) holder;
            normalViewHolder.mNewsPageFragmentBinding.tvTitle.setText(list.get(position).getTitle());
            normalViewHolder.mNewsPageFragmentBinding. tvNewsAbs.setText(list.get(position).getSummary());
            normalViewHolder.mNewsPageFragmentBinding.tvNewsAuthorPage.setText(list.get(position).getInfoSource());
            normalViewHolder.mNewsPageFragmentBinding.  tvNewsUpdataTime.setText(list.get(position).getPubDateStr());
        }
    }

    public void setOnItemListener(WikipediaPageFragmentAdapter.onItemCilckListener itemListener) {
        this.onItemCilckListener = itemListener;
    }

    public interface onItemCilckListener {
        void onItemCilck(int position);
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

        private NewsRecycleItemLatestBinding mItemLatestNewsPageFragmentBinding;

        public ContainTipViewHolder(@NonNull View itemView) {
            super(itemView);
            mItemLatestNewsPageFragmentBinding = NewsRecycleItemLatestBinding.bind(itemView);
        }
    }
    class NormalViewHolder extends RecyclerView.ViewHolder{

        private NewsRecycleItemNormalBinding mNewsPageFragmentBinding;

        public NormalViewHolder(@NonNull View itemView) {
            super(itemView);
            mNewsPageFragmentBinding = NewsRecycleItemNormalBinding.bind(itemView);
        }
    }
}

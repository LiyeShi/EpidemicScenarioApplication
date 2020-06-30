package com.example.epidemicscenarioapplication.adapter;

import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.youth.banner.adapter.BannerAdapter;


import java.util.List;

/**
 * @author sly
 * @version 1.0
 * @date 2020/6/30
 * @description com.example.epidemicscenarioapplication.adapter
 * 还得学学泛型 怎么使用  HomePageBannerAdapter
 */


    public class HomePageBannerAdapter extends BannerAdapter<DataBean, HomePageBannerAdapter.BannerViewHolder> {

        public HomePageBannerAdapter(List<DataBean> mDatas) {
            //设置数据，也可以调用banner提供的方法,或者自己在adapter中实现
            super(mDatas);
        }

        //创建ViewHolder，可以用viewType这个字段来区分不同的ViewHolder
        @Override
        public BannerViewHolder onCreateHolder(ViewGroup parent, int viewType) {
            ImageView imageView = new ImageView(parent.getContext());
            //注意，必须设置为match_parent，这个是viewpager2强制要求的
            imageView.setLayoutParams(new ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            return new BannerViewHolder(imageView);
        }

        @Override
        public void onBindView(BannerViewHolder holder, DataBean data, int position, int size) {
            holder.imageView.setImageResource(data.id);
        }

        class BannerViewHolder extends RecyclerView.ViewHolder {
            ImageView imageView;
            public BannerViewHolder(@NonNull ImageView view) {
                super(view);
                this.imageView = view;
            }
        }
    }
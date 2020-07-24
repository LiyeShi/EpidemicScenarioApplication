package com.example.epidemicscenarioapplication.adapter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.epidemicscenarioapplication.databinding.NewsRecycleItemLocalBinding;
import com.example.epidemicscenarioapplication.domain.LocalNewsDataBean;

import java.util.IdentityHashMap;
import java.util.List;

/**
 * author : 鑫宇
 * e-mail : 1769314609@qq.com
 * time   : 2020/07/24
 * desc   :
 * version: 1.0
 */
public class LocalNewsFragmentAdapter extends RecyclerView.Adapter<LocalNewsFragmentAdapter.ViewHolder> {
    LocalNewsDataBean mDataBean;
    private onItemCilckListener onItemCilckListener;
    public LocalNewsFragmentAdapter(LocalNewsDataBean dataBean) {
        mDataBean = dataBean;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        NewsRecycleItemLocalBinding binding = NewsRecycleItemLocalBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        if (onItemCilckListener != null) {
            holder.itemView.setOnClickListener(v -> onItemCilckListener.onItemCilck(position));
        }
        List<LocalNewsDataBean.DataBean.ResultBean.WholeBean> wholeBeanList = mDataBean.getData().getResult().getWhole();
        LocalNewsDataBean.DataBean.ResultBean.WholeBean bean = wholeBeanList.get(position);
        if (bean.getSecond_cls().equals("公告")) {
                holder.mTvNewsLocalGovern.setVisibility(View.VISIBLE);
        } else if (bean.getSecond_cls().equals("官方")) {
            holder.mIvOffice.setVisibility(View.VISIBLE);
        }else {
            holder.mTvNewsTitle.setText(bean.getTitle());
            holder.mTvNewsAuthor.setText(bean.getWx_name());
            holder.mTvNewsUpdataTime.setText(bean.getFtime());
        }
    }

    public void setOnItemListener(onItemCilckListener itemListener) {
        this.onItemCilckListener = itemListener;
    }

    public interface onItemCilckListener {
        void onItemCilck(int position);
    }
    @Override
    public int getItemCount() {
        int size =  mDataBean.getData().getResult().getWhole().size();
        return size;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private  TextView mTvNewsTitle;
        private  TextView mTvNewsUpdataTime;
        private  ImageView mIvOffice;
        private  TextView mTvNewsAuthor;
        private final TextView mTvNewsLocalGovern;

        public ViewHolder(@NonNull NewsRecycleItemLocalBinding itemView) {
            super(itemView.getRoot());
            mTvNewsTitle = itemView.tvNewsTitle;
            mTvNewsUpdataTime = itemView.tvNewsUpdataTime;
            mIvOffice = itemView.ivOffice;
            mTvNewsAuthor = itemView.tvNewsAuthor;
            mTvNewsLocalGovern = itemView.tvNewsLocalGovern;
        }
    }
}

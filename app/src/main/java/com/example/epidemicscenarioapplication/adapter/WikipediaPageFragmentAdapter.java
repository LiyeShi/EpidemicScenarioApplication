package com.example.epidemicscenarioapplication.adapter;


import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.epidemicscenarioapplication.R;
import com.example.epidemicscenarioapplication.domain.WikipediaDataBean;

import java.util.ArrayList;

/**
 * @author sly
 * @version 1.0
 * @date 2020/7/3
 * @description com.example.epidemicscenarioapplication.adapter
 */
public class WikipediaPageFragmentAdapter extends RecyclerView.Adapter {
    private static final int CONTAIN_IMAGE = 0;
    private static final int ONLY_TEXTVIEW = 1;
    ArrayList<WikipediaDataBean.DataBean.DocsBean> dataBeans;
    private Context mContext;
    private static final String TAG = "WikipediaDiagnoseAdapte";
    private View mView;
    private onItemCilckListener onItemCilckListener;


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        if (viewType == CONTAIN_IMAGE) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.wikipedia_recycle_item_contain_image, parent, false);
            return new ContainImagViewHolder(view);
        } else {
            mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.wikipedia_recycle_item_only_text, parent, false);
            return new OnlyTextViewHolder(mView);
        }

    }

    public void setOnItemListener(onItemCilckListener itemListener) {
        this.onItemCilckListener = itemListener;
    }

    public interface onItemCilckListener {
        void onItemCilck(int position);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (onItemCilckListener != null) {
            Log.d(TAG, "onBindViewHolder: 点击了==》" + position);
            holder.itemView.setOnClickListener(v -> onItemCilckListener.onItemCilck(position));
        }
        if (holder instanceof ContainImagViewHolder) {
            ContainImagViewHolder containImagViewHolder = (ContainImagViewHolder) holder;
            Glide.with(mContext)
                    .load(dataBeans.get(position).getImage())
                    .into(containImagViewHolder.ivNewsIcon
                    );

//        话说为什么判空不行，非得看长度呢 没有来源机构的logo 自己弄一个假的
            if (dataBeans.get(position).getAuthor_info().getIcon().trim().length() > 0) {
                Log.d(TAG, "onBindViewHolder: 空数据==>" + dataBeans.get(position).getAuthor_info().getIcon());
                Glide.with(mContext)
                        .load(dataBeans.get(position).getAuthor_info().getIcon())
                        .into(containImagViewHolder.ivAuthorIcon
                        );
            } else {
                containImagViewHolder.ivAuthorIcon.setImageResource(R.drawable.hospital);
            }
            containImagViewHolder.tvAuthor.setText(dataBeans.get(position).getAuthor_info().getHospital().trim());
            containImagViewHolder.tvTitle.setText(dataBeans.get(position).getTitle().trim());
            containImagViewHolder.tvDes.setText(dataBeans.get(position).getAbs().trim());

        } else {
            if (holder instanceof OnlyTextViewHolder) {
                OnlyTextViewHolder textViewHolder = (OnlyTextViewHolder) holder;
                //        话说为什么判空不行，非得看长度呢 没有来源机构的logo 自己弄一个假的
                if (dataBeans.get(position).getAuthor_info().getIcon().trim().length() > 0) {
                    Log.d(TAG, "onBindViewHolder: 空数据==>" + dataBeans.get(position).getAuthor_info().getIcon());
                    Glide.with(mContext)
                            .load(dataBeans.get(position).getAuthor_info().getIcon())
                            .into(textViewHolder.ivAuthorIcon
                            );
                } else {
                    textViewHolder.ivAuthorIcon.setImageResource(R.drawable.hospital);

                }
                textViewHolder.tvAuthor.setText(dataBeans.get(position).getAuthor_info().getHospital().trim());
                textViewHolder.tvTitle.setText(dataBeans.get(position).getTitle().trim());
                textViewHolder.tvDes.setText(dataBeans.get(position).getAbs().trim());
            }
        }
    }

    @Override
    public int getItemViewType(int position) {
//        说明返回了缩略图
        if (dataBeans.get(position).getImage().trim().length() > 5) {
            return CONTAIN_IMAGE;
        } else {
            //            说明只返回了文字
            return ONLY_TEXTVIEW;
        }


    }


    public void setDataBeans(ArrayList<WikipediaDataBean.DataBean.DocsBean> dataBeans) {
        this.dataBeans = dataBeans;
        Log.d(TAG, "setDataBeans: 数据大小==>" + dataBeans.size());
    }

    @Override
    public int getItemCount() {
        Log.d(TAG, "getItemCount: 百科诊断数据大小==>" + dataBeans.size());
        return dataBeans.size();
    }


    public class ContainImagViewHolder extends RecyclerView.ViewHolder {
        private ImageView ivNewsIcon;
        private TextView tvTitle;
        private TextView tvDes;
        private TextView tvAuthor;
        private ImageView ivAuthorIcon;

        public ContainImagViewHolder(@NonNull View itemView) {
            super(itemView);
            ivNewsIcon = itemView.findViewById(R.id.iv_news_icon);
            tvTitle = itemView.findViewById(R.id.tv_title);
            tvDes = itemView.findViewById(R.id.tv_news_abs);
            tvAuthor = itemView.findViewById(R.id.tv_news_author);
            ivAuthorIcon = itemView.findViewById(R.id.iv_author_icon);
        }


    }

    public class OnlyTextViewHolder extends RecyclerView.ViewHolder {
        private TextView tvTitle;
        private TextView tvDes;
        private TextView tvAuthor;
        private ImageView ivAuthorIcon;

        public OnlyTextViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tv_title);
            tvDes = itemView.findViewById(R.id.tv_news_abs);
            tvAuthor = itemView.findViewById(R.id.tv_news_author);
            ivAuthorIcon = itemView.findViewById(R.id.iv_author_icon);
        }
    }

}

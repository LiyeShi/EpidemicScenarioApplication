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
import com.example.epidemicscenarioapplication.domain.DiagnoseDataBean;

import java.util.ArrayList;

/**
 * @author sly
 * @version 1.0
 * @date 2020/7/3
 * @description com.example.epidemicscenarioapplication.adapter
 */
public class WikipediaDiagnoseAdapter extends RecyclerView.Adapter<WikipediaDiagnoseAdapter.InnerHolder> {
    ArrayList<DiagnoseDataBean.DataBean.DocsBean> dataBeans;
    private Context mContext;
    private static final String TAG = "WikipediaDiagnoseAdapte";

    @NonNull
    @Override
    public WikipediaDiagnoseAdapter.InnerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_diagnose_list,parent,false);
        return new InnerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WikipediaDiagnoseAdapter.InnerHolder holder, int position) {
        if (dataBeans.get(position).getImage().trim().length()>0){
            Glide.with(mContext)
                    .load(dataBeans.get(position).getImage())
                    .into(holder.ivNewsIcon
                    );
        }else {
            holder.ivNewsIcon.setImageResource(R.mipmap.ic_launcher);
        }
//        话说为什么判空不行，非得看长度呢
        if (dataBeans.get(position).getAuthor_info().getIcon().trim().length()>0) {
            Log.d(TAG, "onBindViewHolder: 空数据==>"+dataBeans.get(position).getAuthor_info().getIcon());
            Glide.with(mContext)
                    .load(dataBeans.get(position).getAuthor_info().getIcon())
                    .into(holder.ivAuthorIcon
                    );
        }else {
            holder.ivAuthorIcon.setImageResource(R.mipmap.ic_launcher);

        }

        holder.tvAuthor.setText(dataBeans.get(position).getAuthor_info().getHospital().trim());
        holder.tvTitle.setText(dataBeans.get(position).getTitle().trim());
        holder.tvDes.setText(dataBeans.get(position).getAbs().trim());
    }

    public void setDataBeans(ArrayList<DiagnoseDataBean.DataBean.DocsBean> dataBeans) {
        this.dataBeans = dataBeans;
        Log.d(TAG, "setDataBeans: 数据大小==>"+dataBeans.size());
    }

    @Override
    public int getItemCount() {
        Log.d(TAG, "getItemCount: 百科诊断数据大小==>"+dataBeans.size());
        return dataBeans.size();
    }

    public class InnerHolder extends RecyclerView.ViewHolder {
        private ImageView ivNewsIcon;
        private TextView tvTitle;
        private TextView tvDes;
        private TextView tvAuthor;
        private ImageView ivAuthorIcon;
        public InnerHolder(@NonNull View itemView) {
            super(itemView);
            ivNewsIcon = itemView.findViewById(R.id.iv_news_icon);
            tvTitle = itemView.findViewById(R.id.tv_news_title);
            tvDes = itemView.findViewById(R.id.tv_news_abs);
            tvAuthor = itemView.findViewById(R.id.tv_news_author);
            ivAuthorIcon = itemView.findViewById(R.id.iv_author_icon);
        }
    }
}

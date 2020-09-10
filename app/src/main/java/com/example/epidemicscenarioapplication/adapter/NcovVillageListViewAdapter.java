package com.example.epidemicscenarioapplication.adapter;

import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.epidemicscenarioapplication.R;
import com.example.epidemicscenarioapplication.domain.NcovVillageDataBean;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;

/**
 * @author sly
 * @version 1.0
 * @date 2020/7/3
 * @description com.example.epidemicscenarioapplication.adapter
 */
public class NcovVillageListViewAdapter extends BaseAdapter {
    List<NcovVillageDataBean.DataBean> datas;

    private static final String TAG = "NcovVillageListViewAdap";
    public NcovVillageListViewAdapter(List<NcovVillageDataBean.DataBean> datas) {
        if (this.datas==null) {
           this.datas = new ArrayList<>();
        }
        this.datas = datas;
    }

    /**
     * 重写下面两个方法，使listView不可点击
     * @return
     */
    @Override
    public boolean areAllItemsEnabled() {
        return false;
    }

    @Override
    public boolean isEnabled(int position) {
        return false;
    }

    @Override
    public int getCount() {
        Log.d(TAG, "getCount: 数据大小==>"+datas.size());
        return datas.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    /**
     * 这个地方还真得谨慎一些，一不小心各种神奇现象都会出现
     * @param position
     * @param convertView
     * @param parent
     * @return
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView==null) {
            holder = new ViewHolder();
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.confirmed_list_item_ncov_village, parent, false);
            holder.tvLocation=convertView.findViewById(R.id.tv_ncov_village);
            holder.tvTime = convertView.findViewById(R.id.tv_ncov_update_time);
            holder.tvCount = convertView.findViewById(R.id.tv_confirmed_number);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.tvLocation.setText(datas.get(position).getPosi_address());
        holder.tvTime.setText(datas.get(position).getUpdate_time());
        holder.tvCount.setTextColor(Color.RED);
        holder.tvCount.setText((Math.abs(datas.get(position).getCnt_sum_certain())+"人"));
        return convertView;
    }

    class ViewHolder{
        TextView tvLocation;
        TextView tvTime;
        TextView tvCount;
    }
}

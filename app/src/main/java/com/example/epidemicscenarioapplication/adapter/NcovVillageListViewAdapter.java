package com.example.epidemicscenarioapplication.adapter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.epidemicscenarioapplication.R;
import com.example.epidemicscenarioapplication.domain.NcovVillageDataBean;

import java.util.ArrayList;
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

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = new ViewHolder();
        if (convertView==null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_ncov_village, parent, false);
            holder.tvLocation=convertView.findViewById(R.id.tv_ncov_village);
            holder.tvTime = convertView.findViewById(R.id.tv_ncov_update_time);
            convertView.setTag(holder);
        }else {
            ViewHolder  viewHolder = (ViewHolder) convertView.getTag();
            viewHolder.tvLocation.setText(datas.get(position).getPosi_address());
            viewHolder.tvTime.setText(datas.get(position).getUpdate_time());
        }
        return convertView;
    }

    class ViewHolder{
        TextView tvLocation;
        TextView tvTime;

    }
}

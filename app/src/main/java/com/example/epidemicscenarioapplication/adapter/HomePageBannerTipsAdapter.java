package com.example.epidemicscenarioapplication.adapter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.epidemicscenarioapplication.R;
import com.example.epidemicscenarioapplication.utils.Constants;
import com.youth.banner.adapter.BannerAdapter;
import com.youth.banner.util.BannerUtils;

import java.util.List;


/**
 * @author sly
 * @version 1.0
 * @date 2020/7/2
 * @description com.example.epidemicscenarioapplication.adapter
 */
public class HomePageBannerTipsAdapter extends BannerAdapter<Integer, RecyclerView.ViewHolder> {
    private static final String TAG = "HomePageBannerTipsAdapt";
    List<Integer> datas;
    private LayoutInflater mInflater;
    private View mView;

    public HomePageBannerTipsAdapter(List<Integer> datas) {
//        设置数据 Banner提供
        super(datas);
        this.datas = datas;
    }


    /**
     * RecyclerView在获取itemView的时候，会首先通过getItemViewType方法去获取该position位置的viewType。
     *
     * @param position
     * @return
     */

    @Override
    public int getItemViewType(int position) {
        Log.d(TAG, "getItemViewType: position==>" + position);
//        我的天呢，终于解决了这个问题，realPosition
//        教训：当你自己凭感觉写了N次都达不到效果时，请仔细查看示例程序 看看哪里和你写的不一样
        return getData(getRealPosition(position));
//        switch (datas.get(position)) {
//            case Constants.BANNER_TYPE_WEATER:
//                return Constants.BANNER_TYPE_WEATER;
//            case Constants.BANNER_TYPE_YIQING:
//                return Constants.BANNER_TYPE_YIQING;
//            default:
//                Log.d(TAG, "我看看getItemViewType: " + datas.get(position));
//                break;
//        }
//        return Constants.BANNER_TYPE_YIQING;
    }

//    @Override
////    public int getItemCount() {
////        Log.d(TAG, "getItemCount: 数据个数==>"+datas.size());
////        return datas.size();
////    }

    @Override
    public int getRealCount() {
        Log.d(TAG, "getRealCount: 真实个数==>" + super.getRealCount());
        return super.getRealCount();
    }

    @Override
    public RecyclerView.ViewHolder onCreateHolder(ViewGroup parent, int viewType) {
        mInflater = LayoutInflater.from(parent.getContext());
        switch (viewType) {
            case Constants.BANNER_TYPE_WEATER:
                View view = BannerUtils.getView(parent, R.layout.item_homepage_banner_weather);
//                ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
//                mView = mInflater.inflate(R.layout.item_homepage_banner_weather, parent, false);
//                mView.setLayoutParams(params);
                return new WeatherViewaHolder(view);
            case Constants.BANNER_TYPE_YIQING:
                return new YiQingViewHolder(BannerUtils.getView(parent, R.layout.item_homepager_banner_yiqing));
            default:
                break;
        }
        return new WeatherViewaHolder(mView);
    }

    @Override
    public void onBindView(RecyclerView.ViewHolder holder, Integer data, int position, int size) {
        int itemViewType = holder.getItemViewType();
        switch (itemViewType) {
            case Constants.BANNER_TYPE_WEATER:
                WeatherViewaHolder weatherViewaHolder= (WeatherViewaHolder) holder;
                weatherViewaHolder.tvWeather.setText("...");
                break;
            case Constants.BANNER_TYPE_YIQING:
                break;
            default:
                break;
        }
    }

    public class WeatherViewaHolder extends RecyclerView.ViewHolder {
        TextView tvWeather;

        public WeatherViewaHolder(@NonNull View itemView) {
            super(itemView);
            tvWeather = itemView.findViewById(R.id.tv_weather);
        }


    }

    public class YiQingViewHolder extends RecyclerView.ViewHolder {

        public YiQingViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

}


//此处设置Item中view的数据





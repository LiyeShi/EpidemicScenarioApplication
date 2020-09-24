package com.example.epidemicscenarioapplication.adapter;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.example.epidemicscenarioapplication.R;
import com.example.epidemicscenarioapplication.domain.VerticalBannerDataBeans;
import com.example.epidemicscenarioapplication.utils.ConstantsUtils;
import com.youth.banner.adapter.BannerAdapter;
import com.youth.banner.util.BannerUtils;

import java.util.List;


/**
 * @author sly
 * @version 1.0
 * @date 2020/7/2
 * @description com.example.epidemicscenarioapplication.adapter
 */
public class HomeFragmentVerticalBannerAdapter extends BannerAdapter<VerticalBannerDataBeans, RecyclerView.ViewHolder> {
    private static final String TAG = "HomePageBannerTipsAdapt";
    private Context mContext;


    public HomeFragmentVerticalBannerAdapter(List<VerticalBannerDataBeans> datas) {
        super(datas);
        Log.d(TAG, "HomePageBannerTipsAdapter: 初始化数据");
    }

//醉辽醉辽 不显示原来是这里的问题 懵逼ing  到底需不需要重写这个方法
//    @Override
//    public int getItemCount() {
//        return mDatas.size();
//    }

    @Override
    public int getItemViewType(int position) {
        Log.d(TAG, "getItemViewType: position==>" + position);
//        我的天呢，终于解决了这个问题，realPosition
//        教训：当你自己凭感觉写了N次都达不到效果时，请仔细查看示例程序 看看哪里和你写的不一样
        int realPosition = getRealPosition(position);
        VerticalBannerDataBeans data = getData(realPosition);
        return data.getViewType();


    }


    @Override
    public RecyclerView.ViewHolder onCreateHolder(ViewGroup parent, int viewType) {
        switch (viewType) {
            case ConstantsUtils.BANNER_TYPE_WEATER:
                mContext = parent.getContext();
                View view = BannerUtils.getView(parent, R.layout.home_item_weather);
                return new WeatherViewaHolder(view);
            case ConstantsUtils.BANNER_TYPE_YIQING:
                return new EpidemicHolder(BannerUtils.getView(parent, R.layout.home_item_epidemic_info));
            default:
                break;
        }
        return null;
    }

    //在这里设置数据
    @Override
    public void onBindView(RecyclerView.ViewHolder holder, VerticalBannerDataBeans data, int position, int size) {
        int itemViewType = holder.getItemViewType();
        switch (itemViewType) {
            case ConstantsUtils.BANNER_TYPE_WEATER:
                WeatherViewaHolder weatherViewaHolder = (WeatherViewaHolder) holder;
//                只判断一个数据是不是为空就行了
                if (data.getWeatherDataBean().getData()!=null) {
                    weatherViewaHolder.tvWeather.setText(data.getWeatherDataBean().getData().getWeather());
                    weatherViewaHolder.tvWind.setText("风力"+data.getWeatherDataBean().getData().getWindPower()+"，"+data.getWeatherDataBean().getData().getWindDirection()+"风");
                    weatherViewaHolder.tvHumidity.setText("湿度:" + data.getWeatherDataBean().getData().getHumidity());
                    weatherViewaHolder.tvTemp.setText(data.getWeatherDataBean().getData().getTemp());
                    weatherViewaHolder.tvUptimer.setText(data.getWeatherDataBean().getData().getReportTime());
                    weatherViewaHolder.tvPositioning.setText(data.getWeatherDataBean().getData().getAddress());
                }
                RequestOptions options = new RequestOptions()
                        .diskCacheStrategy(DiskCacheStrategy.RESOURCE);
                Glide.with(mContext).load(R.drawable.home_fragment_banner_weather_icon).apply(options).into(weatherViewaHolder.ivIcon);
                break;
            case ConstantsUtils.BANNER_TYPE_YIQING:
                EpidemicHolder epidemicHolder = (EpidemicHolder) holder;
                epidemicHolder.tvCount.setTextColor(Color.RED);
                epidemicHolder.tvCount.setText(data.getCountyListDataBean().getSure() + "人");
                epidemicHolder.tvName.setText(data.getCountyListDataBean().getName());
                epidemicHolder.tvTime.setText(data.getTime());
                epidemicHolder.tvSource.setText(data.getCountyListDataBean().getSource());
                break;
            default:
                break;
        }

    }

    //不同类型的ViewHolder
    public class WeatherViewaHolder extends RecyclerView.ViewHolder {
        TextView tvWeather;
        TextView tvTemp;
        TextView tvUptimer;
        TextView tvWind;
        TextView tvPositioning;
        TextView tvHumidity;
        ImageView ivIcon;

        public WeatherViewaHolder(@NonNull View itemView) {
            super(itemView);
            tvWeather = itemView.findViewById(R.id.tv_weather);
            ivIcon = itemView.findViewById(R.id.weather_icon);
            tvTemp = itemView.findViewById(R.id.tv_weather_temp);
            tvHumidity = itemView.findViewById(R.id.tv_weather_humidity);
            tvUptimer=itemView.findViewById(R.id.tv_weather_updata_time);
            tvWind=itemView.findViewById(R.id.tv_weather_wind);
            tvPositioning = itemView.findViewById(R.id.tv_positioning);
        }


    }

    public class EpidemicHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        TextView tvCount;
        TextView tvTime;
        TextView tvSource;

        public EpidemicHolder(View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_home_item_epidemic_name);
            tvTime = itemView.findViewById(R.id.tv_home_item_epidemic_time);
            tvSource = itemView.findViewById(R.id.tv_home_item_epidemic_source);
            tvCount = itemView.findViewById(R.id.tv_home_item_epidemic_count);
        }
    }

}







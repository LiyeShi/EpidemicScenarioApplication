package com.example.epidemicscenarioapplication.domain.Api;

import com.example.epidemicscenarioapplication.domain.NcovVillageDataBean;
import com.example.epidemicscenarioapplication.domain.VerticalBannerDataBeans;
import com.example.epidemicscenarioapplication.utils.Constants;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * @author sly
 * @version 1.0
 * @date 2020/7/1
 * @description com.example.epidemicscenarioapplication.domain.Api
 */
public interface API {

//    {}中代表URL中的可变部分
    @GET("weather/current/{city}")

    @Headers({
            "app_id:"+ Constants.WEATHER_APP_ID,
            "app_secret:"+Constants.WEATHER_APP_SECRET

    })
    Call<VerticalBannerDataBeans.WeatherDataBean> getWeatherJson(@Path("city")String city);

    /**
     * @param cityName  获取所在城市小区及村镇确诊信息
     * @return
     */

@GET("/ncov/village/getVillage2")
    Call<NcovVillageDataBean> getVillageByCommunityName(@Query("cityName")String cityName);
}

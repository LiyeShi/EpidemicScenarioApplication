package com.example.epidemicscenarioapplication.domain;

import com.example.epidemicscenarioapplication.domain.DiagnoseDataBean;
import com.example.epidemicscenarioapplication.domain.GuideListDataBean;
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

    /**
     * @param city 获取当地天气信息
     * @return
     */
    //    {}中代表URL中的可变部分
    @GET("weather/current/{city}")

    @Headers({
            "app_id:" + Constants.WEATHER_APP_ID,
            "app_secret:" + Constants.WEATHER_APP_SECRET

    })
    Call<VerticalBannerDataBeans.WeatherDataBean> getWeatherJson(@Path("city") String city);

    /**
     * @param cityName 获取所在城市小区及村镇确诊信息
     * @return
     */

    @GET("/ncov/village/getVillage2")
    Call<NcovVillageDataBean> getVillageByCommunityName(@Query("cityName") String cityName);

    /**
     * @param count 疫情百科知识 （检查诊断）
     * @return
     */
    @GET("/ncov/news/getDiagnoseList")
    Call<DiagnoseDataBean> getDiagnoseList(@Query("count") Integer count);

    /**
     * @param count 疫情百科知识 （预防指南）
     * @return
     */
    @GET("/ncov/news/getGuideList")
    Call<GuideListDataBean> getGuideListList(@Query("count") Integer count);
}

package com.example.epidemicscenarioapplication.domain;

import com.example.epidemicscenarioapplication.utils.ConstantsUtils;

import okhttp3.ResponseBody;
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
            "app_id:" + ConstantsUtils.WEATHER_APP_ID,
            "app_secret:" + ConstantsUtils.WEATHER_APP_SECRET

    })
    Call<VerticalBannerDataBeans.WeatherDataBean> getWeatherJson(@Path("city") String city);

    /**
     * @param cityName 获取所在城市小区及村镇确诊信息
     * @return
     */
    @GET("/ncov/village/getVillage2")
    Call<NcovVillageDataBean> getVillage2(@Query("cityName") String cityName);

    /**
     * @param count 疫情百科知识 （检查诊断）
     * @return
     */
    @GET("/ncov/news/getDiagnoseList")
    Call<WikipediaDataBean> getDiagnoseList(@Query("count") Integer count);

    /**
     * @param count 疫情百科知识 （预防指南）
     * @return
     */
    @GET("/ncov/news/getGuideList")
    Call<WikipediaDataBean> getGuideListList(@Query("count") Integer count);

    /**
     * 获取疫情时间线信息
     *
     * @return
     */
    @GET("data/getTimelineService")
    Call<ResponseBody> getTimeLineService();


    /**
     * 获取当前城市的新闻
     *
     * @param cityName
     * @return
     */
    @GET("/ncov/news/getCityNewsList")
    Call<LocalNewsDataBean> getLocalNews(@Query("cityName") String cityName);

    /**
     * 获取当前省份的疫情历史数据
     *
     * @param provinceName
     * @return
     */
    @GET("/ncov/statistics/getProvinceHistoryList")
    Call<ProvinceHistoryListDataBean> getProvinceHistoryList(@Query("provinceName") String provinceName);

    /**
     * 获取当前市各个县区疫情信息
     * @param cityName
     * @return
     */
    @GET("/ncov/statistics/getCountyList/")
    Call<VerticalBannerDataBeans.CountyListDataBean> getCountyList(@Query("cityName") String cityName);

    @GET("/ncov/village/getVillageByCommunityName/")
    Call<EpidemicAreaDataBean> getVillageByCommunityName(@Query("communityName") String communityName);
}

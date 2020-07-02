package com.example.epidemicscenarioapplication.domain.Api;

import com.example.epidemicscenarioapplication.domain.WeatherDataBean;
import com.example.epidemicscenarioapplication.utils.Constants;

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

//    {}中代表URL中的可变部分
    @GET("weather/current/{city}")

    @Headers({
            "app_id:"+ Constants.WEATHER_APP_ID,
            "app_secret:"+Constants.WEATHER_APP_SECRET

    })
    Call<WeatherDataBean> getWeatherJson(@Path("city")String city);

}

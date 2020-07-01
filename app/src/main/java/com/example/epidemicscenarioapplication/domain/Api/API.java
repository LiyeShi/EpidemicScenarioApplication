package com.example.epidemicscenarioapplication.domain.Api;

import com.example.epidemicscenarioapplication.domain.WeatherDataBean;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

/**
 * @author sly
 * @version 1.0
 * @date 2020/7/1
 * @description com.example.epidemicscenarioapplication.domain.Api
 */
public interface API {
    @GET("weather/current/临沂市")
    @Headers({
            "app_id:srnrtlnlvxuyqskq ",
            "app_secret:cDdBWDd0bDdlRm1WWVZtMXE0anBVUT09"

    })
    Call<WeatherDataBean> getWeatherJson();

}

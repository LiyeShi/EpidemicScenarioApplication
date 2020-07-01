package com.example.epidemicscenarioapplication.domain;

/**
 * @author sly
 * @version 1.0
 * @date 2020/7/1
 * @description com.example.epidemicscenarioapplication.domain
 */
public class WeatherDataBean {

    @Override
    public String toString() {
        return "WeatherDataBean{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    /**
     * code : 1
     * msg : 数据返回成功
     * data : {"address":"广东省 深圳市","cityCode":"440300","temp":"18℃","weather":"小雨","windDirection":"东北","windPower":"≤3级","humidity":"92%","reportTime":"2018-11-27 22:40:53"}
     */

    private int code;
    private String msg;
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * address : 广东省 深圳市
         * cityCode : 440300
         * temp : 18℃
         * weather : 小雨
         * windDirection : 东北
         * windPower : ≤3级
         * humidity : 92%
         * reportTime : 2018-11-27 22:40:53
         */

        private String address;
        private String cityCode;
        private String temp;
        private String weather;
        private String windDirection;
        private String windPower;
        private String humidity;
        private String reportTime;

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getCityCode() {
            return cityCode;
        }

        public void setCityCode(String cityCode) {
            this.cityCode = cityCode;
        }

        public String getTemp() {
            return temp;
        }

        public void setTemp(String temp) {
            this.temp = temp;
        }

        public String getWeather() {
            return weather;
        }

        public void setWeather(String weather) {
            this.weather = weather;
        }

        public String getWindDirection() {
            return windDirection;
        }

        public void setWindDirection(String windDirection) {
            this.windDirection = windDirection;
        }

        public String getWindPower() {
            return windPower;
        }

        public void setWindPower(String windPower) {
            this.windPower = windPower;
        }

        public String getHumidity() {
            return humidity;
        }

        public void setHumidity(String humidity) {
            this.humidity = humidity;
        }

        public String getReportTime() {
            return reportTime;
        }

        public void setReportTime(String reportTime) {
            this.reportTime = reportTime;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "address='" + address + '\'' +
                    ", cityCode='" + cityCode + '\'' +
                    ", temp='" + temp + '\'' +
                    ", weather='" + weather + '\'' +
                    ", windDirection='" + windDirection + '\'' +
                    ", windPower='" + windPower + '\'' +
                    ", humidity='" + humidity + '\'' +
                    ", reportTime='" + reportTime + '\'' +
                    '}';
        }
    }
}

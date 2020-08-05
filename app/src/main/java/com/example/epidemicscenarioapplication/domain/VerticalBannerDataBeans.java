package com.example.epidemicscenarioapplication.domain;

import java.util.List;

/**
 * @author sly
 * @version 1.0
 * @date 2020/7/3
 * @description com.example.epidemicscenarioapplication.domain
 */
public class VerticalBannerDataBeans {
    private int viewType;
    WeatherDataBean mWeatherDataBean;
    CountyListDataBean.DataBean.ResultBean.DistrictBean.ListBean mCountyListDataBean;

    public  CountyListDataBean.DataBean.ResultBean.DistrictBean.ListBean getCountyListDataBean() {
        return mCountyListDataBean;
    }

    public WeatherDataBean getWeatherDataBean() {
        return mWeatherDataBean;
    }

    public VerticalBannerDataBeans(WeatherDataBean DataBean, int viewType) {
        this.viewType = viewType;
        mWeatherDataBean = DataBean;
    }

    public VerticalBannerDataBeans( CountyListDataBean.DataBean.ResultBean.DistrictBean.ListBean countyListDataBean,int viewType) {
        this.viewType = viewType;
        mCountyListDataBean = countyListDataBean;
    }

    public int getViewType() {
        return viewType;
    }

    public void setViewType(int viewType) {
        this.viewType = viewType;
    }


    public static class WeatherDataBean {
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
        }


    }

    public static class CountyListDataBean {

        /**
         * code : 200
         * message : SUCCESS
         * data : {"result":{"realtime":{"die":0,"sure_new":0,"sure":49,"incr_yst":1,"city":"临沂","sure_nzd":167,"cure":49,"time":"数据统计截止08-05 09:06","present":0},"district":{"time":"数据统计截止08-04 00:00","list":[{"sure":"18","name":"兰山区","source":"临沂卫健委","time":"1596470400","url":"http://wsjkw.shandong.gov.cn/ztzl/rdzt/qlzhfkgz/tzgg/202002/t20200224_2582815.html"},{"sure":"6","name":"莒南县","source":"临沂卫健委","time":"1596470400","url":"http://wsjkw.shandong.gov.cn/ztzl/rdzt/qlzhfkgz/tzgg/202002/t20200224_2582815.html"},{"sure":"5","name":"郯城县","source":"临沂卫健委","time":"1596470400","url":"http://wsjkw.shandong.gov.cn/ztzl/rdzt/qlzhfkgz/tzgg/202002/t20200224_2582815.html"},{"sure":"4","name":"平邑县","source":"临沂卫健委","time":"1596470400","url":"http://wsjkw.shandong.gov.cn/ztzl/rdzt/qlzhfkgz/tzgg/202002/t20200224_2582815.html"},{"sure":"4","name":"沂南县","source":"临沂卫健委","time":"1596470400","url":"http://wsjkw.shandong.gov.cn/ztzl/rdzt/qlzhfkgz/tzgg/202002/t20200224_2582815.html"},{"sure":"4","name":"沂水县","source":"临沂卫健委","time":"1596470400","url":"http://wsjkw.shandong.gov.cn/ztzl/rdzt/qlzhfkgz/tzgg/202002/t20200224_2582815.html"},{"sure":"3","name":"费县","source":"临沂卫健委","time":"1596470400","url":"http://wsjkw.shandong.gov.cn/ztzl/rdzt/qlzhfkgz/tzgg/202002/t20200224_2582815.html"},{"sure":"2","name":"临沭县","source":"临沂卫健委","time":"1596470400","url":"http://wsjkw.shandong.gov.cn/ztzl/rdzt/qlzhfkgz/tzgg/202002/t20200224_2582815.html"},{"sure":"2","name":"河东区","source":"临沂卫健委","time":"1596470400","url":"http://wsjkw.shandong.gov.cn/ztzl/rdzt/qlzhfkgz/tzgg/202002/t20200224_2582815.html"},{"sure":"1","name":"兰陵县","source":"临沂卫健委","time":"1596470400","url":"http://wsjkw.shandong.gov.cn/ztzl/rdzt/qlzhfkgz/tzgg/202002/t20200224_2582815.html"},{"sure":"0","name":"罗庄区","source":"临沂卫健委","time":"1596470400","url":"http://wsjkw.shandong.gov.cn/ztzl/rdzt/qlzhfkgz/tzgg/202002/t20200224_2582815.html"},{"sure":"0","name":"蒙阴县","source":"临沂卫健委","time":"1596470400","url":"http://wsjkw.shandong.gov.cn/ztzl/rdzt/qlzhfkgz/tzgg/202002/t20200224_2582815.html"}]},"map":{"url":""}}}
         */

        private int code;
        private String message;
        private DataBean data;

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public DataBean getData() {
            return data;
        }

        public void setData(DataBean data) {
            this.data = data;
        }

        public static class DataBean {


            @Override
            public String toString() {
                return "DataBean{" +
                        "result=" + result +
                        '}';
            }

            /**
             * result : {"realtime":{"die":0,"sure_new":0,"sure":49,"incr_yst":1,"city":"临沂","sure_nzd":167,"cure":49,"time":"数据统计截止08-05 09:06","present":0},"district":{"time":"数据统计截止08-04 00:00","list":[{"sure":"18","name":"兰山区","source":"临沂卫健委","time":"1596470400","url":"http://wsjkw.shandong.gov.cn/ztzl/rdzt/qlzhfkgz/tzgg/202002/t20200224_2582815.html"},{"sure":"6","name":"莒南县","source":"临沂卫健委","time":"1596470400","url":"http://wsjkw.shandong.gov.cn/ztzl/rdzt/qlzhfkgz/tzgg/202002/t20200224_2582815.html"},{"sure":"5","name":"郯城县","source":"临沂卫健委","time":"1596470400","url":"http://wsjkw.shandong.gov.cn/ztzl/rdzt/qlzhfkgz/tzgg/202002/t20200224_2582815.html"},{"sure":"4","name":"平邑县","source":"临沂卫健委","time":"1596470400","url":"http://wsjkw.shandong.gov.cn/ztzl/rdzt/qlzhfkgz/tzgg/202002/t20200224_2582815.html"},{"sure":"4","name":"沂南县","source":"临沂卫健委","time":"1596470400","url":"http://wsjkw.shandong.gov.cn/ztzl/rdzt/qlzhfkgz/tzgg/202002/t20200224_2582815.html"},{"sure":"4","name":"沂水县","source":"临沂卫健委","time":"1596470400","url":"http://wsjkw.shandong.gov.cn/ztzl/rdzt/qlzhfkgz/tzgg/202002/t20200224_2582815.html"},{"sure":"3","name":"费县","source":"临沂卫健委","time":"1596470400","url":"http://wsjkw.shandong.gov.cn/ztzl/rdzt/qlzhfkgz/tzgg/202002/t20200224_2582815.html"},{"sure":"2","name":"临沭县","source":"临沂卫健委","time":"1596470400","url":"http://wsjkw.shandong.gov.cn/ztzl/rdzt/qlzhfkgz/tzgg/202002/t20200224_2582815.html"},{"sure":"2","name":"河东区","source":"临沂卫健委","time":"1596470400","url":"http://wsjkw.shandong.gov.cn/ztzl/rdzt/qlzhfkgz/tzgg/202002/t20200224_2582815.html"},{"sure":"1","name":"兰陵县","source":"临沂卫健委","time":"1596470400","url":"http://wsjkw.shandong.gov.cn/ztzl/rdzt/qlzhfkgz/tzgg/202002/t20200224_2582815.html"},{"sure":"0","name":"罗庄区","source":"临沂卫健委","time":"1596470400","url":"http://wsjkw.shandong.gov.cn/ztzl/rdzt/qlzhfkgz/tzgg/202002/t20200224_2582815.html"},{"sure":"0","name":"蒙阴县","source":"临沂卫健委","time":"1596470400","url":"http://wsjkw.shandong.gov.cn/ztzl/rdzt/qlzhfkgz/tzgg/202002/t20200224_2582815.html"}]},"map":{"url":""}}
             */

            private ResultBean result;

            public ResultBean getResult() {
                return result;
            }

            public void setResult(ResultBean result) {
                this.result = result;
            }

            public static class ResultBean {
                @Override
                public String toString() {
                    return "ResultBean{" +
                            "realtime=" + realtime +
                            ", district=" + district +
                            ", map=" + map +
                            '}';
                }

                /**
                 * realtime : {"die":0,"sure_new":0,"sure":49,"incr_yst":1,"city":"临沂","sure_nzd":167,"cure":49,"time":"数据统计截止08-05 09:06","present":0}
                 * district : {"time":"数据统计截止08-04 00:00","list":[{"sure":"18","name":"兰山区","source":"临沂卫健委","time":"1596470400","url":"http://wsjkw.shandong.gov.cn/ztzl/rdzt/qlzhfkgz/tzgg/202002/t20200224_2582815.html"},{"sure":"6","name":"莒南县","source":"临沂卫健委","time":"1596470400","url":"http://wsjkw.shandong.gov.cn/ztzl/rdzt/qlzhfkgz/tzgg/202002/t20200224_2582815.html"},{"sure":"5","name":"郯城县","source":"临沂卫健委","time":"1596470400","url":"http://wsjkw.shandong.gov.cn/ztzl/rdzt/qlzhfkgz/tzgg/202002/t20200224_2582815.html"},{"sure":"4","name":"平邑县","source":"临沂卫健委","time":"1596470400","url":"http://wsjkw.shandong.gov.cn/ztzl/rdzt/qlzhfkgz/tzgg/202002/t20200224_2582815.html"},{"sure":"4","name":"沂南县","source":"临沂卫健委","time":"1596470400","url":"http://wsjkw.shandong.gov.cn/ztzl/rdzt/qlzhfkgz/tzgg/202002/t20200224_2582815.html"},{"sure":"4","name":"沂水县","source":"临沂卫健委","time":"1596470400","url":"http://wsjkw.shandong.gov.cn/ztzl/rdzt/qlzhfkgz/tzgg/202002/t20200224_2582815.html"},{"sure":"3","name":"费县","source":"临沂卫健委","time":"1596470400","url":"http://wsjkw.shandong.gov.cn/ztzl/rdzt/qlzhfkgz/tzgg/202002/t20200224_2582815.html"},{"sure":"2","name":"临沭县","source":"临沂卫健委","time":"1596470400","url":"http://wsjkw.shandong.gov.cn/ztzl/rdzt/qlzhfkgz/tzgg/202002/t20200224_2582815.html"},{"sure":"2","name":"河东区","source":"临沂卫健委","time":"1596470400","url":"http://wsjkw.shandong.gov.cn/ztzl/rdzt/qlzhfkgz/tzgg/202002/t20200224_2582815.html"},{"sure":"1","name":"兰陵县","source":"临沂卫健委","time":"1596470400","url":"http://wsjkw.shandong.gov.cn/ztzl/rdzt/qlzhfkgz/tzgg/202002/t20200224_2582815.html"},{"sure":"0","name":"罗庄区","source":"临沂卫健委","time":"1596470400","url":"http://wsjkw.shandong.gov.cn/ztzl/rdzt/qlzhfkgz/tzgg/202002/t20200224_2582815.html"},{"sure":"0","name":"蒙阴县","source":"临沂卫健委","time":"1596470400","url":"http://wsjkw.shandong.gov.cn/ztzl/rdzt/qlzhfkgz/tzgg/202002/t20200224_2582815.html"}]}
                 * map : {"url":""}
                 */

                private RealtimeBean realtime;
                private DistrictBean district;
                private MapBean map;

                public RealtimeBean getRealtime() {
                    return realtime;
                }

                public void setRealtime(RealtimeBean realtime) {
                    this.realtime = realtime;
                }

                public DistrictBean getDistrict() {
                    return district;
                }

                public void setDistrict(DistrictBean district) {
                    this.district = district;
                }

                public MapBean getMap() {
                    return map;
                }

                public void setMap(MapBean map) {
                    this.map = map;
                }

                public static class RealtimeBean {
                    /**
                     * die : 0
                     * sure_new : 0
                     * sure : 49
                     * incr_yst : 1
                     * city : 临沂
                     * sure_nzd : 167
                     * cure : 49
                     * time : 数据统计截止08-05 09:06
                     * present : 0
                     */

                    private int die;
                    private int sure_new;
                    private int sure;
                    private int incr_yst;
                    private String city;
                    private int sure_nzd;
                    private int cure;
                    private String time;
                    private int present;

                    public int getDie() {
                        return die;
                    }

                    public void setDie(int die) {
                        this.die = die;
                    }

                    public int getSure_new() {
                        return sure_new;
                    }

                    public void setSure_new(int sure_new) {
                        this.sure_new = sure_new;
                    }

                    public int getSure() {
                        return sure;
                    }

                    public void setSure(int sure) {
                        this.sure = sure;
                    }

                    public int getIncr_yst() {
                        return incr_yst;
                    }

                    public void setIncr_yst(int incr_yst) {
                        this.incr_yst = incr_yst;
                    }

                    public String getCity() {
                        return city;
                    }

                    public void setCity(String city) {
                        this.city = city;
                    }

                    public int getSure_nzd() {
                        return sure_nzd;
                    }

                    public void setSure_nzd(int sure_nzd) {
                        this.sure_nzd = sure_nzd;
                    }

                    public int getCure() {
                        return cure;
                    }

                    public void setCure(int cure) {
                        this.cure = cure;
                    }

                    public String getTime() {
                        return time;
                    }

                    public void setTime(String time) {
                        this.time = time;
                    }

                    public int getPresent() {
                        return present;
                    }

                    public void setPresent(int present) {
                        this.present = present;
                    }

                    @Override
                    public String toString() {
                        return "RealtimeBean{" +
                                "die=" + die +
                                ", sure_new=" + sure_new +
                                ", sure=" + sure +
                                ", incr_yst=" + incr_yst +
                                ", city='" + city + '\'' +
                                ", sure_nzd=" + sure_nzd +
                                ", cure=" + cure +
                                ", time='" + time + '\'' +
                                ", present=" + present +
                                '}';
                    }
                }

                public static class DistrictBean {
                    @Override
                    public String toString() {
                        return "DistrictBean{" +
                                "time='" + time + '\'' +
                                ", list=" + list +
                                '}';
                    }

                    /**
                     * time : 数据统计截止08-04 00:00
                     * list : [{"sure":"18","name":"兰山区","source":"临沂卫健委","time":"1596470400","url":"http://wsjkw.shandong.gov.cn/ztzl/rdzt/qlzhfkgz/tzgg/202002/t20200224_2582815.html"},{"sure":"6","name":"莒南县","source":"临沂卫健委","time":"1596470400","url":"http://wsjkw.shandong.gov.cn/ztzl/rdzt/qlzhfkgz/tzgg/202002/t20200224_2582815.html"},{"sure":"5","name":"郯城县","source":"临沂卫健委","time":"1596470400","url":"http://wsjkw.shandong.gov.cn/ztzl/rdzt/qlzhfkgz/tzgg/202002/t20200224_2582815.html"},{"sure":"4","name":"平邑县","source":"临沂卫健委","time":"1596470400","url":"http://wsjkw.shandong.gov.cn/ztzl/rdzt/qlzhfkgz/tzgg/202002/t20200224_2582815.html"},{"sure":"4","name":"沂南县","source":"临沂卫健委","time":"1596470400","url":"http://wsjkw.shandong.gov.cn/ztzl/rdzt/qlzhfkgz/tzgg/202002/t20200224_2582815.html"},{"sure":"4","name":"沂水县","source":"临沂卫健委","time":"1596470400","url":"http://wsjkw.shandong.gov.cn/ztzl/rdzt/qlzhfkgz/tzgg/202002/t20200224_2582815.html"},{"sure":"3","name":"费县","source":"临沂卫健委","time":"1596470400","url":"http://wsjkw.shandong.gov.cn/ztzl/rdzt/qlzhfkgz/tzgg/202002/t20200224_2582815.html"},{"sure":"2","name":"临沭县","source":"临沂卫健委","time":"1596470400","url":"http://wsjkw.shandong.gov.cn/ztzl/rdzt/qlzhfkgz/tzgg/202002/t20200224_2582815.html"},{"sure":"2","name":"河东区","source":"临沂卫健委","time":"1596470400","url":"http://wsjkw.shandong.gov.cn/ztzl/rdzt/qlzhfkgz/tzgg/202002/t20200224_2582815.html"},{"sure":"1","name":"兰陵县","source":"临沂卫健委","time":"1596470400","url":"http://wsjkw.shandong.gov.cn/ztzl/rdzt/qlzhfkgz/tzgg/202002/t20200224_2582815.html"},{"sure":"0","name":"罗庄区","source":"临沂卫健委","time":"1596470400","url":"http://wsjkw.shandong.gov.cn/ztzl/rdzt/qlzhfkgz/tzgg/202002/t20200224_2582815.html"},{"sure":"0","name":"蒙阴县","source":"临沂卫健委","time":"1596470400","url":"http://wsjkw.shandong.gov.cn/ztzl/rdzt/qlzhfkgz/tzgg/202002/t20200224_2582815.html"}]
                     */

                    private String time;
                    private List<ListBean> list;

                    public String getTime() {
                        return time;
                    }

                    public void setTime(String time) {
                        this.time = time;
                    }

                    public List<ListBean> getList() {
                        return list;
                    }

                    public void setList(List<ListBean> list) {
                        this.list = list;
                    }

                    public static class ListBean {
                        /**
                         * sure : 18
                         * name : 兰山区
                         * source : 临沂卫健委
                         * time : 1596470400
                         * url : http://wsjkw.shandong.gov.cn/ztzl/rdzt/qlzhfkgz/tzgg/202002/t20200224_2582815.html
                         */

                        private String sure;
                        private String name;
                        private String source;
                        private String time;
                        private String url;

                        public String getSure() {
                            return sure;
                        }

                        public void setSure(String sure) {
                            this.sure = sure;
                        }

                        public String getName() {
                            return name;
                        }

                        public void setName(String name) {
                            this.name = name;
                        }

                        public String getSource() {
                            return source;
                        }

                        public void setSource(String source) {
                            this.source = source;
                        }

                        public String getTime() {
                            return time;
                        }

                        public void setTime(String time) {
                            this.time = time;
                        }

                        public String getUrl() {
                            return url;
                        }

                        public void setUrl(String url) {
                            this.url = url;
                        }

                        @Override
                        public String toString() {
                            return "ListBean{" +
                                    "sure='" + sure + '\'' +
                                    ", name='" + name + '\'' +
                                    ", source='" + source + '\'' +
                                    ", time='" + time + '\'' +
                                    ", url='" + url + '\'' +
                                    '}';
                        }
                    }

                }

                public static class MapBean {
                    /**
                     * url :
                     */

                    private String url;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    @Override
                    public String toString() {
                        return "MapBean{" +
                                "url='" + url + '\'' +
                                '}';
                    }
                }
            }

        }

        @Override
        public String toString() {
            return "CountyListDataBean{" +
                    "code=" + code +
                    ", message='" + message + '\'' +
                    ", data=" + data +
                    '}';
        }

    }
}

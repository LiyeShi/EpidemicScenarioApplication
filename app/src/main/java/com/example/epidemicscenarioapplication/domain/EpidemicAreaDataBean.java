package com.example.epidemicscenarioapplication.domain;

import java.util.List;

/**
 * @author : 鑫宇
 * e-mail : 1769314609@qq.com
 * time   : 2020/09/11
 * desc   :
 * version: 1.0
 */
public class EpidemicAreaDataBean {

    /**
     * code : 200
     * message : SUCCESS
     * data : [{"community_name":"幸福家园小区","line":[],"cnt_sum_certain":1,"county_name":"","point":[33.905652,117.895573],"street_name":"","posi_name":"幸福家园小区","province_name":"江苏省","district_name":"睢宁县","update_time":"2020/02/13 13:25:53","posi_address":"江苏省徐州市睢宁县幸福家园小区","city_name":"徐州市","citycode":"320300","polygon":[],"posi_type":"point","_pos":1581601277628,"_id":"653_292564_5_DB5677417C69DB84E8DB6D56F3E9D124"},{"_sys_extra":{},"community_name":"幸福家园小区东区","line":[],"cnt_sum_certain":-1,"county_name":"","point":[39.818101,116.310473],"street_name":"花乡街道","posi_name":"幸福家园小区东区","province_name":"北京市","district_name":"丰台区","update_time":"2020/02/09 03:00:65","posi_address":"北京市丰台区花乡街道幸福家园小区东区","city_name":"北京市","citycode":110000,"polygon":[],"posi_type":"point","_id":"029cca4b5cdf4ae1b4587e16d1d6bf1e"}]
     */

    private int code;
    private String message;
    private List<DataBean> data;

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

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }



    public static class DataBean {
        /**
         * community_name : 幸福家园小区
         * line : []
         * cnt_sum_certain : 1
         * county_name :
         * point : [33.905652,117.895573]
         * street_name :
         * posi_name : 幸福家园小区
         * province_name : 江苏省
         * district_name : 睢宁县
         * update_time : 2020/02/13 13:25:53
         * posi_address : 江苏省徐州市睢宁县幸福家园小区
         * city_name : 徐州市
         * citycode : 320300
         * polygon : []
         * posi_type : point
         * _pos : 1581601277628
         * _id : 653_292564_5_DB5677417C69DB84E8DB6D56F3E9D124
         * _sys_extra : {}
         */

        private String community_name;
        private int cnt_sum_certain;
        private String county_name;
        private String street_name;
        private String posi_name;
        private String province_name;
        private String district_name;
        private String update_time;
        private String posi_address;
        private String city_name;
        private String citycode;
        private String posi_type;
        private long _pos;
        private String _id;
        private SysExtraBean _sys_extra;
        private List<?> line;
        private List<Double> point;
        private List<?> polygon;

        public String getCommunity_name() {
            return community_name;
        }

        public void setCommunity_name(String community_name) {
            this.community_name = community_name;
        }

        public int getCnt_sum_certain() {
            return cnt_sum_certain;
        }

        public void setCnt_sum_certain(int cnt_sum_certain) {
            this.cnt_sum_certain = cnt_sum_certain;
        }

        public String getCounty_name() {
            return county_name;
        }

        public void setCounty_name(String county_name) {
            this.county_name = county_name;
        }

        public String getStreet_name() {
            return street_name;
        }

        public void setStreet_name(String street_name) {
            this.street_name = street_name;
        }

        public String getPosi_name() {
            return posi_name;
        }

        public void setPosi_name(String posi_name) {
            this.posi_name = posi_name;
        }

        public String getProvince_name() {
            return province_name;
        }

        public void setProvince_name(String province_name) {
            this.province_name = province_name;
        }

        public String getDistrict_name() {
            return district_name;
        }

        public void setDistrict_name(String district_name) {
            this.district_name = district_name;
        }

        public String getUpdate_time() {
            return update_time;
        }

        public void setUpdate_time(String update_time) {
            this.update_time = update_time;
        }

        public String getPosi_address() {
            return posi_address;
        }

        public void setPosi_address(String posi_address) {
            this.posi_address = posi_address;
        }

        public String getCity_name() {
            return city_name;
        }

        public void setCity_name(String city_name) {
            this.city_name = city_name;
        }

        public String getCitycode() {
            return citycode;
        }

        public void setCitycode(String citycode) {
            this.citycode = citycode;
        }

        public String getPosi_type() {
            return posi_type;
        }

        public void setPosi_type(String posi_type) {
            this.posi_type = posi_type;
        }

        public long get_pos() {
            return _pos;
        }

        public void set_pos(long _pos) {
            this._pos = _pos;
        }

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public SysExtraBean get_sys_extra() {
            return _sys_extra;
        }

        public void set_sys_extra(SysExtraBean _sys_extra) {
            this._sys_extra = _sys_extra;
        }

        public List<?> getLine() {
            return line;
        }

        public void setLine(List<?> line) {
            this.line = line;
        }

        public List<Double> getPoint() {
            return point;
        }

        public void setPoint(List<Double> point) {
            this.point = point;
        }

        public List<?> getPolygon() {
            return polygon;
        }

        public void setPolygon(List<?> polygon) {
            this.polygon = polygon;
        }

        public static class SysExtraBean {
        }
    }

    @Override
    public String toString() {
        return "EpidemicAreaDataBean{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}

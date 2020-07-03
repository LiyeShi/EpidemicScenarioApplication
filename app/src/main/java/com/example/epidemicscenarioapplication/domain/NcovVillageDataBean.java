package com.example.epidemicscenarioapplication.domain;

import java.util.List;

/**
 * @author sly
 * @version 1.0
 * @date 2020/7/3
 * @description com.example.epidemicscenarioapplication.domain
 * 所在市小区 村 镇 确诊人员  根据城市的名称获取当前城市确诊小区的信息。例如：西安
 */
public class NcovVillageDataBean {


    @Override
    public String toString() {
        return "NcovVillageDataBean{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    /**
     * code : 200
     * message : SUCCESS
     * data : [{"community_name":"","line":[],"cnt_sum_certain":1,"county_name":"","point":[35.184878,118.866671],"street_name":"","posi_name":"东赤石沟村","province_name":"山东省","district_name":"莒南县","update_time":"2020/02/19 11:10:26","posi_address":"山东省临沂市莒南县十字路镇东赤石沟村","city_name":"临沂市","citycode":"371300","polygon":[],"posi_type":"point","_pos":1582193099858,"_id":"653_292564_5_CE0BFED75A847F47B3D8DAB36E812C2A"},{"_sys_extra":{},"line":[],"community_name":"","cnt_sum_certain":1,"county_name":"","point":[34.636194,118.347098],"street_name":"","posi_name":"郯城北华园小区","province_name":"山东省","district_name":"郯城县","posi_address":"山东省临沂市郯城县郯城北华园小区","update_time":"2020/02/07 15:48:25","city_name":"临沂市","polygon":[],"citycode":371300,"posi_type":"point","_id":"bdfc9a4a5b724ff79a5cf06e60551637"},{"_sys_extra":{},"line":[],"community_name":"","cnt_sum_certain":1,"county_name":"兰山区","point":[35.041284,118.362064],"street_name":"","posi_name":"五大道住宅区","province_name":"山东省","district_name":"兰山区","posi_address":"山东省临沂市兰山区五大道住宅区","update_time":"2020/02/07 15:48:25","city_name":"临沂市","polygon":[],"citycode":371300,"posi_type":"point","_id":"444f562869e042e6b8cf71a4fe80c7e6"},{"_sys_extra":{},"line":[],"community_name":"","cnt_sum_certain":1,"county_name":"兰山区","point":[35.0682,118.34512],"street_name":"","posi_name":"市水利局家属院","province_name":"山东省","district_name":"兰山区","posi_address":"山东省临沂市兰山区市水利局家属院","update_time":"2020/02/07 15:48:25","city_name":"临沂市","polygon":[],"citycode":371300,"posi_type":"point","_id":"e36868c3686b4df6a25c5901b4a0ae74"},{"_sys_extra":{},"line":[],"community_name":"","cnt_sum_certain":1,"county_name":"兰山区","point":[35.116303,118.364889],"street_name":"柳青街","posi_name":"道润园小区","province_name":"山东省","district_name":"兰山区","posi_address":"山东省临沂市兰山区柳青街道润园小区","update_time":"2020/02/07 15:48:25","city_name":"临沂市","polygon":[],"citycode":371300,"posi_type":"point","_id":"3cf5891826b74404b370f27f80c0ce24"},{"_sys_extra":{},"line":[],"community_name":"","cnt_sum_certain":1,"county_name":"兰山区","point":[35.068876,118.294152],"street_name":"","posi_name":"农药厂家属院","province_name":"山东省","district_name":"兰山区","posi_address":"山东省临沂市兰山区农药厂家属院","update_time":"2020/02/07 15:48:25","city_name":"临沂市","polygon":[],"citycode":371300,"posi_type":"point","_id":"8e1b1addda0445cfa17d08c2cd5ce094"},{"_sys_extra":{},"line":[],"community_name":"","cnt_sum_certain":1,"county_name":"莒南县","point":[35.182069,119.088382],"street_name":"","posi_name":"坪上一村","province_name":"山东省","district_name":"莒南县","posi_address":"山东省临沂市莒南县坪上一村","update_time":"2020/02/07 15:48:25","city_name":"临沂市","polygon":[],"citycode":371300,"posi_type":"point","_id":"b75e7e1aa5594975ba120716e774bf47"},{"_sys_extra":{},"line":[],"community_name":"","cnt_sum_certain":1,"county_name":"平邑县","point":[35.517512,117.815081],"street_name":"","posi_name":"柏林村","province_name":"山东省","district_name":"平邑县","posi_address":"山东省临沂市平邑县柏林村","update_time":"2020/02/07 15:48:25","city_name":"临沂市","polygon":[],"citycode":371300,"posi_type":"point","_id":"af0ed225566444ce9b284e4efaefab64"},{"_sys_extra":{},"line":[],"community_name":"","cnt_sum_certain":1,"county_name":"沂水县","point":[35.763601,118.636373],"street_name":"","posi_name":"信合家园","province_name":"山东省","district_name":"沂水县","posi_address":"山东省临沂市沂水县信合家园","update_time":"2020/02/07 15:48:25","city_name":"临沂市","polygon":[],"citycode":371300,"posi_type":"point","_id":"b78fe6e9881749108a40a0fbf717fa0d"},{"_sys_extra":{},"line":[],"community_name":"","cnt_sum_certain":1,"county_name":"郯城县","point":[34.623432,118.356859],"street_name":"","posi_name":"龙域中央小区","province_name":"山东省","district_name":"郯城县","posi_address":"山东省临沂市郯城县龙域中央小区","update_time":"2020/02/07 15:48:25","city_name":"临沂市","polygon":[],"citycode":371300,"posi_type":"point","_id":"93615821f57247a599c92f12cfc6fe05"},{"_sys_extra":{},"line":[],"community_name":"","cnt_sum_certain":1,"county_name":"兰山区","point":[35.122201,118.314995],"street_name":"","posi_name":"泉源乡","province_name":"山东省","district_name":"兰山区","posi_address":"山东省临沂市兰山区滨河新天地","update_time":"2020/02/07 15:48:25","city_name":"临沂市","polygon":[],"citycode":371300,"posi_type":"point","_id":"dd91ed66140a4b558f525e1a52926dfa"},{"line":[],"community_name":"","cnt_sum_certain":1,"county_name":"郯城县","point":[34.737201,118.439086],"street_name":"","posi_name":"泉源乡","province_name":"山东省","district_name":"郯城县","posi_address":"山东省临沂市郯城县泉源乡","update_time":"2020/02/07 15:48:25","city_name":"临沂市","polygon":[],"citycode":371300,"_pos":1581264704028,"posi_type":"point","_id":"653_292564_5_FF332B88782307A978AC04F5E06416B8"},{"line":[],"community_name":"","cnt_sum_certain":1,"county_name":"郯城县","point":[34.630414,118.367881],"street_name":"","posi_name":"郯城街道","province_name":"山东省","district_name":"郯城县","posi_address":"山东省临沂市郯城县郯城街道","update_time":"2020/02/06 18:13:81","city_name":"临沂市","polygon":[],"citycode":371300,"_pos":1581264702327,"posi_type":"point","_id":"653_292564_5_FD5A69D94F675E3036E50C886BDFCF9F"},{"community_name":"","line":[],"cnt_sum_certain":1,"county_name":"","point":[35.046367,118.351254],"street_name":"金雀山街道","posi_name":"金雀山街道","province_name":"山东省","district_name":"兰山区","update_time":"2020/02/09 02:53:47","posi_address":"山东省临沂市兰山区金雀山街道","city_name":"临沂市","citycode":371300,"polygon":[],"posi_type":"point","_pos":1581264654106,"_id":"653_292564_5_CC74529BA2D49AB58E4A45C0E6817C4C"},{"line":[],"community_name":"","cnt_sum_certain":1,"county_name":"莒南县","point":[35.12723,118.695698],"street_name":"","posi_name":"板泉镇","province_name":"山东省","district_name":"莒南县","posi_address":"山东省临沂市莒南县板泉镇","update_time":"2020/02/06 18:13:76","city_name":"临沂市","polygon":[],"citycode":371300,"_pos":1581264644074,"posi_type":"point","_id":"653_292564_5_C43C6419308479EFA1A19F38BA15D7F7"},{"line":[],"community_name":"","cnt_sum_certain":1,"county_name":"郯城县","point":[34.630844,118.308093],"street_name":"","posi_name":"马头镇","province_name":"山东省","district_name":"郯城县","posi_address":"山东省临沂市郯城县马头镇","update_time":"2020/02/06 18:13:76","city_name":"临沂市","polygon":[],"citycode":371300,"_pos":1581264643006,"posi_type":"point","_id":"653_292564_5_C2F9F834F61B4E15FEAB8F14C8286139"},{"line":[],"community_name":"","cnt_sum_certain":1,"county_name":"兰陵县","point":[34.861095,118.078903],"street_name":"卞庄街道","posi_name":"卞庄街道","province_name":"山东省","district_name":"兰陵县","posi_address":"山东省临沂市兰陵县卞庄街道","update_time":"2020/02/06 18:13:67","city_name":"临沂市","polygon":[],"citycode":371300,"_pos":1581264638545,"posi_type":"point","_id":"653_292564_5_C001C89BF2B2AFD66CEC5E9B108A1661"},{"line":[],"community_name":"","cnt_sum_certain":3,"county_name":"","point":[35.046367,118.351254],"street_name":"银雀山街道","posi_name":"银雀山街道","province_name":"山东省","district_name":"兰山区","posi_address":"山东省临沂市兰山区银雀山街道","update_time":"2020/02/09 02:53:89","city_name":"临沂市","polygon":[],"citycode":371300,"_pos":1581264621756,"posi_type":"point","_id":"653_292564_5_B02BDE56F321277861EFE1E876D686B2"},{"line":[],"community_name":"","cnt_sum_certain":2,"county_name":"","point":[35.089638,118.315522],"street_name":"兰山街道","posi_name":"兰山街道","province_name":"山东省","district_name":"兰山区","posi_address":"山东省临沂市兰山区兰山街道","update_time":"2020/02/06 18:13:82","city_name":"临沂市","polygon":[],"citycode":371300,"_pos":1581264614906,"posi_type":"point","_id":"653_292564_5_A9A99035446ACF33039A621046DC8E9F"},{"line":[],"community_name":"","cnt_sum_certain":2,"county_name":"","point":[35.068694,118.391753],"street_name":"九曲街道","posi_name":"九曲街道","province_name":"山东省","district_name":"河东区","posi_address":"山东省临沂市河东区九曲街道","update_time":"2020/02/06 18:13:66","city_name":"临沂市","polygon":[],"citycode":371300,"_pos":1581264593983,"posi_type":"point","_id":"653_292564_5_96C7DC7123927C8B71AE0D15BFE7689C"},{"line":[],"community_name":"","cnt_sum_certain":6,"county_name":"","point":[35.126848,118.338767],"street_name":"柳青街道","posi_name":"柳青街道","province_name":"山东省","district_name":"兰山区","posi_address":"山东省临沂市兰山区柳青街道","update_time":"2020/02/06 18:13:71","city_name":"临沂市","polygon":[],"citycode":371300,"_pos":1581264591601,"posi_type":"point","_id":"653_292564_5_943F6180D772AF0DC92FCFFD3A426B0E"},{"line":[],"community_name":"","cnt_sum_certain":1,"county_name":"沂水县","point":[35.724541,118.622638],"street_name":"","posi_name":"许家湖镇","province_name":"山东省","district_name":"沂水县","posi_address":"山东省临沂市沂水县许家湖镇","update_time":"2020/02/06 18:13:78","city_name":"临沂市","polygon":[],"citycode":371300,"_pos":1581264510093,"posi_type":"point","_id":"653_292564_5_49CBECBD03C52E64B2D0932B451BD4DA"},{"line":[],"community_name":"","cnt_sum_certain":1,"county_name":"沂水县","point":[35.89496,118.688231],"street_name":"","posi_name":"道托镇","province_name":"山东省","district_name":"沂水县","posi_address":"山东省临沂市沂水县道托镇","update_time":"2020/02/06 18:13:81","city_name":"临沂市","polygon":[],"citycode":371300,"_pos":1581264483554,"posi_type":"point","_id":"653_292564_5_30D9ECD73F75E37E4CC7C30C5B4F6CC4"},{"line":[],"community_name":"","cnt_sum_certain":1,"county_name":"临沭县","point":[34.91674,118.662712],"street_name":"临沭街道","posi_name":"临沭街道","province_name":"山东省","district_name":"临沭县","posi_address":"山东省临沂市临沭县临沭街道","update_time":"2020/02/06 18:13:73","city_name":"临沂市","polygon":[],"citycode":371300,"_pos":1581264475852,"posi_type":"point","_id":"653_292564_5_2909A5B42D2F131D269C83614B8BB4BA"},{"line":[],"community_name":"","cnt_sum_certain":2,"county_name":"沂南县","point":[35.606112,118.471684],"street_name":"","posi_name":"铜井镇","province_name":"山东省","district_name":"沂南县","posi_address":"山东省临沂市沂南县铜井镇","update_time":"2020/02/07 15:48:39","city_name":"临沂市","polygon":[],"citycode":371300,"_pos":1581264471001,"posi_type":"point","_id":"653_292564_5_23620542622DBF4A6508AB579D8486A2"},{"line":[],"community_name":"","cnt_sum_certain":2,"county_name":"平邑县","point":[35.517512,117.815081],"street_name":"","posi_name":"柏林镇","province_name":"山东省","district_name":"平邑县","posi_address":"山东省临沂市平邑县柏林镇","update_time":"2020/02/09 02:53:02","city_name":"临沂市","polygon":[],"citycode":371300,"_pos":1581264469555,"posi_type":"point","_id":"653_292564_5_22A5565BC0F3FB37D0E1C5861E278D9B"},{"line":[],"community_name":"","cnt_sum_certain":3,"county_name":"费县","point":[35.205447,118.141822],"street_name":"","posi_name":"探沂镇","province_name":"山东省","district_name":"费县","posi_address":"山东省临沂市费县探沂镇","update_time":"2020/02/06 18:13:78","city_name":"临沂市","polygon":[],"citycode":371300,"_pos":1581264439811,"posi_type":"point","_id":"653_292564_5_07E06F9346009C4DD329071C95CB6079"},{"_sys_extra":{},"line":[],"community_name":"","cnt_sum_certain":1,"county_name":"莒南县","point":[35.1783,119.077212],"street_name":"","posi_name":"坪上镇","province_name":"山东省","district_name":"莒南县","posi_address":"山东省临沂市莒南县坪上镇","update_time":"2020/02/06 18:13:76","city_name":"临沂市","polygon":[],"citycode":371300,"posi_type":"point","_id":"2f80fcffa09b4f46965129efdb20e59c"}]
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
        @Override
        public String toString() {
            return "DataBean{" +
                    "community_name='" + community_name + '\'' +
                    ", cnt_sum_certain=" + cnt_sum_certain +
                    ", county_name='" + county_name + '\'' +
                    ", street_name='" + street_name + '\'' +
                    ", posi_name='" + posi_name + '\'' +
                    ", province_name='" + province_name + '\'' +
                    ", district_name='" + district_name + '\'' +
                    ", update_time='" + update_time + '\'' +
                    ", posi_address='" + posi_address + '\'' +
                    ", city_name='" + city_name + '\'' +
                    ", citycode='" + citycode + '\'' +
                    ", posi_type='" + posi_type + '\'' +
                    ", _pos=" + _pos +
                    ", _id='" + _id + '\'' +
                    ", _sys_extra=" + _sys_extra +
                    ", line=" + line +
                    ", point=" + point +
                    ", polygon=" + polygon +
                    '}';
        }

        /**
         * community_name :
         * line : []
         * cnt_sum_certain : 1
         * county_name :
         * point : [35.184878,118.866671]
         * street_name :
         * posi_name : 东赤石沟村
         * province_name : 山东省
         * district_name : 莒南县
         * update_time : 2020/02/19 11:10:26
         * posi_address : 山东省临沂市莒南县十字路镇东赤石沟村
         * city_name : 临沂市
         * citycode : 371300
         * polygon : []
         * posi_type : point
         * _pos : 1582193099858
         * _id : 653_292564_5_CE0BFED75A847F47B3D8DAB36E812C2A
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
}

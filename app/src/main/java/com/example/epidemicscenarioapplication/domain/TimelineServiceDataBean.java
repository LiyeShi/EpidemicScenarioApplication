package com.example.epidemicscenarioapplication.domain;

/**
 * @author sly
 * @version 1.0
 * @date 2020/7/9
 * @description com.example.epidemicscenarioapplication.domain
 */
public class TimelineServiceDataBean {


    /**
     * adoptType : 1
     * createTime : 1580223016000
     * dataInfoOperator :
     * dataInfoState : 0
     * dataInfoTime : 1580223016000
     * entryWay : 1
     * id : 678
     * infoSource : 人民日报
     * infoType : 2
     * modifyTime : 1580223016000
     * provinceId : 100
     * provinceName : 全国
     * pubDate : 1580222395000
     * pubDateStr : 11分钟前
     * sourceUrl : http://m.weibo.cn/2803301701/4465838767229144
     * summary : 国家公务员局发布《关于推迟中央机关及其直属机构2020年度公务员考试录用、公开遴选和公开选调面试时间的公告》：为贯彻落实党中央、国务院关于新型冠状病毒感染的肺炎预防控制工作的有关要求，经研究，中央机关及其直属机构2020年度公务员考试录用、公开遴选和公开选调面试时间推迟，具体安排另行通知。
     * title : 国考面试推迟，具体时间安排另行通知
     */

    private int adoptType;
    private long createTime;
    private String dataInfoOperator;
    private int dataInfoState;
    private long dataInfoTime;
    private int entryWay;
    private int id;
    private String infoSource;
    private int infoType;
    private long modifyTime;
    private String provinceId;
    private String provinceName;
    private long pubDate;
    private String pubDateStr;
    private String sourceUrl;
    private String summary;
    private String title;

    @Override
    public String toString() {
        return "TimelineServiceDataBean{" +
                "adoptType=" + adoptType +
                ", createTime=" + createTime +
                ", dataInfoOperator='" + dataInfoOperator + '\'' +
                ", dataInfoState=" + dataInfoState +
                ", dataInfoTime=" + dataInfoTime +
                ", entryWay=" + entryWay +
                ", id=" + id +
                ", infoSource='" + infoSource + '\'' +
                ", infoType=" + infoType +
                ", modifyTime=" + modifyTime +
                ", provinceId='" + provinceId + '\'' +
                ", provinceName='" + provinceName + '\'' +
                ", pubDate=" + pubDate +
                ", pubDateStr='" + pubDateStr + '\'' +
                ", sourceUrl='" + sourceUrl + '\'' +
                ", summary='" + summary + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    public int getAdoptType() {
        return adoptType;
    }

    public void setAdoptType(int adoptType) {
        this.adoptType = adoptType;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public String getDataInfoOperator() {
        return dataInfoOperator;
    }

    public void setDataInfoOperator(String dataInfoOperator) {
        this.dataInfoOperator = dataInfoOperator;
    }

    public int getDataInfoState() {
        return dataInfoState;
    }

    public void setDataInfoState(int dataInfoState) {
        this.dataInfoState = dataInfoState;
    }

    public long getDataInfoTime() {
        return dataInfoTime;
    }

    public void setDataInfoTime(long dataInfoTime) {
        this.dataInfoTime = dataInfoTime;
    }

    public int getEntryWay() {
        return entryWay;
    }

    public void setEntryWay(int entryWay) {
        this.entryWay = entryWay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInfoSource() {
        return infoSource;
    }

    public void setInfoSource(String infoSource) {
        this.infoSource = infoSource;
    }

    public int getInfoType() {
        return infoType;
    }

    public void setInfoType(int infoType) {
        this.infoType = infoType;
    }

    public long getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(long modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public long getPubDate() {
        return pubDate;
    }

    public void setPubDate(long pubDate) {
        this.pubDate = pubDate;
    }

    public String getPubDateStr() {
        return pubDateStr;
    }

    public void setPubDateStr(String pubDateStr) {
        this.pubDateStr = pubDateStr;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

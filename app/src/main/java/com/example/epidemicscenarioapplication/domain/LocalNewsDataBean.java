package com.example.epidemicscenarioapplication.domain;

import java.util.List;

/**
 * author : 鑫宇
 * e-mail : 1769314609@qq.com
 * time   : 2020/07/24
 * desc   :
 * version: 1.0
 */
public class LocalNewsDataBean {

    @Override
    public String toString() {
        return "LocalNewsDataBean{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    /**
     * code : 200
     * message : SUCCESS
     * data : {"result":{"govern":[{"ftime":"07月24日 10:41","wx_name":"北京旅游网","rank_score":0.8290474644964,"img":"","second_cls":"公告","title":"北京通报确诊病例详情:有家教、保安、餐饮店经营人员\u2026\u2026","ptime":"1595558460000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=368085867106928640&from=kuake_xxx"},{"ftime":"07月24日 09:29","wx_name":"北京旅游网","rank_score":0.78759509127158,"img":"","second_cls":"公告","title":"北京市文化和旅游局关于演出场所、娱乐场所、互联网上网服务营业场所有序恢复经营活动的通知","ptime":"1595554140000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=368076814955844608&from=kuake_xxx"},{"ftime":"07月24日 00:45","wx_name":"新浪新闻","rank_score":0.32118792677265,"img":"","second_cls":"公告","title":"北京通报29病例详情，均与新发地市场有关联，多名厨师、配菜员、服务员确诊","ptime":"1595522700000","url":"https://news.sina.cn/2020-06-16/detail-iirczymk7376491.d.html"},{"ftime":"07月22日 19:10","wx_name":"新京报","rank_score":1.31542759375,"img":"","second_cls":"公告","title":"北京高院发布涉中国银行\u201c原油宝\u201d事件民事诉讼案件集中管辖公告","ptime":"1595416201000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367787702438855680&from=kuake_xxx"},{"ftime":"07月22日 19:30","wx_name":"时光小日记","rank_score":1.00591521875,"img":"","second_cls":"公告","title":"北京一小区保安检查出入证遭业主暴打昏迷不醒 警方通报:已刑拘","ptime":"1595417400000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367789983771137024&from=kuake_xxx"},{"ftime":"07月21日 19:03","wx_name":"每经网","rank_score":0.85115903125,"img":"","second_cls":"公告","title":"交通部最新通知!各地省际旅游客运可与跨省团队游业务同步恢复,北京新疆需按疫情防控有关部署执行","ptime":"1595329419000","url":"http://www.nbd.com.cn/articles/2020-07-21/1465159.html"},{"ftime":"07月21日 18:13","wx_name":"中国政府网","rank_score":0.8086010796875,"img":"","second_cls":"公告","title":"北京市电影局关于在疫情防控常态化条件下有序推进电影院恢复开放的通知","ptime":"1595326380000","url":"http://www.gov.cn/govweb/xinwen/2020-07/21/content_5528751.htm"},{"ftime":"07月21日 15:37","wx_name":"中公网","rank_score":0.69327435069707,"img":"","second_cls":"公告","title":"2020首都医科大学附属北京儿童医院招聘2人公告","ptime":"1595317079000","url":"http://www.offcn.com/ylws/2020/0721/193368.html"},{"ftime":"07月21日 07:34","wx_name":"新浪科技","rank_score":0.45993236874109,"img":"","second_cls":"公告","title":"海南航空发布疫情防控期间涉及北京进出港国内航班票务处理的通知","ptime":"1595288040000","url":"https://tech.sina.cn/2020-06-17/detail-iircuyvi8970049.d.html"},{"ftime":"07月21日 03:55","wx_name":"新浪科技","rank_score":0.37461778891693,"img":"","second_cls":"公告","title":"同一餐馆8人确诊！北京通报18日确诊病例详情→","ptime":"1595274900000","url":"https://tech.sina.cn/2020-06-19/detail-iircuyvi9410254.d.html"},{"ftime":"07月21日 00:00","wx_name":"北京市卫生健康委员会","rank_score":0.32118792677265,"img":"","second_cls":"公告","title":"关于首都医科大学附属北京佑安医院等3家医院血液透析室变更登记有关工作的通知","ptime":"1595260800000","url":"http://wjw.beijing.gov.cn/zwgk_20040/zxgk/202007/t20200721_1954253.html"},{"ftime":"07月20日 15:40","wx_name":"北京旅游网","rank_score":0.69327435069707,"img":"","second_cls":"公告","title":"速看!北京疫情最新通报!","ptime":"1595230800000","url":"http://3g.visitbeijing.com.cn/uczzd/a-XEP4E1C9CF78702B7F6CD7"},{"ftime":"07月20日 14:46","wx_name":"北京旅游网","rank_score":0.65861063316222,"img":"","second_cls":"公告","title":"北京通报两起聚集性疫情详情:存在宿舍、更衣室等区域不戴口罩情况","ptime":"1595227560000","url":"https://mparticle.uc.cn/article_org.html?uc_param_str=frdnsnpfvecpntnwprdssskt#!wm_cid=367392006495802368!!wm_id=68d00510526447f7ba1630b56bd53698"},{"ftime":"07月20日 14:43","wx_name":"北京旅游网","rank_score":0.65861063316222,"img":"","second_cls":"公告","title":"北京通报此前两起聚集性疫情详情!","ptime":"1595227380000","url":"http://3g.visitbeijing.com.cn/uczzd/a-XEP4P72143A694CA9D02B7"},{"ftime":"07月20日 14:03","wx_name":"北京旅游网","rank_score":0.65861063316222,"img":"","second_cls":"公告","title":"北京通报2例特殊病例!出现症状后自行服药","ptime":"1595224980000","url":"https://mparticle.uc.cn/article_org.html?uc_param_str=frdnsnpfvecpntnwprdssskt#!wm_cid=367390016843810816!!wm_id=68d00510526447f7ba1630b56bd53698"},{"ftime":"07月19日 15:51","wx_name":"北京发布","rank_score":1.1974738784768,"img":"","second_cls":"公告","title":"最新通知 | 北京教育系统不组织、不接待各类夏令营等聚集性活动","ptime":"1595145069000","url":"http://mp.weixin.qq.com/s?__biz=MzA4NTIyMjMyMw==&mid=2652866198&idx=1&sn=65835cb6acab6bd052af59d04d421ad6"}],"epidemic":[{"ftime":"07月24日 09:21","wx_name":"北京发布","rank_score":0.88025333730353,"img":"","second_cls":"官方","title":"北京昨日无新增报告新冠肺炎确诊病例，治愈出院14例","ptime":"1595553690000","content":"7月23日0时至24时，无新增报告本地确诊病例、疑似病例和无症状感染者，治愈出院病例14例；无新增报告境外输入确诊病例、疑似病例和无症状感染者。 6月11日0时至7月23日24时，累计报告本地确诊病例335例，在院65例，治愈出院270例。尚在观察的无症状感染者7例；无新增报告境外输入新冠肺炎确诊病","url":"http://mp.weixin.qq.com/s?__biz=MzA4NTIyMjMyMw==&mid=2652866620&idx=1&sn=6a079e159ce2a2af3fafa4a674781336"},{"ftime":"07月24日 11:19","wx_name":"北京旅游网","rank_score":0.87268154157516,"img":"","second_cls":"官方","title":"北京市6月30日新增确诊病例相关情况","ptime":"1595560740000","content":"6月30日0时至24时，北京市新增新冠肺炎确诊病例3例，其中男性2例，女性1例；年龄最小20岁，最大54岁；均居住于大兴区。现将确诊病例具体情况通报如下： 病例1，男，25岁，住址为大兴区西红门（地区）镇西红门路，其多名同事和家人有新发地接触史。6月21至25日多次到住地附近永安小卖店购物，曾与确诊","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=368091224504010752&from=kuake_xxx"},{"ftime":"07月24日 10:43","wx_name":"北京旅游网","rank_score":0.8290474644964,"img":"","second_cls":"官方","title":"北京今天又有一名确诊患者出院,已出院病例未出现人传人现象","ptime":"1595558580000","content":"6月30日下午，北京市新型冠状病毒肺炎疫情防控工作第137场新闻发布会上，北京地坛医院副院长吴国安又带来了好消息：今天又有一名确诊病例刘某某康复出院。 昨天，\u201c西城大爷\u201d老何康复出院，他也是北京市此轮疫情的首例出院患者。 北京地坛医院副院长吴国安介绍说，目前所有病例都集中收治在地坛医院，便于集中资源","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=368086916981070848&from=kuake_xxx"},{"ftime":"07月24日 10:13","wx_name":"北京旅游网","rank_score":0.8290474644964,"img":"","second_cls":"官方","title":"又有餐饮从业人员\u201c中招\u201d!北京再通报9例确诊病例详情","ptime":"1595556780000","content":"6月29日，北京市召开疫情防控新闻发布会。北京市疾控中心等部门通报疫情最新进展及防控措施等相关情况，并答记者问。 会上，北京市疾病预防控制中心副主任庞星火就北京市新增确诊病例的相关情况进行了通报。 庞星火介绍，6月28日0时至24时，北京市新增新冠肺炎确诊病例7例，其中男性3例，女性4例；平均年龄3","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=368083312293446656&from=kuake_xxx"},{"ftime":"07月24日 08:33","wx_name":"中新经纬","rank_score":0.5721646692473,"img":"","second_cls":"","title":"北京连续18天0新增!23日治愈出院14例","ptime":"1595550807000","content":"中新经纬客户端7月24日电 据北京市卫生健康委员会官方微博24日通报，7月23日0时至24时，无新增报告本地确诊病例、疑似病例和无症状感染者，治愈出院病例14例；无新增报告境外输入确诊病例、疑似病例和无症状感染者。 6月11日0时至7月23日24时，累计报告本地确诊病例335例，在院65例，治愈出院","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=368071987725076480&from=kuake_xxx"},{"ftime":"07月24日 08:37","wx_name":"新浪新闻","rank_score":0.48413933551694,"img":"","second_cls":"","title":"百事公司北京分厂聚集感染患者出院,首例确诊者披露感染原因","ptime":"1595551020000","content":"6月21日下午，在北京新型冠状病毒肺炎疫情防控工作第128场新闻发布会上，百事公司大中华区集团事务部企宣总监樊志敏通报了大兴区百事食品（中国）有限公司北京分厂新发地输入型病例情况。回顾相关信息可戳→百事公司分厂出现确诊病例，已停产停业，87名密切接触者全部集中隔离近日，这起聚集性案例的两名员工相继出","url":"https://partners.sina.cn/html/uc/toutiao/article?docUrl=http://k.sina.cn/article_1750344480_v6854232001900wnzz.html?cre=tianyi&loc=1&mod=uchealth&r=0&rfunc=93&tj=cxthirdparty_batch&tr=302&wm=6079"},{"ftime":"07月23日 19:15","wx_name":"封面新闻","rank_score":1.31542759375,"img":"","second_cls":"官方","title":"北京新发地疫情已治愈出院病例256例 17天无新增确诊病例","ptime":"1595502923000","content":"封面新闻记者 粟裕 7月23日，北京市新型冠状病毒肺炎疫情防控工作第160场新闻发布会，北京市委宣传部副部长、市政府新闻办主任、市政府新闻发言人徐和建介绍，7月22日，北京无新增报告本地确诊病例、疑似病例和无症状感染者，治愈出院病例8例。 /strip/quality/95/ignore-error","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367969318201203712&from=kuake_xxx"},{"ftime":"07月23日 18:00","wx_name":"北京日报客户端","rank_score":1.2496562140625,"img":"","second_cls":"官方","title":"北京今日发布会要点汇总：新发地疫情八成患者已出院","ptime":"1595498442000","content":" 北京疫情防控新闻发布会要点汇总 （7月23日·第160场） 市疾控中心： 1.7月23日0时至15时，北京市报告出院病例14例。 2.6月11日至7月23日15时，北京市累计报告确诊病例335例，已出院270例，达80.6%，现有在院65例，无危重病例、重症病例，无疑似病例，尚在观察的无症状感染者","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367959668909148160&from=kuake_xxx"},{"ftime":"07月23日 19:10","wx_name":"新浪财经","rank_score":0.85115903125,"img":"","second_cls":"","title":"北京九日新增205例确诊；中芯国际19天极速上会丨一周热点回顾","ptime":"1595502600000","content":"原标题：北京九日新增205例确诊； 中芯国际 19天极速上会丨一周热点回顾 来源：第一财经5 月主要经济指标持续改善国家统计局6月15日发布5月份宏观经济数据，工业、消费、投资等主要经济指标持续改善，经济继续呈现恢复态势。5月份，全国规模以上工业增加值同比增长4.4%，增速比4月份加快0.5个百分点","url":"https://finance.sina.cn/stock/relnews/hk/2020-06-20/detail-iircuyvi9490680.d.html"},{"ftime":"07月23日 08:42","wx_name":"北京发布","rank_score":0.83624067043835,"img":"","second_cls":"官方","title":"北京昨日无新增报告新冠肺炎确诊病例，治愈出院8例","ptime":"1595464948000","content":"7月22日0时至24时，无新增报告本地确诊病例、疑似病例和无症状感染者，治愈出院病例8例；无新增报告境外输入确诊病例、疑似病例和无症状感染者。 6月11日0时至7月22日24时，累计报告本地确诊病例335例，在院79例，治愈出院256例。尚在观察的无症状感染者8例；无新增报告境外输入新冠肺炎确诊病例","url":"http://mp.weixin.qq.com/s?__biz=MzA4NTIyMjMyMw==&mid=2652866552&idx=1&sn=f8bf5a716819d7383203cd7b524aa223"},{"ftime":"07月23日 13:36","wx_name":"新浪科技","rank_score":0.62568010150411,"img":"","second_cls":"","title":"北京新增51例，一架航班输入17例\u2026疫情会否反弹？","ptime":"1595482560000","content":"原标题：北京新增51例，一架航班输入17例\u2026疫情会否反弹？中新网客户端北京6月15日电(记者 张尼)近日，北京的新发地出现数十个新冠肺炎本土确诊病例，让人们原本放松的神经再度紧绷。疫情的变化给所有人敲响警钟：狡猾的病毒没有彻底离开，它甚至可能以一种更隐蔽的方式存在于我们身边。6月13日，北京新发地批","url":"https://tech.sina.cn/2020-06-15/detail-iirczymk7000503.d.html"},{"ftime":"07月23日 12:22","wx_name":"新浪新闻","rank_score":0.5943960964289,"img":"","second_cls":"","title":"北京市新型冠状病毒肺炎疫情防控工作新闻发布会(7月23日)","ptime":"1595478179000","content":"2020.07.23 12:22:59 北京市政府网站原标题：北京市新型冠状病毒肺炎疫情防控工作新闻发布会(7月23日)来源：视频北京北京市新型冠状病毒肺炎疫情防控工作新闻发布会(7月23日)发布时间：2020-07-23北京市人民政府新闻办公室于2020年7月23日下午4点，在北京市人民政府新闻办","url":"https://news.sina.cn/gn/2020-07-23/detail-iivhuipn4637353.d.html"},{"ftime":"07月23日 05:34","wx_name":"时光小日记","rank_score":0.4905596832959,"img":"","second_cls":"","title":"北京市7月21日无新增确诊病例 治愈出院患者17例","ptime":"1595453640000","content":"7月21日北京市无新增新冠肺炎确诊病例，治愈出院17例。截至7月21日24时，全市已连续16天无新增报告确诊病例。目前，全市所有街乡均为低风险地区。 7月21日0时至24时，本市无新增报告本地确诊病例、疑似病例和无症状感染者，治愈出院病例17例；无新增报告境外输入确诊病例、疑似病例和无症状感染者。 ","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367865978781965312&from=kuake_xxx"},{"ftime":"07月22日 17:32","wx_name":"新华社","rank_score":1.1871734033594,"img":"","second_cls":"官方","title":"北京连续16天无新增报告本地确诊病例,所有街乡均为低风险地区","ptime":"1595410373000","content":" [简介]7月22日下午，北京市新型冠状病毒肺炎疫情防控工作第159场新闻发布会上，北京市政府新闻发言人徐和建介绍，北京已连续16天无新增报告本地确诊病例，全市所有街乡均为低风险地区。 记者：王普","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367777587293848576&from=kuake_xxx"},{"ftime":"07月22日 14:07","wx_name":"北京商报","rank_score":1.0178527967052,"img":"","second_cls":"官方","title":"新疆昨新增9例本土病例，北京连续16个0","ptime":"1595398064000","content":"7月21日0-24时，31个省（自治区、直辖市）和新疆生产建设兵团报告新增确诊病例14例，其中境外输入病例5例（上海2例，广东2例，云南1例），本土病例9例（均在新疆）；无新增死亡病例；无新增疑似病例。 当日新增治愈出院病例23例，解除医学观察的密切接触者434人，重症病例较前一日减少1例。境外输入","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367749160077628416&from=kuake_xxx"},{"ftime":"07月22日 22:58","wx_name":"新浪新闻","rank_score":0.99275,"img":"","second_cls":"","title":"北京新增新冠肺炎确诊病例36例 社区防控进入战时状态","ptime":"1595429880000","content":"原标题：北京新增新冠肺炎确诊病例36例 社区防控进入战时状态据新华社电 15日下午，在北京市新型冠状病毒肺炎疫情防控工作新闻发布会上，北京市疾控中心副主任庞星火介绍，6月14日0时至24时，北京市新增新冠肺炎确诊病例36例，已完成流调34例，均与新发地市场有关，还有2例正在流调中。发布会上，北京市委","url":"https://news.sina.cn/2020-06-16/detail-iirczymk7219125.d.html"},{"ftime":"07月22日 13:20","wx_name":"北京旅游网","rank_score":0.96696015686998,"img":"","second_cls":"官方","title":"北京新增报告本地确诊病例1例!又一区中风险地区\u201c清零\u201d","ptime":"1595395200000","content":"据国家卫生健康委员会消息，7月1日0\u201424时，31个省（自治区、直辖市）和新疆生产建设兵团报告新增确诊病例3例，其中境外输入病例2例（上海1例，广东1例），本土病例1例（在北京）；无新增死亡病例；无新增疑似病例。 据北京市卫生健康委员会消息，7月1日0时至24时，新增报告本地确诊病例1例、无症状感染","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367747793074259968&from=kuake_xxx"},{"ftime":"07月22日 13:16","wx_name":"北京旅游网","rank_score":0.96696015686998,"img":"","second_cls":"官方","title":"北京市新冠肺炎疫情防控工作第138场新闻发布会","ptime":"1595394960000","content":"北京市政府新闻办组织召开北京市新冠肺炎疫情防控工作第138场新闻发布会，市委宣传部副部长、市政府新闻办主任、市政府新闻发言人徐和建主持。市交通委副主任、新闻发言人容军，大兴区副区长何景涛，市疾控中心副主任庞星火，中国疾病预防控制中心流行病学首席专家吴尊友出席发布会，通报北京最新疫情，发布防控有关信息","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367747793126688768&from=kuake_xxx"},{"ftime":"07月22日 21:44","wx_name":"新浪科技","rank_score":0.9431125,"img":"","second_cls":"","title":"31省区市昨日新增本土病例33例，均与北京有关联","ptime":"1595425440000","content":"原标题：31省区市昨日新增本土病例33例，均与北京有关联国家卫健委6月17日早间通报，6月16日0\u201424时，31个省（自治区、直辖市）和新疆生产建设兵团报告新增确诊病例44例，其中境外输入病例11例（甘肃10例，四川1例），本土病例33例（北京31例，河北1例，浙江1例）；无新增死亡病例；新增疑似病","url":"https://tech.sina.cn/2020-06-17/detail-iircuyvi8895030.d.html"},{"ftime":"07月22日 13:23","wx_name":"新浪网","rank_score":0.62568010150411,"img":"","second_cls":"","title":"17年后重启，北京小汤山医院出现首例确诊病例","ptime":"1595395380000","content":" 环球网03月17日 18:29 关注【来源：中国新闻网】为做好境外输入人员疫情防控工作，尽力保证市民正常工作生活秩序，时隔17年，北京小汤山医院于3月16日再次启用，主要用于境外来（返）京人员中需筛查人员、疑似病例及轻型、普通型确诊患者治疗。从3月16日17时到24时，小汤山医院共接收来自机场待筛","url":"https://k.sina.cn/article_1686546714_6486a91a020010cgg.html"}],"whole":[{"ftime":"07月24日 09:21","wx_name":"北京发布","rank_score":0.88025333730353,"img":"","second_cls":"官方","title":"北京昨日无新增报告新冠肺炎确诊病例，治愈出院14例","ptime":"1595553690000","content":"7月23日0时至24时，无新增报告本地确诊病例、疑似病例和无症状感染者，治愈出院病例14例；无新增报告境外输入确诊病例、疑似病例和无症状感染者。 6月11日0时至7月23日24时，累计报告本地确诊病例335例，在院65例，治愈出院270例。尚在观察的无症状感染者7例；无新增报告境外输入新冠肺炎确诊病","url":"http://mp.weixin.qq.com/s?__biz=MzA4NTIyMjMyMw==&mid=2652866620&idx=1&sn=6a079e159ce2a2af3fafa4a674781336"},{"ftime":"07月24日 11:19","wx_name":"北京旅游网","rank_score":0.87268154157516,"img":"","second_cls":"官方","title":"北京市6月30日新增确诊病例相关情况","ptime":"1595560740000","content":"6月30日0时至24时，北京市新增新冠肺炎确诊病例3例，其中男性2例，女性1例；年龄最小20岁，最大54岁；均居住于大兴区。现将确诊病例具体情况通报如下： 病例1，男，25岁，住址为大兴区西红门（地区）镇西红门路，其多名同事和家人有新发地接触史。6月21至25日多次到住地附近永安小卖店购物，曾与确诊","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=368091224504010752&from=kuake_xxx"},{"ftime":"07月24日 08:30","wx_name":"北京发布","rank_score":0.83624067043835,"img":"","second_cls":"","title":"蔡奇来到北京最东端，调研生态涵养区，要求密云建设践行\u201c两山\u201d理论的典范之区","ptime":"1595550613000","url":"http://mp.weixin.qq.com/s?__biz=MzA4NTIyMjMyMw==&mid=2652866616&idx=1&sn=a58ca5db908a174b01b4ba274f0e3766"},{"ftime":"07月24日 10:56","wx_name":"北京旅游网","rank_score":0.8290474644964,"img":"","second_cls":"地铁","title":"今年明年北京有哪些地铁会开通？快看看有你家附近吗？","ptime":"1595559374000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=368087451740145664&from=kuake_xxx"},{"ftime":"07月24日 10:44","wx_name":"北京旅游网","rank_score":0.8290474644964,"img":"","second_cls":"医院","title":"北京一诊所擅自接诊发热患者,停业整顿、行拘","ptime":"1595558640000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=368087007823398912&from=kuake_xxx"},{"ftime":"07月24日 10:43","wx_name":"北京旅游网","rank_score":0.8290474644964,"img":"","second_cls":"官方","title":"北京今天又有一名确诊患者出院,已出院病例未出现人传人现象","ptime":"1595558580000","content":"6月30日下午，北京市新型冠状病毒肺炎疫情防控工作第137场新闻发布会上，北京地坛医院副院长吴国安又带来了好消息：今天又有一名确诊病例刘某某康复出院。 昨天，\u201c西城大爷\u201d老何康复出院，他也是北京市此轮疫情的首例出院患者。 北京地坛医院副院长吴国安介绍说，目前所有病例都集中收治在地坛医院，便于集中资源","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=368086916981070848&from=kuake_xxx"},{"ftime":"07月24日 10:42","wx_name":"北京旅游网","rank_score":0.8290474644964,"img":"","second_cls":"","title":"北京本轮疫情早期入院患者进入恢复期","ptime":"1595558520000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=368085867929012224&from=kuake_xxx"},{"ftime":"07月24日 10:41","wx_name":"北京旅游网","rank_score":0.8290474644964,"img":"","second_cls":"公告","title":"北京通报确诊病例详情:有家教、保安、餐饮店经营人员\u2026\u2026","ptime":"1595558460000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=368085867106928640&from=kuake_xxx"},{"ftime":"07月24日 10:41","wx_name":"北京旅游网","rank_score":0.8290474644964,"img":"","second_cls":"地铁","title":"北京又一公园走红,有湖有桥还有沙滩,没有门票,地铁4号线直达","ptime":"1595558460000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=368085867943695360&from=kuake_xxx"},{"ftime":"07月24日 10:17","wx_name":"环球网","rank_score":0.8290474644964,"img":"","second_cls":"复工","title":"影业复工!北京电影院7月24日恢复营业","ptime":"1595557030000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=368083082990846976&from=kuake_xxx"},{"ftime":"07月24日 10:13","wx_name":"北京旅游网","rank_score":0.8290474644964,"img":"","second_cls":"官方","title":"又有餐饮从业人员\u201c中招\u201d!北京再通报9例确诊病例详情","ptime":"1595556780000","content":"6月29日，北京市召开疫情防控新闻发布会。北京市疾控中心等部门通报疫情最新进展及防控措施等相关情况，并答记者问。 会上，北京市疾病预防控制中心副主任庞星火就北京市新增确诊病例的相关情况进行了通报。 庞星火介绍，6月28日0时至24时，北京市新增新冠肺炎确诊病例7例，其中男性3例，女性4例；平均年龄3","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=368083312293446656&from=kuake_xxx"},{"ftime":"07月24日 09:52","wx_name":"光明网","rank_score":0.78759509127158,"img":"","second_cls":"科普","title":"北京知识产权巡回审判庭揭牌","ptime":"1595555520000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=368080692271125504&from=kuake_xxx"},{"ftime":"07月24日 09:29","wx_name":"北京旅游网","rank_score":0.78759509127158,"img":"","second_cls":"公告","title":"北京市文化和旅游局关于演出场所、娱乐场所、互联网上网服务营业场所有序恢复经营活动的通知","ptime":"1595554140000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=368076814955844608&from=kuake_xxx"},{"ftime":"07月24日 08:00","wx_name":"凤凰网房产","rank_score":0.5721646692473,"img":"","second_cls":"科普","title":"看了不吃亏!北京舒适改善房选择指南!","ptime":"1595548825000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=368073156321088512&from=kuake_xxx"},{"ftime":"07月24日 08:00","wx_name":"凤凰网房产","rank_score":0.5721646692473,"img":"","second_cls":"辟谣","title":"是套路还是真优惠?北京这些优惠楼盘真相了","ptime":"1595548802000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=368073130740030464&from=kuake_xxx"},{"ftime":"07月24日 09:17","wx_name":"找法网","rank_score":0.50962035317573,"img":"","second_cls":"社保","title":"在北京办的社保想增加一家医院","ptime":"1595553479000","url":"http://china.findlaw.cn/ask/wenda_10618613.html"},{"ftime":"07月24日 10:52","wx_name":"中国西藏网","rank_score":0.73151246867329,"img":"","second_cls":"","title":"北京市第五批\u201c组团式\u201d援藏医疗队,用心打造西藏大病兜底医院","ptime":"1595559120000","url":"http://www.tibet.cn/cn/medicine/lht/202007/t20200724_6824778.html"},{"ftime":"07月24日 10:30","wx_name":"中国长安网","rank_score":0.73151246867329,"img":"","second_cls":"","title":"北京:安检进医院 全方位保障医患更安全","ptime":"1595557813000","url":"https://mparticle.uc.cn/article.html?uc_param_str=frdnsnpfvecpntnwprdssskt#!wm_aid=50bfbf87e534c80e63151e01b1463a5c!!wm_id=0e247b1ff5c34db58e9ca3e0e4b64d72"},{"ftime":"07月24日 09:23","wx_name":"中国网","rank_score":0.69493684523963,"img":"","second_cls":"","title":"北京:57家因疫情关停生产经营单位29家恢复经营","ptime":"1595553783000","url":"http://www.china.com.cn/news/2020-07/24/content_76307370.htm"},{"ftime":"07月24日 12:05","wx_name":"手机新浪网","rank_score":0.5943960964289,"img":"","second_cls":"","title":"拒戴口罩打死老人的郭某思曾连续减刑，北京政法委核查","ptime":"1595563500000","url":"https://mil.sina.cn/2020-03-31/detail-iimxyqwa4324076.d.html"},{"ftime":"07月24日 08:33","wx_name":"中新经纬","rank_score":0.5721646692473,"img":"","second_cls":"","title":"北京连续18天0新增!23日治愈出院14例","ptime":"1595550807000","content":"中新经纬客户端7月24日电 据北京市卫生健康委员会官方微博24日通报，7月23日0时至24时，无新增报告本地确诊病例、疑似病例和无症状感染者，治愈出院病例14例；无新增报告境外输入确诊病例、疑似病例和无症状感染者。 6月11日0时至7月23日24时，累计报告本地确诊病例335例，在院65例，治愈出院","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=368071987725076480&from=kuake_xxx"},{"ftime":"07月24日 11:26","wx_name":"新浪新闻","rank_score":0.56467629160746,"img":"","second_cls":"","title":"全院封闭管理！北京大学国际医院一名急诊科护士确诊","ptime":"1595561160000","url":"https://news.sina.cn/gn/2020-06-19/detail-iircuyvi9398672.d.html"},{"ftime":"07月24日 11:19","wx_name":"北京旅游网","rank_score":0.56467629160746,"img":"","second_cls":"","title":"北京昨日确诊病例情况来了:一女子自我隔离14天后与多人聚餐","ptime":"1595560740000","url":"https://mparticle.uc.cn/article_org.html?uc_param_str=frdnsnpfvecpntnwprdssskt#!wm_cid=368091159662167040!!wm_id=68d00510526447f7ba1630b56bd53698"},{"ftime":"07月24日 11:19","wx_name":"北京旅游网","rank_score":0.56467629160746,"img":"","second_cls":"","title":"北京:对短期来京运送物资等人员不采取隔离措施","ptime":"1595560740000","url":"https://mparticle.uc.cn/article_org.html?uc_param_str=frdnsnpfvecpntnwprdssskt#!wm_cid=368091175258687488!!wm_id=68d00510526447f7ba1630b56bd53698"},{"ftime":"07月24日 11:10","wx_name":"新浪科技","rank_score":0.56467629160746,"img":"","second_cls":"","title":"北京疫情上升期 非常之时非常之举","ptime":"1595560200000","url":"https://tech.sina.cn/2020-06-18/detail-iircuyvi9062544.d.html"},{"ftime":"07月24日 11:04","wx_name":"新浪新闻","rank_score":0.56467629160746,"img":"","second_cls":"","title":"速看!大连、新疆和北京,疫情有了这些重大变化","ptime":"1595559840000","url":"https://partners.sina.cn/html/uc/toutiao/article?docUrl=http://zx.sina.cn/2020-07-24/zx-iivhvpwx7196756.d.html?cre=tianyi&loc=7&mod=ucsociety&r=0&rfunc=93&tj=cxthirdparty_batch&tr=302&wm=6079"},{"ftime":"07月24日 10:57","wx_name":"北京旅游网","rank_score":0.53644247702708,"img":"","second_cls":"","title":"北京一患者4次核酸阴性后确诊","ptime":"1595559420000","url":"https://mparticle.uc.cn/article_org.html?uc_param_str=frdnsnpfvecpntnwprdssskt#!wm_cid=368087828352995328!!wm_id=68d00510526447f7ba1630b56bd53698"},{"ftime":"07月24日 10:56","wx_name":"北京旅游网","rank_score":0.53644247702708,"img":"","second_cls":"","title":"北京疫情形势如何?是否有第二波疫情?专家给出最新判断","ptime":"1595559360000","url":"https://mparticle.uc.cn/article_org.html?uc_param_str=frdnsnpfvecpntnwprdssskt#!wm_cid=368087827583337472!!wm_id=68d00510526447f7ba1630b56bd53698"},{"ftime":"07月24日 10:42","wx_name":"北京旅游网","rank_score":0.53644247702708,"img":"","second_cls":"","title":"多地调整风险等级!北京发布最新隔离政策","ptime":"1595558520000","url":"http://3g.visitbeijing.com.cn/uczzd/a-XEOYLQEF5EF18A6E5268BE"},{"ftime":"07月24日 10:39","wx_name":"北京旅游网","rank_score":0.53644247702708,"img":"","second_cls":"","title":"北京新冠肺炎疫情防控工作领导小组第七十二次会议暨首都严格进京管理联防联控协调机制第三十三次会议召开","ptime":"1595558340000","url":"https://mparticle.uc.cn/article_org.html?uc_param_str=frdnsnpfvecpntnwprdssskt#!wm_cid=368086247865844736!!wm_id=68d00510526447f7ba1630b56bd53698"},{"ftime":"07月24日 10:03","wx_name":"珍惜眼前人的","rank_score":0.53644247702708,"img":"","second_cls":"","title":"截止到7月24日,国内疫情迎来一个新转折,北京老百姓喜迎好消息!","ptime":"1595556232000","url":"https://mparticle.uc.cn/article.html?uc_param_str=frdnsnpfvecpntnwprdssskt#!wm_aid=b44b8414124a4d3fbe5205006f5feece!!wm_id=235d070c0ff548efbd63f120b1262008"},{"ftime":"07月24日 09:42","wx_name":"脉宝宝","rank_score":0.50962035317573,"img":"","second_cls":"","title":"北京建档攻略:2020北大国际医院怀孕建档条件及建档流程","ptime":"1595554967000","url":"https://mparticle.uc.cn/article.html?uc_param_str=frdnsnpfvecpntnwprdssskt#!wm_aid=4e4acc0b25de4e4cb8fecbd693a6aa55!!wm_id=0fa23753e9a5417ea9fff865b92044b2"},{"ftime":"07月24日 09:40","wx_name":"新浪财经","rank_score":0.50962035317573,"img":"","second_cls":"","title":"北京万达影城零点场:影迷准守防疫规则 IMax票价降至40元","ptime":"1595554800000","url":"https://finance.sina.cn/china/gncj/2020-07-24/detail-iivhvpwx7196866.d.html"},{"ftime":"07月24日 09:28","wx_name":"和讯网","rank_score":0.50962035317573,"img":"","second_cls":"","title":"冰封下的家装市场：有人转行卖口罩，有人离开北京","ptime":"1595554080000","url":"http://m.hexun.com/news/2020-07-24/201756506.html"},{"ftime":"07月24日 08:37","wx_name":"新浪新闻","rank_score":0.48413933551694,"img":"","second_cls":"","title":"百事公司北京分厂聚集感染患者出院,首例确诊者披露感染原因","ptime":"1595551020000","content":"6月21日下午，在北京新型冠状病毒肺炎疫情防控工作第128场新闻发布会上，百事公司大中华区集团事务部企宣总监樊志敏通报了大兴区百事食品（中国）有限公司北京分厂新发地输入型病例情况。回顾相关信息可戳→百事公司分厂出现确诊病例，已停产停业，87名密切接触者全部集中隔离近日，这起聚集性案例的两名员工相继出","url":"https://partners.sina.cn/html/uc/toutiao/article?docUrl=http://k.sina.cn/article_1750344480_v6854232001900wnzz.html?cre=tianyi&loc=1&mod=uchealth&r=0&rfunc=93&tj=cxthirdparty_batch&tr=302&wm=6079"},{"ftime":"07月24日 08:36","wx_name":"新浪新闻","rank_score":0.48413933551694,"img":"","second_cls":"","title":"今天的北京疫情防控新闻发布会","ptime":"1595550960000","url":"https://news.sina.cn/gn/2020-07-19/detail-iivhvpwx6283027.d.html"},{"ftime":"07月24日 00:45","wx_name":"新浪新闻","rank_score":0.32118792677265,"img":"","second_cls":"公告","title":"北京通报29病例详情，均与新发地市场有关联，多名厨师、配菜员、服务员确诊","ptime":"1595522700000","url":"https://news.sina.cn/2020-06-16/detail-iirczymk7376491.d.html"},{"ftime":"07月23日 19:55","wx_name":"中国新闻网","rank_score":1.31542759375,"img":"","second_cls":"科普","title":"北京将推动知识产权保护立法 落实惩罚性赔偿制度","ptime":"1595505344000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367975183335560192&from=kuake_xxx"},{"ftime":"07月23日 19:15","wx_name":"新京报","rank_score":1.31542759375,"img":"","second_cls":"科普","title":"北京知识产权巡回审判庭揭牌,知识产权案件可\u201c云开庭\u201d","ptime":"1595502934000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367969402856935424&from=kuake_xxx"},{"ftime":"07月23日 19:15","wx_name":"封面新闻","rank_score":1.31542759375,"img":"","second_cls":"官方","title":"北京新发地疫情已治愈出院病例256例 17天无新增确诊病例","ptime":"1595502923000","content":"封面新闻记者 粟裕 7月23日，北京市新型冠状病毒肺炎疫情防控工作第160场新闻发布会，北京市委宣传部副部长、市政府新闻办主任、市政府新闻发言人徐和建介绍，7月22日，北京无新增报告本地确诊病例、疑似病例和无症状感染者，治愈出院病例8例。 /strip/quality/95/ignore-error","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367969318201203712&from=kuake_xxx"},{"ftime":"07月23日 18:00","wx_name":"北京日报客户端","rank_score":1.2496562140625,"img":"","second_cls":"官方","title":"北京今日发布会要点汇总：新发地疫情八成患者已出院","ptime":"1595498442000","content":" 北京疫情防控新闻发布会要点汇总 （7月23日·第160场） 市疾控中心： 1.7月23日0时至15时，北京市报告出院病例14例。 2.6月11日至7月23日15时，北京市累计报告确诊病例335例，已出院270例，达80.6%，现有在院65例，无危重病例、重症病例，无疑似病例，尚在观察的无症状感染者","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367959668909148160&from=kuake_xxx"},{"ftime":"07月23日 16:59","wx_name":"扬眼","rank_score":1.1278147331914,"img":"","second_cls":"复工","title":"广东、北京、江苏最关注影院复工《唐人街探案3》最受期待","ptime":"1595494796000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367953075775735808&from=kuake_xxx"},{"ftime":"07月23日 16:36","wx_name":"环球网","rank_score":1.1278147331914,"img":"","second_cls":"医院","title":"北京:全市发热门诊24小时开诊 发热患者全进行\u201c1+3\u201d检查","ptime":"1595493406000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367949990949028864&from=kuake_xxx"},{"ftime":"07月23日 13:27","wx_name":"封面新闻","rank_score":0.96696015686998,"img":"","second_cls":"高速","title":"除了京雄高速北京段 下半年还将推进哪些项目建设?交通运输部回应","ptime":"1595482071000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367925709336740864&from=kuake_xxx"},{"ftime":"07月23日 11:07","wx_name":"新京报","rank_score":0.87268154157516,"img":"","second_cls":"科普","title":"北京开放54家博物馆全面实行实名制预约 这里有一份参观指南","ptime":"1595473627000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367908306873750528&from=kuake_xxx"},{"ftime":"07月23日 19:10","wx_name":"新浪财经","rank_score":0.85115903125,"img":"","second_cls":"","title":"北京九日新增205例确诊；中芯国际19天极速上会丨一周热点回顾","ptime":"1595502600000","content":"原标题：北京九日新增205例确诊； 中芯国际 19天极速上会丨一周热点回顾 来源：第一财经5 月主要经济指标持续改善国家统计局6月15日发布5月份宏观经济数据，工业、消费、投资等主要经济指标持续改善，经济继续呈现恢复态势。5月份，全国规模以上工业增加值同比增长4.4%，增速比4月份加快0.5个百分点","url":"https://finance.sina.cn/stock/relnews/hk/2020-06-20/detail-iircuyvi9490680.d.html"},{"ftime":"07月23日 08:42","wx_name":"北京发布","rank_score":0.83624067043835,"img":"","second_cls":"官方","title":"北京昨日无新增报告新冠肺炎确诊病例，治愈出院8例","ptime":"1595464948000","content":"7月22日0时至24时，无新增报告本地确诊病例、疑似病例和无症状感染者，治愈出院病例8例；无新增报告境外输入确诊病例、疑似病例和无症状感染者。 6月11日0时至7月22日24时，累计报告本地确诊病例335例，在院79例，治愈出院256例。尚在观察的无症状感染者8例；无新增报告境外输入新冠肺炎确诊病例","url":"http://mp.weixin.qq.com/s?__biz=MzA4NTIyMjMyMw==&mid=2652866552&idx=1&sn=f8bf5a716819d7383203cd7b524aa223"},{"ftime":"07月23日 10:38","wx_name":"环球网","rank_score":0.8290474644964,"img":"","second_cls":"医保","title":"互联网诊疗落地北京大学肿瘤医院并实现医保对接","ptime":"1595471929000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367905589914765312&from=kuake_xxx"},{"ftime":"07月23日 07:50","wx_name":"北京日报客户端","rank_score":0.7108045698726,"img":"","second_cls":"社保","title":"北京系列政策为企业\u201c输血\u201d，企业社保费减免全年将超千亿元","ptime":"1595461852000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367882933064696832&from=kuake_xxx"},{"ftime":"07月23日 07:34","wx_name":"中国经济网","rank_score":0.7108045698726,"img":"","second_cls":"科普","title":"一文读懂!北京市场租房补贴政策相关问题解答","ptime":"1595460840000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367883616723672064&from=kuake_xxx"},{"ftime":"07月23日 13:36","wx_name":"新浪科技","rank_score":0.62568010150411,"img":"","second_cls":"","title":"北京新增51例，一架航班输入17例\u2026疫情会否反弹？","ptime":"1595482560000","content":"原标题：北京新增51例，一架航班输入17例\u2026疫情会否反弹？中新网客户端北京6月15日电(记者 张尼)近日，北京的新发地出现数十个新冠肺炎本土确诊病例，让人们原本放松的神经再度紧绷。疫情的变化给所有人敲响警钟：狡猾的病毒没有彻底离开，它甚至可能以一种更隐蔽的方式存在于我们身边。6月13日，北京新发地批","url":"https://tech.sina.cn/2020-06-15/detail-iirczymk7000503.d.html"},{"ftime":"07月23日 12:22","wx_name":"新浪新闻","rank_score":0.5943960964289,"img":"","second_cls":"","title":"北京市新型冠状病毒肺炎疫情防控工作新闻发布会(7月23日)","ptime":"1595478179000","content":"2020.07.23 12:22:59 北京市政府网站原标题：北京市新型冠状病毒肺炎疫情防控工作新闻发布会(7月23日)来源：视频北京北京市新型冠状病毒肺炎疫情防控工作新闻发布会(7月23日)发布时间：2020-07-23北京市人民政府新闻办公室于2020年7月23日下午4点，在北京市人民政府新闻办","url":"https://news.sina.cn/gn/2020-07-23/detail-iivhuipn4637353.d.html"},{"ftime":"07月23日 11:17","wx_name":"北方网","rank_score":0.56467629160746,"img":"","second_cls":"辟谣","title":"辟谣!\u201c网传北京某小区出现确诊病例\u201d不实","ptime":"1595474272000","url":"http://economy.enorth.com.cn/system/2020/07/23/050301941.shtml"},{"ftime":"07月23日 06:07","wx_name":"时光小日记","rank_score":0.51637861399568,"img":"","second_cls":"公交","title":"北京公交车身创意设计获奖作品公示","ptime":"1595455620000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367870425172021248&from=kuake_xxx"},{"ftime":"07月23日 05:34","wx_name":"时光小日记","rank_score":0.4905596832959,"img":"","second_cls":"","title":"北京市7月21日无新增确诊病例 治愈出院患者17例","ptime":"1595453640000","content":"7月21日北京市无新增新冠肺炎确诊病例，治愈出院17例。截至7月21日24时，全市已连续16天无新增报告确诊病例。目前，全市所有街乡均为低风险地区。 7月21日0时至24时，本市无新增报告本地确诊病例、疑似病例和无症状感染者，治愈出院病例17例；无新增报告境外输入确诊病例、疑似病例和无症状感染者。 ","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367865978781965312&from=kuake_xxx"},{"ftime":"07月22日 22:48","wx_name":"央广网","rank_score":1.53425,"img":"","second_cls":"公交","title":"\u201c糊涂\u201d母女两度走散 北京公交民警地铁1号线首尾联动助其团聚","ptime":"1595429280000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367815876220558336&from=kuake_xxx"},{"ftime":"07月22日 22:00","wx_name":"北京日报客户端","rank_score":1.53425,"img":"","second_cls":"复工","title":"复工进入倒计时！北京影院准备就绪，请观众入场","ptime":"1595426454000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367808697797188608&from=kuake_xxx"},{"ftime":"07月22日 18:36","wx_name":"北京税务","rank_score":1.3966745921875,"img":"","second_cls":"社保","title":"针对中小微企业的社保费优惠政策是如何规定的?","ptime":"1595414186000","url":"http://mp.weixin.qq.com/s?__biz=MzAxNTA1Njc4Mw==&mid=2650848191&idx=2&sn=153113144487749b535ef6a2f7d09ad9"},{"ftime":"07月22日 18:17","wx_name":"北京发布","rank_score":1.3966745921875,"img":"","second_cls":"复工","title":"朝阳区综合施策，助力文化企业复工达产","ptime":"1595413056000","url":"http://mp.weixin.qq.com/s?__biz=MzA4NTIyMjMyMw==&mid=2652866539&idx=2&sn=b3348da54e16518b3304950e470d1900"},{"ftime":"07月22日 20:59","wx_name":"海峡军情","rank_score":1.384660625,"img":"","second_cls":"辟谣","title":"谣言不攻自破，那些想看北京笑话的人失望了！","ptime":"1595422758000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367800947490954240&from=kuake_xxx"},{"ftime":"07月22日 19:10","wx_name":"新京报","rank_score":1.31542759375,"img":"","second_cls":"公告","title":"北京高院发布涉中国银行\u201c原油宝\u201d事件民事诉讼案件集中管辖公告","ptime":"1595416201000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367787702438855680&from=kuake_xxx"},{"ftime":"07月22日 17:36","wx_name":"北京日报客户端","rank_score":1.1871734033594,"img":"","second_cls":"公交","title":"北京公交车身图案设计征集结束，获奖作品来了","ptime":"1595410603000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367775456484656128&from=kuake_xxx"},{"ftime":"07月22日 17:32","wx_name":"新华社","rank_score":1.1871734033594,"img":"","second_cls":"官方","title":"北京连续16天无新增报告本地确诊病例,所有街乡均为低风险地区","ptime":"1595410373000","content":" [简介]7月22日下午，北京市新型冠状病毒肺炎疫情防控工作第159场新闻发布会上，北京市政府新闻发言人徐和建介绍，北京已连续16天无新增报告本地确诊病例，全市所有街乡均为低风险地区。 记者：王普","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367777587293848576&from=kuake_xxx"},{"ftime":"07月22日 16:40","wx_name":"中国商报","rank_score":1.1278147331914,"img":"","second_cls":"学校","title":"北京幼儿园体罚孩子的，警告、罚款","ptime":"1595407223000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367768368599535616&from=kuake_xxx"},{"ftime":"07月22日 14:07","wx_name":"北京商报","rank_score":1.0178527967052,"img":"","second_cls":"官方","title":"新疆昨新增9例本土病例，北京连续16个0","ptime":"1595398064000","content":"7月21日0-24时，31个省（自治区、直辖市）和新疆生产建设兵团报告新增确诊病例14例，其中境外输入病例5例（上海2例，广东2例，云南1例），本土病例9例（均在新疆）；无新增死亡病例；无新增疑似病例。 当日新增治愈出院病例23例，解除医学观察的密切接触者434人，重症病例较前一日减少1例。境外输入","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367749160077628416&from=kuake_xxx"},{"ftime":"07月22日 19:30","wx_name":"时光小日记","rank_score":1.00591521875,"img":"","second_cls":"公告","title":"北京一小区保安检查出入证遭业主暴打昏迷不醒 警方通报:已刑拘","ptime":"1595417400000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367789983771137024&from=kuake_xxx"},{"ftime":"07月22日 22:58","wx_name":"新浪新闻","rank_score":0.99275,"img":"","second_cls":"","title":"北京新增新冠肺炎确诊病例36例 社区防控进入战时状态","ptime":"1595429880000","content":"原标题：北京新增新冠肺炎确诊病例36例 社区防控进入战时状态据新华社电 15日下午，在北京市新型冠状病毒肺炎疫情防控工作新闻发布会上，北京市疾控中心副主任庞星火介绍，6月14日0时至24时，北京市新增新冠肺炎确诊病例36例，已完成流调34例，均与新发地市场有关，还有2例正在流调中。发布会上，北京市委","url":"https://news.sina.cn/2020-06-16/detail-iirczymk7219125.d.html"},{"ftime":"07月22日 13:20","wx_name":"北京旅游网","rank_score":0.96696015686998,"img":"","second_cls":"官方","title":"北京新增报告本地确诊病例1例!又一区中风险地区\u201c清零\u201d","ptime":"1595395200000","content":"据国家卫生健康委员会消息，7月1日0\u201424时，31个省（自治区、直辖市）和新疆生产建设兵团报告新增确诊病例3例，其中境外输入病例2例（上海1例，广东1例），本土病例1例（在北京）；无新增死亡病例；无新增疑似病例。 据北京市卫生健康委员会消息，7月1日0时至24时，新增报告本地确诊病例1例、无症状感染","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367747793074259968&from=kuake_xxx"},{"ftime":"07月22日 13:16","wx_name":"北京旅游网","rank_score":0.96696015686998,"img":"","second_cls":"官方","title":"北京市新冠肺炎疫情防控工作第138场新闻发布会","ptime":"1595394960000","content":"北京市政府新闻办组织召开北京市新冠肺炎疫情防控工作第138场新闻发布会，市委宣传部副部长、市政府新闻办主任、市政府新闻发言人徐和建主持。市交通委副主任、新闻发言人容军，大兴区副区长何景涛，市疾控中心副主任庞星火，中国疾病预防控制中心流行病学首席专家吴尊友出席发布会，通报北京最新疫情，发布防控有关信息","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367747793126688768&from=kuake_xxx"},{"ftime":"07月22日 21:44","wx_name":"新浪科技","rank_score":0.9431125,"img":"","second_cls":"","title":"31省区市昨日新增本土病例33例，均与北京有关联","ptime":"1595425440000","content":"原标题：31省区市昨日新增本土病例33例，均与北京有关联国家卫健委6月17日早间通报，6月16日0\u201424时，31个省（自治区、直辖市）和新疆生产建设兵团报告新增确诊病例44例，其中境外输入病例11例（甘肃10例，四川1例），本土病例33例（北京31例，河北1例，浙江1例）；无新增死亡病例；新增疑似病","url":"https://tech.sina.cn/2020-06-17/detail-iircuyvi8895030.d.html"},{"ftime":"07月22日 17:45","wx_name":"中教云","rank_score":0.90783848492187,"img":"","second_cls":"学校","title":"乘风破浪的：北京中小学教师数字教育培训计划全面启动","ptime":"1595411143000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367776589793991680&from=kuake_xxx"},{"ftime":"07月22日 17:00","wx_name":"凤凰网房产","rank_score":0.90783848492187,"img":"","second_cls":"科普","title":"想在北京购房置业,一份廊坊购房指南请查收!","ptime":"1595408422000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367778889665092608&from=kuake_xxx"},{"ftime":"07月22日 13:23","wx_name":"新浪网","rank_score":0.62568010150411,"img":"","second_cls":"","title":"17年后重启，北京小汤山医院出现首例确诊病例","ptime":"1595395380000","content":" 环球网03月17日 18:29 关注【来源：中国新闻网】为做好境外输入人员疫情防控工作，尽力保证市民正常工作生活秩序，时隔17年，北京小汤山医院于3月16日再次启用，主要用于境外来（返）京人员中需筛查人员、疑似病例及轻型、普通型确诊患者治疗。从3月16日17时到24时，小汤山医院共接收来自机场待筛","url":"https://k.sina.cn/article_1686546714_6486a91a020010cgg.html"},{"ftime":"07月22日 10:03","wx_name":"央广网","rank_score":0.53644247702708,"img":"","second_cls":"科普","title":"北京市卫健委:要坚持适时、科学佩戴口罩","ptime":"1595383380000","url":"https://mparticle.uc.cn/article_org.html?uc_param_str=frdnsnpfvecpntnwprdssskt#!wm_cid=367727412900795392!!wm_id=e05eb8d04c624373ab89a82af80b727e"},{"ftime":"07月22日 00:00","wx_name":"知乎专栏","rank_score":0.32118792677265,"img":"","second_cls":"科普","title":"会被隔离吗？北京区块链人未来一月跑会指南","ptime":"1595347200000","url":"https://zhuanlan.zhihu.com/p/148959006"},{"ftime":"07月21日 21:35","wx_name":"北京税务","rank_score":1.6290125,"img":"","second_cls":"税务","title":"《网络办税联盟》告诉你网上便捷办税！","ptime":"1595338500000","url":"http://mp.weixin.qq.com/s?__biz=MzAxNTA1Njc4Mw==&mid=2650848138&idx=3&sn=08388a3d37650abc3c0f1bcae05b83e1"},{"ftime":"07月21日 15:19","wx_name":"北京发布","rank_score":1.1974738784768,"img":"","second_cls":"公交","title":"7月26日起25条公交线路优化调整","ptime":"1595315992000","url":"http://mp.weixin.qq.com/s?__biz=MzA4NTIyMjMyMw==&mid=2652866369&idx=2&sn=7bb0482e8e9c4a90a76636a38963ba22"},{"ftime":"07月21日 17:26","wx_name":"中国新闻网","rank_score":1.0475059441406,"img":"","second_cls":"科普","title":"北京官方:\u201c大考未到交卷时\u201d 适时科学戴口罩","ptime":"1595323570000","url":"https://mparticle.uc.cn/article_org.html?uc_param_str=frdnsnpfvecpntnwprdssskt#!wm_cid=367596671718134784!!wm_id=857dfb71acf84cf1b6119ca350c99661"},{"ftime":"07月21日 16:36","wx_name":"经济日报","rank_score":0.99513064693359,"img":"","second_cls":"科普","title":"北京卫健委提醒市民科学佩戴口罩丨权威发布","ptime":"1595320580000","url":"https://mparticle.uc.cn/article_org.html?uc_param_str=frdnsnpfvecpntnwprdssskt#!wm_cid=367593608194297856!!wm_id=e190e792fb3a40318bbb9f46bcf1a77d"},{"ftime":"07月21日 16:30","wx_name":"环球网","rank_score":0.99513064693359,"img":"","second_cls":"公交","title":"北京:在人员密集场所或乘坐公共交通等情况下必须戴口罩","ptime":"1595320246000","url":"https://3w.huanqiu.com/a/67c0c8/3z911Vdkc9C?agt=21"},{"ftime":"07月21日 19:03","wx_name":"每经网","rank_score":0.85115903125,"img":"","second_cls":"公告","title":"交通部最新通知!各地省际旅游客运可与跨省团队游业务同步恢复,北京新疆需按疫情防控有关部署执行","ptime":"1595329419000","url":"http://www.nbd.com.cn/articles/2020-07-21/1465159.html"},{"ftime":"07月21日 18:13","wx_name":"中国政府网","rank_score":0.8086010796875,"img":"","second_cls":"公告","title":"北京市电影局关于在疫情防控常态化条件下有序推进电影院恢复开放的通知","ptime":"1595326380000","url":"http://www.gov.cn/govweb/xinwen/2020-07/21/content_5528751.htm"},{"ftime":"07月21日 17:35","wx_name":"封面新闻","rank_score":0.76817102570312,"img":"","second_cls":"公交","title":"北京卫健委:乘坐公共交通工具仍须佩戴口罩","ptime":"1595324100000","url":"http://www.thecover.cn/news/4816487"},{"ftime":"07月21日 17:10","wx_name":"本地宝","rank_score":0.76817102570312,"img":"","second_cls":"复工","title":"2020北京电影院复工时间及疫情防控要求措施","ptime":"1595322600000","url":"http://bj.bendibao.com/news/2020721/277780.shtm"},{"ftime":"07月21日 15:37","wx_name":"中公网","rank_score":0.69327435069707,"img":"","second_cls":"公告","title":"2020首都医科大学附属北京儿童医院招聘2人公告","ptime":"1595317079000","url":"http://www.offcn.com/ylws/2020/0721/193368.html"},{"ftime":"07月21日 08:04","wx_name":"新浪网","rank_score":0.48413933551694,"img":"","second_cls":"地铁","title":"北京：患流感戴口罩、公共场所禁赤膊、地铁禁食等正式入法！","ptime":"1595289840000","url":"https://k.sina.cn/article_1686546714_6486a91a020011xq7.html"},{"ftime":"07月21日 07:34","wx_name":"新浪科技","rank_score":0.45993236874109,"img":"","second_cls":"公告","title":"海南航空发布疫情防控期间涉及北京进出港国内航班票务处理的通知","ptime":"1595288040000","url":"https://tech.sina.cn/2020-06-17/detail-iircuyvi8970049.d.html"},{"ftime":"07月21日 03:55","wx_name":"新浪科技","rank_score":0.37461778891693,"img":"","second_cls":"公告","title":"同一餐馆8人确诊！北京通报18日确诊病例详情→","ptime":"1595274900000","url":"https://tech.sina.cn/2020-06-19/detail-iircuyvi9410254.d.html"},{"ftime":"07月21日 00:00","wx_name":"北京市卫生健康委员会","rank_score":0.32118792677265,"img":"","second_cls":"公告","title":"关于首都医科大学附属北京佑安医院等3家医院血液透析室变更登记有关工作的通知","ptime":"1595260800000","url":"http://wjw.beijing.gov.cn/zwgk_20040/zxgk/202007/t20200721_1954253.html"},{"ftime":"07月20日 17:56","wx_name":"北京税务","rank_score":1.3268408625781,"img":"","second_cls":"复工","title":"听说电影院要复工啦？！好政策顶起来~","ptime":"1595238990000","url":"http://mp.weixin.qq.com/s?__biz=MzAxNTA1Njc4Mw==&mid=2650848048&idx=3&sn=66dbe3fed6575be0655edfda574c7886"},{"ftime":"07月20日 17:56","wx_name":"北京税务","rank_score":1.3268408625781,"img":"","second_cls":"社保","title":"阶段性减免企业社保费政策延长后，很多企业都在问\u2026\u2026","ptime":"1595238990000","url":"http://mp.weixin.qq.com/s?__biz=MzAxNTA1Njc4Mw==&mid=2650848048&idx=1&sn=5114f3b7649e2a68ac27cfb0c24287f1"},{"ftime":"07月20日 22:22","wx_name":"启瑞谈之论之","rank_score":0.99275,"img":"","second_cls":"学校","title":"继北京之后,又有一地出现疫情反弹,学生:9月还能正常开学吗?","ptime":"1595254965000","url":"https://mparticle.uc.cn/article.html?uc_param_str=frdnsnpfvecpntnwprdssskt#!wm_aid=16b5f8083ba94a78ba6f45324bb83f20!!wm_id=2f35198b5f1948069977cadb2c7eafdc"},{"ftime":"07月20日 09:42","wx_name":"中国经济网","rank_score":0.69493684523963,"img":"","second_cls":"医院","title":"北京新冠肺炎高风险人员收治定点医院高风险患者清零","ptime":"1595209320000","url":"http://district.ce.cn/newarea/roll/202007/20/t20200720_35358933.shtml"},{"ftime":"07月20日 15:40","wx_name":"北京旅游网","rank_score":0.69327435069707,"img":"","second_cls":"公告","title":"速看!北京疫情最新通报!","ptime":"1595230800000","url":"http://3g.visitbeijing.com.cn/uczzd/a-XEP4E1C9CF78702B7F6CD7"},{"ftime":"07月20日 14:46","wx_name":"北京旅游网","rank_score":0.65861063316222,"img":"","second_cls":"公告","title":"北京通报两起聚集性疫情详情:存在宿舍、更衣室等区域不戴口罩情况","ptime":"1595227560000","url":"https://mparticle.uc.cn/article_org.html?uc_param_str=frdnsnpfvecpntnwprdssskt#!wm_cid=367392006495802368!!wm_id=68d00510526447f7ba1630b56bd53698"},{"ftime":"07月20日 14:43","wx_name":"北京旅游网","rank_score":0.65861063316222,"img":"","second_cls":"公告","title":"北京通报此前两起聚集性疫情详情!","ptime":"1595227380000","url":"http://3g.visitbeijing.com.cn/uczzd/a-XEP4P72143A694CA9D02B7"},{"ftime":"07月20日 14:03","wx_name":"北京旅游网","rank_score":0.65861063316222,"img":"","second_cls":"公告","title":"北京通报2例特殊病例!出现症状后自行服药","ptime":"1595224980000","url":"https://mparticle.uc.cn/article_org.html?uc_param_str=frdnsnpfvecpntnwprdssskt#!wm_cid=367390016843810816!!wm_id=68d00510526447f7ba1630b56bd53698"},{"ftime":"07月20日 00:00","wx_name":"千龙新闻网","rank_score":0.32118792677265,"img":"","second_cls":"科普","title":"北京疫情防控级别调至三级后日常生活如何常态化?一文读懂","ptime":"1595174400000","url":"http://beijing.qianlong.com/2020/0720/4451316.shtml"},{"ftime":"07月19日 15:51","wx_name":"北京发布","rank_score":1.1974738784768,"img":"","second_cls":"公告","title":"最新通知 | 北京教育系统不组织、不接待各类夏令营等聚集性活动","ptime":"1595145069000","url":"http://mp.weixin.qq.com/s?__biz=MzA4NTIyMjMyMw==&mid=2652866198&idx=1&sn=65835cb6acab6bd052af59d04d421ad6"},{"ftime":"07月18日 23:44","wx_name":"北京税务","rank_score":1.805,"img":"","second_cls":"社保","title":"延长阶段性减免企业社保费实施期限，具体政策如何规定？","ptime":"1595087081000","url":"http://mp.weixin.qq.com/s?__biz=MzAxNTA1Njc4Mw==&mid=2650847981&idx=1&sn=07d1da44f9caf7f391ee4bfd9a995c24"},{"ftime":"07月18日 20:50","wx_name":"北京发布","rank_score":1.547561875,"img":"","second_cls":"科普","title":"中国医学科学院肿瘤医院：努力做好疫情防控期间肿瘤患者诊疗工作","ptime":"1595076630000","url":"http://mp.weixin.qq.com/s?__biz=MzA4NTIyMjMyMw==&mid=2652866176&idx=3&sn=288e63bd730ecd26a2e2f60b4baca34b"},{"ftime":"07月17日 21:09","wx_name":"北京税务","rank_score":1.6290125,"img":"","second_cls":"税务","title":"北京税务邀您参与~","ptime":"1594991398000","url":"http://mp.weixin.qq.com/s?__biz=MzAxNTA1Njc4Mw==&mid=2650847980&idx=1&sn=2495bf01a9e8782b7dea904bda51d2cd"}],"life":[{"ftime":"07月24日 10:44","wx_name":"北京旅游网","rank_score":0.8290474644964,"img":"","second_cls":"医院","title":"北京一诊所擅自接诊发热患者,停业整顿、行拘","ptime":"1595558640000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=368087007823398912&from=kuake_xxx"},{"ftime":"07月24日 10:17","wx_name":"环球网","rank_score":0.8290474644964,"img":"","second_cls":"复工","title":"影业复工!北京电影院7月24日恢复营业","ptime":"1595557030000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=368083082990846976&from=kuake_xxx"},{"ftime":"07月24日 09:17","wx_name":"找法网","rank_score":0.50962035317573,"img":"","second_cls":"社保","title":"在北京办的社保想增加一家医院","ptime":"1595553479000","url":"http://china.findlaw.cn/ask/wenda_10618613.html"},{"ftime":"07月23日 16:59","wx_name":"扬眼","rank_score":1.1278147331914,"img":"","second_cls":"复工","title":"广东、北京、江苏最关注影院复工《唐人街探案3》最受期待","ptime":"1595494796000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367953075775735808&from=kuake_xxx"},{"ftime":"07月23日 16:36","wx_name":"环球网","rank_score":1.1278147331914,"img":"","second_cls":"医院","title":"北京:全市发热门诊24小时开诊 发热患者全进行\u201c1+3\u201d检查","ptime":"1595493406000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367949990949028864&from=kuake_xxx"},{"ftime":"07月23日 10:38","wx_name":"环球网","rank_score":0.8290474644964,"img":"","second_cls":"医保","title":"互联网诊疗落地北京大学肿瘤医院并实现医保对接","ptime":"1595471929000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367905589914765312&from=kuake_xxx"},{"ftime":"07月23日 07:50","wx_name":"北京日报客户端","rank_score":0.7108045698726,"img":"","second_cls":"社保","title":"北京系列政策为企业\u201c输血\u201d，企业社保费减免全年将超千亿元","ptime":"1595461852000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367882933064696832&from=kuake_xxx"},{"ftime":"07月22日 22:00","wx_name":"北京日报客户端","rank_score":1.53425,"img":"","second_cls":"复工","title":"复工进入倒计时！北京影院准备就绪，请观众入场","ptime":"1595426454000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367808697797188608&from=kuake_xxx"},{"ftime":"07月22日 18:36","wx_name":"北京税务","rank_score":1.3966745921875,"img":"","second_cls":"社保","title":"针对中小微企业的社保费优惠政策是如何规定的?","ptime":"1595414186000","url":"http://mp.weixin.qq.com/s?__biz=MzAxNTA1Njc4Mw==&mid=2650848191&idx=2&sn=153113144487749b535ef6a2f7d09ad9"},{"ftime":"07月22日 18:17","wx_name":"北京发布","rank_score":1.3966745921875,"img":"","second_cls":"复工","title":"朝阳区综合施策，助力文化企业复工达产","ptime":"1595413056000","url":"http://mp.weixin.qq.com/s?__biz=MzA4NTIyMjMyMw==&mid=2652866539&idx=2&sn=b3348da54e16518b3304950e470d1900"},{"ftime":"07月22日 16:40","wx_name":"中国商报","rank_score":1.1278147331914,"img":"","second_cls":"学校","title":"北京幼儿园体罚孩子的，警告、罚款","ptime":"1595407223000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367768368599535616&from=kuake_xxx"},{"ftime":"07月22日 17:45","wx_name":"中教云","rank_score":0.90783848492187,"img":"","second_cls":"学校","title":"乘风破浪的：北京中小学教师数字教育培训计划全面启动","ptime":"1595411143000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367776589793991680&from=kuake_xxx"},{"ftime":"07月21日 21:35","wx_name":"北京税务","rank_score":1.6290125,"img":"","second_cls":"税务","title":"《网络办税联盟》告诉你网上便捷办税！","ptime":"1595338500000","url":"http://mp.weixin.qq.com/s?__biz=MzAxNTA1Njc4Mw==&mid=2650848138&idx=3&sn=08388a3d37650abc3c0f1bcae05b83e1"},{"ftime":"07月21日 17:10","wx_name":"本地宝","rank_score":0.76817102570312,"img":"","second_cls":"复工","title":"2020北京电影院复工时间及疫情防控要求措施","ptime":"1595322600000","url":"http://bj.bendibao.com/news/2020721/277780.shtm"},{"ftime":"07月20日 17:56","wx_name":"北京税务","rank_score":1.3268408625781,"img":"","second_cls":"复工","title":"听说电影院要复工啦？！好政策顶起来~","ptime":"1595238990000","url":"http://mp.weixin.qq.com/s?__biz=MzAxNTA1Njc4Mw==&mid=2650848048&idx=3&sn=66dbe3fed6575be0655edfda574c7886"},{"ftime":"07月20日 17:56","wx_name":"北京税务","rank_score":1.3268408625781,"img":"","second_cls":"社保","title":"阶段性减免企业社保费政策延长后，很多企业都在问\u2026\u2026","ptime":"1595238990000","url":"http://mp.weixin.qq.com/s?__biz=MzAxNTA1Njc4Mw==&mid=2650848048&idx=1&sn=5114f3b7649e2a68ac27cfb0c24287f1"},{"ftime":"07月20日 22:22","wx_name":"启瑞谈之论之","rank_score":0.99275,"img":"","second_cls":"学校","title":"继北京之后,又有一地出现疫情反弹,学生:9月还能正常开学吗?","ptime":"1595254965000","url":"https://mparticle.uc.cn/article.html?uc_param_str=frdnsnpfvecpntnwprdssskt#!wm_aid=16b5f8083ba94a78ba6f45324bb83f20!!wm_id=2f35198b5f1948069977cadb2c7eafdc"},{"ftime":"07月20日 09:42","wx_name":"中国经济网","rank_score":0.69493684523963,"img":"","second_cls":"医院","title":"北京新冠肺炎高风险人员收治定点医院高风险患者清零","ptime":"1595209320000","url":"http://district.ce.cn/newarea/roll/202007/20/t20200720_35358933.shtml"},{"ftime":"07月18日 23:44","wx_name":"北京税务","rank_score":1.805,"img":"","second_cls":"社保","title":"延长阶段性减免企业社保费实施期限，具体政策如何规定？","ptime":"1595087081000","url":"http://mp.weixin.qq.com/s?__biz=MzAxNTA1Njc4Mw==&mid=2650847981&idx=1&sn=07d1da44f9caf7f391ee4bfd9a995c24"},{"ftime":"07月17日 21:09","wx_name":"北京税务","rank_score":1.6290125,"img":"","second_cls":"税务","title":"北京税务邀您参与~","ptime":"1594991398000","url":"http://mp.weixin.qq.com/s?__biz=MzAxNTA1Njc4Mw==&mid=2650847980&idx=1&sn=2495bf01a9e8782b7dea904bda51d2cd"}],"rumour":[{"ftime":"07月24日 08:00","wx_name":"凤凰网房产","rank_score":0.5721646692473,"img":"","second_cls":"辟谣","title":"是套路还是真优惠?北京这些优惠楼盘真相了","ptime":"1595548802000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=368073130740030464&from=kuake_xxx"},{"ftime":"07月23日 11:17","wx_name":"北方网","rank_score":0.56467629160746,"img":"","second_cls":"辟谣","title":"辟谣!\u201c网传北京某小区出现确诊病例\u201d不实","ptime":"1595474272000","url":"http://economy.enorth.com.cn/system/2020/07/23/050301941.shtml"},{"ftime":"07月22日 20:59","wx_name":"海峡军情","rank_score":1.384660625,"img":"","second_cls":"辟谣","title":"谣言不攻自破，那些想看北京笑话的人失望了！","ptime":"1595422758000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367800947490954240&from=kuake_xxx"}],"traffic":[{"ftime":"07月24日 10:56","wx_name":"北京旅游网","rank_score":0.8290474644964,"img":"","second_cls":"地铁","title":"今年明年北京有哪些地铁会开通？快看看有你家附近吗？","ptime":"1595559374000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=368087451740145664&from=kuake_xxx"},{"ftime":"07月24日 10:41","wx_name":"北京旅游网","rank_score":0.8290474644964,"img":"","second_cls":"地铁","title":"北京又一公园走红,有湖有桥还有沙滩,没有门票,地铁4号线直达","ptime":"1595558460000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=368085867943695360&from=kuake_xxx"},{"ftime":"07月23日 13:27","wx_name":"封面新闻","rank_score":0.96696015686998,"img":"","second_cls":"高速","title":"除了京雄高速北京段 下半年还将推进哪些项目建设?交通运输部回应","ptime":"1595482071000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367925709336740864&from=kuake_xxx"},{"ftime":"07月23日 06:07","wx_name":"时光小日记","rank_score":0.51637861399568,"img":"","second_cls":"公交","title":"北京公交车身创意设计获奖作品公示","ptime":"1595455620000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367870425172021248&from=kuake_xxx"},{"ftime":"07月22日 22:48","wx_name":"央广网","rank_score":1.53425,"img":"","second_cls":"公交","title":"\u201c糊涂\u201d母女两度走散 北京公交民警地铁1号线首尾联动助其团聚","ptime":"1595429280000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367815876220558336&from=kuake_xxx"},{"ftime":"07月22日 17:36","wx_name":"北京日报客户端","rank_score":1.1871734033594,"img":"","second_cls":"公交","title":"北京公交车身图案设计征集结束，获奖作品来了","ptime":"1595410603000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367775456484656128&from=kuake_xxx"},{"ftime":"07月21日 15:19","wx_name":"北京发布","rank_score":1.1974738784768,"img":"","second_cls":"公交","title":"7月26日起25条公交线路优化调整","ptime":"1595315992000","url":"http://mp.weixin.qq.com/s?__biz=MzA4NTIyMjMyMw==&mid=2652866369&idx=2&sn=7bb0482e8e9c4a90a76636a38963ba22"},{"ftime":"07月21日 16:30","wx_name":"环球网","rank_score":0.99513064693359,"img":"","second_cls":"公交","title":"北京:在人员密集场所或乘坐公共交通等情况下必须戴口罩","ptime":"1595320246000","url":"https://3w.huanqiu.com/a/67c0c8/3z911Vdkc9C?agt=21"},{"ftime":"07月21日 17:35","wx_name":"封面新闻","rank_score":0.76817102570312,"img":"","second_cls":"公交","title":"北京卫健委:乘坐公共交通工具仍须佩戴口罩","ptime":"1595324100000","url":"http://www.thecover.cn/news/4816487"},{"ftime":"07月21日 08:04","wx_name":"新浪网","rank_score":0.48413933551694,"img":"","second_cls":"地铁","title":"北京：患流感戴口罩、公共场所禁赤膊、地铁禁食等正式入法！","ptime":"1595289840000","url":"https://k.sina.cn/article_1686546714_6486a91a020011xq7.html"}]},"tab":[{"name":"全部","key":"whole"},{"name":"疫情","key":"epidemic"},{"name":"交通","key":"traffic"},{"name":"办事","key":"life"},{"name":"公告","key":"govern"},{"name":"辟谣","key":"rumour"}],"city":"北京","district":"北京","query":"北京"}
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
                    ", city='" + city + '\'' +
                    ", district='" + district + '\'' +
                    ", query='" + query + '\'' +
                    ", tab=" + tab +
                    '}';
        }

        /**
         * result : {"govern":[{"ftime":"07月24日 10:41","wx_name":"北京旅游网","rank_score":0.8290474644964,"img":"","second_cls":"公告","title":"北京通报确诊病例详情:有家教、保安、餐饮店经营人员\u2026\u2026","ptime":"1595558460000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=368085867106928640&from=kuake_xxx"},{"ftime":"07月24日 09:29","wx_name":"北京旅游网","rank_score":0.78759509127158,"img":"","second_cls":"公告","title":"北京市文化和旅游局关于演出场所、娱乐场所、互联网上网服务营业场所有序恢复经营活动的通知","ptime":"1595554140000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=368076814955844608&from=kuake_xxx"},{"ftime":"07月24日 00:45","wx_name":"新浪新闻","rank_score":0.32118792677265,"img":"","second_cls":"公告","title":"北京通报29病例详情，均与新发地市场有关联，多名厨师、配菜员、服务员确诊","ptime":"1595522700000","url":"https://news.sina.cn/2020-06-16/detail-iirczymk7376491.d.html"},{"ftime":"07月22日 19:10","wx_name":"新京报","rank_score":1.31542759375,"img":"","second_cls":"公告","title":"北京高院发布涉中国银行\u201c原油宝\u201d事件民事诉讼案件集中管辖公告","ptime":"1595416201000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367787702438855680&from=kuake_xxx"},{"ftime":"07月22日 19:30","wx_name":"时光小日记","rank_score":1.00591521875,"img":"","second_cls":"公告","title":"北京一小区保安检查出入证遭业主暴打昏迷不醒 警方通报:已刑拘","ptime":"1595417400000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367789983771137024&from=kuake_xxx"},{"ftime":"07月21日 19:03","wx_name":"每经网","rank_score":0.85115903125,"img":"","second_cls":"公告","title":"交通部最新通知!各地省际旅游客运可与跨省团队游业务同步恢复,北京新疆需按疫情防控有关部署执行","ptime":"1595329419000","url":"http://www.nbd.com.cn/articles/2020-07-21/1465159.html"},{"ftime":"07月21日 18:13","wx_name":"中国政府网","rank_score":0.8086010796875,"img":"","second_cls":"公告","title":"北京市电影局关于在疫情防控常态化条件下有序推进电影院恢复开放的通知","ptime":"1595326380000","url":"http://www.gov.cn/govweb/xinwen/2020-07/21/content_5528751.htm"},{"ftime":"07月21日 15:37","wx_name":"中公网","rank_score":0.69327435069707,"img":"","second_cls":"公告","title":"2020首都医科大学附属北京儿童医院招聘2人公告","ptime":"1595317079000","url":"http://www.offcn.com/ylws/2020/0721/193368.html"},{"ftime":"07月21日 07:34","wx_name":"新浪科技","rank_score":0.45993236874109,"img":"","second_cls":"公告","title":"海南航空发布疫情防控期间涉及北京进出港国内航班票务处理的通知","ptime":"1595288040000","url":"https://tech.sina.cn/2020-06-17/detail-iircuyvi8970049.d.html"},{"ftime":"07月21日 03:55","wx_name":"新浪科技","rank_score":0.37461778891693,"img":"","second_cls":"公告","title":"同一餐馆8人确诊！北京通报18日确诊病例详情→","ptime":"1595274900000","url":"https://tech.sina.cn/2020-06-19/detail-iircuyvi9410254.d.html"},{"ftime":"07月21日 00:00","wx_name":"北京市卫生健康委员会","rank_score":0.32118792677265,"img":"","second_cls":"公告","title":"关于首都医科大学附属北京佑安医院等3家医院血液透析室变更登记有关工作的通知","ptime":"1595260800000","url":"http://wjw.beijing.gov.cn/zwgk_20040/zxgk/202007/t20200721_1954253.html"},{"ftime":"07月20日 15:40","wx_name":"北京旅游网","rank_score":0.69327435069707,"img":"","second_cls":"公告","title":"速看!北京疫情最新通报!","ptime":"1595230800000","url":"http://3g.visitbeijing.com.cn/uczzd/a-XEP4E1C9CF78702B7F6CD7"},{"ftime":"07月20日 14:46","wx_name":"北京旅游网","rank_score":0.65861063316222,"img":"","second_cls":"公告","title":"北京通报两起聚集性疫情详情:存在宿舍、更衣室等区域不戴口罩情况","ptime":"1595227560000","url":"https://mparticle.uc.cn/article_org.html?uc_param_str=frdnsnpfvecpntnwprdssskt#!wm_cid=367392006495802368!!wm_id=68d00510526447f7ba1630b56bd53698"},{"ftime":"07月20日 14:43","wx_name":"北京旅游网","rank_score":0.65861063316222,"img":"","second_cls":"公告","title":"北京通报此前两起聚集性疫情详情!","ptime":"1595227380000","url":"http://3g.visitbeijing.com.cn/uczzd/a-XEP4P72143A694CA9D02B7"},{"ftime":"07月20日 14:03","wx_name":"北京旅游网","rank_score":0.65861063316222,"img":"","second_cls":"公告","title":"北京通报2例特殊病例!出现症状后自行服药","ptime":"1595224980000","url":"https://mparticle.uc.cn/article_org.html?uc_param_str=frdnsnpfvecpntnwprdssskt#!wm_cid=367390016843810816!!wm_id=68d00510526447f7ba1630b56bd53698"},{"ftime":"07月19日 15:51","wx_name":"北京发布","rank_score":1.1974738784768,"img":"","second_cls":"公告","title":"最新通知 | 北京教育系统不组织、不接待各类夏令营等聚集性活动","ptime":"1595145069000","url":"http://mp.weixin.qq.com/s?__biz=MzA4NTIyMjMyMw==&mid=2652866198&idx=1&sn=65835cb6acab6bd052af59d04d421ad6"}],"epidemic":[{"ftime":"07月24日 09:21","wx_name":"北京发布","rank_score":0.88025333730353,"img":"","second_cls":"官方","title":"北京昨日无新增报告新冠肺炎确诊病例，治愈出院14例","ptime":"1595553690000","content":"7月23日0时至24时，无新增报告本地确诊病例、疑似病例和无症状感染者，治愈出院病例14例；无新增报告境外输入确诊病例、疑似病例和无症状感染者。 6月11日0时至7月23日24时，累计报告本地确诊病例335例，在院65例，治愈出院270例。尚在观察的无症状感染者7例；无新增报告境外输入新冠肺炎确诊病","url":"http://mp.weixin.qq.com/s?__biz=MzA4NTIyMjMyMw==&mid=2652866620&idx=1&sn=6a079e159ce2a2af3fafa4a674781336"},{"ftime":"07月24日 11:19","wx_name":"北京旅游网","rank_score":0.87268154157516,"img":"","second_cls":"官方","title":"北京市6月30日新增确诊病例相关情况","ptime":"1595560740000","content":"6月30日0时至24时，北京市新增新冠肺炎确诊病例3例，其中男性2例，女性1例；年龄最小20岁，最大54岁；均居住于大兴区。现将确诊病例具体情况通报如下： 病例1，男，25岁，住址为大兴区西红门（地区）镇西红门路，其多名同事和家人有新发地接触史。6月21至25日多次到住地附近永安小卖店购物，曾与确诊","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=368091224504010752&from=kuake_xxx"},{"ftime":"07月24日 10:43","wx_name":"北京旅游网","rank_score":0.8290474644964,"img":"","second_cls":"官方","title":"北京今天又有一名确诊患者出院,已出院病例未出现人传人现象","ptime":"1595558580000","content":"6月30日下午，北京市新型冠状病毒肺炎疫情防控工作第137场新闻发布会上，北京地坛医院副院长吴国安又带来了好消息：今天又有一名确诊病例刘某某康复出院。 昨天，\u201c西城大爷\u201d老何康复出院，他也是北京市此轮疫情的首例出院患者。 北京地坛医院副院长吴国安介绍说，目前所有病例都集中收治在地坛医院，便于集中资源","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=368086916981070848&from=kuake_xxx"},{"ftime":"07月24日 10:13","wx_name":"北京旅游网","rank_score":0.8290474644964,"img":"","second_cls":"官方","title":"又有餐饮从业人员\u201c中招\u201d!北京再通报9例确诊病例详情","ptime":"1595556780000","content":"6月29日，北京市召开疫情防控新闻发布会。北京市疾控中心等部门通报疫情最新进展及防控措施等相关情况，并答记者问。 会上，北京市疾病预防控制中心副主任庞星火就北京市新增确诊病例的相关情况进行了通报。 庞星火介绍，6月28日0时至24时，北京市新增新冠肺炎确诊病例7例，其中男性3例，女性4例；平均年龄3","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=368083312293446656&from=kuake_xxx"},{"ftime":"07月24日 08:33","wx_name":"中新经纬","rank_score":0.5721646692473,"img":"","second_cls":"","title":"北京连续18天0新增!23日治愈出院14例","ptime":"1595550807000","content":"中新经纬客户端7月24日电 据北京市卫生健康委员会官方微博24日通报，7月23日0时至24时，无新增报告本地确诊病例、疑似病例和无症状感染者，治愈出院病例14例；无新增报告境外输入确诊病例、疑似病例和无症状感染者。 6月11日0时至7月23日24时，累计报告本地确诊病例335例，在院65例，治愈出院","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=368071987725076480&from=kuake_xxx"},{"ftime":"07月24日 08:37","wx_name":"新浪新闻","rank_score":0.48413933551694,"img":"","second_cls":"","title":"百事公司北京分厂聚集感染患者出院,首例确诊者披露感染原因","ptime":"1595551020000","content":"6月21日下午，在北京新型冠状病毒肺炎疫情防控工作第128场新闻发布会上，百事公司大中华区集团事务部企宣总监樊志敏通报了大兴区百事食品（中国）有限公司北京分厂新发地输入型病例情况。回顾相关信息可戳→百事公司分厂出现确诊病例，已停产停业，87名密切接触者全部集中隔离近日，这起聚集性案例的两名员工相继出","url":"https://partners.sina.cn/html/uc/toutiao/article?docUrl=http://k.sina.cn/article_1750344480_v6854232001900wnzz.html?cre=tianyi&loc=1&mod=uchealth&r=0&rfunc=93&tj=cxthirdparty_batch&tr=302&wm=6079"},{"ftime":"07月23日 19:15","wx_name":"封面新闻","rank_score":1.31542759375,"img":"","second_cls":"官方","title":"北京新发地疫情已治愈出院病例256例 17天无新增确诊病例","ptime":"1595502923000","content":"封面新闻记者 粟裕 7月23日，北京市新型冠状病毒肺炎疫情防控工作第160场新闻发布会，北京市委宣传部副部长、市政府新闻办主任、市政府新闻发言人徐和建介绍，7月22日，北京无新增报告本地确诊病例、疑似病例和无症状感染者，治愈出院病例8例。 /strip/quality/95/ignore-error","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367969318201203712&from=kuake_xxx"},{"ftime":"07月23日 18:00","wx_name":"北京日报客户端","rank_score":1.2496562140625,"img":"","second_cls":"官方","title":"北京今日发布会要点汇总：新发地疫情八成患者已出院","ptime":"1595498442000","content":" 北京疫情防控新闻发布会要点汇总 （7月23日·第160场） 市疾控中心： 1.7月23日0时至15时，北京市报告出院病例14例。 2.6月11日至7月23日15时，北京市累计报告确诊病例335例，已出院270例，达80.6%，现有在院65例，无危重病例、重症病例，无疑似病例，尚在观察的无症状感染者","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367959668909148160&from=kuake_xxx"},{"ftime":"07月23日 19:10","wx_name":"新浪财经","rank_score":0.85115903125,"img":"","second_cls":"","title":"北京九日新增205例确诊；中芯国际19天极速上会丨一周热点回顾","ptime":"1595502600000","content":"原标题：北京九日新增205例确诊； 中芯国际 19天极速上会丨一周热点回顾 来源：第一财经5 月主要经济指标持续改善国家统计局6月15日发布5月份宏观经济数据，工业、消费、投资等主要经济指标持续改善，经济继续呈现恢复态势。5月份，全国规模以上工业增加值同比增长4.4%，增速比4月份加快0.5个百分点","url":"https://finance.sina.cn/stock/relnews/hk/2020-06-20/detail-iircuyvi9490680.d.html"},{"ftime":"07月23日 08:42","wx_name":"北京发布","rank_score":0.83624067043835,"img":"","second_cls":"官方","title":"北京昨日无新增报告新冠肺炎确诊病例，治愈出院8例","ptime":"1595464948000","content":"7月22日0时至24时，无新增报告本地确诊病例、疑似病例和无症状感染者，治愈出院病例8例；无新增报告境外输入确诊病例、疑似病例和无症状感染者。 6月11日0时至7月22日24时，累计报告本地确诊病例335例，在院79例，治愈出院256例。尚在观察的无症状感染者8例；无新增报告境外输入新冠肺炎确诊病例","url":"http://mp.weixin.qq.com/s?__biz=MzA4NTIyMjMyMw==&mid=2652866552&idx=1&sn=f8bf5a716819d7383203cd7b524aa223"},{"ftime":"07月23日 13:36","wx_name":"新浪科技","rank_score":0.62568010150411,"img":"","second_cls":"","title":"北京新增51例，一架航班输入17例\u2026疫情会否反弹？","ptime":"1595482560000","content":"原标题：北京新增51例，一架航班输入17例\u2026疫情会否反弹？中新网客户端北京6月15日电(记者 张尼)近日，北京的新发地出现数十个新冠肺炎本土确诊病例，让人们原本放松的神经再度紧绷。疫情的变化给所有人敲响警钟：狡猾的病毒没有彻底离开，它甚至可能以一种更隐蔽的方式存在于我们身边。6月13日，北京新发地批","url":"https://tech.sina.cn/2020-06-15/detail-iirczymk7000503.d.html"},{"ftime":"07月23日 12:22","wx_name":"新浪新闻","rank_score":0.5943960964289,"img":"","second_cls":"","title":"北京市新型冠状病毒肺炎疫情防控工作新闻发布会(7月23日)","ptime":"1595478179000","content":"2020.07.23 12:22:59 北京市政府网站原标题：北京市新型冠状病毒肺炎疫情防控工作新闻发布会(7月23日)来源：视频北京北京市新型冠状病毒肺炎疫情防控工作新闻发布会(7月23日)发布时间：2020-07-23北京市人民政府新闻办公室于2020年7月23日下午4点，在北京市人民政府新闻办","url":"https://news.sina.cn/gn/2020-07-23/detail-iivhuipn4637353.d.html"},{"ftime":"07月23日 05:34","wx_name":"时光小日记","rank_score":0.4905596832959,"img":"","second_cls":"","title":"北京市7月21日无新增确诊病例 治愈出院患者17例","ptime":"1595453640000","content":"7月21日北京市无新增新冠肺炎确诊病例，治愈出院17例。截至7月21日24时，全市已连续16天无新增报告确诊病例。目前，全市所有街乡均为低风险地区。 7月21日0时至24时，本市无新增报告本地确诊病例、疑似病例和无症状感染者，治愈出院病例17例；无新增报告境外输入确诊病例、疑似病例和无症状感染者。 ","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367865978781965312&from=kuake_xxx"},{"ftime":"07月22日 17:32","wx_name":"新华社","rank_score":1.1871734033594,"img":"","second_cls":"官方","title":"北京连续16天无新增报告本地确诊病例,所有街乡均为低风险地区","ptime":"1595410373000","content":" [简介]7月22日下午，北京市新型冠状病毒肺炎疫情防控工作第159场新闻发布会上，北京市政府新闻发言人徐和建介绍，北京已连续16天无新增报告本地确诊病例，全市所有街乡均为低风险地区。 记者：王普","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367777587293848576&from=kuake_xxx"},{"ftime":"07月22日 14:07","wx_name":"北京商报","rank_score":1.0178527967052,"img":"","second_cls":"官方","title":"新疆昨新增9例本土病例，北京连续16个0","ptime":"1595398064000","content":"7月21日0-24时，31个省（自治区、直辖市）和新疆生产建设兵团报告新增确诊病例14例，其中境外输入病例5例（上海2例，广东2例，云南1例），本土病例9例（均在新疆）；无新增死亡病例；无新增疑似病例。 当日新增治愈出院病例23例，解除医学观察的密切接触者434人，重症病例较前一日减少1例。境外输入","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367749160077628416&from=kuake_xxx"},{"ftime":"07月22日 22:58","wx_name":"新浪新闻","rank_score":0.99275,"img":"","second_cls":"","title":"北京新增新冠肺炎确诊病例36例 社区防控进入战时状态","ptime":"1595429880000","content":"原标题：北京新增新冠肺炎确诊病例36例 社区防控进入战时状态据新华社电 15日下午，在北京市新型冠状病毒肺炎疫情防控工作新闻发布会上，北京市疾控中心副主任庞星火介绍，6月14日0时至24时，北京市新增新冠肺炎确诊病例36例，已完成流调34例，均与新发地市场有关，还有2例正在流调中。发布会上，北京市委","url":"https://news.sina.cn/2020-06-16/detail-iirczymk7219125.d.html"},{"ftime":"07月22日 13:20","wx_name":"北京旅游网","rank_score":0.96696015686998,"img":"","second_cls":"官方","title":"北京新增报告本地确诊病例1例!又一区中风险地区\u201c清零\u201d","ptime":"1595395200000","content":"据国家卫生健康委员会消息，7月1日0\u201424时，31个省（自治区、直辖市）和新疆生产建设兵团报告新增确诊病例3例，其中境外输入病例2例（上海1例，广东1例），本土病例1例（在北京）；无新增死亡病例；无新增疑似病例。 据北京市卫生健康委员会消息，7月1日0时至24时，新增报告本地确诊病例1例、无症状感染","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367747793074259968&from=kuake_xxx"},{"ftime":"07月22日 13:16","wx_name":"北京旅游网","rank_score":0.96696015686998,"img":"","second_cls":"官方","title":"北京市新冠肺炎疫情防控工作第138场新闻发布会","ptime":"1595394960000","content":"北京市政府新闻办组织召开北京市新冠肺炎疫情防控工作第138场新闻发布会，市委宣传部副部长、市政府新闻办主任、市政府新闻发言人徐和建主持。市交通委副主任、新闻发言人容军，大兴区副区长何景涛，市疾控中心副主任庞星火，中国疾病预防控制中心流行病学首席专家吴尊友出席发布会，通报北京最新疫情，发布防控有关信息","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367747793126688768&from=kuake_xxx"},{"ftime":"07月22日 21:44","wx_name":"新浪科技","rank_score":0.9431125,"img":"","second_cls":"","title":"31省区市昨日新增本土病例33例，均与北京有关联","ptime":"1595425440000","content":"原标题：31省区市昨日新增本土病例33例，均与北京有关联国家卫健委6月17日早间通报，6月16日0\u201424时，31个省（自治区、直辖市）和新疆生产建设兵团报告新增确诊病例44例，其中境外输入病例11例（甘肃10例，四川1例），本土病例33例（北京31例，河北1例，浙江1例）；无新增死亡病例；新增疑似病","url":"https://tech.sina.cn/2020-06-17/detail-iircuyvi8895030.d.html"},{"ftime":"07月22日 13:23","wx_name":"新浪网","rank_score":0.62568010150411,"img":"","second_cls":"","title":"17年后重启，北京小汤山医院出现首例确诊病例","ptime":"1595395380000","content":" 环球网03月17日 18:29 关注【来源：中国新闻网】为做好境外输入人员疫情防控工作，尽力保证市民正常工作生活秩序，时隔17年，北京小汤山医院于3月16日再次启用，主要用于境外来（返）京人员中需筛查人员、疑似病例及轻型、普通型确诊患者治疗。从3月16日17时到24时，小汤山医院共接收来自机场待筛","url":"https://k.sina.cn/article_1686546714_6486a91a020010cgg.html"}],"whole":[{"ftime":"07月24日 09:21","wx_name":"北京发布","rank_score":0.88025333730353,"img":"","second_cls":"官方","title":"北京昨日无新增报告新冠肺炎确诊病例，治愈出院14例","ptime":"1595553690000","content":"7月23日0时至24时，无新增报告本地确诊病例、疑似病例和无症状感染者，治愈出院病例14例；无新增报告境外输入确诊病例、疑似病例和无症状感染者。 6月11日0时至7月23日24时，累计报告本地确诊病例335例，在院65例，治愈出院270例。尚在观察的无症状感染者7例；无新增报告境外输入新冠肺炎确诊病","url":"http://mp.weixin.qq.com/s?__biz=MzA4NTIyMjMyMw==&mid=2652866620&idx=1&sn=6a079e159ce2a2af3fafa4a674781336"},{"ftime":"07月24日 11:19","wx_name":"北京旅游网","rank_score":0.87268154157516,"img":"","second_cls":"官方","title":"北京市6月30日新增确诊病例相关情况","ptime":"1595560740000","content":"6月30日0时至24时，北京市新增新冠肺炎确诊病例3例，其中男性2例，女性1例；年龄最小20岁，最大54岁；均居住于大兴区。现将确诊病例具体情况通报如下： 病例1，男，25岁，住址为大兴区西红门（地区）镇西红门路，其多名同事和家人有新发地接触史。6月21至25日多次到住地附近永安小卖店购物，曾与确诊","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=368091224504010752&from=kuake_xxx"},{"ftime":"07月24日 08:30","wx_name":"北京发布","rank_score":0.83624067043835,"img":"","second_cls":"","title":"蔡奇来到北京最东端，调研生态涵养区，要求密云建设践行\u201c两山\u201d理论的典范之区","ptime":"1595550613000","url":"http://mp.weixin.qq.com/s?__biz=MzA4NTIyMjMyMw==&mid=2652866616&idx=1&sn=a58ca5db908a174b01b4ba274f0e3766"},{"ftime":"07月24日 10:56","wx_name":"北京旅游网","rank_score":0.8290474644964,"img":"","second_cls":"地铁","title":"今年明年北京有哪些地铁会开通？快看看有你家附近吗？","ptime":"1595559374000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=368087451740145664&from=kuake_xxx"},{"ftime":"07月24日 10:44","wx_name":"北京旅游网","rank_score":0.8290474644964,"img":"","second_cls":"医院","title":"北京一诊所擅自接诊发热患者,停业整顿、行拘","ptime":"1595558640000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=368087007823398912&from=kuake_xxx"},{"ftime":"07月24日 10:43","wx_name":"北京旅游网","rank_score":0.8290474644964,"img":"","second_cls":"官方","title":"北京今天又有一名确诊患者出院,已出院病例未出现人传人现象","ptime":"1595558580000","content":"6月30日下午，北京市新型冠状病毒肺炎疫情防控工作第137场新闻发布会上，北京地坛医院副院长吴国安又带来了好消息：今天又有一名确诊病例刘某某康复出院。 昨天，\u201c西城大爷\u201d老何康复出院，他也是北京市此轮疫情的首例出院患者。 北京地坛医院副院长吴国安介绍说，目前所有病例都集中收治在地坛医院，便于集中资源","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=368086916981070848&from=kuake_xxx"},{"ftime":"07月24日 10:42","wx_name":"北京旅游网","rank_score":0.8290474644964,"img":"","second_cls":"","title":"北京本轮疫情早期入院患者进入恢复期","ptime":"1595558520000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=368085867929012224&from=kuake_xxx"},{"ftime":"07月24日 10:41","wx_name":"北京旅游网","rank_score":0.8290474644964,"img":"","second_cls":"公告","title":"北京通报确诊病例详情:有家教、保安、餐饮店经营人员\u2026\u2026","ptime":"1595558460000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=368085867106928640&from=kuake_xxx"},{"ftime":"07月24日 10:41","wx_name":"北京旅游网","rank_score":0.8290474644964,"img":"","second_cls":"地铁","title":"北京又一公园走红,有湖有桥还有沙滩,没有门票,地铁4号线直达","ptime":"1595558460000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=368085867943695360&from=kuake_xxx"},{"ftime":"07月24日 10:17","wx_name":"环球网","rank_score":0.8290474644964,"img":"","second_cls":"复工","title":"影业复工!北京电影院7月24日恢复营业","ptime":"1595557030000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=368083082990846976&from=kuake_xxx"},{"ftime":"07月24日 10:13","wx_name":"北京旅游网","rank_score":0.8290474644964,"img":"","second_cls":"官方","title":"又有餐饮从业人员\u201c中招\u201d!北京再通报9例确诊病例详情","ptime":"1595556780000","content":"6月29日，北京市召开疫情防控新闻发布会。北京市疾控中心等部门通报疫情最新进展及防控措施等相关情况，并答记者问。 会上，北京市疾病预防控制中心副主任庞星火就北京市新增确诊病例的相关情况进行了通报。 庞星火介绍，6月28日0时至24时，北京市新增新冠肺炎确诊病例7例，其中男性3例，女性4例；平均年龄3","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=368083312293446656&from=kuake_xxx"},{"ftime":"07月24日 09:52","wx_name":"光明网","rank_score":0.78759509127158,"img":"","second_cls":"科普","title":"北京知识产权巡回审判庭揭牌","ptime":"1595555520000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=368080692271125504&from=kuake_xxx"},{"ftime":"07月24日 09:29","wx_name":"北京旅游网","rank_score":0.78759509127158,"img":"","second_cls":"公告","title":"北京市文化和旅游局关于演出场所、娱乐场所、互联网上网服务营业场所有序恢复经营活动的通知","ptime":"1595554140000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=368076814955844608&from=kuake_xxx"},{"ftime":"07月24日 08:00","wx_name":"凤凰网房产","rank_score":0.5721646692473,"img":"","second_cls":"科普","title":"看了不吃亏!北京舒适改善房选择指南!","ptime":"1595548825000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=368073156321088512&from=kuake_xxx"},{"ftime":"07月24日 08:00","wx_name":"凤凰网房产","rank_score":0.5721646692473,"img":"","second_cls":"辟谣","title":"是套路还是真优惠?北京这些优惠楼盘真相了","ptime":"1595548802000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=368073130740030464&from=kuake_xxx"},{"ftime":"07月24日 09:17","wx_name":"找法网","rank_score":0.50962035317573,"img":"","second_cls":"社保","title":"在北京办的社保想增加一家医院","ptime":"1595553479000","url":"http://china.findlaw.cn/ask/wenda_10618613.html"},{"ftime":"07月24日 10:52","wx_name":"中国西藏网","rank_score":0.73151246867329,"img":"","second_cls":"","title":"北京市第五批\u201c组团式\u201d援藏医疗队,用心打造西藏大病兜底医院","ptime":"1595559120000","url":"http://www.tibet.cn/cn/medicine/lht/202007/t20200724_6824778.html"},{"ftime":"07月24日 10:30","wx_name":"中国长安网","rank_score":0.73151246867329,"img":"","second_cls":"","title":"北京:安检进医院 全方位保障医患更安全","ptime":"1595557813000","url":"https://mparticle.uc.cn/article.html?uc_param_str=frdnsnpfvecpntnwprdssskt#!wm_aid=50bfbf87e534c80e63151e01b1463a5c!!wm_id=0e247b1ff5c34db58e9ca3e0e4b64d72"},{"ftime":"07月24日 09:23","wx_name":"中国网","rank_score":0.69493684523963,"img":"","second_cls":"","title":"北京:57家因疫情关停生产经营单位29家恢复经营","ptime":"1595553783000","url":"http://www.china.com.cn/news/2020-07/24/content_76307370.htm"},{"ftime":"07月24日 12:05","wx_name":"手机新浪网","rank_score":0.5943960964289,"img":"","second_cls":"","title":"拒戴口罩打死老人的郭某思曾连续减刑，北京政法委核查","ptime":"1595563500000","url":"https://mil.sina.cn/2020-03-31/detail-iimxyqwa4324076.d.html"},{"ftime":"07月24日 08:33","wx_name":"中新经纬","rank_score":0.5721646692473,"img":"","second_cls":"","title":"北京连续18天0新增!23日治愈出院14例","ptime":"1595550807000","content":"中新经纬客户端7月24日电 据北京市卫生健康委员会官方微博24日通报，7月23日0时至24时，无新增报告本地确诊病例、疑似病例和无症状感染者，治愈出院病例14例；无新增报告境外输入确诊病例、疑似病例和无症状感染者。 6月11日0时至7月23日24时，累计报告本地确诊病例335例，在院65例，治愈出院","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=368071987725076480&from=kuake_xxx"},{"ftime":"07月24日 11:26","wx_name":"新浪新闻","rank_score":0.56467629160746,"img":"","second_cls":"","title":"全院封闭管理！北京大学国际医院一名急诊科护士确诊","ptime":"1595561160000","url":"https://news.sina.cn/gn/2020-06-19/detail-iircuyvi9398672.d.html"},{"ftime":"07月24日 11:19","wx_name":"北京旅游网","rank_score":0.56467629160746,"img":"","second_cls":"","title":"北京昨日确诊病例情况来了:一女子自我隔离14天后与多人聚餐","ptime":"1595560740000","url":"https://mparticle.uc.cn/article_org.html?uc_param_str=frdnsnpfvecpntnwprdssskt#!wm_cid=368091159662167040!!wm_id=68d00510526447f7ba1630b56bd53698"},{"ftime":"07月24日 11:19","wx_name":"北京旅游网","rank_score":0.56467629160746,"img":"","second_cls":"","title":"北京:对短期来京运送物资等人员不采取隔离措施","ptime":"1595560740000","url":"https://mparticle.uc.cn/article_org.html?uc_param_str=frdnsnpfvecpntnwprdssskt#!wm_cid=368091175258687488!!wm_id=68d00510526447f7ba1630b56bd53698"},{"ftime":"07月24日 11:10","wx_name":"新浪科技","rank_score":0.56467629160746,"img":"","second_cls":"","title":"北京疫情上升期 非常之时非常之举","ptime":"1595560200000","url":"https://tech.sina.cn/2020-06-18/detail-iircuyvi9062544.d.html"},{"ftime":"07月24日 11:04","wx_name":"新浪新闻","rank_score":0.56467629160746,"img":"","second_cls":"","title":"速看!大连、新疆和北京,疫情有了这些重大变化","ptime":"1595559840000","url":"https://partners.sina.cn/html/uc/toutiao/article?docUrl=http://zx.sina.cn/2020-07-24/zx-iivhvpwx7196756.d.html?cre=tianyi&loc=7&mod=ucsociety&r=0&rfunc=93&tj=cxthirdparty_batch&tr=302&wm=6079"},{"ftime":"07月24日 10:57","wx_name":"北京旅游网","rank_score":0.53644247702708,"img":"","second_cls":"","title":"北京一患者4次核酸阴性后确诊","ptime":"1595559420000","url":"https://mparticle.uc.cn/article_org.html?uc_param_str=frdnsnpfvecpntnwprdssskt#!wm_cid=368087828352995328!!wm_id=68d00510526447f7ba1630b56bd53698"},{"ftime":"07月24日 10:56","wx_name":"北京旅游网","rank_score":0.53644247702708,"img":"","second_cls":"","title":"北京疫情形势如何?是否有第二波疫情?专家给出最新判断","ptime":"1595559360000","url":"https://mparticle.uc.cn/article_org.html?uc_param_str=frdnsnpfvecpntnwprdssskt#!wm_cid=368087827583337472!!wm_id=68d00510526447f7ba1630b56bd53698"},{"ftime":"07月24日 10:42","wx_name":"北京旅游网","rank_score":0.53644247702708,"img":"","second_cls":"","title":"多地调整风险等级!北京发布最新隔离政策","ptime":"1595558520000","url":"http://3g.visitbeijing.com.cn/uczzd/a-XEOYLQEF5EF18A6E5268BE"},{"ftime":"07月24日 10:39","wx_name":"北京旅游网","rank_score":0.53644247702708,"img":"","second_cls":"","title":"北京新冠肺炎疫情防控工作领导小组第七十二次会议暨首都严格进京管理联防联控协调机制第三十三次会议召开","ptime":"1595558340000","url":"https://mparticle.uc.cn/article_org.html?uc_param_str=frdnsnpfvecpntnwprdssskt#!wm_cid=368086247865844736!!wm_id=68d00510526447f7ba1630b56bd53698"},{"ftime":"07月24日 10:03","wx_name":"珍惜眼前人的","rank_score":0.53644247702708,"img":"","second_cls":"","title":"截止到7月24日,国内疫情迎来一个新转折,北京老百姓喜迎好消息!","ptime":"1595556232000","url":"https://mparticle.uc.cn/article.html?uc_param_str=frdnsnpfvecpntnwprdssskt#!wm_aid=b44b8414124a4d3fbe5205006f5feece!!wm_id=235d070c0ff548efbd63f120b1262008"},{"ftime":"07月24日 09:42","wx_name":"脉宝宝","rank_score":0.50962035317573,"img":"","second_cls":"","title":"北京建档攻略:2020北大国际医院怀孕建档条件及建档流程","ptime":"1595554967000","url":"https://mparticle.uc.cn/article.html?uc_param_str=frdnsnpfvecpntnwprdssskt#!wm_aid=4e4acc0b25de4e4cb8fecbd693a6aa55!!wm_id=0fa23753e9a5417ea9fff865b92044b2"},{"ftime":"07月24日 09:40","wx_name":"新浪财经","rank_score":0.50962035317573,"img":"","second_cls":"","title":"北京万达影城零点场:影迷准守防疫规则 IMax票价降至40元","ptime":"1595554800000","url":"https://finance.sina.cn/china/gncj/2020-07-24/detail-iivhvpwx7196866.d.html"},{"ftime":"07月24日 09:28","wx_name":"和讯网","rank_score":0.50962035317573,"img":"","second_cls":"","title":"冰封下的家装市场：有人转行卖口罩，有人离开北京","ptime":"1595554080000","url":"http://m.hexun.com/news/2020-07-24/201756506.html"},{"ftime":"07月24日 08:37","wx_name":"新浪新闻","rank_score":0.48413933551694,"img":"","second_cls":"","title":"百事公司北京分厂聚集感染患者出院,首例确诊者披露感染原因","ptime":"1595551020000","content":"6月21日下午，在北京新型冠状病毒肺炎疫情防控工作第128场新闻发布会上，百事公司大中华区集团事务部企宣总监樊志敏通报了大兴区百事食品（中国）有限公司北京分厂新发地输入型病例情况。回顾相关信息可戳→百事公司分厂出现确诊病例，已停产停业，87名密切接触者全部集中隔离近日，这起聚集性案例的两名员工相继出","url":"https://partners.sina.cn/html/uc/toutiao/article?docUrl=http://k.sina.cn/article_1750344480_v6854232001900wnzz.html?cre=tianyi&loc=1&mod=uchealth&r=0&rfunc=93&tj=cxthirdparty_batch&tr=302&wm=6079"},{"ftime":"07月24日 08:36","wx_name":"新浪新闻","rank_score":0.48413933551694,"img":"","second_cls":"","title":"今天的北京疫情防控新闻发布会","ptime":"1595550960000","url":"https://news.sina.cn/gn/2020-07-19/detail-iivhvpwx6283027.d.html"},{"ftime":"07月24日 00:45","wx_name":"新浪新闻","rank_score":0.32118792677265,"img":"","second_cls":"公告","title":"北京通报29病例详情，均与新发地市场有关联，多名厨师、配菜员、服务员确诊","ptime":"1595522700000","url":"https://news.sina.cn/2020-06-16/detail-iirczymk7376491.d.html"},{"ftime":"07月23日 19:55","wx_name":"中国新闻网","rank_score":1.31542759375,"img":"","second_cls":"科普","title":"北京将推动知识产权保护立法 落实惩罚性赔偿制度","ptime":"1595505344000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367975183335560192&from=kuake_xxx"},{"ftime":"07月23日 19:15","wx_name":"新京报","rank_score":1.31542759375,"img":"","second_cls":"科普","title":"北京知识产权巡回审判庭揭牌,知识产权案件可\u201c云开庭\u201d","ptime":"1595502934000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367969402856935424&from=kuake_xxx"},{"ftime":"07月23日 19:15","wx_name":"封面新闻","rank_score":1.31542759375,"img":"","second_cls":"官方","title":"北京新发地疫情已治愈出院病例256例 17天无新增确诊病例","ptime":"1595502923000","content":"封面新闻记者 粟裕 7月23日，北京市新型冠状病毒肺炎疫情防控工作第160场新闻发布会，北京市委宣传部副部长、市政府新闻办主任、市政府新闻发言人徐和建介绍，7月22日，北京无新增报告本地确诊病例、疑似病例和无症状感染者，治愈出院病例8例。 /strip/quality/95/ignore-error","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367969318201203712&from=kuake_xxx"},{"ftime":"07月23日 18:00","wx_name":"北京日报客户端","rank_score":1.2496562140625,"img":"","second_cls":"官方","title":"北京今日发布会要点汇总：新发地疫情八成患者已出院","ptime":"1595498442000","content":" 北京疫情防控新闻发布会要点汇总 （7月23日·第160场） 市疾控中心： 1.7月23日0时至15时，北京市报告出院病例14例。 2.6月11日至7月23日15时，北京市累计报告确诊病例335例，已出院270例，达80.6%，现有在院65例，无危重病例、重症病例，无疑似病例，尚在观察的无症状感染者","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367959668909148160&from=kuake_xxx"},{"ftime":"07月23日 16:59","wx_name":"扬眼","rank_score":1.1278147331914,"img":"","second_cls":"复工","title":"广东、北京、江苏最关注影院复工《唐人街探案3》最受期待","ptime":"1595494796000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367953075775735808&from=kuake_xxx"},{"ftime":"07月23日 16:36","wx_name":"环球网","rank_score":1.1278147331914,"img":"","second_cls":"医院","title":"北京:全市发热门诊24小时开诊 发热患者全进行\u201c1+3\u201d检查","ptime":"1595493406000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367949990949028864&from=kuake_xxx"},{"ftime":"07月23日 13:27","wx_name":"封面新闻","rank_score":0.96696015686998,"img":"","second_cls":"高速","title":"除了京雄高速北京段 下半年还将推进哪些项目建设?交通运输部回应","ptime":"1595482071000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367925709336740864&from=kuake_xxx"},{"ftime":"07月23日 11:07","wx_name":"新京报","rank_score":0.87268154157516,"img":"","second_cls":"科普","title":"北京开放54家博物馆全面实行实名制预约 这里有一份参观指南","ptime":"1595473627000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367908306873750528&from=kuake_xxx"},{"ftime":"07月23日 19:10","wx_name":"新浪财经","rank_score":0.85115903125,"img":"","second_cls":"","title":"北京九日新增205例确诊；中芯国际19天极速上会丨一周热点回顾","ptime":"1595502600000","content":"原标题：北京九日新增205例确诊； 中芯国际 19天极速上会丨一周热点回顾 来源：第一财经5 月主要经济指标持续改善国家统计局6月15日发布5月份宏观经济数据，工业、消费、投资等主要经济指标持续改善，经济继续呈现恢复态势。5月份，全国规模以上工业增加值同比增长4.4%，增速比4月份加快0.5个百分点","url":"https://finance.sina.cn/stock/relnews/hk/2020-06-20/detail-iircuyvi9490680.d.html"},{"ftime":"07月23日 08:42","wx_name":"北京发布","rank_score":0.83624067043835,"img":"","second_cls":"官方","title":"北京昨日无新增报告新冠肺炎确诊病例，治愈出院8例","ptime":"1595464948000","content":"7月22日0时至24时，无新增报告本地确诊病例、疑似病例和无症状感染者，治愈出院病例8例；无新增报告境外输入确诊病例、疑似病例和无症状感染者。 6月11日0时至7月22日24时，累计报告本地确诊病例335例，在院79例，治愈出院256例。尚在观察的无症状感染者8例；无新增报告境外输入新冠肺炎确诊病例","url":"http://mp.weixin.qq.com/s?__biz=MzA4NTIyMjMyMw==&mid=2652866552&idx=1&sn=f8bf5a716819d7383203cd7b524aa223"},{"ftime":"07月23日 10:38","wx_name":"环球网","rank_score":0.8290474644964,"img":"","second_cls":"医保","title":"互联网诊疗落地北京大学肿瘤医院并实现医保对接","ptime":"1595471929000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367905589914765312&from=kuake_xxx"},{"ftime":"07月23日 07:50","wx_name":"北京日报客户端","rank_score":0.7108045698726,"img":"","second_cls":"社保","title":"北京系列政策为企业\u201c输血\u201d，企业社保费减免全年将超千亿元","ptime":"1595461852000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367882933064696832&from=kuake_xxx"},{"ftime":"07月23日 07:34","wx_name":"中国经济网","rank_score":0.7108045698726,"img":"","second_cls":"科普","title":"一文读懂!北京市场租房补贴政策相关问题解答","ptime":"1595460840000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367883616723672064&from=kuake_xxx"},{"ftime":"07月23日 13:36","wx_name":"新浪科技","rank_score":0.62568010150411,"img":"","second_cls":"","title":"北京新增51例，一架航班输入17例\u2026疫情会否反弹？","ptime":"1595482560000","content":"原标题：北京新增51例，一架航班输入17例\u2026疫情会否反弹？中新网客户端北京6月15日电(记者 张尼)近日，北京的新发地出现数十个新冠肺炎本土确诊病例，让人们原本放松的神经再度紧绷。疫情的变化给所有人敲响警钟：狡猾的病毒没有彻底离开，它甚至可能以一种更隐蔽的方式存在于我们身边。6月13日，北京新发地批","url":"https://tech.sina.cn/2020-06-15/detail-iirczymk7000503.d.html"},{"ftime":"07月23日 12:22","wx_name":"新浪新闻","rank_score":0.5943960964289,"img":"","second_cls":"","title":"北京市新型冠状病毒肺炎疫情防控工作新闻发布会(7月23日)","ptime":"1595478179000","content":"2020.07.23 12:22:59 北京市政府网站原标题：北京市新型冠状病毒肺炎疫情防控工作新闻发布会(7月23日)来源：视频北京北京市新型冠状病毒肺炎疫情防控工作新闻发布会(7月23日)发布时间：2020-07-23北京市人民政府新闻办公室于2020年7月23日下午4点，在北京市人民政府新闻办","url":"https://news.sina.cn/gn/2020-07-23/detail-iivhuipn4637353.d.html"},{"ftime":"07月23日 11:17","wx_name":"北方网","rank_score":0.56467629160746,"img":"","second_cls":"辟谣","title":"辟谣!\u201c网传北京某小区出现确诊病例\u201d不实","ptime":"1595474272000","url":"http://economy.enorth.com.cn/system/2020/07/23/050301941.shtml"},{"ftime":"07月23日 06:07","wx_name":"时光小日记","rank_score":0.51637861399568,"img":"","second_cls":"公交","title":"北京公交车身创意设计获奖作品公示","ptime":"1595455620000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367870425172021248&from=kuake_xxx"},{"ftime":"07月23日 05:34","wx_name":"时光小日记","rank_score":0.4905596832959,"img":"","second_cls":"","title":"北京市7月21日无新增确诊病例 治愈出院患者17例","ptime":"1595453640000","content":"7月21日北京市无新增新冠肺炎确诊病例，治愈出院17例。截至7月21日24时，全市已连续16天无新增报告确诊病例。目前，全市所有街乡均为低风险地区。 7月21日0时至24时，本市无新增报告本地确诊病例、疑似病例和无症状感染者，治愈出院病例17例；无新增报告境外输入确诊病例、疑似病例和无症状感染者。 ","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367865978781965312&from=kuake_xxx"},{"ftime":"07月22日 22:48","wx_name":"央广网","rank_score":1.53425,"img":"","second_cls":"公交","title":"\u201c糊涂\u201d母女两度走散 北京公交民警地铁1号线首尾联动助其团聚","ptime":"1595429280000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367815876220558336&from=kuake_xxx"},{"ftime":"07月22日 22:00","wx_name":"北京日报客户端","rank_score":1.53425,"img":"","second_cls":"复工","title":"复工进入倒计时！北京影院准备就绪，请观众入场","ptime":"1595426454000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367808697797188608&from=kuake_xxx"},{"ftime":"07月22日 18:36","wx_name":"北京税务","rank_score":1.3966745921875,"img":"","second_cls":"社保","title":"针对中小微企业的社保费优惠政策是如何规定的?","ptime":"1595414186000","url":"http://mp.weixin.qq.com/s?__biz=MzAxNTA1Njc4Mw==&mid=2650848191&idx=2&sn=153113144487749b535ef6a2f7d09ad9"},{"ftime":"07月22日 18:17","wx_name":"北京发布","rank_score":1.3966745921875,"img":"","second_cls":"复工","title":"朝阳区综合施策，助力文化企业复工达产","ptime":"1595413056000","url":"http://mp.weixin.qq.com/s?__biz=MzA4NTIyMjMyMw==&mid=2652866539&idx=2&sn=b3348da54e16518b3304950e470d1900"},{"ftime":"07月22日 20:59","wx_name":"海峡军情","rank_score":1.384660625,"img":"","second_cls":"辟谣","title":"谣言不攻自破，那些想看北京笑话的人失望了！","ptime":"1595422758000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367800947490954240&from=kuake_xxx"},{"ftime":"07月22日 19:10","wx_name":"新京报","rank_score":1.31542759375,"img":"","second_cls":"公告","title":"北京高院发布涉中国银行\u201c原油宝\u201d事件民事诉讼案件集中管辖公告","ptime":"1595416201000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367787702438855680&from=kuake_xxx"},{"ftime":"07月22日 17:36","wx_name":"北京日报客户端","rank_score":1.1871734033594,"img":"","second_cls":"公交","title":"北京公交车身图案设计征集结束，获奖作品来了","ptime":"1595410603000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367775456484656128&from=kuake_xxx"},{"ftime":"07月22日 17:32","wx_name":"新华社","rank_score":1.1871734033594,"img":"","second_cls":"官方","title":"北京连续16天无新增报告本地确诊病例,所有街乡均为低风险地区","ptime":"1595410373000","content":" [简介]7月22日下午，北京市新型冠状病毒肺炎疫情防控工作第159场新闻发布会上，北京市政府新闻发言人徐和建介绍，北京已连续16天无新增报告本地确诊病例，全市所有街乡均为低风险地区。 记者：王普","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367777587293848576&from=kuake_xxx"},{"ftime":"07月22日 16:40","wx_name":"中国商报","rank_score":1.1278147331914,"img":"","second_cls":"学校","title":"北京幼儿园体罚孩子的，警告、罚款","ptime":"1595407223000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367768368599535616&from=kuake_xxx"},{"ftime":"07月22日 14:07","wx_name":"北京商报","rank_score":1.0178527967052,"img":"","second_cls":"官方","title":"新疆昨新增9例本土病例，北京连续16个0","ptime":"1595398064000","content":"7月21日0-24时，31个省（自治区、直辖市）和新疆生产建设兵团报告新增确诊病例14例，其中境外输入病例5例（上海2例，广东2例，云南1例），本土病例9例（均在新疆）；无新增死亡病例；无新增疑似病例。 当日新增治愈出院病例23例，解除医学观察的密切接触者434人，重症病例较前一日减少1例。境外输入","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367749160077628416&from=kuake_xxx"},{"ftime":"07月22日 19:30","wx_name":"时光小日记","rank_score":1.00591521875,"img":"","second_cls":"公告","title":"北京一小区保安检查出入证遭业主暴打昏迷不醒 警方通报:已刑拘","ptime":"1595417400000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367789983771137024&from=kuake_xxx"},{"ftime":"07月22日 22:58","wx_name":"新浪新闻","rank_score":0.99275,"img":"","second_cls":"","title":"北京新增新冠肺炎确诊病例36例 社区防控进入战时状态","ptime":"1595429880000","content":"原标题：北京新增新冠肺炎确诊病例36例 社区防控进入战时状态据新华社电 15日下午，在北京市新型冠状病毒肺炎疫情防控工作新闻发布会上，北京市疾控中心副主任庞星火介绍，6月14日0时至24时，北京市新增新冠肺炎确诊病例36例，已完成流调34例，均与新发地市场有关，还有2例正在流调中。发布会上，北京市委","url":"https://news.sina.cn/2020-06-16/detail-iirczymk7219125.d.html"},{"ftime":"07月22日 13:20","wx_name":"北京旅游网","rank_score":0.96696015686998,"img":"","second_cls":"官方","title":"北京新增报告本地确诊病例1例!又一区中风险地区\u201c清零\u201d","ptime":"1595395200000","content":"据国家卫生健康委员会消息，7月1日0\u201424时，31个省（自治区、直辖市）和新疆生产建设兵团报告新增确诊病例3例，其中境外输入病例2例（上海1例，广东1例），本土病例1例（在北京）；无新增死亡病例；无新增疑似病例。 据北京市卫生健康委员会消息，7月1日0时至24时，新增报告本地确诊病例1例、无症状感染","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367747793074259968&from=kuake_xxx"},{"ftime":"07月22日 13:16","wx_name":"北京旅游网","rank_score":0.96696015686998,"img":"","second_cls":"官方","title":"北京市新冠肺炎疫情防控工作第138场新闻发布会","ptime":"1595394960000","content":"北京市政府新闻办组织召开北京市新冠肺炎疫情防控工作第138场新闻发布会，市委宣传部副部长、市政府新闻办主任、市政府新闻发言人徐和建主持。市交通委副主任、新闻发言人容军，大兴区副区长何景涛，市疾控中心副主任庞星火，中国疾病预防控制中心流行病学首席专家吴尊友出席发布会，通报北京最新疫情，发布防控有关信息","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367747793126688768&from=kuake_xxx"},{"ftime":"07月22日 21:44","wx_name":"新浪科技","rank_score":0.9431125,"img":"","second_cls":"","title":"31省区市昨日新增本土病例33例，均与北京有关联","ptime":"1595425440000","content":"原标题：31省区市昨日新增本土病例33例，均与北京有关联国家卫健委6月17日早间通报，6月16日0\u201424时，31个省（自治区、直辖市）和新疆生产建设兵团报告新增确诊病例44例，其中境外输入病例11例（甘肃10例，四川1例），本土病例33例（北京31例，河北1例，浙江1例）；无新增死亡病例；新增疑似病","url":"https://tech.sina.cn/2020-06-17/detail-iircuyvi8895030.d.html"},{"ftime":"07月22日 17:45","wx_name":"中教云","rank_score":0.90783848492187,"img":"","second_cls":"学校","title":"乘风破浪的：北京中小学教师数字教育培训计划全面启动","ptime":"1595411143000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367776589793991680&from=kuake_xxx"},{"ftime":"07月22日 17:00","wx_name":"凤凰网房产","rank_score":0.90783848492187,"img":"","second_cls":"科普","title":"想在北京购房置业,一份廊坊购房指南请查收!","ptime":"1595408422000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367778889665092608&from=kuake_xxx"},{"ftime":"07月22日 13:23","wx_name":"新浪网","rank_score":0.62568010150411,"img":"","second_cls":"","title":"17年后重启，北京小汤山医院出现首例确诊病例","ptime":"1595395380000","content":" 环球网03月17日 18:29 关注【来源：中国新闻网】为做好境外输入人员疫情防控工作，尽力保证市民正常工作生活秩序，时隔17年，北京小汤山医院于3月16日再次启用，主要用于境外来（返）京人员中需筛查人员、疑似病例及轻型、普通型确诊患者治疗。从3月16日17时到24时，小汤山医院共接收来自机场待筛","url":"https://k.sina.cn/article_1686546714_6486a91a020010cgg.html"},{"ftime":"07月22日 10:03","wx_name":"央广网","rank_score":0.53644247702708,"img":"","second_cls":"科普","title":"北京市卫健委:要坚持适时、科学佩戴口罩","ptime":"1595383380000","url":"https://mparticle.uc.cn/article_org.html?uc_param_str=frdnsnpfvecpntnwprdssskt#!wm_cid=367727412900795392!!wm_id=e05eb8d04c624373ab89a82af80b727e"},{"ftime":"07月22日 00:00","wx_name":"知乎专栏","rank_score":0.32118792677265,"img":"","second_cls":"科普","title":"会被隔离吗？北京区块链人未来一月跑会指南","ptime":"1595347200000","url":"https://zhuanlan.zhihu.com/p/148959006"},{"ftime":"07月21日 21:35","wx_name":"北京税务","rank_score":1.6290125,"img":"","second_cls":"税务","title":"《网络办税联盟》告诉你网上便捷办税！","ptime":"1595338500000","url":"http://mp.weixin.qq.com/s?__biz=MzAxNTA1Njc4Mw==&mid=2650848138&idx=3&sn=08388a3d37650abc3c0f1bcae05b83e1"},{"ftime":"07月21日 15:19","wx_name":"北京发布","rank_score":1.1974738784768,"img":"","second_cls":"公交","title":"7月26日起25条公交线路优化调整","ptime":"1595315992000","url":"http://mp.weixin.qq.com/s?__biz=MzA4NTIyMjMyMw==&mid=2652866369&idx=2&sn=7bb0482e8e9c4a90a76636a38963ba22"},{"ftime":"07月21日 17:26","wx_name":"中国新闻网","rank_score":1.0475059441406,"img":"","second_cls":"科普","title":"北京官方:\u201c大考未到交卷时\u201d 适时科学戴口罩","ptime":"1595323570000","url":"https://mparticle.uc.cn/article_org.html?uc_param_str=frdnsnpfvecpntnwprdssskt#!wm_cid=367596671718134784!!wm_id=857dfb71acf84cf1b6119ca350c99661"},{"ftime":"07月21日 16:36","wx_name":"经济日报","rank_score":0.99513064693359,"img":"","second_cls":"科普","title":"北京卫健委提醒市民科学佩戴口罩丨权威发布","ptime":"1595320580000","url":"https://mparticle.uc.cn/article_org.html?uc_param_str=frdnsnpfvecpntnwprdssskt#!wm_cid=367593608194297856!!wm_id=e190e792fb3a40318bbb9f46bcf1a77d"},{"ftime":"07月21日 16:30","wx_name":"环球网","rank_score":0.99513064693359,"img":"","second_cls":"公交","title":"北京:在人员密集场所或乘坐公共交通等情况下必须戴口罩","ptime":"1595320246000","url":"https://3w.huanqiu.com/a/67c0c8/3z911Vdkc9C?agt=21"},{"ftime":"07月21日 19:03","wx_name":"每经网","rank_score":0.85115903125,"img":"","second_cls":"公告","title":"交通部最新通知!各地省际旅游客运可与跨省团队游业务同步恢复,北京新疆需按疫情防控有关部署执行","ptime":"1595329419000","url":"http://www.nbd.com.cn/articles/2020-07-21/1465159.html"},{"ftime":"07月21日 18:13","wx_name":"中国政府网","rank_score":0.8086010796875,"img":"","second_cls":"公告","title":"北京市电影局关于在疫情防控常态化条件下有序推进电影院恢复开放的通知","ptime":"1595326380000","url":"http://www.gov.cn/govweb/xinwen/2020-07/21/content_5528751.htm"},{"ftime":"07月21日 17:35","wx_name":"封面新闻","rank_score":0.76817102570312,"img":"","second_cls":"公交","title":"北京卫健委:乘坐公共交通工具仍须佩戴口罩","ptime":"1595324100000","url":"http://www.thecover.cn/news/4816487"},{"ftime":"07月21日 17:10","wx_name":"本地宝","rank_score":0.76817102570312,"img":"","second_cls":"复工","title":"2020北京电影院复工时间及疫情防控要求措施","ptime":"1595322600000","url":"http://bj.bendibao.com/news/2020721/277780.shtm"},{"ftime":"07月21日 15:37","wx_name":"中公网","rank_score":0.69327435069707,"img":"","second_cls":"公告","title":"2020首都医科大学附属北京儿童医院招聘2人公告","ptime":"1595317079000","url":"http://www.offcn.com/ylws/2020/0721/193368.html"},{"ftime":"07月21日 08:04","wx_name":"新浪网","rank_score":0.48413933551694,"img":"","second_cls":"地铁","title":"北京：患流感戴口罩、公共场所禁赤膊、地铁禁食等正式入法！","ptime":"1595289840000","url":"https://k.sina.cn/article_1686546714_6486a91a020011xq7.html"},{"ftime":"07月21日 07:34","wx_name":"新浪科技","rank_score":0.45993236874109,"img":"","second_cls":"公告","title":"海南航空发布疫情防控期间涉及北京进出港国内航班票务处理的通知","ptime":"1595288040000","url":"https://tech.sina.cn/2020-06-17/detail-iircuyvi8970049.d.html"},{"ftime":"07月21日 03:55","wx_name":"新浪科技","rank_score":0.37461778891693,"img":"","second_cls":"公告","title":"同一餐馆8人确诊！北京通报18日确诊病例详情→","ptime":"1595274900000","url":"https://tech.sina.cn/2020-06-19/detail-iircuyvi9410254.d.html"},{"ftime":"07月21日 00:00","wx_name":"北京市卫生健康委员会","rank_score":0.32118792677265,"img":"","second_cls":"公告","title":"关于首都医科大学附属北京佑安医院等3家医院血液透析室变更登记有关工作的通知","ptime":"1595260800000","url":"http://wjw.beijing.gov.cn/zwgk_20040/zxgk/202007/t20200721_1954253.html"},{"ftime":"07月20日 17:56","wx_name":"北京税务","rank_score":1.3268408625781,"img":"","second_cls":"复工","title":"听说电影院要复工啦？！好政策顶起来~","ptime":"1595238990000","url":"http://mp.weixin.qq.com/s?__biz=MzAxNTA1Njc4Mw==&mid=2650848048&idx=3&sn=66dbe3fed6575be0655edfda574c7886"},{"ftime":"07月20日 17:56","wx_name":"北京税务","rank_score":1.3268408625781,"img":"","second_cls":"社保","title":"阶段性减免企业社保费政策延长后，很多企业都在问\u2026\u2026","ptime":"1595238990000","url":"http://mp.weixin.qq.com/s?__biz=MzAxNTA1Njc4Mw==&mid=2650848048&idx=1&sn=5114f3b7649e2a68ac27cfb0c24287f1"},{"ftime":"07月20日 22:22","wx_name":"启瑞谈之论之","rank_score":0.99275,"img":"","second_cls":"学校","title":"继北京之后,又有一地出现疫情反弹,学生:9月还能正常开学吗?","ptime":"1595254965000","url":"https://mparticle.uc.cn/article.html?uc_param_str=frdnsnpfvecpntnwprdssskt#!wm_aid=16b5f8083ba94a78ba6f45324bb83f20!!wm_id=2f35198b5f1948069977cadb2c7eafdc"},{"ftime":"07月20日 09:42","wx_name":"中国经济网","rank_score":0.69493684523963,"img":"","second_cls":"医院","title":"北京新冠肺炎高风险人员收治定点医院高风险患者清零","ptime":"1595209320000","url":"http://district.ce.cn/newarea/roll/202007/20/t20200720_35358933.shtml"},{"ftime":"07月20日 15:40","wx_name":"北京旅游网","rank_score":0.69327435069707,"img":"","second_cls":"公告","title":"速看!北京疫情最新通报!","ptime":"1595230800000","url":"http://3g.visitbeijing.com.cn/uczzd/a-XEP4E1C9CF78702B7F6CD7"},{"ftime":"07月20日 14:46","wx_name":"北京旅游网","rank_score":0.65861063316222,"img":"","second_cls":"公告","title":"北京通报两起聚集性疫情详情:存在宿舍、更衣室等区域不戴口罩情况","ptime":"1595227560000","url":"https://mparticle.uc.cn/article_org.html?uc_param_str=frdnsnpfvecpntnwprdssskt#!wm_cid=367392006495802368!!wm_id=68d00510526447f7ba1630b56bd53698"},{"ftime":"07月20日 14:43","wx_name":"北京旅游网","rank_score":0.65861063316222,"img":"","second_cls":"公告","title":"北京通报此前两起聚集性疫情详情!","ptime":"1595227380000","url":"http://3g.visitbeijing.com.cn/uczzd/a-XEP4P72143A694CA9D02B7"},{"ftime":"07月20日 14:03","wx_name":"北京旅游网","rank_score":0.65861063316222,"img":"","second_cls":"公告","title":"北京通报2例特殊病例!出现症状后自行服药","ptime":"1595224980000","url":"https://mparticle.uc.cn/article_org.html?uc_param_str=frdnsnpfvecpntnwprdssskt#!wm_cid=367390016843810816!!wm_id=68d00510526447f7ba1630b56bd53698"},{"ftime":"07月20日 00:00","wx_name":"千龙新闻网","rank_score":0.32118792677265,"img":"","second_cls":"科普","title":"北京疫情防控级别调至三级后日常生活如何常态化?一文读懂","ptime":"1595174400000","url":"http://beijing.qianlong.com/2020/0720/4451316.shtml"},{"ftime":"07月19日 15:51","wx_name":"北京发布","rank_score":1.1974738784768,"img":"","second_cls":"公告","title":"最新通知 | 北京教育系统不组织、不接待各类夏令营等聚集性活动","ptime":"1595145069000","url":"http://mp.weixin.qq.com/s?__biz=MzA4NTIyMjMyMw==&mid=2652866198&idx=1&sn=65835cb6acab6bd052af59d04d421ad6"},{"ftime":"07月18日 23:44","wx_name":"北京税务","rank_score":1.805,"img":"","second_cls":"社保","title":"延长阶段性减免企业社保费实施期限，具体政策如何规定？","ptime":"1595087081000","url":"http://mp.weixin.qq.com/s?__biz=MzAxNTA1Njc4Mw==&mid=2650847981&idx=1&sn=07d1da44f9caf7f391ee4bfd9a995c24"},{"ftime":"07月18日 20:50","wx_name":"北京发布","rank_score":1.547561875,"img":"","second_cls":"科普","title":"中国医学科学院肿瘤医院：努力做好疫情防控期间肿瘤患者诊疗工作","ptime":"1595076630000","url":"http://mp.weixin.qq.com/s?__biz=MzA4NTIyMjMyMw==&mid=2652866176&idx=3&sn=288e63bd730ecd26a2e2f60b4baca34b"},{"ftime":"07月17日 21:09","wx_name":"北京税务","rank_score":1.6290125,"img":"","second_cls":"税务","title":"北京税务邀您参与~","ptime":"1594991398000","url":"http://mp.weixin.qq.com/s?__biz=MzAxNTA1Njc4Mw==&mid=2650847980&idx=1&sn=2495bf01a9e8782b7dea904bda51d2cd"}],"life":[{"ftime":"07月24日 10:44","wx_name":"北京旅游网","rank_score":0.8290474644964,"img":"","second_cls":"医院","title":"北京一诊所擅自接诊发热患者,停业整顿、行拘","ptime":"1595558640000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=368087007823398912&from=kuake_xxx"},{"ftime":"07月24日 10:17","wx_name":"环球网","rank_score":0.8290474644964,"img":"","second_cls":"复工","title":"影业复工!北京电影院7月24日恢复营业","ptime":"1595557030000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=368083082990846976&from=kuake_xxx"},{"ftime":"07月24日 09:17","wx_name":"找法网","rank_score":0.50962035317573,"img":"","second_cls":"社保","title":"在北京办的社保想增加一家医院","ptime":"1595553479000","url":"http://china.findlaw.cn/ask/wenda_10618613.html"},{"ftime":"07月23日 16:59","wx_name":"扬眼","rank_score":1.1278147331914,"img":"","second_cls":"复工","title":"广东、北京、江苏最关注影院复工《唐人街探案3》最受期待","ptime":"1595494796000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367953075775735808&from=kuake_xxx"},{"ftime":"07月23日 16:36","wx_name":"环球网","rank_score":1.1278147331914,"img":"","second_cls":"医院","title":"北京:全市发热门诊24小时开诊 发热患者全进行\u201c1+3\u201d检查","ptime":"1595493406000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367949990949028864&from=kuake_xxx"},{"ftime":"07月23日 10:38","wx_name":"环球网","rank_score":0.8290474644964,"img":"","second_cls":"医保","title":"互联网诊疗落地北京大学肿瘤医院并实现医保对接","ptime":"1595471929000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367905589914765312&from=kuake_xxx"},{"ftime":"07月23日 07:50","wx_name":"北京日报客户端","rank_score":0.7108045698726,"img":"","second_cls":"社保","title":"北京系列政策为企业\u201c输血\u201d，企业社保费减免全年将超千亿元","ptime":"1595461852000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367882933064696832&from=kuake_xxx"},{"ftime":"07月22日 22:00","wx_name":"北京日报客户端","rank_score":1.53425,"img":"","second_cls":"复工","title":"复工进入倒计时！北京影院准备就绪，请观众入场","ptime":"1595426454000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367808697797188608&from=kuake_xxx"},{"ftime":"07月22日 18:36","wx_name":"北京税务","rank_score":1.3966745921875,"img":"","second_cls":"社保","title":"针对中小微企业的社保费优惠政策是如何规定的?","ptime":"1595414186000","url":"http://mp.weixin.qq.com/s?__biz=MzAxNTA1Njc4Mw==&mid=2650848191&idx=2&sn=153113144487749b535ef6a2f7d09ad9"},{"ftime":"07月22日 18:17","wx_name":"北京发布","rank_score":1.3966745921875,"img":"","second_cls":"复工","title":"朝阳区综合施策，助力文化企业复工达产","ptime":"1595413056000","url":"http://mp.weixin.qq.com/s?__biz=MzA4NTIyMjMyMw==&mid=2652866539&idx=2&sn=b3348da54e16518b3304950e470d1900"},{"ftime":"07月22日 16:40","wx_name":"中国商报","rank_score":1.1278147331914,"img":"","second_cls":"学校","title":"北京幼儿园体罚孩子的，警告、罚款","ptime":"1595407223000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367768368599535616&from=kuake_xxx"},{"ftime":"07月22日 17:45","wx_name":"中教云","rank_score":0.90783848492187,"img":"","second_cls":"学校","title":"乘风破浪的：北京中小学教师数字教育培训计划全面启动","ptime":"1595411143000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367776589793991680&from=kuake_xxx"},{"ftime":"07月21日 21:35","wx_name":"北京税务","rank_score":1.6290125,"img":"","second_cls":"税务","title":"《网络办税联盟》告诉你网上便捷办税！","ptime":"1595338500000","url":"http://mp.weixin.qq.com/s?__biz=MzAxNTA1Njc4Mw==&mid=2650848138&idx=3&sn=08388a3d37650abc3c0f1bcae05b83e1"},{"ftime":"07月21日 17:10","wx_name":"本地宝","rank_score":0.76817102570312,"img":"","second_cls":"复工","title":"2020北京电影院复工时间及疫情防控要求措施","ptime":"1595322600000","url":"http://bj.bendibao.com/news/2020721/277780.shtm"},{"ftime":"07月20日 17:56","wx_name":"北京税务","rank_score":1.3268408625781,"img":"","second_cls":"复工","title":"听说电影院要复工啦？！好政策顶起来~","ptime":"1595238990000","url":"http://mp.weixin.qq.com/s?__biz=MzAxNTA1Njc4Mw==&mid=2650848048&idx=3&sn=66dbe3fed6575be0655edfda574c7886"},{"ftime":"07月20日 17:56","wx_name":"北京税务","rank_score":1.3268408625781,"img":"","second_cls":"社保","title":"阶段性减免企业社保费政策延长后，很多企业都在问\u2026\u2026","ptime":"1595238990000","url":"http://mp.weixin.qq.com/s?__biz=MzAxNTA1Njc4Mw==&mid=2650848048&idx=1&sn=5114f3b7649e2a68ac27cfb0c24287f1"},{"ftime":"07月20日 22:22","wx_name":"启瑞谈之论之","rank_score":0.99275,"img":"","second_cls":"学校","title":"继北京之后,又有一地出现疫情反弹,学生:9月还能正常开学吗?","ptime":"1595254965000","url":"https://mparticle.uc.cn/article.html?uc_param_str=frdnsnpfvecpntnwprdssskt#!wm_aid=16b5f8083ba94a78ba6f45324bb83f20!!wm_id=2f35198b5f1948069977cadb2c7eafdc"},{"ftime":"07月20日 09:42","wx_name":"中国经济网","rank_score":0.69493684523963,"img":"","second_cls":"医院","title":"北京新冠肺炎高风险人员收治定点医院高风险患者清零","ptime":"1595209320000","url":"http://district.ce.cn/newarea/roll/202007/20/t20200720_35358933.shtml"},{"ftime":"07月18日 23:44","wx_name":"北京税务","rank_score":1.805,"img":"","second_cls":"社保","title":"延长阶段性减免企业社保费实施期限，具体政策如何规定？","ptime":"1595087081000","url":"http://mp.weixin.qq.com/s?__biz=MzAxNTA1Njc4Mw==&mid=2650847981&idx=1&sn=07d1da44f9caf7f391ee4bfd9a995c24"},{"ftime":"07月17日 21:09","wx_name":"北京税务","rank_score":1.6290125,"img":"","second_cls":"税务","title":"北京税务邀您参与~","ptime":"1594991398000","url":"http://mp.weixin.qq.com/s?__biz=MzAxNTA1Njc4Mw==&mid=2650847980&idx=1&sn=2495bf01a9e8782b7dea904bda51d2cd"}],"rumour":[{"ftime":"07月24日 08:00","wx_name":"凤凰网房产","rank_score":0.5721646692473,"img":"","second_cls":"辟谣","title":"是套路还是真优惠?北京这些优惠楼盘真相了","ptime":"1595548802000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=368073130740030464&from=kuake_xxx"},{"ftime":"07月23日 11:17","wx_name":"北方网","rank_score":0.56467629160746,"img":"","second_cls":"辟谣","title":"辟谣!\u201c网传北京某小区出现确诊病例\u201d不实","ptime":"1595474272000","url":"http://economy.enorth.com.cn/system/2020/07/23/050301941.shtml"},{"ftime":"07月22日 20:59","wx_name":"海峡军情","rank_score":1.384660625,"img":"","second_cls":"辟谣","title":"谣言不攻自破，那些想看北京笑话的人失望了！","ptime":"1595422758000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367800947490954240&from=kuake_xxx"}],"traffic":[{"ftime":"07月24日 10:56","wx_name":"北京旅游网","rank_score":0.8290474644964,"img":"","second_cls":"地铁","title":"今年明年北京有哪些地铁会开通？快看看有你家附近吗？","ptime":"1595559374000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=368087451740145664&from=kuake_xxx"},{"ftime":"07月24日 10:41","wx_name":"北京旅游网","rank_score":0.8290474644964,"img":"","second_cls":"地铁","title":"北京又一公园走红,有湖有桥还有沙滩,没有门票,地铁4号线直达","ptime":"1595558460000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=368085867943695360&from=kuake_xxx"},{"ftime":"07月23日 13:27","wx_name":"封面新闻","rank_score":0.96696015686998,"img":"","second_cls":"高速","title":"除了京雄高速北京段 下半年还将推进哪些项目建设?交通运输部回应","ptime":"1595482071000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367925709336740864&from=kuake_xxx"},{"ftime":"07月23日 06:07","wx_name":"时光小日记","rank_score":0.51637861399568,"img":"","second_cls":"公交","title":"北京公交车身创意设计获奖作品公示","ptime":"1595455620000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367870425172021248&from=kuake_xxx"},{"ftime":"07月22日 22:48","wx_name":"央广网","rank_score":1.53425,"img":"","second_cls":"公交","title":"\u201c糊涂\u201d母女两度走散 北京公交民警地铁1号线首尾联动助其团聚","ptime":"1595429280000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367815876220558336&from=kuake_xxx"},{"ftime":"07月22日 17:36","wx_name":"北京日报客户端","rank_score":1.1871734033594,"img":"","second_cls":"公交","title":"北京公交车身图案设计征集结束，获奖作品来了","ptime":"1595410603000","url":"https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=367775456484656128&from=kuake_xxx"},{"ftime":"07月21日 15:19","wx_name":"北京发布","rank_score":1.1974738784768,"img":"","second_cls":"公交","title":"7月26日起25条公交线路优化调整","ptime":"1595315992000","url":"http://mp.weixin.qq.com/s?__biz=MzA4NTIyMjMyMw==&mid=2652866369&idx=2&sn=7bb0482e8e9c4a90a76636a38963ba22"},{"ftime":"07月21日 16:30","wx_name":"环球网","rank_score":0.99513064693359,"img":"","second_cls":"公交","title":"北京:在人员密集场所或乘坐公共交通等情况下必须戴口罩","ptime":"1595320246000","url":"https://3w.huanqiu.com/a/67c0c8/3z911Vdkc9C?agt=21"},{"ftime":"07月21日 17:35","wx_name":"封面新闻","rank_score":0.76817102570312,"img":"","second_cls":"公交","title":"北京卫健委:乘坐公共交通工具仍须佩戴口罩","ptime":"1595324100000","url":"http://www.thecover.cn/news/4816487"},{"ftime":"07月21日 08:04","wx_name":"新浪网","rank_score":0.48413933551694,"img":"","second_cls":"地铁","title":"北京：患流感戴口罩、公共场所禁赤膊、地铁禁食等正式入法！","ptime":"1595289840000","url":"https://k.sina.cn/article_1686546714_6486a91a020011xq7.html"}]}
         * tab : [{"name":"全部","key":"whole"},{"name":"疫情","key":"epidemic"},{"name":"交通","key":"traffic"},{"name":"办事","key":"life"},{"name":"公告","key":"govern"},{"name":"辟谣","key":"rumour"}]
         * city : 北京
         * district : 北京
         * query : 北京
         */

        private ResultBean result;
        private String city;
        private String district;
        private String query;
        private List<TabBean> tab;

        public ResultBean getResult() {
            return result;
        }

        public void setResult(ResultBean result) {
            this.result = result;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getDistrict() {
            return district;
        }

        public void setDistrict(String district) {
            this.district = district;
        }

        public String getQuery() {
            return query;
        }

        public void setQuery(String query) {
            this.query = query;
        }

        public List<TabBean> getTab() {
            return tab;
        }

        public void setTab(List<TabBean> tab) {
            this.tab = tab;
        }

        public static class ResultBean {
            private List<GovernBean> govern;
            private List<EpidemicBean> epidemic;
            private List<WholeBean> whole;
            private List<LifeBean> life;
            private List<RumourBean> rumour;
            private List<TrafficBean> traffic;

            @Override
            public String toString() {
                return "ResultBean{" +
                        "govern=" + govern +
                        ", epidemic=" + epidemic +
                        ", whole=" + whole +
                        ", life=" + life +
                        ", rumour=" + rumour +
                        ", traffic=" + traffic +
                        '}';
            }

            public List<GovernBean> getGovern() {
                return govern;
            }

            public void setGovern(List<GovernBean> govern) {
                this.govern = govern;
            }

            public List<EpidemicBean> getEpidemic() {
                return epidemic;
            }

            public void setEpidemic(List<EpidemicBean> epidemic) {
                this.epidemic = epidemic;
            }

            public List<WholeBean> getWhole() {
                return whole;
            }

            public void setWhole(List<WholeBean> whole) {
                this.whole = whole;
            }

            public List<LifeBean> getLife() {
                return life;
            }

            public void setLife(List<LifeBean> life) {
                this.life = life;
            }

            public List<RumourBean> getRumour() {
                return rumour;
            }

            public void setRumour(List<RumourBean> rumour) {
                this.rumour = rumour;
            }

            public List<TrafficBean> getTraffic() {
                return traffic;
            }

            public void setTraffic(List<TrafficBean> traffic) {
                this.traffic = traffic;
            }

            public static class GovernBean {
                /**
                 * ftime : 07月24日 10:41
                 * wx_name : 北京旅游网
                 * rank_score : 0.8290474644964
                 * img :
                 * second_cls : 公告
                 * title : 北京通报确诊病例详情:有家教、保安、餐饮店经营人员……
                 * ptime : 1595558460000
                 * url : https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=368085867106928640&from=kuake_xxx
                 */

                private String ftime;
                private String wx_name;
                private double rank_score;
                private String img;
                private String second_cls;
                private String title;
                private String ptime;
                private String url;

                public String getFtime() {
                    return ftime;
                }

                public void setFtime(String ftime) {
                    this.ftime = ftime;
                }

                public String getWx_name() {
                    return wx_name;
                }

                public void setWx_name(String wx_name) {
                    this.wx_name = wx_name;
                }

                public double getRank_score() {
                    return rank_score;
                }

                public void setRank_score(double rank_score) {
                    this.rank_score = rank_score;
                }

                public String getImg() {
                    return img;
                }

                public void setImg(String img) {
                    this.img = img;
                }

                public String getSecond_cls() {
                    return second_cls;
                }

                public void setSecond_cls(String second_cls) {
                    this.second_cls = second_cls;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getPtime() {
                    return ptime;
                }

                public void setPtime(String ptime) {
                    this.ptime = ptime;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                @Override
                public String toString() {
                    return "GovernBean{" +
                            "ftime='" + ftime + '\'' +
                            ", wx_name='" + wx_name + '\'' +
                            ", rank_score=" + rank_score +
                            ", img='" + img + '\'' +
                            ", second_cls='" + second_cls + '\'' +
                            ", title='" + title + '\'' +
                            ", ptime='" + ptime + '\'' +
                            ", url='" + url + '\'' +
                            '}';
                }
            }

            public static class EpidemicBean {
                /**
                 * ftime : 07月24日 09:21
                 * wx_name : 北京发布
                 * rank_score : 0.88025333730353
                 * img :
                 * second_cls : 官方
                 * title : 北京昨日无新增报告新冠肺炎确诊病例，治愈出院14例
                 * ptime : 1595553690000
                 * content : 7月23日0时至24时，无新增报告本地确诊病例、疑似病例和无症状感染者，治愈出院病例14例；无新增报告境外输入确诊病例、疑似病例和无症状感染者。 6月11日0时至7月23日24时，累计报告本地确诊病例335例，在院65例，治愈出院270例。尚在观察的无症状感染者7例；无新增报告境外输入新冠肺炎确诊病
                 * url : http://mp.weixin.qq.com/s?__biz=MzA4NTIyMjMyMw==&mid=2652866620&idx=1&sn=6a079e159ce2a2af3fafa4a674781336
                 */

                private String ftime;
                private String wx_name;
                private double rank_score;
                private String img;
                private String second_cls;
                private String title;
                private String ptime;
                private String content;
                private String url;

                public String getFtime() {
                    return ftime;
                }

                public void setFtime(String ftime) {
                    this.ftime = ftime;
                }

                public String getWx_name() {
                    return wx_name;
                }

                public void setWx_name(String wx_name) {
                    this.wx_name = wx_name;
                }

                public double getRank_score() {
                    return rank_score;
                }

                public void setRank_score(double rank_score) {
                    this.rank_score = rank_score;
                }

                public String getImg() {
                    return img;
                }

                public void setImg(String img) {
                    this.img = img;
                }

                public String getSecond_cls() {
                    return second_cls;
                }

                public void setSecond_cls(String second_cls) {
                    this.second_cls = second_cls;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getPtime() {
                    return ptime;
                }

                public void setPtime(String ptime) {
                    this.ptime = ptime;
                }

                public String getContent() {
                    return content;
                }

                public void setContent(String content) {
                    this.content = content;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                @Override
                public String toString() {
                    return "EpidemicBean{" +
                            "ftime='" + ftime + '\'' +
                            ", wx_name='" + wx_name + '\'' +
                            ", rank_score=" + rank_score +
                            ", img='" + img + '\'' +
                            ", second_cls='" + second_cls + '\'' +
                            ", title='" + title + '\'' +
                            ", ptime='" + ptime + '\'' +
                            ", content='" + content + '\'' +
                            ", url='" + url + '\'' +
                            '}';
                }
            }

            public static class WholeBean {
                /**
                 * ftime : 07月24日 09:21
                 * wx_name : 北京发布
                 * rank_score : 0.88025333730353
                 * img :
                 * second_cls : 官方
                 * title : 北京昨日无新增报告新冠肺炎确诊病例，治愈出院14例
                 * ptime : 1595553690000
                 * content : 7月23日0时至24时，无新增报告本地确诊病例、疑似病例和无症状感染者，治愈出院病例14例；无新增报告境外输入确诊病例、疑似病例和无症状感染者。 6月11日0时至7月23日24时，累计报告本地确诊病例335例，在院65例，治愈出院270例。尚在观察的无症状感染者7例；无新增报告境外输入新冠肺炎确诊病
                 * url : http://mp.weixin.qq.com/s?__biz=MzA4NTIyMjMyMw==&mid=2652866620&idx=1&sn=6a079e159ce2a2af3fafa4a674781336
                 */

                private String ftime;
                private String wx_name;
                private double rank_score;
                private String img;
                private String second_cls;
                private String title;
                private String ptime;
                private String content;
                private String url;

                public String getFtime() {
                    return ftime;
                }

                public void setFtime(String ftime) {
                    this.ftime = ftime;
                }

                public String getWx_name() {
                    return wx_name;
                }

                public void setWx_name(String wx_name) {
                    this.wx_name = wx_name;
                }

                public double getRank_score() {
                    return rank_score;
                }

                public void setRank_score(double rank_score) {
                    this.rank_score = rank_score;
                }

                public String getImg() {
                    return img;
                }

                public void setImg(String img) {
                    this.img = img;
                }

                public String getSecond_cls() {
                    return second_cls;
                }

                public void setSecond_cls(String second_cls) {
                    this.second_cls = second_cls;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getPtime() {
                    return ptime;
                }

                public void setPtime(String ptime) {
                    this.ptime = ptime;
                }

                public String getContent() {
                    return content;
                }

                public void setContent(String content) {
                    this.content = content;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                @Override
                public String toString() {
                    return "WholeBean{" +
                            "ftime='" + ftime + '\'' +
                            ", wx_name='" + wx_name + '\'' +
                            ", rank_score=" + rank_score +
                            ", img='" + img + '\'' +
                            ", second_cls='" + second_cls + '\'' +
                            ", title='" + title + '\'' +
                            ", ptime='" + ptime + '\'' +
                            ", content='" + content + '\'' +
                            ", url='" + url + '\'' +
                            '}';
                }
            }

            public static class LifeBean {
                /**
                 * ftime : 07月24日 10:44
                 * wx_name : 北京旅游网
                 * rank_score : 0.8290474644964
                 * img :
                 * second_cls : 医院
                 * title : 北京一诊所擅自接诊发热患者,停业整顿、行拘
                 * ptime : 1595558640000
                 * url : https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=368087007823398912&from=kuake_xxx
                 */

                private String ftime;
                private String wx_name;
                private double rank_score;
                private String img;
                private String second_cls;
                private String title;
                private String ptime;
                private String url;

                public String getFtime() {
                    return ftime;
                }

                public void setFtime(String ftime) {
                    this.ftime = ftime;
                }

                public String getWx_name() {
                    return wx_name;
                }

                public void setWx_name(String wx_name) {
                    this.wx_name = wx_name;
                }

                public double getRank_score() {
                    return rank_score;
                }

                public void setRank_score(double rank_score) {
                    this.rank_score = rank_score;
                }

                public String getImg() {
                    return img;
                }

                public void setImg(String img) {
                    this.img = img;
                }

                public String getSecond_cls() {
                    return second_cls;
                }

                public void setSecond_cls(String second_cls) {
                    this.second_cls = second_cls;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getPtime() {
                    return ptime;
                }

                public void setPtime(String ptime) {
                    this.ptime = ptime;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                @Override
                public String toString() {
                    return "LifeBean{" +
                            "ftime='" + ftime + '\'' +
                            ", wx_name='" + wx_name + '\'' +
                            ", rank_score=" + rank_score +
                            ", img='" + img + '\'' +
                            ", second_cls='" + second_cls + '\'' +
                            ", title='" + title + '\'' +
                            ", ptime='" + ptime + '\'' +
                            ", url='" + url + '\'' +
                            '}';
                }
            }

            public static class RumourBean {
                /**
                 * ftime : 07月24日 08:00
                 * wx_name : 凤凰网房产
                 * rank_score : 0.5721646692473
                 * img :
                 * second_cls : 辟谣
                 * title : 是套路还是真优惠?北京这些优惠楼盘真相了
                 * ptime : 1595548802000
                 * url : https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=368073130740030464&from=kuake_xxx
                 */

                private String ftime;
                private String wx_name;
                private double rank_score;
                private String img;
                private String second_cls;
                private String title;
                private String ptime;
                private String url;

                public String getFtime() {
                    return ftime;
                }

                public void setFtime(String ftime) {
                    this.ftime = ftime;
                }

                public String getWx_name() {
                    return wx_name;
                }

                public void setWx_name(String wx_name) {
                    this.wx_name = wx_name;
                }

                public double getRank_score() {
                    return rank_score;
                }

                public void setRank_score(double rank_score) {
                    this.rank_score = rank_score;
                }

                public String getImg() {
                    return img;
                }

                public void setImg(String img) {
                    this.img = img;
                }

                public String getSecond_cls() {
                    return second_cls;
                }

                public void setSecond_cls(String second_cls) {
                    this.second_cls = second_cls;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getPtime() {
                    return ptime;
                }

                public void setPtime(String ptime) {
                    this.ptime = ptime;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                @Override
                public String toString() {
                    return "RumourBean{" +
                            "ftime='" + ftime + '\'' +
                            ", wx_name='" + wx_name + '\'' +
                            ", rank_score=" + rank_score +
                            ", img='" + img + '\'' +
                            ", second_cls='" + second_cls + '\'' +
                            ", title='" + title + '\'' +
                            ", ptime='" + ptime + '\'' +
                            ", url='" + url + '\'' +
                            '}';
                }
            }

            public static class TrafficBean {
                /**
                 * ftime : 07月24日 10:56
                 * wx_name : 北京旅游网
                 * rank_score : 0.8290474644964
                 * img :
                 * second_cls : 地铁
                 * title : 今年明年北京有哪些地铁会开通？快看看有你家附近吗？
                 * ptime : 1595559374000
                 * url : https://mparticle.uc.cn/article.html?app=kuake_xxx&uc_param_str=frdnsnpfvecpntnwprdssskt&zzd_from=kuake_xxx&wm_cid=368087451740145664&from=kuake_xxx
                 */

                private String ftime;
                private String wx_name;
                private double rank_score;
                private String img;
                private String second_cls;
                private String title;
                private String ptime;
                private String url;

                public String getFtime() {
                    return ftime;
                }

                public void setFtime(String ftime) {
                    this.ftime = ftime;
                }

                public String getWx_name() {
                    return wx_name;
                }

                public void setWx_name(String wx_name) {
                    this.wx_name = wx_name;
                }

                public double getRank_score() {
                    return rank_score;
                }

                public void setRank_score(double rank_score) {
                    this.rank_score = rank_score;
                }

                public String getImg() {
                    return img;
                }

                public void setImg(String img) {
                    this.img = img;
                }

                public String getSecond_cls() {
                    return second_cls;
                }

                public void setSecond_cls(String second_cls) {
                    this.second_cls = second_cls;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getPtime() {
                    return ptime;
                }

                public void setPtime(String ptime) {
                    this.ptime = ptime;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                @Override
                public String toString() {
                    return "TrafficBean{" +
                            "ftime='" + ftime + '\'' +
                            ", wx_name='" + wx_name + '\'' +
                            ", rank_score=" + rank_score +
                            ", img='" + img + '\'' +
                            ", second_cls='" + second_cls + '\'' +
                            ", title='" + title + '\'' +
                            ", ptime='" + ptime + '\'' +
                            ", url='" + url + '\'' +
                            '}';
                }
            }
        }

        public static class TabBean {
            /**
             * name : 全部
             * key : whole
             */

            private String name;
            private String key;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getKey() {
                return key;
            }

            public void setKey(String key) {
                this.key = key;
            }

            @Override
            public String toString() {
                return "TabBean{" +
                        "name='" + name + '\'' +
                        ", key='" + key + '\'' +
                        '}';
            }
        }
    }
}

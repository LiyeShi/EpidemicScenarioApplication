package com.example.epidemicscenarioapplication.domain;

import java.util.List;

/**
 * @author sly
 * @version 1.0
 * @date 2020/7/3
 * @description com.example.epidemicscenarioapplication.domain
 */
public class WikipediaDataBean {
    @Override
    public String toString() {
        return "DiagnoseDataBean{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    /**
     * code : 200
     * message : SUCCESS
     * data : {"docs":[{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=tx20406001v3lknw&amp;adtag=txxw.op.fybox","image":"https://baike-med-1256891581.file.myqcloud.com/2020023/dec99f30-5843-11ea-b711-37db0881b500_0.jpg","abs":"截至目前，NMPA共批准新冠病毒检测试剂15个，核酸检测试剂10个，抗体检测试剂5个。","title":"15种新冠病毒检测获批，它们是如何检出病毒的？","author_info":{"name":"","icon":"https://baike-med-1256891581.file.myqcloud.com/yidian/production/common/image/source_wicon.png","title":"","department":"","hospital":"腾讯医典医学团队"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=tx204060015beohw&amp;adtag=txxw.op.fybox","image":"","abs":"WHO将病毒传染给十人以上的患者定义为超级传播者。","title":"1个感染10个，\u201c超级传播者\u201d如何防控？","author_info":{"name":"","icon":"https://baike-med-1256891581.file.myqcloud.com/yidian/production/common/image/source_wicon.png","title":"","department":"","hospital":"腾讯医典医学团队"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=tx20406001fhv7y7&amp;adtag=txxw.op.fybox","image":"","abs":"检测权下放可是指较低级别的医疗机构，也有了参与病毒确诊的权利，目的是加快确诊时间。","title":"检测权下放是什么意思？哪些机构可以检测新型冠状病毒？","author_info":{"name":"朱颉","icon":"https://baike-med-1256891581.file.myqcloud.com/2019112/ec180710-ffb2-11e9-a1dc-bf3c12b93712_0.jpg","title":"副主任医师","department":"急诊科","hospital":"中山大学孙逸仙纪念医院"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=tx20406001wdtjwr&amp;adtag=txxw.op.fybox","image":"","abs":"新冠病毒的检测试剂盒是从无到有的原研开发，一定要从实际情况出发，不能违背规律。","title":"新型冠状病毒核酸检测最大的问题是质量，而非试剂盒产量","author_info":{"name":"","icon":"https://baike-med-1256891581.file.myqcloud.com/yidian/production/common/image/source_wicon.png","title":"","department":"","hospital":"腾讯医典医学团队"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=tx20406001gdbadd&amp;adtag=txxw.op.fybox","image":"","abs":"尽管病毒核酸检测有不少问题，但它仍是当前最准确和灵敏的新冠病毒检测方法。","title":"告急的试剂盒、漫长的等待、30%左右的阳性率\u2026\u2026新冠病毒核酸检测，各类难题如何解？","author_info":{"name":"","icon":"https://baike-med-1256891581.file.myqcloud.com/yidian/production/common/image/source_wicon.png","title":"","department":"","hospital":"腾讯医典医学团队"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=tx20406001hf1bbs&amp;adtag=txxw.op.fybox","image":"https://baike-med-1256891581.file.myqcloud.com/2020021/17ade5d0-5390-11ea-b6f0-e90d1699cad2_0.jpg","abs":"基因芯片，与分离培养、显微观察、血清学诊断、PCR 扩增等都是传统的病毒学诊断方法。","title":"鉴定：香港科技大学研发出了全球最快的新型冠状病毒检测仪吗？","author_info":{"name":"牟小芬","icon":"","title":"主任医师","department":"呼吸内科","hospital":"中国人民解放军总医院"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=tx20406001hakgpp&amp;adtag=txxw.op.fybox","image":"","abs":"李医生正值壮年，为何也发展成了重症并不幸辞世？","title":"新冠肺炎，重症为何那么重？","author_info":{"name":"","icon":"https://baike-med-1256891581.file.myqcloud.com/yidian/production/common/image/source_wicon.png","title":"","department":"","hospital":"腾讯医典医学团队"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=tx20406001pkfmki&amp;adtag=txxw.op.fybox","image":"https://baike-med-1256891581.file.myqcloud.com/2020012/8e497a90-3682-11ea-acd7-bfdffd72c235_0.jpg","abs":"新冠病毒自测试纸是通过检测特异性抗体的存在，达到发现病毒感染的目的。","title":"新型冠状病毒有没有自测试纸，可以在家自行检测吗？","author_info":{"name":"卢学新","icon":"","title":"助理研究员","department":"病毒病预防控制所","hospital":"中国疾病预防控制中心"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=qa20406011m25lqy&amp;adtag=txxw.op.fybox","image":"","abs":"血常规对新型冠状病毒感染的诊断具有一定指导作用。2020 年 1 月 27 日国家卫生健康委员会发布的《新型冠状病毒肺炎诊疗方案（试行第四版）》介绍的实验室检查部分指出：\u201c发病早期外周血白细胞总数正常或减低，淋巴细胞计数减少，部分患者出现肝酶、肌酶和肌红蛋白增高。多数患者 C 反应蛋白（CRP）和血沉升高，降钙素原正常。严重者 D-二聚体升高、外周血淋巴细胞进行性减少。在咽拭子、痰、下呼吸道分泌物、血液等标本中可检测出新型冠状病毒核酸。\u201d从中可以看出，血常规检查发现外周血白细胞总数正常或减低、淋巴细胞计数减少对诊断有一定指导作用。但是，因为导致血常规变化的还可能有其他因素，所以最终诊断还要根据《新型冠状病毒肺炎诊疗方案（试行第四版）》所提供的确诊病例标准，疑似病例，具备以下病原学证据之一者才可以确诊：呼吸道标本或血液标本实时荧光 RT-PCR 检测新型冠状病毒核酸阳性；呼吸道标本或血液标本病毒基因测序，与已知的新型冠状病毒高度同源。","title":"血常规能检查出新型冠状病毒感染吗？","author_info":{"name":"张鸿","icon":"","title":"副主任医师","department":"呼吸与危重症医学科","hospital":"首都医科大学附属北京朝阳医院"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=tx20406001kt0tjt&amp;adtag=txxw.op.fybox","image":"https://baike-med-1256891581.file.myqcloud.com/2020010/45c50160-3905-11ea-b6f0-e90d1699cad2_0.jpg","abs":"需要靠病毒核酸检测确诊。","title":"新型冠状病毒感染，如何确诊？","author_info":{"name":"侯静静","icon":"","title":"","department":"呼吸科","hospital":"上海市同济医院"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=tx20406001fbjlto&amp;adtag=txxw.op.fybox","image":"https://baike-med-1256891581.file.myqcloud.com/2020016/737727f0-3694-11ea-84ae-25e4a22a0f71_0.jpg","abs":"当感染新型冠状病毒时，通常会有这些指标异常","title":"怀疑新型冠状病毒感染，要做哪些检查","author_info":{"name":"蒋卫民","icon":"https://baike-med-1256891581.file.myqcloud.com/2018033/e6aace30-1de5-11e8-ab39-b5cd33858281_0.png","title":"主任医师","department":"感染科","hospital":"复旦大学附属华山医院"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=tx204060017zpudz&amp;adtag=txxw.op.fybox","image":"https://baike-med-1256891581.file.myqcloud.com/2020021/1374dac0-53b6-11ea-9f19-7f116001755c_0.jpg","abs":"抽血进行二代测序，如果病毒基因测序结果已知的新型冠状病毒高度同源，即可确诊，","title":"鉴定：新型冠状病毒验血能查出来吗？","author_info":{"name":"原庆","icon":"","title":"主任医师","department":"呼吸科","hospital":"首都医科大学附属北京中医医院"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=tx20406001ybqufx&amp;adtag=txxw.op.fybox","image":"https://baike-med-1256891581.file.myqcloud.com/2020019/7aa717e0-410e-11ea-a282-e32d557443e5_0.jpg","abs":"儿童感染新型冠状病毒的潜伏期1~14天不等。年龄越小，越不容易发现，一旦发病，进展更快。","title":"孩子出现哪些症状，要当心新型冠状病毒感染？","author_info":{"name":"张鸿","icon":"","title":"副主任医师","department":"呼吸与危重症医学科","hospital":"首都医科大学附属北京朝阳医院"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=qa204060115duign&amp;adtag=txxw.op.fybox","image":"","abs":"除了不确定感，这部分人群还可能存在侥幸心理、躲避治疗、怕被歧视，或焦躁、过度求治、频繁转院等。干预措施政策宣教、密切观察、及早求治；为人为己采用必要的保护措施；服从大局安排，按照规定报告个人情况；使用减压行为、减少应激。原则：及时宣教、正确防护、服从大局、减少压力。【我能做什么】提醒自己：纸里包不住火，越回避越恐惧，所以不如直接面对真相，如果确诊，就是早发现、早诊断，可以早治疗；如果能够排除，那就是幸免。生病不是自己的错，该怎样就怎样，服从安排就是对自己的和他人最大的负责。当然，也不必太过焦虑，把问题交给权威部门，无条件地信任医务人员。在确切的判断到来之前，一切行动听指挥。不妄自菲薄，不庸人自扰。【家属能做什么】劝导、监督疑似患者配合要求，遵守规定，不盲目乐观，也不过度检查。患者和家属都采取必要的保护措施。家属做两手准备，做好稳定的后方。对疑似患者不催促，不抱怨，不拖延。协助患者不做没有根据的假设，有困惑就去寻求专业的咨询。","title":"指南解读：疑似患者如何进行心理干预？","author_info":{"name":"宋崇升","icon":"https://baike-med-1256891581.file.myqcloud.com/2020029/c272e350-4579-11ea-b6f0-e90d1699cad2_0.jpg","title":"副主任医师","department":"精神科","hospital":"北京回龙观医院"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=tx20406001elserw&amp;adtag=txxw.op.fybox","image":"https://baike-med-1256891581.file.myqcloud.com/2020013/79e70e30-38f5-11ea-a282-e32d557443e5_0.jpg","abs":"医生临床上诊断新型冠状病毒感染，需要经过两个步骤。","title":"医生如何确诊新型冠状病毒感染？","author_info":{"name":"李春辉","icon":"","title":"副主任医师","department":"感染中心","hospital":"中南大学湘雅医院"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=tx204060014l5snk&amp;adtag=txxw.op.fybox","image":"https://baike-med-1256891581.file.myqcloud.com/2020013/0264ba60-3ff3-11ea-a282-e32d557443e5_0.jpg","abs":"在国家卫生健康委28日上午召开新闻发布会中，将河南安阳的病例认定为无症状感染者。","title":"\u201c无症状感染者\u201d如何防控？","author_info":{"name":"陈宏","icon":"","title":"主任医师","department":"呼吸内科","hospital":"哈尔滨医科大学附属第二医院"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=tx20406001ewajzu&amp;adtag=txxw.op.fybox","image":"https://baike-med-1256891581.file.myqcloud.com/2020011/98a685e0-3d8b-11ea-b6f0-e90d1699cad2_0.jpg","abs":"张文宏教授特地撰文对疫情的变化趋势、热点问题及相关注意事项进行解读。","title":"节后日子怎么过，上海医疗救治专家组组长给出答案","author_info":{"name":"","icon":"https://baike-med-1256891581.file.myqcloud.com/2018038/f1b09d00-1de5-11e8-ab39-b5cd33858281_0.png","title":"","department":"","hospital":"复旦大学附属华山医院"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=tx20406001izmvrb&amp;adtag=txxw.op.fybox","image":"https://baike-med-1256891581.file.myqcloud.com/2020010/93511170-40ea-11ea-b6f0-e90d1699cad2_0.jpg","abs":"新型冠状病毒确诊，核酸来定！","title":"国家火速批准4个病毒检测产品！新冠肺炎怎样确诊？病毒核酸给出答案！","author_info":{"name":"","icon":"https://baike-med-1256891581.file.myqcloud.com/2020044/5f503fd0-220f-11ea-b4cf-cb1987c2b846_1.png","title":"","department":"","hospital":"腾讯医典微信公众号"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=qa20406011fjbol2&amp;adtag=txxw.op.fybox","image":"","abs":"从目前报道来看新冠肺炎的主要症状有：发热（部分患者也可能没有发热症状）、咳嗽、肌肉疼痛或疲劳。比较少见的症状有产痰、头痛、咯血和腹泻。严重的情况下患者会出现急性呼吸窘迫、脓毒症休克、代谢性酸中毒，凝血功能障碍、肾衰竭或全身其他器官衰竭等症状。但是有这些症状不一定是新型冠状病毒引起的肺炎。具体诊断还需要通过问诊、血常规检查、医学影像检查及病原学检查结果进行判断。","title":"新冠肺炎症状怎么判断？","author_info":{"name":"李文丰","icon":"","title":"主治医师","department":"重症医学科-呼吸方向","hospital":"广东药科大学附属第一医院"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=qa20406011evmqdh&amp;adtag=txxw.op.fybox","image":"","abs":"病毒核酸转阴表示不再向外\u201c排毒\u201d，也就是说，患者不再具有传染性了，可以解除隔离。然而，核酸转阴并不代表治愈，只是判断是否治愈的指标之一，医生还需要结合症状、影像学检查结果等进行判断。有可能检查发现核酸转阴了，但是仍有临床症状，这时也不算做治愈。","title":"新型冠状病毒核酸转阴什么意思，表示痊愈了吗？","author_info":{"name":"姜园园","icon":"","title":"副主任医师","department":"呼吸内科","hospital":"山东大学齐鲁医院"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=qa204060118kyyck&amp;adtag=txxw.op.fybox","image":"","abs":"2020 年 1 月 25 日，新型冠状病毒检测试剂盒通过了上海市医疗器械检测所的检验，成为我国法定检验机构检定合格的首个新型冠状病毒检测产品。获得国家药监局的上市批件后，这种试剂盒将被用于测定疑似患者的样本中是否有新型冠状病毒。对于疑似感染新型冠状病毒的患者，医院、疾控中心、出入境检验检疫局等处的工作人员将用试剂盒对他们的鼻咽拭子（拿棉签在鼻腔或咽部轻轻抹一下）、痰液、肺泡灌洗液（麻醉后操作，检测清洗肺泡后的液体）3 种样本进行检测，测定是否感染了新型冠状病毒。","title":"新型冠状病毒检测试剂盒是做什么的？","author_info":{"name":"黄茂","icon":"https://baike-med-1256891581.file.myqcloud.com/2018038/cfe5c110-1de4-11e8-ab39-b5cd33858281_0.png","title":"主任医师","department":"呼吸与危重症医学科","hospital":"江苏省人民医院"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=qa20406011js02xh&amp;adtag=txxw.op.fybox","image":"","abs":"浙江大学医学院第一医院、传染病诊治国家重点实验室副主任肖永红在接受《新京报》记者采访时介绍，中国疾控中心在实验室中把病毒培养出来了，这对于研究病毒致病机制、药物研发都非常有帮助，奠定了非常好的基础。通俗地说，全基因组序列找到了\u201c贼\u201d的证据，现在是把\u201c贼\u201d抓住了。","title":"中国疾控中心公布分离病毒毒种信息和电镜照片，意味着什么？","author_info":{"name":"黄茂","icon":"https://baike-med-1256891581.file.myqcloud.com/2018038/cfe5c110-1de4-11e8-ab39-b5cd33858281_0.png","title":"主任医师","department":"呼吸与危重症医学科","hospital":"江苏省人民医院"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=tx20406001vc2ksl&amp;adtag=txxw.op.fybox","image":"https://baike-med-1256891581.file.myqcloud.com/2020014/09f746e0-390d-11ea-99eb-ef7915f20177_0.jpg","abs":"具有以下情况之一就属于重症病例","title":"患者故事（三）：重症肺炎，早期识别及时救治","author_info":{"name":"金寿德","icon":"","title":"主任医师","department":"呼吸内科","hospital":"哈尔滨医科大学附属第四医院"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=tx20406001ixrbmo&amp;adtag=txxw.op.fybox","image":"https://baike-med-1256891581.file.myqcloud.com/2020014/09f746e0-390d-11ea-99eb-ef7915f20177_0.jpg","abs":"怀疑感染新型冠状病毒，需要做哪些检查？会有哪些指标异常？","title":"怀疑感染新型冠状病毒，需要做哪些检查？会有哪些指标异常？","author_info":{"name":"蒋卫民","icon":"https://baike-med-1256891581.file.myqcloud.com/2018033/e6aace30-1de5-11e8-ab39-b5cd33858281_0.png","title":"主任医师","department":"感染科","hospital":"复旦大学附属华山医院"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=qa00069011fyqhkf&amp;adtag=txxw.op.fybox","image":"","abs":"在符合疑似病例标准的基础上，痰液、咽拭子、下呼吸道分泌物等标本，行实时荧光 RT-PCR （反转录聚合酶链式反应）检测 2019-nCoV 核酸阳性，就可确诊。最快两小时出结果，由于需要做两次反复的采样和对照检测，一般 48 小时内可以确诊。","title":"新型冠状病毒感染怎么诊断？多久可以出结果？","author_info":{"name":"吴晓昇","icon":"","title":"副主任医师","department":"呼吸内科","hospital":"南昌市第三医院"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=qa000020116o4lyr&amp;adtag=txxw.op.fybox","image":"","abs":"1月22日，北京市卫健委发布发热患者就诊指南。指南建议：发热患者可先自行评估，部分情况可先在家休息观察。出现发热症状，可先自我评估。具体建议如下：以下情况，可先在家休息和观察：体温不超过38℃，并且没有明显的气短、憋喘等症状；年龄在60岁以下或5岁以上；不属于孕妇、慢性病患者或肥胖者。在家期间：多喝水，可服用一些减轻症状的感冒药；同时，戴口罩、勤洗手、房间勤通风，做好自己和家人的防护。如伴有以下情况，请及时就近医院就诊：在家观察休息后病情无好转；近期近距离接触过有发热、咳嗽症状的患者；去过有流感、不明原因肺炎等传染病疫情的地区；孕妇；有心肺、肾脏等基础性疾病和呼吸系统慢性疾病的人。发热患者应该如何就诊？就近选择发热门诊若体温超过37.3℃，去医院就诊时，可直接去发热门诊。发热门诊是专门为出现发热、咳嗽等症状患者提供诊疗服务的诊室，可先行查询，就近就诊。就诊注意事项到发热门诊就诊时应戴好口罩。主动告诉医务人员以下信息：\n\t近期是否去过有流感或不明原因肺炎疫情的地区；有无与发热、咳嗽等症状的患者近距离接触史。","title":"自己或身边人有发热症状，该如何正确就诊？","author_info":{"name":"杨媛华","icon":"https://baike-med-1256891581.file.myqcloud.com/2018036/87604630-1de5-11e8-ab39-b5cd33858281_0.png","title":"主任医师","department":"呼吸科","hospital":"首都医科大学附属北京朝阳医院"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=tx20406008ex1sdh&amp;adtag=txxw.op.fybox","image":"https://baike-med-1256891581.file.myqcloud.com/2020011/fd1d8970-4172-11ea-b8f3-ebd516b57352_0.jpg","abs":"新型冠状病毒与SARS谁\u201c厉害\u201d","title":"新型冠状病毒与SARS谁\u201c厉害\u201d","author_info":{"name":"刘又宁","icon":"https://baike-med-1256891581.file.myqcloud.com/2020016/fcaf70b0-3c14-11ea-b0c2-518444c9f737_0.jpg","title":"主任医师","department":"呼吸内科","hospital":"中国人民解放军总医院"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=tx20406008iwojwq&amp;adtag=txxw.op.fybox","image":"https://baike-med-1256891581.file.myqcloud.com/2020012/0cdaece0-4173-11ea-a282-e32d557443e5_0.jpg","abs":"新型冠状病毒的易感人群是？","title":"新型冠状病毒的易感人群是？","author_info":{"name":"刘又宁","icon":"https://baike-med-1256891581.file.myqcloud.com/2020016/fcaf70b0-3c14-11ea-b0c2-518444c9f737_0.jpg","title":"主任医师","department":"呼吸内科","hospital":"中国人民解放军总医院"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=tx20406001lgnee5&amp;adtag=txxw.op.fybox","image":"https://baike-med-1256891581.file.myqcloud.com/2020011/61ea61e0-3b59-11ea-99eb-ef7915f20177_0.jpg","abs":"新型冠状病毒肺炎疫情正热，如果出现了发热、咳嗽，该如何就医？","title":"怀疑感染了新型冠状病毒，就诊前该做哪些准备","author_info":{"name":"牟小芬","icon":"","title":"主任医师","department":"呼吸内科","hospital":"中国人民解放军总医院"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=qa20406011gzfw4e&amp;adtag=txxw.op.fybox","image":"","abs":"在新型冠状病毒肺炎疫情下，如果出现了密切接触的情况，密切接触者需要被隔离观察 14 天。中国人民解放军总医院刘又宁教授在做客腾讯医典《名医在身边》直播间时指出，新型冠状病毒引起的肺炎具有潜伏期，而潜伏期的长度从 4 天到 2 周都有可能，因此，目前将医学观察到的有密切接触史里最长的潜伏期定为了观察期限，如果最长的潜伏期后被观察对象也未出现异常，通常就没有问题了。","title":"新型冠状病毒密切接触者，为什么要被隔离 14 天？","author_info":{"name":"牟小芬","icon":"","title":"主任医师","department":"呼吸内科","hospital":"中国人民解放军总医院"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=tx20406001tqkunl&amp;adtag=txxw.op.fybox","image":"https://baike-med-1256891581.file.myqcloud.com/2019125/132be2f0-1b23-11ea-8d87-61a5d76c9532_0.jpg","abs":"发烧了，我该怎么办？","title":"发烧了，我该怎么办？","author_info":{"name":"王仲","icon":"","title":"主任医师","department":"全科医学科","hospital":"北京清华长庚医院"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=qa20406011fbhcgm&amp;adtag=txxw.op.fybox","image":"","abs":"对新型冠状病毒的症状表现，华中科技大学同济医学院附属同济医院专家组在《新型冠状病毒肺炎诊疗快速指南》中已经详细解读。","title":"出现发热、咳嗽，担心是新冠肺炎咋办","author_info":{"name":"陈宏","icon":"","title":"主任医师","department":"呼吸内科","hospital":"哈尔滨医科大学附属第二医院"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=qa20406011dfdjdl&amp;adtag=txxw.op.fybox","image":"","abs":"国家卫健委专家组成员高占成教授在接受央视采访时表示：新型冠状病毒肺炎目前根据现有的病例判断潜伏期平均是7天左右，短的可以是2天-3天，长的可以是10天-12天。","title":"新型冠状病毒的潜伏期是咋回事？","author_info":{"name":"陈宏","icon":"","title":"主任医师","department":"呼吸内科","hospital":"哈尔滨医科大学附属第二医院"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=tx20406008lfrhy2&amp;adtag=txxw.op.fybox","image":"https://baike-med-1256891581.file.myqcloud.com/2020010/f9dfc540-3ddd-11ea-b8f3-ebd516b57352_0.png","abs":"湖北省武汉市等多个地区发生新型冠状病毒肺炎疫情，专家为您解读","title":"全国著名呼吸病专家刘又宁详解新型冠状病毒","author_info":{"name":"刘又宁","icon":"https://baike-med-1256891581.file.myqcloud.com/2020016/fcaf70b0-3c14-11ea-b0c2-518444c9f737_0.jpg","title":"主任医师","department":"呼吸内科","hospital":"中国人民解放军总医院"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=tx20406001nd1vxb&amp;adtag=txxw.op.fybox","image":"https://baike-med-1256891581.file.myqcloud.com/2020011/67972190-390c-11ea-b8f3-ebd516b57352_0.jpg","abs":"《新型冠状病毒肺炎诊疗快速指南》发布！","title":"《新型冠状病毒肺炎诊疗快速指南》发布，快收藏！","author_info":{"name":"","icon":"https://baike-med-1256891581.file.myqcloud.com/2018032/b6752680-1de4-11e8-ab39-b5cd33858281_0.png","title":"","department":"","hospital":"华中科技大学同济医学院附属同济医院"}}],"count":35}
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
        /**
         * docs : [{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=tx20406001v3lknw&amp;adtag=txxw.op.fybox","image":"https://baike-med-1256891581.file.myqcloud.com/2020023/dec99f30-5843-11ea-b711-37db0881b500_0.jpg","abs":"截至目前，NMPA共批准新冠病毒检测试剂15个，核酸检测试剂10个，抗体检测试剂5个。","title":"15种新冠病毒检测获批，它们是如何检出病毒的？","author_info":{"name":"","icon":"https://baike-med-1256891581.file.myqcloud.com/yidian/production/common/image/source_wicon.png","title":"","department":"","hospital":"腾讯医典医学团队"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=tx204060015beohw&amp;adtag=txxw.op.fybox","image":"","abs":"WHO将病毒传染给十人以上的患者定义为超级传播者。","title":"1个感染10个，\u201c超级传播者\u201d如何防控？","author_info":{"name":"","icon":"https://baike-med-1256891581.file.myqcloud.com/yidian/production/common/image/source_wicon.png","title":"","department":"","hospital":"腾讯医典医学团队"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=tx20406001fhv7y7&amp;adtag=txxw.op.fybox","image":"","abs":"检测权下放可是指较低级别的医疗机构，也有了参与病毒确诊的权利，目的是加快确诊时间。","title":"检测权下放是什么意思？哪些机构可以检测新型冠状病毒？","author_info":{"name":"朱颉","icon":"https://baike-med-1256891581.file.myqcloud.com/2019112/ec180710-ffb2-11e9-a1dc-bf3c12b93712_0.jpg","title":"副主任医师","department":"急诊科","hospital":"中山大学孙逸仙纪念医院"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=tx20406001wdtjwr&amp;adtag=txxw.op.fybox","image":"","abs":"新冠病毒的检测试剂盒是从无到有的原研开发，一定要从实际情况出发，不能违背规律。","title":"新型冠状病毒核酸检测最大的问题是质量，而非试剂盒产量","author_info":{"name":"","icon":"https://baike-med-1256891581.file.myqcloud.com/yidian/production/common/image/source_wicon.png","title":"","department":"","hospital":"腾讯医典医学团队"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=tx20406001gdbadd&amp;adtag=txxw.op.fybox","image":"","abs":"尽管病毒核酸检测有不少问题，但它仍是当前最准确和灵敏的新冠病毒检测方法。","title":"告急的试剂盒、漫长的等待、30%左右的阳性率\u2026\u2026新冠病毒核酸检测，各类难题如何解？","author_info":{"name":"","icon":"https://baike-med-1256891581.file.myqcloud.com/yidian/production/common/image/source_wicon.png","title":"","department":"","hospital":"腾讯医典医学团队"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=tx20406001hf1bbs&amp;adtag=txxw.op.fybox","image":"https://baike-med-1256891581.file.myqcloud.com/2020021/17ade5d0-5390-11ea-b6f0-e90d1699cad2_0.jpg","abs":"基因芯片，与分离培养、显微观察、血清学诊断、PCR 扩增等都是传统的病毒学诊断方法。","title":"鉴定：香港科技大学研发出了全球最快的新型冠状病毒检测仪吗？","author_info":{"name":"牟小芬","icon":"","title":"主任医师","department":"呼吸内科","hospital":"中国人民解放军总医院"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=tx20406001hakgpp&amp;adtag=txxw.op.fybox","image":"","abs":"李医生正值壮年，为何也发展成了重症并不幸辞世？","title":"新冠肺炎，重症为何那么重？","author_info":{"name":"","icon":"https://baike-med-1256891581.file.myqcloud.com/yidian/production/common/image/source_wicon.png","title":"","department":"","hospital":"腾讯医典医学团队"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=tx20406001pkfmki&amp;adtag=txxw.op.fybox","image":"https://baike-med-1256891581.file.myqcloud.com/2020012/8e497a90-3682-11ea-acd7-bfdffd72c235_0.jpg","abs":"新冠病毒自测试纸是通过检测特异性抗体的存在，达到发现病毒感染的目的。","title":"新型冠状病毒有没有自测试纸，可以在家自行检测吗？","author_info":{"name":"卢学新","icon":"","title":"助理研究员","department":"病毒病预防控制所","hospital":"中国疾病预防控制中心"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=qa20406011m25lqy&amp;adtag=txxw.op.fybox","image":"","abs":"血常规对新型冠状病毒感染的诊断具有一定指导作用。2020 年 1 月 27 日国家卫生健康委员会发布的《新型冠状病毒肺炎诊疗方案（试行第四版）》介绍的实验室检查部分指出：\u201c发病早期外周血白细胞总数正常或减低，淋巴细胞计数减少，部分患者出现肝酶、肌酶和肌红蛋白增高。多数患者 C 反应蛋白（CRP）和血沉升高，降钙素原正常。严重者 D-二聚体升高、外周血淋巴细胞进行性减少。在咽拭子、痰、下呼吸道分泌物、血液等标本中可检测出新型冠状病毒核酸。\u201d从中可以看出，血常规检查发现外周血白细胞总数正常或减低、淋巴细胞计数减少对诊断有一定指导作用。但是，因为导致血常规变化的还可能有其他因素，所以最终诊断还要根据《新型冠状病毒肺炎诊疗方案（试行第四版）》所提供的确诊病例标准，疑似病例，具备以下病原学证据之一者才可以确诊：呼吸道标本或血液标本实时荧光 RT-PCR 检测新型冠状病毒核酸阳性；呼吸道标本或血液标本病毒基因测序，与已知的新型冠状病毒高度同源。","title":"血常规能检查出新型冠状病毒感染吗？","author_info":{"name":"张鸿","icon":"","title":"副主任医师","department":"呼吸与危重症医学科","hospital":"首都医科大学附属北京朝阳医院"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=tx20406001kt0tjt&amp;adtag=txxw.op.fybox","image":"https://baike-med-1256891581.file.myqcloud.com/2020010/45c50160-3905-11ea-b6f0-e90d1699cad2_0.jpg","abs":"需要靠病毒核酸检测确诊。","title":"新型冠状病毒感染，如何确诊？","author_info":{"name":"侯静静","icon":"","title":"","department":"呼吸科","hospital":"上海市同济医院"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=tx20406001fbjlto&amp;adtag=txxw.op.fybox","image":"https://baike-med-1256891581.file.myqcloud.com/2020016/737727f0-3694-11ea-84ae-25e4a22a0f71_0.jpg","abs":"当感染新型冠状病毒时，通常会有这些指标异常","title":"怀疑新型冠状病毒感染，要做哪些检查","author_info":{"name":"蒋卫民","icon":"https://baike-med-1256891581.file.myqcloud.com/2018033/e6aace30-1de5-11e8-ab39-b5cd33858281_0.png","title":"主任医师","department":"感染科","hospital":"复旦大学附属华山医院"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=tx204060017zpudz&amp;adtag=txxw.op.fybox","image":"https://baike-med-1256891581.file.myqcloud.com/2020021/1374dac0-53b6-11ea-9f19-7f116001755c_0.jpg","abs":"抽血进行二代测序，如果病毒基因测序结果已知的新型冠状病毒高度同源，即可确诊，","title":"鉴定：新型冠状病毒验血能查出来吗？","author_info":{"name":"原庆","icon":"","title":"主任医师","department":"呼吸科","hospital":"首都医科大学附属北京中医医院"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=tx20406001ybqufx&amp;adtag=txxw.op.fybox","image":"https://baike-med-1256891581.file.myqcloud.com/2020019/7aa717e0-410e-11ea-a282-e32d557443e5_0.jpg","abs":"儿童感染新型冠状病毒的潜伏期1~14天不等。年龄越小，越不容易发现，一旦发病，进展更快。","title":"孩子出现哪些症状，要当心新型冠状病毒感染？","author_info":{"name":"张鸿","icon":"","title":"副主任医师","department":"呼吸与危重症医学科","hospital":"首都医科大学附属北京朝阳医院"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=qa204060115duign&amp;adtag=txxw.op.fybox","image":"","abs":"除了不确定感，这部分人群还可能存在侥幸心理、躲避治疗、怕被歧视，或焦躁、过度求治、频繁转院等。干预措施政策宣教、密切观察、及早求治；为人为己采用必要的保护措施；服从大局安排，按照规定报告个人情况；使用减压行为、减少应激。原则：及时宣教、正确防护、服从大局、减少压力。【我能做什么】提醒自己：纸里包不住火，越回避越恐惧，所以不如直接面对真相，如果确诊，就是早发现、早诊断，可以早治疗；如果能够排除，那就是幸免。生病不是自己的错，该怎样就怎样，服从安排就是对自己的和他人最大的负责。当然，也不必太过焦虑，把问题交给权威部门，无条件地信任医务人员。在确切的判断到来之前，一切行动听指挥。不妄自菲薄，不庸人自扰。【家属能做什么】劝导、监督疑似患者配合要求，遵守规定，不盲目乐观，也不过度检查。患者和家属都采取必要的保护措施。家属做两手准备，做好稳定的后方。对疑似患者不催促，不抱怨，不拖延。协助患者不做没有根据的假设，有困惑就去寻求专业的咨询。","title":"指南解读：疑似患者如何进行心理干预？","author_info":{"name":"宋崇升","icon":"https://baike-med-1256891581.file.myqcloud.com/2020029/c272e350-4579-11ea-b6f0-e90d1699cad2_0.jpg","title":"副主任医师","department":"精神科","hospital":"北京回龙观医院"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=tx20406001elserw&amp;adtag=txxw.op.fybox","image":"https://baike-med-1256891581.file.myqcloud.com/2020013/79e70e30-38f5-11ea-a282-e32d557443e5_0.jpg","abs":"医生临床上诊断新型冠状病毒感染，需要经过两个步骤。","title":"医生如何确诊新型冠状病毒感染？","author_info":{"name":"李春辉","icon":"","title":"副主任医师","department":"感染中心","hospital":"中南大学湘雅医院"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=tx204060014l5snk&amp;adtag=txxw.op.fybox","image":"https://baike-med-1256891581.file.myqcloud.com/2020013/0264ba60-3ff3-11ea-a282-e32d557443e5_0.jpg","abs":"在国家卫生健康委28日上午召开新闻发布会中，将河南安阳的病例认定为无症状感染者。","title":"\u201c无症状感染者\u201d如何防控？","author_info":{"name":"陈宏","icon":"","title":"主任医师","department":"呼吸内科","hospital":"哈尔滨医科大学附属第二医院"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=tx20406001ewajzu&amp;adtag=txxw.op.fybox","image":"https://baike-med-1256891581.file.myqcloud.com/2020011/98a685e0-3d8b-11ea-b6f0-e90d1699cad2_0.jpg","abs":"张文宏教授特地撰文对疫情的变化趋势、热点问题及相关注意事项进行解读。","title":"节后日子怎么过，上海医疗救治专家组组长给出答案","author_info":{"name":"","icon":"https://baike-med-1256891581.file.myqcloud.com/2018038/f1b09d00-1de5-11e8-ab39-b5cd33858281_0.png","title":"","department":"","hospital":"复旦大学附属华山医院"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=tx20406001izmvrb&amp;adtag=txxw.op.fybox","image":"https://baike-med-1256891581.file.myqcloud.com/2020010/93511170-40ea-11ea-b6f0-e90d1699cad2_0.jpg","abs":"新型冠状病毒确诊，核酸来定！","title":"国家火速批准4个病毒检测产品！新冠肺炎怎样确诊？病毒核酸给出答案！","author_info":{"name":"","icon":"https://baike-med-1256891581.file.myqcloud.com/2020044/5f503fd0-220f-11ea-b4cf-cb1987c2b846_1.png","title":"","department":"","hospital":"腾讯医典微信公众号"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=qa20406011fjbol2&amp;adtag=txxw.op.fybox","image":"","abs":"从目前报道来看新冠肺炎的主要症状有：发热（部分患者也可能没有发热症状）、咳嗽、肌肉疼痛或疲劳。比较少见的症状有产痰、头痛、咯血和腹泻。严重的情况下患者会出现急性呼吸窘迫、脓毒症休克、代谢性酸中毒，凝血功能障碍、肾衰竭或全身其他器官衰竭等症状。但是有这些症状不一定是新型冠状病毒引起的肺炎。具体诊断还需要通过问诊、血常规检查、医学影像检查及病原学检查结果进行判断。","title":"新冠肺炎症状怎么判断？","author_info":{"name":"李文丰","icon":"","title":"主治医师","department":"重症医学科-呼吸方向","hospital":"广东药科大学附属第一医院"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=qa20406011evmqdh&amp;adtag=txxw.op.fybox","image":"","abs":"病毒核酸转阴表示不再向外\u201c排毒\u201d，也就是说，患者不再具有传染性了，可以解除隔离。然而，核酸转阴并不代表治愈，只是判断是否治愈的指标之一，医生还需要结合症状、影像学检查结果等进行判断。有可能检查发现核酸转阴了，但是仍有临床症状，这时也不算做治愈。","title":"新型冠状病毒核酸转阴什么意思，表示痊愈了吗？","author_info":{"name":"姜园园","icon":"","title":"副主任医师","department":"呼吸内科","hospital":"山东大学齐鲁医院"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=qa204060118kyyck&amp;adtag=txxw.op.fybox","image":"","abs":"2020 年 1 月 25 日，新型冠状病毒检测试剂盒通过了上海市医疗器械检测所的检验，成为我国法定检验机构检定合格的首个新型冠状病毒检测产品。获得国家药监局的上市批件后，这种试剂盒将被用于测定疑似患者的样本中是否有新型冠状病毒。对于疑似感染新型冠状病毒的患者，医院、疾控中心、出入境检验检疫局等处的工作人员将用试剂盒对他们的鼻咽拭子（拿棉签在鼻腔或咽部轻轻抹一下）、痰液、肺泡灌洗液（麻醉后操作，检测清洗肺泡后的液体）3 种样本进行检测，测定是否感染了新型冠状病毒。","title":"新型冠状病毒检测试剂盒是做什么的？","author_info":{"name":"黄茂","icon":"https://baike-med-1256891581.file.myqcloud.com/2018038/cfe5c110-1de4-11e8-ab39-b5cd33858281_0.png","title":"主任医师","department":"呼吸与危重症医学科","hospital":"江苏省人民医院"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=qa20406011js02xh&amp;adtag=txxw.op.fybox","image":"","abs":"浙江大学医学院第一医院、传染病诊治国家重点实验室副主任肖永红在接受《新京报》记者采访时介绍，中国疾控中心在实验室中把病毒培养出来了，这对于研究病毒致病机制、药物研发都非常有帮助，奠定了非常好的基础。通俗地说，全基因组序列找到了\u201c贼\u201d的证据，现在是把\u201c贼\u201d抓住了。","title":"中国疾控中心公布分离病毒毒种信息和电镜照片，意味着什么？","author_info":{"name":"黄茂","icon":"https://baike-med-1256891581.file.myqcloud.com/2018038/cfe5c110-1de4-11e8-ab39-b5cd33858281_0.png","title":"主任医师","department":"呼吸与危重症医学科","hospital":"江苏省人民医院"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=tx20406001vc2ksl&amp;adtag=txxw.op.fybox","image":"https://baike-med-1256891581.file.myqcloud.com/2020014/09f746e0-390d-11ea-99eb-ef7915f20177_0.jpg","abs":"具有以下情况之一就属于重症病例","title":"患者故事（三）：重症肺炎，早期识别及时救治","author_info":{"name":"金寿德","icon":"","title":"主任医师","department":"呼吸内科","hospital":"哈尔滨医科大学附属第四医院"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=tx20406001ixrbmo&amp;adtag=txxw.op.fybox","image":"https://baike-med-1256891581.file.myqcloud.com/2020014/09f746e0-390d-11ea-99eb-ef7915f20177_0.jpg","abs":"怀疑感染新型冠状病毒，需要做哪些检查？会有哪些指标异常？","title":"怀疑感染新型冠状病毒，需要做哪些检查？会有哪些指标异常？","author_info":{"name":"蒋卫民","icon":"https://baike-med-1256891581.file.myqcloud.com/2018033/e6aace30-1de5-11e8-ab39-b5cd33858281_0.png","title":"主任医师","department":"感染科","hospital":"复旦大学附属华山医院"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=qa00069011fyqhkf&amp;adtag=txxw.op.fybox","image":"","abs":"在符合疑似病例标准的基础上，痰液、咽拭子、下呼吸道分泌物等标本，行实时荧光 RT-PCR （反转录聚合酶链式反应）检测 2019-nCoV 核酸阳性，就可确诊。最快两小时出结果，由于需要做两次反复的采样和对照检测，一般 48 小时内可以确诊。","title":"新型冠状病毒感染怎么诊断？多久可以出结果？","author_info":{"name":"吴晓昇","icon":"","title":"副主任医师","department":"呼吸内科","hospital":"南昌市第三医院"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=qa000020116o4lyr&amp;adtag=txxw.op.fybox","image":"","abs":"1月22日，北京市卫健委发布发热患者就诊指南。指南建议：发热患者可先自行评估，部分情况可先在家休息观察。出现发热症状，可先自我评估。具体建议如下：以下情况，可先在家休息和观察：体温不超过38℃，并且没有明显的气短、憋喘等症状；年龄在60岁以下或5岁以上；不属于孕妇、慢性病患者或肥胖者。在家期间：多喝水，可服用一些减轻症状的感冒药；同时，戴口罩、勤洗手、房间勤通风，做好自己和家人的防护。如伴有以下情况，请及时就近医院就诊：在家观察休息后病情无好转；近期近距离接触过有发热、咳嗽症状的患者；去过有流感、不明原因肺炎等传染病疫情的地区；孕妇；有心肺、肾脏等基础性疾病和呼吸系统慢性疾病的人。发热患者应该如何就诊？就近选择发热门诊若体温超过37.3℃，去医院就诊时，可直接去发热门诊。发热门诊是专门为出现发热、咳嗽等症状患者提供诊疗服务的诊室，可先行查询，就近就诊。就诊注意事项到发热门诊就诊时应戴好口罩。主动告诉医务人员以下信息：\n\t近期是否去过有流感或不明原因肺炎疫情的地区；有无与发热、咳嗽等症状的患者近距离接触史。","title":"自己或身边人有发热症状，该如何正确就诊？","author_info":{"name":"杨媛华","icon":"https://baike-med-1256891581.file.myqcloud.com/2018036/87604630-1de5-11e8-ab39-b5cd33858281_0.png","title":"主任医师","department":"呼吸科","hospital":"首都医科大学附属北京朝阳医院"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=tx20406008ex1sdh&amp;adtag=txxw.op.fybox","image":"https://baike-med-1256891581.file.myqcloud.com/2020011/fd1d8970-4172-11ea-b8f3-ebd516b57352_0.jpg","abs":"新型冠状病毒与SARS谁\u201c厉害\u201d","title":"新型冠状病毒与SARS谁\u201c厉害\u201d","author_info":{"name":"刘又宁","icon":"https://baike-med-1256891581.file.myqcloud.com/2020016/fcaf70b0-3c14-11ea-b0c2-518444c9f737_0.jpg","title":"主任医师","department":"呼吸内科","hospital":"中国人民解放军总医院"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=tx20406008iwojwq&amp;adtag=txxw.op.fybox","image":"https://baike-med-1256891581.file.myqcloud.com/2020012/0cdaece0-4173-11ea-a282-e32d557443e5_0.jpg","abs":"新型冠状病毒的易感人群是？","title":"新型冠状病毒的易感人群是？","author_info":{"name":"刘又宁","icon":"https://baike-med-1256891581.file.myqcloud.com/2020016/fcaf70b0-3c14-11ea-b0c2-518444c9f737_0.jpg","title":"主任医师","department":"呼吸内科","hospital":"中国人民解放军总医院"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=tx20406001lgnee5&amp;adtag=txxw.op.fybox","image":"https://baike-med-1256891581.file.myqcloud.com/2020011/61ea61e0-3b59-11ea-99eb-ef7915f20177_0.jpg","abs":"新型冠状病毒肺炎疫情正热，如果出现了发热、咳嗽，该如何就医？","title":"怀疑感染了新型冠状病毒，就诊前该做哪些准备","author_info":{"name":"牟小芬","icon":"","title":"主任医师","department":"呼吸内科","hospital":"中国人民解放军总医院"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=qa20406011gzfw4e&amp;adtag=txxw.op.fybox","image":"","abs":"在新型冠状病毒肺炎疫情下，如果出现了密切接触的情况，密切接触者需要被隔离观察 14 天。中国人民解放军总医院刘又宁教授在做客腾讯医典《名医在身边》直播间时指出，新型冠状病毒引起的肺炎具有潜伏期，而潜伏期的长度从 4 天到 2 周都有可能，因此，目前将医学观察到的有密切接触史里最长的潜伏期定为了观察期限，如果最长的潜伏期后被观察对象也未出现异常，通常就没有问题了。","title":"新型冠状病毒密切接触者，为什么要被隔离 14 天？","author_info":{"name":"牟小芬","icon":"","title":"主任医师","department":"呼吸内科","hospital":"中国人民解放军总医院"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=tx20406001tqkunl&amp;adtag=txxw.op.fybox","image":"https://baike-med-1256891581.file.myqcloud.com/2019125/132be2f0-1b23-11ea-8d87-61a5d76c9532_0.jpg","abs":"发烧了，我该怎么办？","title":"发烧了，我该怎么办？","author_info":{"name":"王仲","icon":"","title":"主任医师","department":"全科医学科","hospital":"北京清华长庚医院"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=qa20406011fbhcgm&amp;adtag=txxw.op.fybox","image":"","abs":"对新型冠状病毒的症状表现，华中科技大学同济医学院附属同济医院专家组在《新型冠状病毒肺炎诊疗快速指南》中已经详细解读。","title":"出现发热、咳嗽，担心是新冠肺炎咋办","author_info":{"name":"陈宏","icon":"","title":"主任医师","department":"呼吸内科","hospital":"哈尔滨医科大学附属第二医院"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=qa20406011dfdjdl&amp;adtag=txxw.op.fybox","image":"","abs":"国家卫健委专家组成员高占成教授在接受央视采访时表示：新型冠状病毒肺炎目前根据现有的病例判断潜伏期平均是7天左右，短的可以是2天-3天，长的可以是10天-12天。","title":"新型冠状病毒的潜伏期是咋回事？","author_info":{"name":"陈宏","icon":"","title":"主任医师","department":"呼吸内科","hospital":"哈尔滨医科大学附属第二医院"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=tx20406008lfrhy2&amp;adtag=txxw.op.fybox","image":"https://baike-med-1256891581.file.myqcloud.com/2020010/f9dfc540-3ddd-11ea-b8f3-ebd516b57352_0.png","abs":"湖北省武汉市等多个地区发生新型冠状病毒肺炎疫情，专家为您解读","title":"全国著名呼吸病专家刘又宁详解新型冠状病毒","author_info":{"name":"刘又宁","icon":"https://baike-med-1256891581.file.myqcloud.com/2020016/fcaf70b0-3c14-11ea-b0c2-518444c9f737_0.jpg","title":"主任医师","department":"呼吸内科","hospital":"中国人民解放军总医院"}},{"h5url":"https://h5.baike.qq.com/mobile/article.html?docid=tx20406001nd1vxb&amp;adtag=txxw.op.fybox","image":"https://baike-med-1256891581.file.myqcloud.com/2020011/67972190-390c-11ea-b8f3-ebd516b57352_0.jpg","abs":"《新型冠状病毒肺炎诊疗快速指南》发布！","title":"《新型冠状病毒肺炎诊疗快速指南》发布，快收藏！","author_info":{"name":"","icon":"https://baike-med-1256891581.file.myqcloud.com/2018032/b6752680-1de4-11e8-ab39-b5cd33858281_0.png","title":"","department":"","hospital":"华中科技大学同济医学院附属同济医院"}}]
         * count : 35
         */

        private int count;
        private List<DocsBean> docs;

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public List<DocsBean> getDocs() {
            return docs;
        }

        public void setDocs(List<DocsBean> docs) {
            this.docs = docs;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "count=" + count +
                    ", docs=" + docs +
                    '}';
        }

        public static class DocsBean {
            /**
             * h5url : https://h5.baike.qq.com/mobile/article.html?docid=tx20406001v3lknw&amp;adtag=txxw.op.fybox
             * image : https://baike-med-1256891581.file.myqcloud.com/2020023/dec99f30-5843-11ea-b711-37db0881b500_0.jpg
             * abs : 截至目前，NMPA共批准新冠病毒检测试剂15个，核酸检测试剂10个，抗体检测试剂5个。
             * title : 15种新冠病毒检测获批，它们是如何检出病毒的？
             * author_info : {"name":"","icon":"https://baike-med-1256891581.file.myqcloud.com/yidian/production/common/image/source_wicon.png","title":"","department":"","hospital":"腾讯医典医学团队"}
             */

            private String h5url;
            private String image;
            private String abs;
            private String title;
            private AuthorInfoBean author_info;

            public String getH5url() {
                return h5url;
            }

            public void setH5url(String h5url) {
                this.h5url = h5url;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public String getAbs() {
                return abs;
            }

            public void setAbs(String abs) {
                this.abs = abs;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public AuthorInfoBean getAuthor_info() {
                return author_info;
            }

            public void setAuthor_info(AuthorInfoBean author_info) {
                this.author_info = author_info;
            }

            @Override
            public String toString() {
                return "DocsBean{" +
                        "h5url='" + h5url + '\'' +
                        ", image='" + image + '\'' +
                        ", abs='" + abs + '\'' +
                        ", title='" + title + '\'' +
                        ", author_info=" + author_info +
                        '}';
            }

            public static class AuthorInfoBean {
                /**
                 * name :
                 * icon : https://baike-med-1256891581.file.myqcloud.com/yidian/production/common/image/source_wicon.png
                 * title :
                 * department :
                 * hospital : 腾讯医典医学团队
                 */

                private String name;
                private String icon;
                private String title;
                private String department;
                private String hospital;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getIcon() {
                    return icon;
                }

                public void setIcon(String icon) {
                    this.icon = icon;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getDepartment() {
                    return department;
                }

                public void setDepartment(String department) {
                    this.department = department;
                }

                public String getHospital() {
                    return hospital;
                }

                public void setHospital(String hospital) {
                    this.hospital = hospital;
                }

                @Override
                public String toString() {
                    return "AuthorInfoBean{" +
                            "name='" + name + '\'' +
                            ", icon='" + icon + '\'' +
                            ", title='" + title + '\'' +
                            ", department='" + department + '\'' +
                            ", hospital='" + hospital + '\'' +
                            '}';
                }
            }
        }
    }
}

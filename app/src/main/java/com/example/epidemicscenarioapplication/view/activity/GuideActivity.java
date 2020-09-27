package com.example.epidemicscenarioapplication.view.activity;


import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.WindowManager;

import androidx.fragment.app.Fragment;

import com.example.epidemicscenarioapplication.R;
import com.example.epidemicscenarioapplication.utils.SpUtils;
import com.github.appintro.AppIntro2;
import com.github.appintro.AppIntroFragment;
import com.github.appintro.AppIntroPageTransformerType;


/**
 * @author 鑫宇
 */
public class GuideActivity extends AppIntro2 {
    private static final String PREF_ISFIRST = "isFirst";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //全屏显示
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //不要调用setContentView()方法  标题 描述  要显示的图片 背景颜色 标题颜色 描述颜色
        addSlide(AppIntroFragment.newInstance("疫情信息全部掌握",
                "实时疫情地图、周边小区确诊人数、所在市各县区确诊人数、所在省份历史数据回顾、根据小区名称在全国范围内模糊搜索出现疫情的小区，尽可能多的向您提供疫情信息。",
                R.drawable.info,
                Color.parseColor("#ffffff"),
                R.color.guildpagefour,
                R.color.guildpagefour
               ));

        addSlide(AppIntroFragment.newInstance("新冠肺炎预防和科普",
                "新冠肺炎如何预防，怎么治疗？每天焦虑不安，让我们来告诉你答案!",
                R.drawable.kp,
                Color.parseColor("#ffffff"),
                R.color.guildpagefour,
                R.color.guildpagefour));

        addSlide(AppIntroFragment.newInstance("疫情新闻和当地新闻",
                "向您展示全球疫情新闻和所在地新闻，最快获取疫情资讯。",
                R.drawable.zixun,
                Color.parseColor("#ffffff"),
                R.color.guildpagefour,
                R.color.guildpagefour));

        addSlide(AppIntroFragment.newInstance("辨别谣言",
                "什么！“男性比女性更容易的新冠肺炎？”，别猜了，我们给您提供查询平台，让谣言无处遁形。",
                R.drawable.dislike,
                Color.parseColor("#ffffff"),
                R.color.guildpagefour,
                R.color.guildpagefour));

        addSlide(AppIntroFragment.newInstance("一款全面的疫情综合资讯平台",
                "口罩预约、同乘车辆查询、义诊、辟谣、全球确诊人数、全平台及官方疫情数据、你想看的我们全都有、快点击右下角来体验吧！",
                R.drawable.zonghe,
                Color.parseColor("#ffffff"),
                R.color.guildpagefour,
                R.color.guildpagefour));

//        背景之间的颜色过渡进行动画处理的可能性。默认情况下，此功能是禁用的，您需要使用以下命令在AppIntro上启用它：
        setColorTransitionsEnabled(true);
        try {
            setTransformer(AppIntroPageTransformerType.Parallax.class.newInstance());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
//        //设置为沉浸模式
//        setSeparatorColor(getResources().getColor(R.color.colorAccent));
//
//        setColorSkipButton(ContextCompat.getColor(this, R.color.guildpageone));
////        setdon(ContextCompat.getColor(this, R.color.guildpageone));
//        setSkipText("跳过");
//        setDoneText("开启抗疫征程");
    }

    @Override
    protected void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        SpUtils.putBoolean(this, PREF_ISFIRST, false);
        finish();
    }

    @Override
    protected void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        SpUtils.putBoolean(this, PREF_ISFIRST, false);
        finish();
    }

}
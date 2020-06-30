package com.example.epidemicscenarioapplication.view.activity;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import com.example.epidemicscenarioapplication.R;
import com.github.appintro.AppIntro2;
import com.github.appintro.AppIntroFragment;
import com.github.appintro.AppIntroPageTransformerType;


/**
 * @author 鑫宇
 */
public class IntroActivity extends AppIntro2 {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //不要调用setContentView()方法            下面这个颜色这个地方还没太搞懂                                  背景颜色                 标题颜色                 描述颜色
        addSlide(AppIntroFragment.newInstance("全民抗击疫情，我是首页", "wowo", R.drawable.fast, R.color.guildpageone, R.color.guildpageone, R.color.guildpageone));
        addSlide(AppIntroFragment.newInstance("全民抗击疫情，我是第二页", "wowo", R.drawable.medicalmask, Color.parseColor("#ffffff"), Color.parseColor("#ffffff"), R.color.guildpageone));
        addSlide(AppIntroFragment.newInstance("全民抗击疫情，我是第三页", "wowo", R.drawable.thermometer, R.color.guildpagethree));
        addSlide(AppIntroFragment.newInstance("全民抗击疫情，我是第四页", "wowo", R.drawable.fast, R.color.guildpagefour));
        addSlide(AppIntroFragment.newInstance("全民抗击疫情，我是第五页", "wowo", R.drawable.fast, R.color.guildpagefive));

//        背景之间的颜色过渡进行动画处理的可能性。默认情况下，此功能是禁用的，您需要使用以下命令在AppIntro上启用它：
        isColorTransitionsEnabled();
        setTransformer(AppIntroPageTransformerType.Flow.INSTANCE);
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
        startActivity(new Intent(this, HomeActivity.class));
    }

    @Override
    protected void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        startActivity(new Intent(this, HomeActivity.class));
    }

}
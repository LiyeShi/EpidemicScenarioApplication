package com.example.epidemicscenarioapplication.view.activity;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import com.example.epidemicscenarioapplication.R;
import com.github.appintro.AppIntro;
import com.github.appintro.AppIntroFragment;


/**
 * @author 鑫宇
 */
public class IntroActivity extends AppIntro {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //不要调用setContentView()方法                                                                        背景颜色                 标题颜色                 描述颜色
        addSlide(AppIntroFragment.newInstance("全民抗击疫情，我是首页", "wowo", R.drawable.fast, R.color.colorPrimary, R.color.appintro_title_color, R.color.colorPrimaryDark));
        addSlide(AppIntroFragment.newInstance("全民抗击疫情，我是第二页", "wowo", R.drawable.fast, R.color.material_on_surface_emphasis_medium));
        addSlide(AppIntroFragment.newInstance("全民抗击疫情，我是第三页", "wowo", R.drawable.fast, R.color.colorPrimary));
        addSlide(AppIntroFragment.newInstance("全民抗击疫情，我是第四页", "wowo", R.drawable.fast, R.color.colorPrimary));
        addSlide(AppIntroFragment.newInstance("全民抗击疫情，我是第五页", "wowo", R.drawable.fast, R.color.colorPrimary));
//        背景之间的颜色过渡进行动画处理的可能性。默认情况下，此功能是禁用的，您需要使用以下命令在AppIntro上启用它：
        isColorTransitionsEnabled();
        //设置为沉浸模式
        setSeparatorColor(getResources().getColor(R.color.colorAccent));
        setSkipText("跳过");
        setDoneText("开启抗议征程");
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
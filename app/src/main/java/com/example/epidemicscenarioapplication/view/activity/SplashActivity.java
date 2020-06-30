package com.example.epidemicscenarioapplication.view.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.epidemicscenarioapplication.R;

/**
 * @author 鑫宇
 * 最后解决应用启动白屏的问题
 */
public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }
}
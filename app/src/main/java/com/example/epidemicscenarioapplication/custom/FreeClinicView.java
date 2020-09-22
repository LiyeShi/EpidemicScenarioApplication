package com.example.epidemicscenarioapplication.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.example.epidemicscenarioapplication.R;

/**
 * @author : 鑫宇
 * e-mail : 1769314609@qq.com
 * time   : 2020/09/22
 * desc   :
 * version: 1.0
 */
public class FreeClinicView extends RelativeLayout {

    private ImageView mIvIcon;
    private TextView mTvTitle;
    private TextView mTvDes;

    public ImageView getIvIcon() {
        return mIvIcon;
    }

    public FreeClinicView(Context context) {
        super(context);
    }

    public FreeClinicView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.item_home_free_clinic_fragment_dialog, this);
        mIvIcon = findViewById(R.id.iv_icon);
        mTvTitle = findViewById(R.id.tv_title);
        mTvDes = findViewById(R.id.tv_des);
    }

    void setIcon(int id) {
        mIvIcon.setImageResource(id);
    }

    void setTitle(String title) {
        mTvTitle.setText(title);
    }

    void setDes(String des) {
        mTvDes.setText(des);
    }
}

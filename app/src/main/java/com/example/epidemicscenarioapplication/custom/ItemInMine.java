package com.example.epidemicscenarioapplication.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import com.example.epidemicscenarioapplication.R;

/**
 * @author : 鑫宇
 * e-mail : 1769314609@qq.com
 * time   : 2020/08/26
 * desc   :
 * version: 1.0
 */
public class ItemInMine extends CardView {

    private TextView mTvContent;

    public ItemInMine(Context context) {
        super(context);
    }

    public ItemInMine(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
       inflater.inflate(R.layout.item_custom_linearlayout, this);
        mTvContent = (TextView)findViewById(R.id.tv_mine_content);
    }


    public void setTextViewText(String text) {
        mTvContent.setText(text);
    }

}

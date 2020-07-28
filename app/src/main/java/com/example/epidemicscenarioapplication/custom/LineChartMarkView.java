package com.example.epidemicscenarioapplication.custom;


import android.content.Context;
import android.util.Log;
import android.widget.TextView;

import com.example.epidemicscenarioapplication.R;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.utils.MPPointF;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @author : 鑫宇
 * e-mail : 1769314609@qq.com
 * time   : 2020/07/27
 * desc   :
 * version: 1.0
 */
public class LineChartMarkView extends MarkerView {
    private static final String TAG = "LineChartMarkView";
    private TextView tvDate;
    private TextView tvValueConfirm;
    private TextView tvValueHeal;
    private TextView tvValueDead;
    private ValueFormatter xAxisValueFormatter;
    private int mBeforeY;


    public LineChartMarkView(Context context, ValueFormatter xAxisValueFormatter) {
        super(context, R.layout.databack_linechart_markview);
        this.xAxisValueFormatter = xAxisValueFormatter;
        tvDate = findViewById(R.id.tv_date);
        tvValueConfirm = findViewById(R.id.tv_value_confirm);
        tvValueHeal = findViewById(R.id.tv_value_heal);
        tvValueDead = findViewById(R.id.tv_value_dead);
    }


    @Override
    public void refreshContent(Entry e, Highlight highlight) {
//        通过MarkerView 获取到当前的LineChart，然后通过LineChart获取LineData，图表展示的数据 都在LineData中可以得到
        Chart chart = getChartView();
        if (chart instanceof LineChart) {
            LineData lineData = ((LineChart) chart).getLineData();
            List<ILineDataSet> dataSets = lineData.getDataSets();
            for (int i = 0; i < dataSets.size(); i++) {
                LineDataSet dataSet = (LineDataSet) dataSets.get(i);
                //获取到曲线的所有在Y轴的数据集合，根据当前X轴的位置 来获取对应的Y轴值
                int y = (int) dataSet.getValues().get((int) e.getX()).getY();
                if (e.getX() > 0) {
                    mBeforeY = (int) dataSet.getValues().get((int) e.getX()-1).getY();
                }
                int increaseY=y-mBeforeY;
                if (i == 0) {
                    tvValueConfirm.setText(dataSet.getLabel()+":"+y+"(增加:"+increaseY+"人)");
                }
                if (i == 1) {
                    tvValueHeal.setText(dataSet.getLabel()+":"+y+"(增加:"+increaseY+"人)");;
                }
                if (i == 2) {
                    tvValueDead.setText(dataSet.getLabel()+":"+y+"(增加:"+increaseY+"人)");;
                }
            }
            SimpleDateFormat sf1 = new SimpleDateFormat("MM.dd");
            Calendar c1=Calendar.getInstance();
            int currentYear = c1.get(Calendar.YEAR);
            SimpleDateFormat sf2 = new SimpleDateFormat("MM月dd日");
            try {
                Date parse = sf1.parse((xAxisValueFormatter.getFormattedValue(e.getX(), null)));
                String format = sf2.format(parse);
                Log.d(TAG, "refreshContent: formate==>"+format);
                tvDate.setText(currentYear+"年"+format);
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
            super.refreshContent(e, highlight);
        }
    }


    @Override
    public MPPointF getOffset() {
        return new MPPointF(-(getWidth() / 2), -getHeight());
    }
}

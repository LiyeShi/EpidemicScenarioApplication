package com.example.epidemicscenarioapplication.view.activity;

import android.graphics.Color;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import androidx.core.content.ContextCompat;

import com.example.epidemicscenarioapplication.R;
import com.example.epidemicscenarioapplication.base.BaseActivity;
import com.example.epidemicscenarioapplication.base.IBaseView;
import com.example.epidemicscenarioapplication.custom.LineChartMarkView;
import com.example.epidemicscenarioapplication.databinding.ActivityDataBackBinding;
import com.example.epidemicscenarioapplication.presenter.impl.DataBackActibityPresenter;
import com.example.epidemicscenarioapplication.utils.ConstantsUtils;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.gyf.immersionbar.ImmersionBar;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class DataBackActivity extends BaseActivity implements IBaseView<HashMap<String, ArrayList>> {
    private static final String TAG = "DataBackActivity";
    private DataBackActibityPresenter mDataBackActibityPresenter;
    private ActivityDataBackBinding mMDataBackBinding;
    private LineData mLineData;

    @Override
    protected void initData() {
        mDataBackActibityPresenter.loadData(this);
    }

    @Override
    protected View getView() {
        mMDataBackBinding = ActivityDataBackBinding.inflate(getLayoutInflater());
        LinearLayout view = mMDataBackBinding.getRoot();
        return view;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void InitImmersionBar() {
        mImmersionBar = ImmersionBar.with(this);
        mImmersionBar.fitsSystemWindows(true)
                .statusBarColor(R.color.white)
                //状态栏字体是深色，不写默认为亮色
                .statusBarDarkFont(true)
                //导航栏图标是深色，不写默认为亮色
                .navigationBarDarkIcon(false).init();
    }

    @Override
    protected void initPresenter() {
        mDataBackActibityPresenter = new DataBackActibityPresenter(this);
    }

    @Override
    public void showLoadingView() {

    }

    /**
     * @param data 绘制图表所需的所有数据都在这里
     */
    @Override
    public void showSuccessView(HashMap<String, ArrayList> data) {
        initLineChart();
        ArrayList<Integer> confirmArraylist = data.get("confirm");
        ArrayList<String> dateArraylist = data.get("date");
        ArrayList<Integer> healCutsListArrayList = data.get("heal");
        ArrayList<Integer> deadArrayList = data.get("dead");
        //填充数据
        List<Entry> confirmList = new ArrayList<>();
        List<Entry> healList = new ArrayList<>();
        List<Entry> deadList = new ArrayList<>();
        for (int i = 0; i < confirmArraylist.size(); i++) {
            confirmList.add(new Entry(i, (int) confirmArraylist.get(i)));
            healList.add(new Entry(i, (int) healCutsListArrayList.get(i)));
            deadList.add(new Entry(i, (int) deadArrayList.get(i)));
        }

//        for (int i = 0; i < deadArrayList.size(); i++) {
////            如果治愈人数是零 放入0
//            if (deadArrayList.get(i).trim().equals("")) {
//                Log.d(TAG, "showSuccessView: 空数据");
//                deadList.add(new Entry(i,0));
//            }else {
//                Log.d(TAG, "showSuccessView: 不为空");
//                deadList.add(new Entry(i,Integer.parseInt(deadArrayList.get(i).trim())));
//            }
//        }

        //一个LineDataSet就是一条线  label 就是图例
        LineDataSet ConfirmSet = new LineDataSet(confirmList, "确诊人数");
        LineDataSet HealCutsSet = new LineDataSet(healList, "治愈人数");
        LineDataSet DeadSet = new LineDataSet(deadList, "死亡人数");
//        添加数据集到LineData中，LineData存放所有的数据
        mLineData = new LineData();
        mLineData.addDataSet(ConfirmSet);
        mLineData.addDataSet(HealCutsSet);
        mLineData.addDataSet(DeadSet);
        //线颜色
        ConfirmSet.setColor(Color.parseColor("#F15A4A"));
        //线宽度
        ConfirmSet.setLineWidth(1f);
        //不显示圆点
        ConfirmSet.setDrawCircles(false);
        HealCutsSet.setDrawCircles(false);
        DeadSet.setDrawCircles(false);
        //线条平滑
        ConfirmSet.setMode(LineDataSet.Mode.HORIZONTAL_BEZIER);
        //得到X轴
        XAxis xAxis = mMDataBackBinding.lcData.getXAxis();
        //设置X轴的位置（默认在上方)
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        //设置X轴坐标之间的最小间隔
        xAxis.setGranularity(1f);
        //设置X轴的刻度数量，第二个参数为true,将会画出明确数量（带有小数点），但是可能值导致不均匀，默认（6，false）
        xAxis.setLabelCount(confirmArraylist.size(), false);
        //设置X轴的值（最小值、最大值、然后会根据设置的刻度数量自动分配刻度显示）
        xAxis.setAxisMinimum(0f);
//        最大值是数据集合的大小-1，否则就越界了
        xAxis.setAxisMaximum((float) dateArraylist.size() - 1);
        //设置X轴值为字符串
        xAxis.setValueFormatter(new ValueFormatter() {
                                    @Override
                                    public String getFormattedValue(float value) {
                                        return (String) dateArraylist.get((int) value);
                                    }
                                }
        );
        //不显示网格线
        xAxis.setDrawGridLines(false);
        xAxis.setDrawGridLines(false);
        // 标签倾斜
        xAxis.setLabelRotationAngle(45);
        //折线图显示数值
        mLineData.setDrawValues(true);
        YAxis yAxisRight = mMDataBackBinding.lcData.getAxisRight();
//        不显示右边Y轴
        yAxisRight.setEnabled(false);
        YAxis yAxisLeft = mMDataBackBinding.lcData.getAxisLeft();
        yAxisLeft.setAxisMinimum(0f);
        yAxisLeft.setDrawGridLines(true);
//        显示虚线
        yAxisLeft.enableGridDashedLine(10f, 10f, 0f);
        //设置数据
        mMDataBackBinding.lcData.setData(mLineData);
//: 启用/禁用与图表的所有可能的触摸交互。
//        setTouchEnabled(boolean enabled)
//        : 启用/禁用拖动（平移）图表。
//        mMDataBackBinding.lcData.setDragEnabled(boolean enabled) ;
//        : 启用/禁用缩放图表上的两个轴。
//        mMDataBackBinding.lcData. setScaleEnabled(true) ;
//         : 启用/禁用缩放在x轴上。
//        mMDataBackBinding.lcData.setScaleXEnabled(boolean enabled);
//        : 启用/禁用缩放在y轴。
//        mMDataBackBinding.lcData.  setScaleYEnabled(boolean enabled) ;
//
//        : 设置为false以禁止通过在其上双击缩放图表。
////        mMDataBackBinding.lcData.setDoubleTapToZoomEnabled(boolean enabled) ;
//        mMDataBackBinding.lcData.setHighlightPerDragEnabled(boolean enabled) ;
//         : 设置为false，以防止值由敲击姿态被突出显示。 值仍然可以通过拖动或编程方式突出显示。 默认值：true
//        mMDataBackBinding.lcData.setHighlightPerTapEnabled(boolean enabled);
        LineChartMarkView mv = new LineChartMarkView(this, xAxis.getValueFormatter());
        mv.setChartView( mMDataBackBinding.lcData);
        mMDataBackBinding.lcData.setMarker(mv);
        mMDataBackBinding.lcData.invalidate();

    }

    private void initLineChart() {
        // TODO: 2020/7/28 这个地方要换成真实的地理位置
        Description description = new Description();
        description.setText(ConstantsUtils.LOCATION_PROVINCE +"疫情历史数据");
        description.setTextSize(10);

        mMDataBackBinding.lcData.setDescription(description);
//       启用/禁用拖动（平移）图表。
        mMDataBackBinding.lcData.setDragEnabled(true);

        mMDataBackBinding.lcData.setScaleXEnabled(true);
        //设置XY轴动画效果 从上往下 和从左往右绘制图形
        mMDataBackBinding.lcData.animateY(2500);
        mMDataBackBinding.lcData.animateX(1500);
        //不显示显示边界
        mMDataBackBinding.lcData.setDrawBorders(false);
//        如果设置为true，捏缩放功能。 如果false，x轴和y轴可分别放大。
        mMDataBackBinding.lcData.setPinchZoom(true);
//        没有数据的时候设置显示的文字并不生效
//        mMDataBackBinding.lcData.data
        mMDataBackBinding.lcData.setNoDataText("当前没有数据");
        mMDataBackBinding.lcData.setNoDataTextColor(ContextCompat.getColor(this, R.color.red));
//        限制缩放倍数
        mMDataBackBinding.lcData.getViewPortHandler().setMaximumScaleX(8f);
        mMDataBackBinding.lcData.getViewPortHandler().setMaximumScaleY(6f);
        mMDataBackBinding.lcData.invalidate();
    }


    @Override
    public void showErrorView() {

    }
}
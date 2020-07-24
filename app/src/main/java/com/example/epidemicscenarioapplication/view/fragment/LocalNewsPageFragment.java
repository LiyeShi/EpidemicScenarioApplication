package com.example.epidemicscenarioapplication.view.fragment;

import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.epidemicscenarioapplication.adapter.LocalNewsFragmentAdapter;
import com.example.epidemicscenarioapplication.base.BaseFragment;
import com.example.epidemicscenarioapplication.databinding.NewsFragmentLocalBinding;
import com.example.epidemicscenarioapplication.domain.LocalNewsDataBean;
import com.example.epidemicscenarioapplication.presenter.impl.LocalNewsPresenter;
import com.example.epidemicscenarioapplication.view.INewsView;
import com.example.epidemicscenarioapplication.view.activity.WebPageActivity;


/**
 * @author sly
 * @version 1.0
 * @date 2020/7/8
 * @description com.example.epidemicscenarioapplication.view.fragment
 */
public class LocalNewsPageFragment extends BaseFragment implements INewsView<LocalNewsDataBean> {

    private LinearLayout mLocalNewsLayoutBindingRoot;
    private LocalNewsPresenter mNewsPresenter;
    private NewsFragmentLocalBinding mLocalNewsLayoutBinding;

    @Override
    protected void initListener() {

    }

    @Override
    protected void initPresenter() {
        mNewsPresenter = new LocalNewsPresenter(this);
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {
        mNewsPresenter.loadData(mLocalNewsLayoutBindingRoot.getContext());
    }

    @Override
    protected View getSuccessView(LayoutInflater inflater, ViewGroup container) {
        mLocalNewsLayoutBinding = NewsFragmentLocalBinding.inflate(inflater, container, false);
        mLocalNewsLayoutBindingRoot = mLocalNewsLayoutBinding.getRoot();
        return mLocalNewsLayoutBindingRoot;

    }


    @Override
    public void showLoadingView() {
        setViewState(ViewState.LOADING);
    }

    @Override
    public void showSuccessView(LocalNewsDataBean dataBean) {
        setViewState(ViewState.SUCCESS);
        LinearLayoutManager manager = new LinearLayoutManager(mLocalNewsLayoutBindingRoot.getContext());
        manager.setOrientation(RecyclerView.VERTICAL);
        mLocalNewsLayoutBinding.rvLocalNews.setLayoutManager(manager);
        mLocalNewsLayoutBinding.rvLocalNews.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
                outRect.bottom = 10;
                outRect.top = 10;
                outRect.left = 25;
                outRect.right = 25;
            }
        });
        LocalNewsFragmentAdapter adapter = new LocalNewsFragmentAdapter(dataBean);
        mLocalNewsLayoutBinding.rvLocalNews.setAdapter(adapter);
        adapter.setOnItemListener(position -> {
            WebPageActivity.start(mLocalNewsLayoutBindingRoot.getContext(),dataBean.getData().getResult().getWhole().get(position).getUrl());
        });
    }


    @Override
    public void showErrorView() {
        setViewState(ViewState.ERROR);
    }
}

package com.example.epidemicscenarioapplication.view.fragment;

import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.epidemicscenarioapplication.adapter.WikipediaPageFragmentAdapter;
import com.example.epidemicscenarioapplication.base.BaseFragment;
import com.example.epidemicscenarioapplication.databinding.WikipediaFragmentPreventionBinding;
import com.example.epidemicscenarioapplication.domain.WikipediaDataBean;
import com.example.epidemicscenarioapplication.model.impl.WikipediaModel;
import com.example.epidemicscenarioapplication.presenter.impl.WikipediaPresenter;
import com.example.epidemicscenarioapplication.view.IWikipediaView;
import com.example.epidemicscenarioapplication.view.activity.WebPageActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sly
 * @version 1.0
 * @date 2020/7/6
 * @description com.example.epidemicscenarioapplication.view.fragment
 */
public class WikipediaPreventionPageFragment extends BaseFragment implements IWikipediaView<WikipediaDataBean> {
    private static final String TAG = "WikipediaPreventionPage";
    private LinearLayout mFragment2BindingRoot;
    private WikipediaFragmentPreventionBinding mFragment2Binding;
    private WikipediaPresenter mWikipediaPresenter;

    @Override
    protected void initListener() {
        mNetworkErrorBinding.llNetwork.setOnClickListener((view)->{
            mWikipediaPresenter.loadData(WikipediaModel.WikipediaType.PREVENTION);
        });
    }

    @Override
    protected void initPresenter() {
        mWikipediaPresenter = new WikipediaPresenter(this);
    }

    @Override
    protected void initData() {
        mWikipediaPresenter.loadData(WikipediaModel.WikipediaType.PREVENTION);
    }

    @Override
    protected void initView() {

    }

    @Override
    protected View getSuccessView(LayoutInflater inflater, ViewGroup container) {
        mFragment2Binding = WikipediaFragmentPreventionBinding.inflate(inflater, container, false);
        mFragment2BindingRoot = mFragment2Binding.getRoot();
        return mFragment2BindingRoot;
    }

    @Override
    public void showLoadingView() {
        setViewState(ViewState.LOADING);
    }


    @Override
    public void showSuccessView(WikipediaDataBean body) {
        WikipediaPageFragmentAdapter adapter = new WikipediaPageFragmentAdapter();
        adapter.setOnItemListener(position -> {
            WebPageActivity.start(mFragment2BindingRoot.getContext(),body.getData().getDocs().get(position).getH5url());
        });
        adapter.setDataBeans((ArrayList<WikipediaDataBean.DataBean.DocsBean>) body.getData().getDocs());
//                    设置布局管理器 智障！忘了几次了
        //设置布局管理器
        LinearLayoutManager manager = new LinearLayoutManager(mFragment2BindingRoot.getContext());
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        mFragment2Binding.rvGuideList.setLayoutManager(manager);
        //设置分割线
        mFragment2Binding.rvGuideList.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
                outRect.bottom = 10;
                outRect.top = 10;
                outRect.left = 25;
                outRect.right = 25;
            }
        });

//设置动画
        mFragment2Binding.rvGuideList.setItemAnimator(new DefaultItemAnimator());
        mFragment2Binding.rvGuideList.setAdapter(adapter);
        setViewState(ViewState.SUCCESS);
    }

    @Override
    public void showErrorView() {
        setViewState(ViewState.ERROR);
    }
}

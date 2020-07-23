package com.example.epidemicscenarioapplication.view.fragment;

import android.graphics.Rect;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.epidemicscenarioapplication.R;
import com.example.epidemicscenarioapplication.adapter.WikipediaPageFragmentAdapter;
import com.example.epidemicscenarioapplication.base.BaseFragment;

import com.example.epidemicscenarioapplication.base.IBaseView;
import com.example.epidemicscenarioapplication.databinding.BaseFragmentNetworkErrorBinding;
import com.example.epidemicscenarioapplication.databinding.WikipediaFragmentDiagnosisBinding;
import com.example.epidemicscenarioapplication.domain.API;
import com.example.epidemicscenarioapplication.domain.WikipediaDataBean;
import com.example.epidemicscenarioapplication.model.impl.WikipediaModel;
import com.example.epidemicscenarioapplication.presenter.impl.WikipediaPresenter;
import com.example.epidemicscenarioapplication.utils.ConstantsUtils;
import com.example.epidemicscenarioapplication.utils.RetrofitManager;
import com.example.epidemicscenarioapplication.view.IWikipediaView;
import com.example.epidemicscenarioapplication.view.activity.WebPageActivity;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * @author sly
 * @version 1.0
 * @date 2020/7/6
 * @description com.example.epidemicscenarioapplication.view.fragment
 */
public class WikipediaDiagnosisPageFragment extends BaseFragment implements IWikipediaView<WikipediaDataBean> {

    private static final String TAG = "WikipediaDiagnosisPageF";

    private WikipediaPageFragmentAdapter mWikipediaDiagnoseAdapter;
    private LinearLayout mTengxun1FragmentBindingRoot;
    private WikipediaFragmentDiagnosisBinding mTengxun1FragmentBinding;
    private WikipediaPresenter mWikipediaPresenter;

    @Override
    protected void initListener() {
        mNetworkErrorBinding.llNetwork.setOnClickListener(v -> {
            mWikipediaPresenter.loadData(WikipediaModel.WikipediaType.DIAGONSIS);
            Log.d(TAG, "onClick: 重新加载数据");
        });
                
    }

    @Override
    protected void initData() {
        mWikipediaPresenter.loadData(WikipediaModel.WikipediaType.DIAGONSIS);

    }



    @Override
    protected void initPresenter() {
        mWikipediaPresenter = new WikipediaPresenter(this);
    }

    @Override
    protected void initView() {
    }

    @Override
    protected View getSuccessView(LayoutInflater inflater, ViewGroup container) {
        mTengxun1FragmentBinding = WikipediaFragmentDiagnosisBinding.inflate(inflater, container, false);
        mTengxun1FragmentBindingRoot = mTengxun1FragmentBinding.getRoot();
        return mTengxun1FragmentBindingRoot;
    }




    @Override
    public void showLoadingView() {
            setViewState(ViewState.LOADING);
    }


    @Override
    public void showErrorView() {
        setViewState(ViewState.ERROR);
    }

    @Override
    public void showSuccessView(WikipediaDataBean body) {
        ArrayList<WikipediaDataBean.DataBean.DocsBean> docsBeans;
//                    返回的就是docs集合对象
        docsBeans = (ArrayList<WikipediaDataBean.DataBean.DocsBean>)body.getData().getDocs();
        mWikipediaDiagnoseAdapter = new WikipediaPageFragmentAdapter();
        mWikipediaDiagnoseAdapter.setOnItemListener(position -> {
        WebPageActivity.start(mTengxun1FragmentBindingRoot.getContext(),docsBeans.get(position).getH5url());
        });

        mWikipediaDiagnoseAdapter.setDataBeans(docsBeans);
        //设置布局管理器
        LinearLayoutManager manager = new LinearLayoutManager(mTengxun1FragmentBindingRoot.getContext());
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        mTengxun1FragmentBinding.rvDiagnoseList.setLayoutManager(manager);

//设置分割线
        mTengxun1FragmentBinding.rvDiagnoseList.addItemDecoration(new RecyclerView.ItemDecoration() {
@Override
public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
        outRect.bottom = 10;
        outRect.top = 10;
        outRect.left = 25;
        outRect.right = 25;
        }
        });

//设置动画
        mTengxun1FragmentBinding.rvDiagnoseList.setItemAnimator(new DefaultItemAnimator());
//设置Adapter
        mTengxun1FragmentBinding.rvDiagnoseList.setAdapter(mWikipediaDiagnoseAdapter);
        setViewState(ViewState.SUCCESS);
    }

}

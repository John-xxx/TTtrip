package ownhome.top.tttrip.ui;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.chad.library.adapter.base.BaseQuickAdapter;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import ownhome.top.tttrip.R;
import ownhome.top.tttrip.adapter.TripRecyclerViewAdapter;
import ownhome.top.tttrip.bean.response.PersonBean;

/**
 * description：
 * date：2018/4/25 14:01
 * author：ZouChao
 * email：475934874@qq.com
 */
public class TripRecordActivity extends Activity implements BaseQuickAdapter.RequestLoadMoreListener, SwipeRefreshLayout.OnRefreshListener {

    ArrayList<PersonBean> arrayList;
    TripRecyclerViewAdapter adapter;
    @BindView(R.id.rv_list)
    RecyclerView rvList;
    @BindView(R.id.srl_refresh)
    SwipeRefreshLayout srlRefresh;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triprecord);
        ButterKnife.bind(this);

        initData();
    }

    protected void initData() {
        arrayList = new ArrayList<>();
        adapter = new TripRecyclerViewAdapter();
        adapter.setOnLoadMoreListener(this, rvList);
        adapter.openLoadAnimation(BaseQuickAdapter.SLIDEIN_RIGHT);
        rvList.setAdapter(adapter);
        rvList.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        PersonBean personBean = new PersonBean();
        personBean.setName("邹超");
        personBean.setAge(25);
        personBean.setAddress("成都市武侯区人民南路四段");
        personBean.setSex("男");
        PersonBean personBean1 = new PersonBean();
        personBean1.setName("陈祥");
        personBean1.setAge(29);
        personBean1.setAddress("成都市武侯区人民南路四段");
        personBean1.setSex("女");

        arrayList.add(personBean);
        arrayList.add(personBean1);
        arrayList.add(personBean);
        arrayList.add(personBean1);
        arrayList.add(personBean);
        arrayList.add(personBean1);
        arrayList.add(personBean);
        arrayList.add(personBean1);
        arrayList.add(personBean);
        arrayList.add(personBean1);
        arrayList.add(personBean);
        arrayList.add(personBean1);
        adapter.setNewData(arrayList);
    }

    @Override
    public void onRefresh() {
        adapter.setEnableLoadMore(false);
        PersonBean personBean = new PersonBean();
        personBean.setName("邹超");
        personBean.setAge(25);
        personBean.setAddress("成都市武侯区人民南路四段");
        personBean.setSex("男");
        PersonBean personBean1 = new PersonBean();
        personBean1.setName("陈祥");
        personBean1.setAge(29);
        personBean1.setAddress("成都市武侯区人民南路四段");
        personBean1.setSex("女");

        arrayList.add(personBean);
        arrayList.add(personBean1);
        arrayList.add(personBean);
        arrayList.add(personBean1);
        arrayList.add(personBean);
        arrayList.add(personBean1);
        arrayList.add(personBean);
        arrayList.add(personBean1);
        arrayList.add(personBean);
        arrayList.add(personBean1);
        arrayList.add(personBean);
        arrayList.add(personBean1);
        adapter.setNewData(arrayList);
        adapter.setEnableLoadMore(true);
        srlRefresh.setEnabled(true);
        srlRefresh.setRefreshing(false);
    }

    @Override
    public void onLoadMoreRequested() {
        srlRefresh.setEnabled(false);
        Log.i("tag","start");
        PersonBean personBean = new PersonBean();
        personBean.setName("邹超");
        personBean.setAge(25);
        personBean.setAddress("成都市武侯区人民南路四段");
        personBean.setSex("男");
        PersonBean personBean1 = new PersonBean();
        personBean1.setName("陈祥");
        personBean1.setAge(29);
        personBean1.setAddress("成都市武侯区人民南路四段");
        personBean1.setSex("女");
        ArrayList<PersonBean> arrayList = new ArrayList<>();
        arrayList.add(personBean);
        arrayList.add(personBean1);
        arrayList.add(personBean);
        arrayList.add(personBean1);
        adapter.addData(arrayList);
        srlRefresh.setEnabled(true);
        adapter.loadMoreComplete();
        adapter.loadMoreEnd(false);

    }
}

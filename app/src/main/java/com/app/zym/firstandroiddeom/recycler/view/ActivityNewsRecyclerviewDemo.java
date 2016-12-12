package com.app.zym.firstandroiddeom.recycler.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.app.zym.firstandroiddeom.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/9.
 */

public class ActivityNewsRecyclerviewDemo extends AppCompatActivity {
    private RecyclerView rvDemo;
    private ActivityNewsAdapter mAdapter;
    private List<NewsInfo> mlist;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_recyclerview);
        rvDemo = (RecyclerView) findViewById(R.id.rv_news);
        rvDemo.setLayoutManager(new LinearLayoutManager(this));
        initData();
        mAdapter = new ActivityNewsAdapter(this,mlist);
        rvDemo.setAdapter(mAdapter);
    }
    public void initData(){
        mlist = new ArrayList<>();
        NewsInfo ni = new NewsInfo();
        ni.adr = "广东-深圳";
        ni.age = "25";
        ni.context = "我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴";
        ni.distance = "3.5";
        ni.head = R.mipmap.ds;
        ni.name = "风景1";
        mlist.add(ni);
        ni = new NewsInfo();
        ni.adr = "广东-深圳";
        ni.age = "25";
        ni.context = "我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴";
        ni.distance = "3.5";
        ni.head = R.mipmap.ds;
        ni.name = "风景1";
        mlist.add(ni);
        ni = new NewsInfo();
        ni.adr = "广东-深圳";
        ni.age = "25";
        ni.context = "我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴";
        ni.distance = "3.5";
        ni.head = R.mipmap.ds;
        ni.name = "风景1";
        mlist.add(ni);
        ni = new NewsInfo();
        ni.adr = "广东-深圳";
        ni.age = "25";
        ni.context = "我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴";
        ni.distance = "3.5";
        ni.head = R.mipmap.ds;
        ni.name = "风景1";
        mlist.add(ni);
        ni = new NewsInfo();
        ni.adr = "广东-深圳";
        ni.age = "25";
        ni.context = "我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴";
        ni.distance = "2223.5";
        ni.head = R.mipmap.ds;
        ni.name = "风景1";
        mlist.add(ni);
    }
}

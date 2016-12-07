package com.app.zym.firstandroiddeom;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/7.
 */

public class ActivityMeListView extends AppCompatActivity {
    private ListView mList;
    private ActivitymeAdapter mAdapter;
    private List<MeInfo> mlist;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me_list_view);
        mList = (ListView) findViewById(R.id.lv_me_list);
        initData();
        mAdapter = new ActivitymeAdapter(this,R.layout.activity_me_item,mlist);
        mList.setAdapter(mAdapter);
    }
    public void initData(){
        mlist = new ArrayList<>();
        MeInfo mi = new MeInfo();
        mi.icon = R.mipmap.me_vip;
        mi.slogan= "会员充值";
        mlist.add(mi);
        mi = new MeInfo();
        mi.icon = R.mipmap.me_info;
        mi.slogan= "我的资料";
        mlist.add(mi);
        mi = new MeInfo();
        mi.icon = R.mipmap.me_biaoqian;
        mi.slogan= "我的标签";
        mlist.add(mi);
        mi = new MeInfo();
        mi.icon = R.mipmap.me_say;
        mi.slogan= "我的说说";
        mlist.add(mi);
        mi = new MeInfo();
        mi.icon = R.mipmap.me_friend;
        mi.slogan= "交友条件";
        mlist.add(mi);
        mi = new MeInfo();
        mi.icon = R.mipmap.me_server;
        mi.slogan= "联系客服";
        mlist.add(mi);
        mi = new MeInfo();
        mi.icon = R.mipmap.me_setting;
        mi.slogan= "设置";
        mlist.add(mi);

    }
}

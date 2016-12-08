package com.app.zym.firstandroiddeom;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/8.
 */

public class ActivityWoListView extends AppCompatActivity {
    private ListView mList;
    private ActivityWoAdapter mAdapter;
    private List<WoInfo> mlis;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wo_list_view);
        mList = (ListView) findViewById(R.id.lv_wo_list);
        initData();
        mAdapter = new ActivityWoAdapter(this, R.layout.activity_wo_item,mlis);
        mList.setAdapter(mAdapter);
    }
    public void initData(){
        mlis = new ArrayList<>();
        WoInfo wo = new WoInfo();
        wo.head = R.mipmap.me_vip;
        wo.value = "会员充值";
        mlis.add(wo);
        wo = new WoInfo();
        wo.head = R.mipmap.me_info;
        wo.value = "我的资料";
        mlis.add(wo);
        wo = new WoInfo();
        wo.head = R.mipmap.me_biaoqian;
        wo.value = "我的标签";
        mlis.add(wo);
        wo = new WoInfo();
        wo.head = R.mipmap.me_say;
        wo.value = "我的说说";
        mlis.add(wo);
        wo = new WoInfo();
        wo.head = R.mipmap.me_friend;
        wo.value = "交友条件";
        mlis.add(wo);
        wo = new WoInfo();
        wo.head = R.mipmap.me_server;
        wo.value = "联系客服";
        mlis.add(wo);
        wo = new WoInfo();
        wo.head = R.mipmap.me_setting;
        wo.value = "设置";
        mlis.add(wo);

    }
}


package com.app.zym.firstandroiddeom;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/6.
 */

public class ActivityHomeListView extends AppCompatActivity {
    private ListView mlistview;
    private List<HomeUserInFo> mlist;
    private ActivityHomeAdapter mAdapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_listview);
        mlistview = (ListView) findViewById(R.id.lv_home);
        initData();
        mAdapter = new ActivityHomeAdapter(this,R.layout.activity_home_item,mlist);
        mlistview.setAdapter(mAdapter);
    }
    public void initData(){
        mlist = new ArrayList<>();
        HomeUserInFo ui = new HomeUserInFo();
        ui.head= R.mipmap.as;
        ui.adr = "广东-深圳";
        ui.age = "25";
        ui.name= "风景1";
        ui.distance = "3.5";
        ui.content = "我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴";
        mlist.add(ui );
        ui = new HomeUserInFo();
        ui.head= R.mipmap.ds;
        ui.adr = "广东-深圳";
        ui.age = "26";
        ui.name= "风景2";
        ui.distance = "4.5";
        ui.content = "我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴";
        mlist.add(ui );
        ui = new HomeUserInFo();
        ui.head= R.mipmap.vc;
        ui.adr = "广东-深圳";
        ui.age = "30";
        ui.name= "风景3";
        ui.distance = "8.5";
        ui.content = "我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴";
        mlist.add(ui );
        ui = new HomeUserInFo();
        ui.head= R.mipmap.jp;
        ui.adr = "广东-深圳";
        ui.age = "28";
        ui.name= "风景4";
        ui.distance = "9999";
        ui.content = "我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴";
        mlist.add(ui );
        ui = new HomeUserInFo();
        ui.head= R.mipmap.as;
        ui.adr = "广东-深圳";
        ui.age = "25";
        ui.name= "风景1";
        ui.distance = "3.5";
        ui.content = "我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴";
        mlist.add(ui );ui = new HomeUserInFo();
        ui.head= R.mipmap.as;
        ui.adr = "广东-深圳";
        ui.age = "25";
        ui.name= "风景1";
        ui.distance = "3.5";
        ui.content = "我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴";
        mlist.add(ui );ui = new HomeUserInFo();
        ui.head= R.mipmap.as;
        ui.adr = "广东-深圳";
        ui.age = "25";
        ui.name= "风景1";
        ui.distance = "3.5";
        ui.content = "我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴";
        mlist.add(ui );ui = new HomeUserInFo();
        ui.head= R.mipmap.as;
        ui.adr = "广东-深圳";
        ui.age = "25";
        ui.name= "风景1";
        ui.distance = "3.5";
        ui.content = "我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴";
        mlist.add(ui );ui = new HomeUserInFo();
        ui.head= R.mipmap.as;
        ui.adr = "广东-深圳";
        ui.age = "25";
        ui.name= "风景1";
        ui.distance = "3.5";
        ui.content = "我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴";
        mlist.add(ui );ui = new HomeUserInFo();
        ui.head= R.mipmap.as;
        ui.adr = "广东-深圳";
        ui.age = "25";
        ui.name= "风景1";
        ui.distance = "3.5";
        ui.content = "我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴";
        mlist.add(ui );
    }
}

package com.app.zym.firstandroiddeom;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/5.
 */

public class ActivityNearbyListView extends AppCompatActivity {
    private ListView lvInfo;
    private ListViewNearbyAdapter mAdapter;
    private List<NearbyUserInfo> mlist;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nearby_list_view);
        lvInfo = (ListView) findViewById(R.id.lv_show_info);
        initData();
        mAdapter = new ListViewNearbyAdapter(this,R.layout.activity_nearby_item_show_info,mlist);
        lvInfo.setAdapter(mAdapter);
    }
    private void initData(){
        mlist = new ArrayList<>();
        NearbyUserInfo  ui = new NearbyUserInfo();
        ui.head= R.mipmap.ds;
        ui.adr= "广东--深圳";
        ui.age="24";
        ui.content="我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴";
        ui.name= "风景1";
        ui.distance="6.5";
        mlist.add(ui );
        ui = new NearbyUserInfo();
        ui.head= R.mipmap.as;
        ui.adr= "广东--深圳";
        ui.age="26";
        ui.content="我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴";
        ui.name= "风景2";
        ui.distance="8.5";
        mlist.add(ui );
        ui = new NearbyUserInfo();
        ui.head= R.mipmap.vc;
        ui.adr= "广东--深圳";
        ui.age="28";
        ui.content="我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴";
        ui.name= "风景3";
        ui.distance="39";
        mlist.add(ui );
        ui = new NearbyUserInfo();
        ui.head= R.mipmap.ew;
        ui.adr= "广东--深圳";
        ui.age="23";
        ui.content="我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴";
        ui.name= "风景4";
        ui.distance="3.8";
        mlist.add(ui );
        ui = new NearbyUserInfo();
        ui.head= R.mipmap.ew;
        ui.adr= "广东--深圳";
        ui.age="23";
        ui.content="我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴";
        ui.name= "风景4";
        ui.distance="3.8";
        mlist.add(ui );
        ui = new NearbyUserInfo();
        ui.head= R.mipmap.ew;
        ui.adr= "广东--深圳";
        ui.age="23";
        ui.content="我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴";
        ui.name= "风景4";
        ui.distance="3.8";
        mlist.add(ui );
        ui = new NearbyUserInfo();
        ui.head= R.mipmap.ew;
        ui.adr= "广东--深圳";
        ui.age="23";
        ui.content="我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴";
        ui.name= "风景4";
        ui.distance="3.8";
        mlist.add(ui );
        ui = new NearbyUserInfo();
        ui.head= R.mipmap.ew;
        ui.adr= "广东--深圳";
        ui.age="23";
        ui.content="我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴";
        ui.name= "风景4";
        ui.distance="3.8";
        mlist.add(ui );
        ui = new NearbyUserInfo();
        ui.head= R.mipmap.ew;
        ui.adr= "广东--深圳";
        ui.age="23";
        ui.content="我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴";
        ui.name= "风景4";
        ui.distance="3.8";
        mlist.add(ui );
        ui = new NearbyUserInfo();
        ui.head= R.mipmap.ew;
        ui.adr= "广东--深圳";
        ui.age="23";
        ui.content="我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴";
        ui.name= "风景4";
        ui.distance="3.8";
        mlist.add(ui );
        ui = new NearbyUserInfo();
        ui.head= R.mipmap.ew;
        ui.adr= "广东--深圳";
        ui.age="23";
        ui.content="我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴";
        ui.name= "风景4";
        ui.distance="3.8";
        mlist.add(ui );
        ui = new NearbyUserInfo();
        ui.head= R.mipmap.ew;
        ui.adr= "广东--深圳";
        ui.age="23";
        ui.content="我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴";
        ui.name= "风景4";
        ui.distance="3.8";
        mlist.add(ui );


    }
}

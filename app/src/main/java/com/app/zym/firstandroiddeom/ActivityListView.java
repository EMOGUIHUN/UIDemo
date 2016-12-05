package com.app.zym.firstandroiddeom;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/3.
 */

public class ActivityListView extends AppCompatActivity {

    private ListView lvShowUserInfo;
    private ShowUserInfoAdapter mAdapter;
    private List<UserInfo> mList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        lvShowUserInfo = (ListView) findViewById(R.id.lv_show_user_info);
        initData();
        mAdapter = new ShowUserInfoAdapter(this, R.layout.lv_item_user_info,mList);
        lvShowUserInfo.setAdapter(mAdapter);
    }

    private void initData(){
        mList = new ArrayList<>();
        UserInfo ui = new UserInfo();
        ui.head = R.mipmap.as;
        ui.name = "名字1";
        ui.age = 18;
        ui.content = "内容1";
        ui.distance = 2.1;
        mList.add(ui);
        ui = new UserInfo();
        ui.head = R.mipmap.ew;
        ui.name = "名字2";
        ui.age = 19;
        ui.content = "内容2";
        ui.distance = 2.8;
        mList.add(ui);
        ui = new UserInfo();
        ui.head = R.mipmap.dp;
        ui.name = "名字3";
        ui.age = 20;
        ui.content = "内容3";
        ui.distance = 3.1;
        mList.add(ui);

        ui = new UserInfo();
        ui.head = R.mipmap.dp;
        ui.name = "名字3";
        ui.age = 20;
        ui.content = "内容3";
        ui.distance = 3.1;
        mList.add(ui);
        ui = new UserInfo();
        ui.head = R.mipmap.dp;
        ui.name = "名字3";
        ui.age = 20;
        ui.content = "内容3";
        ui.distance = 3.1;
        mList.add(ui);
        ui = new UserInfo();
        ui.head = R.mipmap.dp;
        ui.name = "名字3";
        ui.age = 20;
        ui.content = "内容3";
        ui.distance = 3.1;
        mList.add(ui);
        ui = new UserInfo();
        ui.head = R.mipmap.dp;
        ui.name = "名字3";
        ui.age = 20;
        ui.content = "内容3";
        ui.distance = 3.1;
        mList.add(ui);
        ui = new UserInfo();
        ui.head = R.mipmap.dp;
        ui.name = "名字3";
        ui.age = 20;
        ui.content = "内容3";
        ui.distance = 3.1;
        mList.add(ui);
        ui = new UserInfo();
        ui.head = R.mipmap.dp;
        ui.name = "名字3";
        ui.age = 20;
        ui.content = "内容3";
        ui.distance = 3.1;
        mList.add(ui);
        ui = new UserInfo();
        ui.head = R.mipmap.dp;
        ui.name = "名字3";
        ui.age = 20;
        ui.content = "内容3";
        ui.distance = 3.1;
        mList.add(ui);
        ui = new UserInfo();
        ui.head = R.mipmap.dp;
        ui.name = "名字3";
        ui.age = 20;
        ui.content = "内容3";
        ui.distance = 3.1;
        mList.add(ui);
        ui = new UserInfo();
        ui.head = R.mipmap.dp;
        ui.name = "名字3";
        ui.age = 20;
        ui.content = "内容3";
        ui.distance = 3.1;
        mList.add(ui);
        ui = new UserInfo();
        ui.head = R.mipmap.dp;
        ui.name = "名字3";
        ui.age = 20;
        ui.content = "内容3";
        ui.distance = 3.1;
        mList.add(ui);
    }
}

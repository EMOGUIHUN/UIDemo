package com.app.zym.firstandroiddeom.recycler.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.app.zym.firstandroiddeom.HomeUserInFo;
import com.app.zym.firstandroiddeom.NearbyUserInfo;
import com.app.zym.firstandroiddeom.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/8.
 */

public class ActivityRvDemo extends AppCompatActivity {

    private RecyclerView rvDemo;
    private RvAdapter mAdapter;
    private List<HomeUserInFo> mlist;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rv_demo);
        rvDemo = (RecyclerView) findViewById(R.id.rv_demo);
        //设置类型  LinearLayoutManager类似ListView   GridLayoutManager类型GridView
        //new StaggeredGridLayoutManager(2, OrientationHelper.VERTICAL));//这里用线性宫格显示 类似于瀑布流
        rvDemo.setLayoutManager(new LinearLayoutManager(this));
        initData();
        mAdapter = new RvAdapter(this,mlist);
        rvDemo.setAdapter(mAdapter);
    }
    private void initData(){
        mlist = new ArrayList<>();
        HomeUserInFo ui = new HomeUserInFo();
        ui.head= R.mipmap.ds;
        ui.adr= "广东--深圳";
        ui.age="24";
        ui.content="我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴";
        ui.name= "风景1";
        ui.distance="6.5";
        mlist.add(ui );
        ui = new HomeUserInFo();
        ui.head= R.mipmap.as;
        ui.adr= "广东--深圳";
        ui.age="26";
        ui.content="我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴";
        ui.name= "风景2";
        ui.distance="8.5";
        mlist.add(ui );
        ui = new HomeUserInFo();
        ui.head= R.mipmap.vc;
        ui.adr= "广东--深圳";
        ui.age="28";
        ui.content="我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴";
        ui.name= "风景3";
        ui.distance="39";
        mlist.add(ui );
        ui = new HomeUserInFo();
        ui.head= R.mipmap.ew;
        ui.adr= "广东--深圳";
        ui.age="23";
        ui.content="我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴";
        ui.name= "风景4";
        ui.distance="3.8";
        mlist.add(ui );
        ui = new HomeUserInFo();
        ui.head= R.mipmap.ew;
        ui.adr= "广东--深圳";
        ui.age="23";
        ui.content="我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴";
        ui.name= "风景4";
        ui.distance="3.8";
        mlist.add(ui );
        ui = new HomeUserInFo();
        ui.head= R.mipmap.ew;
        ui.adr= "广东--深圳";
        ui.age="23";
        ui.content="我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴";
        ui.name= "风景4";
        ui.distance="3.8";
        mlist.add(ui );
        ui = new HomeUserInFo();
        ui.head= R.mipmap.ew;
        ui.adr= "广东--深圳";
        ui.age="23";
        ui.content="我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴";
        ui.name= "风景4";
        ui.distance="3.8";
        mlist.add(ui );
        ui = new HomeUserInFo();
        ui.head= R.mipmap.ew;
        ui.adr= "广东--深圳";
        ui.age="23";
        ui.content="我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴";
        ui.name= "风景4";
        ui.distance="3.8";
        mlist.add(ui );
        ui = new HomeUserInFo();
        ui.head= R.mipmap.ew;
        ui.adr= "广东--深圳";
        ui.age="23";
        ui.content="我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴";
        ui.name= "风景4";
        ui.distance="3.8";
        mlist.add(ui );
        ui = new HomeUserInFo();
        ui.head= R.mipmap.ew;
        ui.adr= "广东--深圳";
        ui.age="23";
        ui.content="我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴";
        ui.name= "风景4";
        ui.distance="3.8";
        mlist.add(ui );
        ui = new HomeUserInFo();
        ui.head= R.mipmap.ew;
        ui.adr= "广东--深圳";
        ui.age="23";
        ui.content="我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴";
        ui.name= "风景4";
        ui.distance="3.8";
        mlist.add(ui );
        ui = new HomeUserInFo();
        ui.head= R.mipmap.ew;
        ui.adr= "广东--深圳";
        ui.age="23";
        ui.content="我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴我是一个大大咧咧，体贴";
        ui.name= "风景4";
        ui.distance="3.8";
        mlist.add(ui );


    }
}

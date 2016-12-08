package com.app.zym.firstandroiddeom.recycler.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.app.zym.firstandroiddeom.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/8.
 */

public class ActivityRecyclerviewDemo extends AppCompatActivity{
    private RecyclerView rvDemo;
    private ActivityRvAdapter mAdapter;
    private List<RvInfo> mlist;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);
        rvDemo = (RecyclerView) findViewById(R.id.rv_demo);
        rvDemo.setLayoutManager(new GridLayoutManager(this,3));
        initData();
        mAdapter = new ActivityRvAdapter(this,mlist);
        rvDemo.setAdapter(mAdapter);
    }
    public void initData(){
        mlist = new ArrayList<>();
        RvInfo ri  = new RvInfo();
        ri.head = R.mipmap.as;
        ri.name = "风景";
        mlist.add(ri);
        ri  = new RvInfo();
        ri.head = R.mipmap.as;
        ri.name = "风景";
        mlist.add(ri);
        ri  = new RvInfo();
        ri.head = R.mipmap.as;
        ri.name = "风景";
        mlist.add(ri);
        ri  = new RvInfo();
        ri.head = R.mipmap.as;
        ri.name = "风景";
        mlist.add(ri);
        ri  = new RvInfo();
        ri.head = R.mipmap.as;
        ri.name = "风景";
        mlist.add(ri);
        ri  = new RvInfo();
        ri.head = R.mipmap.as;
        ri.name = "风景";
        mlist.add(ri);
        ri  = new RvInfo();
        ri.head = R.mipmap.as;
        ri.name = "风景";
        mlist.add(ri);
        ri  = new RvInfo();
        ri.head = R.mipmap.as;
        ri.name = "风景";
        mlist.add(ri);
        ri  = new RvInfo();
        ri.head = R.mipmap.as;
        ri.name = "风景";
        mlist.add(ri);
        ri  = new RvInfo();
        ri.head = R.mipmap.as;
        ri.name = "风景";
        mlist.add(ri);
        ri  = new RvInfo();
        ri.head = R.mipmap.as;
        ri.name = "风景";
        mlist.add(ri);
        ri  = new RvInfo();
        ri.head = R.mipmap.as;
        ri.name = "风景";
        mlist.add(ri);
        ri  = new RvInfo();
        ri.head = R.mipmap.as;
        ri.name = "风景";
        mlist.add(ri);
        ri  = new RvInfo();
        ri.head = R.mipmap.as;
        ri.name = "风景";
        mlist.add(ri);
    }
}

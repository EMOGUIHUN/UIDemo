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
 * Created by Administrator on 2016/12/8.
 */

public class ActivityEmoTionDemo  extends AppCompatActivity {
    private RecyclerView rvDemo;
    private List<EmoTionInfo> mlist;
    private ActivityEmoTionAdapter mAdapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emotion_rv);
        rvDemo = (RecyclerView) findViewById(R.id.rv_emotion);
        rvDemo.setLayoutManager(new LinearLayoutManager(this));
        initData();
        mAdapter = new ActivityEmoTionAdapter(this,mlist);
        rvDemo.setAdapter(mAdapter);
    }
    public void initData(){
        mlist = new ArrayList<>();
        EmoTionInfo ei = new EmoTionInfo();
        ei.adr= "广东—深圳";
        ei.anonymous = "别人眼中的幸福";
        ei.context = "同事霞是我们办公室公认的幸福女人，老公是一为外科医生，人长得高大帅气，还有.......";
        ei.head = R.mipmap.ds;
        ei.photo = R.mipmap.as;
        ei.leave = "1";
        ei.like = "5";
        ei.name = "风景一";
        ei.time = "440";
        mlist.add(ei);
        ei = new EmoTionInfo();
        ei.adr= "广东—深圳";
        ei.anonymous = "别人眼中的幸福";
        ei.context = "同事霞是我们办公室公认的幸福女人，老公是一为外科医生，人长得高大帅气，还有.......";
        ei.head = R.mipmap.ds;
        ei.photo = R.mipmap.as;
        ei.leave = "1";
        ei.like = "5";
        ei.name = "风景一";
        ei.time = "440";
        mlist.add(ei);
        ei = new EmoTionInfo();
        ei.adr= "广东—深圳";
        ei.anonymous = "别人眼中的幸福";
        ei.context = "同事霞是我们办公室公认的幸福女人，老公是一为外科医生，人长得高大帅气，还有.......";
        ei.head = R.mipmap.ds;
        ei.photo = R.mipmap.as;
        ei.leave = "1";
        ei.like = "5";
        ei.name = "风景一";
        ei.time = "440";
        mlist.add(ei);
        ei = new EmoTionInfo();
        ei.adr= "广东—深圳";
        ei.anonymous = "别人眼中的幸福";
        ei.context = "同事霞是我们办公室公认的幸福女人，老公是一为外科医生，人长得高大帅气，还有.......";
        ei.head = R.mipmap.ds;
        ei.photo = R.mipmap.as;
        ei.leave = "1";
        ei.like = "5";
        ei.name = "风景一";
        ei.time = "440";
        mlist.add(ei);
    }
}

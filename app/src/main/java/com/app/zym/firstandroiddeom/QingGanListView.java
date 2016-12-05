package com.app.zym.firstandroiddeom;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by Administrator on 2016/12/4.
 */
public class QingGanListView extends AppCompatActivity {
    private ListView Lvuser;
    private QingGanAdapter mAdapter;
    private List<Qguserinfo> mlist;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qing_gan_list_view);
        Lvuser = (ListView) findViewById(R.id.lv_qing_gan);
        initData();
        mAdapter= new QingGanAdapter(this,R.layout.qing_gan_list,mlist);
        Lvuser.setAdapter(mAdapter);
    }
    private void initData(){
        mlist = new ArrayList<>();
        Qguserinfo  ur= new Qguserinfo();
        ur.head=R.mipmap.ew;
        ur.Head=R.mipmap.as;
        ur.adr= "广东—深圳";
        ur.name="风景";
        ur.niname="别人眼中的幸福";
        ur.content="同事霞是我们办公室公认的幸福女人，老公是一为外科医生，人长得高大帅气，人长得高大帅气人长得高大帅气";
        ur.day = 400;
        ur.liuyan="0";
        ur.dianzan="0";
        mlist.add(ur);
        ur = new Qguserinfo();
        ur.head=R.mipmap.dp;
        ur.Head=R.mipmap.ds;
        ur.adr= "广东—深圳";
        ur.name="风景1";
        ur.niname="别人眼中的幸福";
        ur.content="同事霞是我们办公室公认的幸福女人，老公是一为外科医生，人长得高大帅气，还有.......";
        ur.day = 401;
        ur.liuyan="2";
        ur.dianzan="5";
        mlist.add(ur);
        ur = new Qguserinfo();
        ur.head=R.mipmap.qw;
        ur.Head=R.mipmap.vc;
        ur.adr= "广东—深圳";
        ur.name="风景2";
        ur.niname="别人眼中的幸福";
        ur.content="同事霞是我们办公室公认的幸福女人，老公是一为外科医生，人长得高大帅气，还有.......";
        ur.day = 403;
        ur.liuyan="3";
        ur.dianzan="6";
        mlist.add(ur);
        ur = new Qguserinfo();
        ur.head=R.mipmap.jp;
        ur.Head=R.mipmap.ty;
        ur.adr= "广东—深圳";
        ur.name="风景3";
        ur.niname="别人眼中的幸福";
        ur.content="同事霞是我们办公室公认的幸福女人，老公是一为外科医生，人长得高大帅气，还有.......";
        ur.day = 402;
        ur.liuyan="4";
        ur.dianzan="9";
        mlist.add(ur);
    }
}

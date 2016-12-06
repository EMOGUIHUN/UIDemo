package com.app.zym.firstandroiddeom;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by Administrator on 2016/12/5.
 */
public class ActivityGvView extends AppCompatActivity {
    private GridView mGridView;
    private List<InfoUser> mList;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_girdview);
        mGridView = (GridView) findViewById(R.id.gv_info);
        initData();
        ActivityGvAdapter mAdapter = new ActivityGvAdapter(this,R.layout.activity_grid_item_view,mList);
        mGridView.setAdapter(mAdapter);
    }
    private void initData(){
        mList = new ArrayList<>();
        InfoUser in = new InfoUser();
        in.haed = R.mipmap.ds;
        in.name = "风景1";
        mList.add(in);
        in = new InfoUser();
        in.haed = R.mipmap.vc;
        in.name = "风景1";
        mList.add(in);
        in = new InfoUser();
        in.haed = R.mipmap.as;
        in.name = "风景1";
        mList.add(in);
        in = new InfoUser();
        in.haed = R.mipmap.as;
        in.name = "风景1";
        mList.add(in);
        in = new InfoUser();
        in.haed = R.mipmap.as;
        in.name = "风景1";
        mList.add(in);
        in = new InfoUser();
        in.haed = R.mipmap.as;
        in.name = "风景1";
        mList.add(in);
        in = new InfoUser();
        in.haed = R.mipmap.as;
        in.name = "风景1";
        mList.add(in);

    }
}

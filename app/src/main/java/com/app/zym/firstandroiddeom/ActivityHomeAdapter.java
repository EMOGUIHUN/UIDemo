package com.app.zym.firstandroiddeom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2016/12/6.
 */

public class ActivityHomeAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<HomeUserInFo> list;
    private LayoutInflater mInflater;
    public ActivityHomeAdapter(Context context,int layout,List<HomeUserInFo> list ){
        this.context = context;
        this.layout = layout;
        this.list = list;
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return list==null?0:list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView==null){
            viewHolder = new ViewHolder();
            convertView = mInflater.inflate(layout,null);
            viewHolder.ivHead = (ImageView) convertView.findViewById(R.id.iv_home_head);
            viewHolder.tvName = (TextView) convertView.findViewById(R.id.tv_home_name);
            viewHolder.tvAdr = (TextView) convertView.findViewById(R.id.tv_home_adr);
            viewHolder.tvAge = (TextView) convertView.findViewById(R.id.tv_home_age);
            viewHolder.tvContent = (TextView) convertView.findViewById(R.id.tv_home_content);
            viewHolder.tvDistance = (TextView) convertView.findViewById(R.id.tv_home_distance);
            convertView.setTag(viewHolder);
        }else{
            viewHolder= (ViewHolder) convertView.getTag();
        }
        HomeUserInFo hui = list.get(position);
        viewHolder.ivHead.setImageResource(hui.head);
        viewHolder.tvName.setText(hui.name);
        viewHolder.tvContent.setText(hui.content);
        viewHolder.tvAdr.setText(hui.adr);
        viewHolder.tvAge.setText(hui.age+"岁");
        viewHolder.tvDistance.setText(hui.distance+"km");
        return convertView;
    }
    static class ViewHolder{
        public ImageView ivHead;
        public TextView tvName,tvAdr,tvAge,tvContent,tvDistance;

    }
}

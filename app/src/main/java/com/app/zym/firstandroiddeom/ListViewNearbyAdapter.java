package com.app.zym.firstandroiddeom;

import android.content.Context;
import android.net.NetworkRequest;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2016/12/5.
 */

public class ListViewNearbyAdapter extends BaseAdapter {
    private Context  context;
    private int layout;
    private List<NearbyUserInfo> list;
    private LayoutInflater mInflater;
    public ListViewNearbyAdapter(Context context, int layout, List<NearbyUserInfo> list){
        this.context=context;
        this.layout=layout;
        this.list=list;
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
        ViewHolder  viewHolder;
        if(convertView==null){
            viewHolder = new ViewHolder();
            convertView = mInflater.inflate(layout,null);
            viewHolder.ivHead = (ImageView) convertView.findViewById(R.id.iv_item_head);
            viewHolder.tvName = (TextView) convertView.findViewById(R.id.tv_item_name);
            viewHolder.tvAdr = (TextView) convertView.findViewById(R.id.tv_item_adr);
            viewHolder.tvAge = (TextView) convertView.findViewById(R.id.tv_item_age);
            viewHolder.tvCcontent = (TextView) convertView.findViewById(R.id.tv_item_content);
            viewHolder.tvDistance = (TextView) convertView.findViewById(R.id.tv_item_distance);
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        }
        NearbyUserInfo nearby = list.get(position);
        Log.d("mToString", nearby.toString());
        viewHolder.tvAdr.setText(nearby.adr);
        viewHolder.ivHead.setImageResource(nearby.head);
        viewHolder.tvName.setText(nearby.name);
        viewHolder.tvAge.setText(nearby.age+"岁");
        viewHolder.tvCcontent.setText(nearby.content);
        viewHolder.tvDistance.setText(nearby.distance+"km");
        return convertView;
    }
    static class ViewHolder{
        public ImageView ivHead;
        public TextView tvName,tvAdr,tvAge,tvCcontent,tvDistance;
    }
}

package com.app.zym.firstandroiddeom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CalendarView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2016/12/8.
 */

public class ActivityWoAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<WoInfo> list;
    private LayoutInflater mInflater;
    public ActivityWoAdapter(Context context, int layout, List<WoInfo> list){
        this.context = context;
        this.layout = layout;
        this.list  = list;
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
            viewHolder.ivHead = (ImageView) convertView.findViewById(R.id.iv_vip_head);
            viewHolder.tvValue = (TextView) convertView.findViewById(R.id.tv_value);
            convertView.setTag(viewHolder);
        }else{
            viewHolder= (ViewHolder) convertView.getTag();
        }
        WoInfo wo = list.get(position);
        viewHolder.ivHead.setImageResource(wo.head);
        viewHolder.tvValue.setText(wo.value);
        return convertView;
    }
    static class ViewHolder{
        public ImageView ivHead;
        public TextView tvValue;
    }
}

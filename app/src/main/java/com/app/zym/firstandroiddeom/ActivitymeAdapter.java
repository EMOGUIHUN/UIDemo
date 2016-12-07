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
 * Created by Administrator on 2016/12/7.
 */

public class ActivitymeAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<MeInfo> list;
    private LayoutInflater mInflater;
    public ActivitymeAdapter(Context context, int layout, List<MeInfo> list){
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
            viewHolder=new ViewHolder();
            convertView = mInflater.inflate(layout,null);
            viewHolder.ivIcon = (ImageView) convertView.findViewById(R.id.iv_icon);
            viewHolder.tvSlogan  = (TextView) convertView.findViewById(R.id.tv_slogan);
            convertView.setTag(viewHolder);
        }else {
            viewHolder= (ViewHolder) convertView.getTag();
        }
        MeInfo  mi= list.get(position);
        viewHolder.ivIcon.setImageResource(mi.icon);
        viewHolder.tvSlogan.setText(mi.slogan);
        return convertView;
    }
    static class ViewHolder{
        public ImageView ivIcon;
        public TextView tvSlogan;
    }
}

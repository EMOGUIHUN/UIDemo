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
 * Created by Administrator on 2016/12/3.
 */

public class GridViewAdapter extends BaseAdapter {
    private LayoutInflater mInflater;
    private Context context;
    private int layout;
    private List<UserInfo> list;
    public GridViewAdapter(Context context,int layout,List<UserInfo> list){
        this.context =context;
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
        if (list == null){
            return null;
        }
        else {
            return list.get(position);
        }
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
            convertView = mInflater.inflate(layout, null);
            viewHolder.IvHead = (ImageView) convertView.findViewById(R.id.iv_head);
            viewHolder.tvName = (TextView) convertView.findViewById(R.id.tv_name);
            convertView.setTag(viewHolder);
        }else{
            viewHolder= (ViewHolder) convertView.getTag();
        }
        UserInfo user =list.get(position);
        viewHolder.IvHead.setImageResource(user.head);
        viewHolder.tvName.setText(user.name);
        return convertView;
    }
    static class ViewHolder{
        public ImageView IvHead;
        public TextView tvName;
    }
}

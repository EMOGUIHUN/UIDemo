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

public class ShowUserInfoAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater mInflater;
    private int layout;
    private List<UserInfo> list;

    public ShowUserInfoAdapter(Context context, int layout, List<UserInfo> list){
        this.context = context;
        this.layout = layout;
        this.list = list;
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return list == null ? 0 : list.size();
    }//获取行数

    @Override
    public Object getItem(int position) {//获取位置内容
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }//获取Id

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView == null){
            viewHolder = new ViewHolder();
            convertView = mInflater.inflate(layout, null);//讲xml文件转换为View对象
            viewHolder.ivHead = (ImageView) convertView.findViewById(R.id.iv_head);
            viewHolder.tvName = (TextView) convertView.findViewById(R.id.tv_name);
            viewHolder.tvAge = (TextView) convertView.findViewById(R.id.tv_age);
            viewHolder.tvContent = (TextView) convertView.findViewById(R.id.tv_content);
            viewHolder.tvDistance = (TextView) convertView.findViewById(R.id.tv_distance);
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        }

        UserInfo usif = list.get(position);
        viewHolder.ivHead.setImageResource(usif.head);
        viewHolder.tvName.setText(usif.name);
        viewHolder.tvAge.setText(usif.age + "岁");
        viewHolder.tvContent.setText(usif.content);
        viewHolder.tvDistance.setText(usif.distance + "km");
        return convertView;
    }

    static class ViewHolder{

        public ImageView ivHead;
        public TextView tvName,tvAge,tvContent,tvDistance;

    }
}

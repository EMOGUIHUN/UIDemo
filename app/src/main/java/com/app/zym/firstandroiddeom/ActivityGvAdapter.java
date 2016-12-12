package com.app.zym.firstandroiddeom;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2016/12/5.
 */

public class ActivityGvAdapter extends BaseAdapter {
    private LayoutInflater mInflater;
    private Context context;
    private int layout;
    private List<InfoUser> list;
    public ActivityGvAdapter(Context context, int layout, List<InfoUser> list){
        this.context= context;
        this.layout = layout;
        this.list = list;
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        wm = ((Activity)context).getWindowManager();
    }
    @Override
    public int getCount() {
        return list == null?0:list.size();
    }

    @Override
    public Object getItem(int position) {
        if(list==null){
            return null;
        }else{
            return list.get(position);
        }
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
    WindowManager wm;
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView==null){
            viewHolder = new ViewHolder();
            convertView= mInflater.inflate(layout,null);
            viewHolder.ivHead = (ImageView) convertView.findViewById(R.id.iv_head);
            viewHolder.tvName = (TextView) convertView.findViewById(R.id.tv_name);
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        }
        InfoUser user  = list.get(position);
        viewHolder.ivHead.setImageResource(user.haed);
        int width = wm.getDefaultDisplay().getWidth();
        ViewGroup.LayoutParams lp = viewHolder.ivHead.getLayoutParams();
        lp.width = (width - dip2px(context,3)*2)/3 ;
        lp.height = lp.width;
        viewHolder.ivHead.setLayoutParams(lp);
        viewHolder.tvName.setText(user.name);
        return convertView;
    }
    static class ViewHolder{
        public ImageView ivHead;
        public TextView tvName;
    }
    public int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }
}

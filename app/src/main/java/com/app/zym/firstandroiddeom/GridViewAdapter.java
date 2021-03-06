package com.app.zym.firstandroiddeom;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
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
        wm = ((Activity)context).getWindowManager();
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

    WindowManager wm;

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView==null){
             viewHolder = new ViewHolder();
            convertView = mInflater.inflate(layout, null);

            viewHolder.IvHead = (ImageView) convertView.findViewById(R.id.iv_head);

            int width = wm.getDefaultDisplay().getWidth();
            ViewGroup.LayoutParams lp = viewHolder.IvHead.getLayoutParams();
            lp.width = (width - dip2px(context,3)*2)/3 ;
            lp.height = lp.width;
            viewHolder.IvHead.setLayoutParams(lp);

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
    /**
     * 根据手机的分辨率从 dp 的单位 转成为 px(像素)
     */
    public int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }
}

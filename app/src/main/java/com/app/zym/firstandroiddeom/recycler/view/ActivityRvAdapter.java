package com.app.zym.firstandroiddeom.recycler.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.zym.firstandroiddeom.R;

import java.util.List;

/**
 * Created by Administrator on 2016/12/8.
 */

public class ActivityRvAdapter extends RecyclerView.Adapter<ActivityRvAdapter.ViewHolder> {
    private Context context;
    private List<RvInfo> list ;
    private LayoutInflater mInflater;
    public ActivityRvAdapter(Context context, List<RvInfo> list ){
        this.context = context;
        this.list = list;
        mInflater = LayoutInflater.from(context);
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(R.layout.activity_home_demo,parent,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        RvInfo ri = list.get(position);
        if(ri ==null){
            return;
        }
        holder.ivHead.setImageResource(ri.head);
        holder.tvName.setText(ri.name);
    }
    @Override
    public int getItemCount() {
        return list==null?0:list.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView ivHead;
        public TextView tvName;
        public ViewHolder(View itemView) {
            super(itemView);
            ivHead = (ImageView) itemView.findViewById(R.id.iv_head);
            tvName = (TextView) itemView.findViewById(R.id.tv_name);
        }
    }
}

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
 * Created by Administrator on 2016/12/9.
 */

public class ActivityNewsAdapter extends RecyclerView.Adapter<ActivityNewsAdapter.ViewHolder>{
    private Context context;
    private List<NewsInfo> list;
    private LayoutInflater mInflater;
    public ActivityNewsAdapter(Context context, List<NewsInfo> list){
        this.context = context;
        this.list = list;
        mInflater = LayoutInflater.from(context);
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(R.layout.activity_news_item,parent,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        NewsInfo ni = list.get(position);
        if(ni==null){
            return;
        }
        holder.ivHead.setImageResource(ni.head);
        holder.tvAdr.setText(ni.adr);
        holder.tvAge.setText(ni.age);
        holder.tvContext.setText(ni.context);
        holder.tvDistance.setText(ni.distance+"km");
        holder.tvName.setText(ni.name);
    }

    @Override
    public int getItemCount() {
        return list==null?0:list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView ivHead;
        public TextView tvName,tvAdr,tvAge,tvContext,tvDistance;
        public ViewHolder(View itemView) {
            super(itemView);
            ivHead = (ImageView) itemView.findViewById(R.id.iv_head);
            tvContext = (TextView) itemView.findViewById(R.id.tv_content);
            tvAge = (TextView) itemView.findViewById(R.id.tv_age);
            tvAdr = (TextView) itemView.findViewById(R.id.tv_adr);
            tvName = (TextView) itemView.findViewById(R.id.tv_name);
            tvDistance = (TextView) itemView.findViewById(R.id.tv_distance);
        }
    }
}

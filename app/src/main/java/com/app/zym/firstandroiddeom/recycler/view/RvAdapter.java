package com.app.zym.firstandroiddeom.recycler.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.app.zym.firstandroiddeom.HomeUserInFo;
import com.app.zym.firstandroiddeom.R;
import java.util.List;

/**
 * Created by Administrator on 2016/12/8.
 */

public class RvAdapter extends RecyclerView.Adapter<RvAdapter.ViewHolder> {
    private Context context;
    private List<HomeUserInFo> list;
    private LayoutInflater mLayoutInflater;
    public RvAdapter(Context context, List<HomeUserInFo> list){
        this.context= context;
        this.list = list;
        mLayoutInflater = LayoutInflater.from(context);
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = mLayoutInflater.inflate(R.layout.lv_item_user_info, parent, false);
        return new ViewHolder(itemView);
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        HomeUserInFo hui = list.get(position);
        if(hui == null){
            return;
        }
        holder.ivHead.setImageResource(hui.head);
        holder.tvAge.setText(hui.age);
        holder.tvName.setText(hui.name);
        holder.tvContent.setText(hui.content);
        holder.tvDistance.setText(hui.distance);
    }
    @Override
    public int getItemCount() {
        return list == null ? 0 : list.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView ivHead;
        public TextView tvName,tvAge,tvContent,tvDistance;
        public ViewHolder(View itemView) {
            super(itemView);
            ivHead = (ImageView) itemView.findViewById(R.id.iv_head);
            tvName = (TextView) itemView.findViewById(R.id.tv_name);
            tvAge = (TextView) itemView.findViewById(R.id.tv_age);
            tvContent = (TextView) itemView.findViewById(R.id.tv_content);
            tvDistance = (TextView) itemView.findViewById(R.id.tv_distance);
        }
    }
}

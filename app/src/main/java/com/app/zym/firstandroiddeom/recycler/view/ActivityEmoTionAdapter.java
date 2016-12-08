package com.app.zym.firstandroiddeom.recycler.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.app.zym.firstandroiddeom.R;

import java.util.List;


/**
 * Created by Administrator on 2016/12/8.
 */

public class ActivityEmoTionAdapter extends RecyclerView.Adapter<ActivityEmoTionAdapter.ViewHolder> {
    private Context context;
    private List<EmoTionInfo> list;
    private LayoutInflater mInflater;
    public ActivityEmoTionAdapter(Context context, List<EmoTionInfo> list){
        this.context = context;
        this.list = list;
        mInflater = LayoutInflater.from(context);
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(R.layout.activity_emotion_item,parent,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        EmoTionInfo ei = list.get(position);
        if(ei==null){
            return;
        }
        holder.tvTime.setText(ei.time+"天前");
        holder.tvLeave.setText(ei.leave);
        holder.tvlike.setText(ei.like);
        holder.tvContext.setText(ei.context);
        holder.tvanonymous.setText(ei.anonymous);
        holder.ivHead .setImageResource(ei.head);
        holder.ivPhoto.setImageResource(ei.photo);
        holder.tvAdr.setText(ei.adr);
        holder.tvName.setText(ei.name);
    }

    @Override
    public int getItemCount() {
        return list==null?0:list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView ivPhoto,ivHead;
        public TextView tvName,tvContext,tvanonymous,tvAdr,tvlike,tvLeave,tvTime;
        public ViewHolder(View itemView) {
            super(itemView);
            ivHead = (ImageView) itemView.findViewById(R.id.iv_head);
            ivPhoto = (ImageView) itemView.findViewById(R.id.iv_photo);
            tvName = (TextView) itemView.findViewById(R.id.tv_name);
            tvAdr = (TextView) itemView.findViewById(R.id.tv_adr);
            tvanonymous = (TextView) itemView.findViewById(R.id.tv_anonymous);
            tvContext = (TextView) itemView.findViewById(R.id.tv_content);
            tvlike = (TextView) itemView.findViewById(R.id.tv_like);
            tvLeave = (TextView) itemView.findViewById(R.id.tv_leave);
            tvTime = (TextView) itemView.findViewById(R.id.tv_time);
        }
    }
}

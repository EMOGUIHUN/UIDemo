package com.app.zym.firstandroiddeom;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import java.util.Queue;
/**
 * Created by Administrator on 2016/12/4.
 */
public class QingGanAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Qguserinfo> list;
    private LayoutInflater mInflater;
    public QingGanAdapter(Context context, int layout, List<Qguserinfo> list){
        this.context=context;
        this.layout=layout;
        this.list=list;
        mInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
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
        if (convertView==null){
            viewHolder = new ViewHolder();
            convertView= mInflater.inflate(layout ,null);
            viewHolder.Ivhead= (ImageView) convertView.findViewById(R.id.iv_head);
            viewHolder.ivHead= (ImageView) convertView.findViewById(R.id.iv_Head);
            viewHolder.tvadr= (TextView) convertView.findViewById(R.id.tv_adr);
            viewHolder.tvname= (TextView) convertView.findViewById(R.id.tv_name);
            viewHolder.tvshuo= (TextView) convertView.findViewById(R.id.tv_shuo_shuo);
            viewHolder.tvnimame= (TextView) convertView.findViewById(R.id.tv_niming);
            viewHolder.tvtian= (TextView) convertView.findViewById(R.id.tv_tian);
            viewHolder.tvliuyan = (TextView) convertView.findViewById(R.id.tv_liuyan);
            viewHolder.tvdianzan= (TextView) convertView.findViewById(R.id.dian_zan);
            convertView.setTag(viewHolder);
        }else{
            viewHolder= (ViewHolder) convertView.getTag();
        }
        Qguserinfo Qguser = list.get(position);
        viewHolder.Ivhead.setImageResource(Qguser.head);
        viewHolder.ivHead.setImageResource(Qguser.Head);
        viewHolder.tvname.setText(Qguser.name);
        viewHolder.tvshuo.setText(Qguser.content);
        viewHolder.tvnimame.setText(Qguser.niname);
        viewHolder.tvadr.setText(Qguser.adr);
        viewHolder.tvtian.setText(Qguser.day+"天前");
        viewHolder.tvliuyan.setText(Qguser.liuyan);
        viewHolder.tvdianzan.setText(Qguser.dianzan);
        return convertView;
    }
    static class ViewHolder{
         public ImageView Ivhead,ivHead;
         public TextView tvname,tvshuo,tvnimame,tvadr,tvtian,tvliuyan,tvdianzan;

    }
}

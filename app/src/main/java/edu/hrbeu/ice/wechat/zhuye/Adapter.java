package edu.hrbeu.ice.wechat.zhuye;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.List;

import edu.hrbeu.ice.wechat.R;

/**
 * Created by WIN8 on 2017/12/10.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{
    private List<Frag1_gift_image> List;

    //类中类
    static class ViewHolder extends RecyclerView.ViewHolder{
        View outlestView;     //保存子项最外层布局
        ImageView Image;
        public ViewHolder(View view){
            super(view);
            outlestView = view;   //将子项最外层布局赋值给变量
            Image = (ImageView)view.findViewById(R.id.gift_image);
        }
    }
    public Adapter(List<Frag1_gift_image> List){
        this.List = List;//将数据赋值给全局变量
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.gift_item,parent,false);
        final ViewHolder holder = new ViewHolder(view);
        //最外层布局注册事件
        holder.outlestView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int position = holder.getAdapterPosition();    //获取用户点击的position
                Frag1_gift_image one = List.get(position);         //得到相应Fruit实例
                Toast.makeText(view.getContext(),"you clicked view " + one.getImageId(),
                        Toast.LENGTH_SHORT).show();
            }
        });
        //为子项内控件注册事件
        holder.Image.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int position = holder.getAdapterPosition();
                Frag1_gift_image one = List.get(position);
                Toast.makeText(view.getContext(),"you clicked image " + one.getImageId(),
                        Toast.LENGTH_SHORT).show();
            }
        });
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Frag1_gift_image fruit = List.get(position);
        holder.Image.setImageResource(fruit.getImageId());
    }

    @Override
    public int getItemCount() {
        return List.size();
    }
}

package com.example.renokurniarw.recycleview;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by RenoKurniaRW on 10/4/2017.
 */

public class Adaptor extends RecyclerView.Adapter<Adaptor.myHolder> {

    String data1[],data2[];
    int img[];
    Context ctx;
    List<Content> data;

    public Adaptor(Context ct, String s1[], String s2[], int rs[],List<Content> content){
            ctx = ct;
        data1 = s1;
        data2 = s2;
        img = rs;
        data = content;

    }

    @Override
    public myHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater myInflater = LayoutInflater.from(ctx);
        View myView = myInflater.inflate(R.layout.recylcer_row,parent,false);


        return new myHolder(myView);
    }

    @Override
    public void onBindViewHolder(myHolder holder, int position) {
       final Content con = data.get(position);
        holder.t1.setText(data1[position]);
        holder.t2.setText(data2[position]);
        holder.myimg.setImageResource(img[position]);
       holder.rl.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent init = new Intent(ctx,detailActivity.class);
                 init.putExtra("judul",con.getJudul());
                 init.putExtra("Pembuatan",con.getPembuatan());
                 init.putExtra("Gambar",con.getImg());
                 ctx.startActivities(new Intent[]{init});
             }
        });
    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public  class  myHolder extends RecyclerView.ViewHolder{

        TextView t1,t2;
        ImageView myimg;
        RelativeLayout rl;

        public myHolder(View itemView) {
            super(itemView);
            t1 = (TextView)itemView.findViewById(R.id.textView1);
            t2 = (TextView)itemView.findViewById(R.id.textView2);
            myimg = (ImageView)itemView.findViewById(R.id.myImage);
            rl = (RelativeLayout)itemView.findViewById(R.id.relative);
        }
    }
}

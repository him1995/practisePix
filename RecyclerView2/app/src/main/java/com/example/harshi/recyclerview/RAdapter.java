package com.example.harshi.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.harshi.recyclerview.information.Information;

import java.util.ArrayList;

/**
 * Created by Harshi on 24-10-2017.
 */

public class RAdapter extends RecyclerView.Adapter<RAdapter.MyHolder> {
    private Context ctx;
    private ArrayList<Information> Inf;

    public RAdapter(Context ctx, ArrayList<Information> Inf) {
        this.ctx = ctx;
        this.Inf = Inf;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout,null);
       MyHolder myHolder = new MyHolder(view);
       return myHolder;


    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        holder.images.setImageResource(Inf.get(position).getImage());
        holder.cat.setText(Inf.get(position).getCategory());

    }

    @Override
    public int getItemCount() {
        return Inf.size();
    }

    public static class MyHolder extends ViewHolder {
        ImageView images;
        TextView cat;

        public MyHolder(View itemView) {
            super(itemView);

            images = (ImageView) itemView.findViewById(R.id.image_view);
            cat = (TextView)itemView.findViewById(R.id.category);
        }
    }
}

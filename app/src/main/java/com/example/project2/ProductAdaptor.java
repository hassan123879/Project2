package com.example.project2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProductAdaptor extends RecyclerView.Adapter<ProductAdaptor.VH> {

    ArrayList<Product> list;

    ProductAdaptor(ArrayList<Product> list){ this.list = list; }

    class VH extends RecyclerView.ViewHolder {
        TextView tv;
        VH(View v){ super(v); tv = v.findViewById(R.id.tvEmail); }
    }

    @Override
    public VH onCreateViewHolder(ViewGroup p, int v) {
        return new VH(LayoutInflater.from(p.getContext())
                .inflate(R.layout.row_item, p, false));
    }

    @Override
    public void onBindViewHolder(VH h, int i) {
        h.tv.setText(list.get(i).name + " - Rs " + list.get(i).price);
    }

    @Override
    public int getItemCount(){ return list.size(); }
}

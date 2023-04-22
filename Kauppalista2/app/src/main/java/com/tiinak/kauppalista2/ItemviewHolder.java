package com.tiinak.kauppalista2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ItemviewHolder extends RecyclerView.ViewHolder {

    TextView item, itemexta;

    public ItemviewHolder(View itemView) {

        super(itemView);
        item = itemView.findViewById(R.id.item);
        itemexta = itemView.findViewById(R.id.itemextra);
    }
    public TextView getView(){
        return item;
    }
}
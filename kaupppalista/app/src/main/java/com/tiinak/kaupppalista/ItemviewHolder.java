package com.tiinak.kaupppalista;

import android.media.Image;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ItemviewHolder extends RecyclerView.ViewHolder {
    TextView item, itemexta, editName, editExtra;
    ImageView removeItem, editItem;


    public ItemviewHolder(View itemView) {
        super(itemView);
        item = itemView.findViewById(R.id.item);
        itemexta = itemView.findViewById(R.id.itemextra);
        removeItem = itemView.findViewById(R.id.imageDelete);
        editItem = itemView.findViewById(R.id.imageEdit);
        editName = itemView.findViewById(R.id.editItem);
        editExtra = itemView.findViewById(R.id.editItemExtra);
    }
}
package com.tiinak.kauppalista2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.util.ArrayList;

public class ItemListAdapter extends RecyclerView.Adapter<ItemListAdapter.ItemviewHolder> {

    private Context context;
    protected ArrayList<Item> items;
    public ItemListAdapter(ArrayList<Item> items) {

        this.items = items;
    }

    @Override
    public ItemviewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_item_view, parent, false);
        return new ItemviewHolder(view);
    }

    @Override
    public int getItemViewType(final int position) {
        return R.layout.fragment_item_view;
    }

    @Override
    public void onBindViewHolder(ItemviewHolder holder, int position) {
        holder.item.setText(items.get(position).getItemName());
        holder.itemexta.setText(items.get(position).getItemextra());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class Item implements Serializable {

        protected String itemName;
        protected String itemextra;
        protected boolean isImportant;

        public Item(String itemName, String itemextra, boolean isImportant) {
            this.itemName = itemName;
            this.itemextra = itemextra;
            this.isImportant = isImportant;
        }

        public String getItemName() {
            return itemName;
        }
        public String getItemextra() {
            return itemextra;
        }

        public boolean getIsImportant(){return isImportant; }

    }

    public class ItemviewHolder extends RecyclerView.ViewHolder {

        TextView item, itemexta;
        public ItemviewHolder(View itemView) {
            super(itemView);
            item = itemView.findViewById(R.id.item);
            itemexta = itemView.findViewById(R.id.itemextra);
        }
    }

}




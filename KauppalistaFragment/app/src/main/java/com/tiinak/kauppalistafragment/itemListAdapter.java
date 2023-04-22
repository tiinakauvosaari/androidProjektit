package com.tiinak.kauppalistafragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;
import java.util.ArrayList;

public class itemListAdapter extends RecyclerView.Adapter<ItemviewHolder> {
    private Context context;

    private ArrayList<Item> items;

    public itemListAdapter(Context context, ArrayList<Item> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public ItemviewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ItemviewHolder(LayoutInflater.from(context).inflate(R.layout.item_view, parent, false));
    }

    @Override
    public void onBindViewHolder(ItemviewHolder holder, int position) {

        holder.item.setText(items.get(position).getItemName());
        holder.itemexta.setText(items.get(position).getItemextra());
        holder.editName.setText(items.get(position).getItemName());
        holder.editExtra.setText(items.get(position).getItemextra());

        holder.removeItem.setOnClickListener(view -> {
            int pos = holder.getAdapterPosition();
            ItemStorage.getInstance().removeItem(items.get(pos).getItemName());
            notifyItemRemoved(pos);
        });

        holder.editItem.setOnClickListener(view -> {
            int pos = holder.getAdapterPosition();
            if(holder.editName.getVisibility() == View.VISIBLE){
                Item item =  ItemStorage.getInstance().getItemName(pos);
                Item item2 =  ItemStorage.getInstance().getItemExtra(pos);
                item.setName(holder.editName.getText().toString());
                item2.setExtra(holder.editExtra.getText().toString());
                holder.editName.setVisibility(View.GONE);
                holder.editExtra.setVisibility(View.GONE);
                notifyDataSetChanged();
            }
            else{
                holder.editName.setVisibility(View.VISIBLE);
                holder.editExtra.setVisibility(View.VISIBLE);
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class Item implements Serializable {

        protected String itemName;
        protected String itemextra;

        public Item(String itemName, String itemextra, boolean isImportant) {
            this.itemName = itemName;
            this.itemextra = itemextra;
        }

        public String getItemName() {
            return itemName;
        }

        public String getItemextra() {
            return itemextra;
        }


        public void setName(String name) {
            this.itemName = name;
        }

        public void setExtra(String extra) { this.itemextra = extra; }

    }
}





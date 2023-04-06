package com.tiinak.kaupppalista;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;
import java.util.ArrayList;

public class ItemListAdapter extends RecyclerView.Adapter<ItemviewHolder> {

    private Context context;
    private ArrayList<Item> items = new ArrayList<>();

    public ItemListAdapter(Context context, ArrayList<Item> items) {
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

        holder.removeItem.setOnClickListener(view -> {
            int pos = holder.getAdapterPosition();
            ItemStorage.getInstance().removeItem(items.get(pos).getItemName());
            notifyItemRemoved(pos);
        });

        holder.editItem.setOnClickListener(view -> {
            int pos = holder.getAdapterPosition();
            if(holder.editName.getVisibility() == View.VISIBLE){
             //  Item item =  ItemStorage.getInstance().getItemName();
             //   item.setName(item);

                //Laita tämä lopuksi:
               // holder.editName.setVisibility(View.GONE);

            }
            else{
                holder.editName.setVisibility(View.VISIBLE);
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

        public Item(String itemName, String itemextra) {
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
    }
}




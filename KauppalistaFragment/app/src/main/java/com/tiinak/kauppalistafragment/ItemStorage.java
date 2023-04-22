package com.tiinak.kauppalistafragment;

import android.content.Context;

import java.util.ArrayList;

public class ItemStorage {

    protected ArrayList<itemListAdapter.Item> items = new ArrayList<>();
    protected static ItemStorage itemstorage = null;
    protected Context context;

    private ItemStorage(){
    }

    public static ItemStorage getInstance(){
        if(itemstorage == null) itemstorage = new ItemStorage();
        return itemstorage;
    }

    public void addItem(itemListAdapter.Item item){
        items.add(item);
    }


    public ArrayList<itemListAdapter.Item> getItems() {
        return items;
    }

    public void removeItem(String itemName) {
        int i = 0;
        for(itemListAdapter.Item r : items){
            if(r.getItemName().equals(itemName)){
                break;
            }
            i++;
        }
        items.remove(i);
    }

    public itemListAdapter.Item getItemName(int pos) {
        return items.get(pos);
    }

    public itemListAdapter.Item getItemExtra(int pos) {
        return items.get(pos);
    }
}



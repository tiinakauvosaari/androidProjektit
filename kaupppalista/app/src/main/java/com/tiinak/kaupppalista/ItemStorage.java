package com.tiinak.kaupppalista;

import android.content.Context;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ItemStorage {

    protected ArrayList<ItemListAdapter.Item> items = new ArrayList<>();
    protected static ItemStorage itemstorage = null;
    protected Context context;

    private ItemStorage(){
    }

    public static ItemStorage getInstance(){
        if(itemstorage == null) itemstorage = new ItemStorage();
        return itemstorage;
    }

    public void addItem(ItemListAdapter.Item item){
        items.add(item);
    }


    public ArrayList<ItemListAdapter.Item> getItems() {
        return items;
    }

    public void removeItem(String itemName) {
        int i = 0;
        for(ItemListAdapter.Item r : items){
            if(r.getItemName().equals(itemName)){
                break;
            }
            i++;
        }
        items.remove(i);
    }

    public ItemListAdapter.Item getItemName(int pos) {
        return items.get(pos);
    }

    public ItemListAdapter.Item getItemExtra(int pos) {
        return items.get(pos);
    }
}

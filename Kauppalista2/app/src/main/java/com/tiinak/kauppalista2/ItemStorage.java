package com.tiinak.kauppalista2;

import android.content.Context;

import java.util.ArrayList;

public class ItemStorage {

        public ArrayList<ItemListAdapter.Item> items = new ArrayList<>();
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

        public ItemListAdapter.Item getItemName(int pos) {
            return items.get(pos);
        }

        public ItemListAdapter.Item getItemExtra(int pos) {
            return items.get(pos);
        }
    }


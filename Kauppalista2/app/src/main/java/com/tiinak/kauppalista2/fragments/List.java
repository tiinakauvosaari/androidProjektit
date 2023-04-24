package com.tiinak.kauppalista2.fragments;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tiinak.kauppalista2.ItemListAdapter;
import com.tiinak.kauppalista2.ItemStorage;
import com.tiinak.kauppalista2.ItemviewHolder;
import com.tiinak.kauppalista2.R;

import java.util.ArrayList;

public class List extends Fragment {

    public ArrayList<ItemListAdapter.Item> items;
            //= new ArrayList<>();
    ItemStorage storage = ItemStorage.getInstance();

    // Add RecyclerView member
    private RecyclerView recyclerView;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        View view = inflater.inflate(R.layout.fragment_list, container, false);
        recyclerView = view.findViewById(R.id.recycleview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setAdapter(new ItemListAdapter(storage.getItems()));
        return view;
    }

     public int getItemViewType(final int position) {
        return R.layout.fragment_item_view;
    }

    @NonNull
    public ItemviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false);
        return new ItemviewHolder(view);
    }

    public void onBindViewHolder(@NonNull ItemviewHolder holder, int position) {
       // holder.getView().setText(String.valueOf(random.nextInt()));
    }

    public int getItemCount() {
        return 100;
    }
}


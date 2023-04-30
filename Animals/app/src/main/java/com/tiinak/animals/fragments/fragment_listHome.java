package com.tiinak.animals.fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tiinak.animals.Animal;
import com.tiinak.animals.AnimalListAdapter;
import com.tiinak.animals.AnimalStorage;
import com.tiinak.animals.AnimalViewHolder;
import com.tiinak.animals.R;

import java.util.ArrayList;

public class fragment_listHome extends Fragment {

      private RecyclerView recyclerView;

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        View view = inflater.inflate(R.layout.fragment_list_home, container, false);
        recyclerView = view.findViewById(R.id.recycleviewHome);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setAdapter(new AnimalListAdapter(AnimalStorage.getAnimalsHome()));
        return view;
    }

}

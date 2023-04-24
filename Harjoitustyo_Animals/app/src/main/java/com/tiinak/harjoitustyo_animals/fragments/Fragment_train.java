package com.tiinak.harjoitustyo_animals.fragments;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.tiinak.harjoitustyo_animals.AnimalChoiceAdapter;
import com.tiinak.harjoitustyo_animals.AnimalListAdapter;
import com.tiinak.harjoitustyo_animals.AnimalStorage;
import com.tiinak.harjoitustyo_animals.R;

import java.util.ArrayList;

public class Fragment_train extends Fragment {

    public ArrayList<AnimalListAdapter.Animal> animals;
    //= new ArrayList<>();
    AnimalStorage animalstorage = AnimalStorage.getInstance();
    private Context context;
    private AnimalChoiceAdapter adapterChoice;

    public Fragment_train() {
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_train, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recycleview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setAdapter(new AnimalChoiceAdapter(animalstorage.getAnimals()));
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

}




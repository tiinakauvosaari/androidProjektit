package com.tiinak.harjoitustyo_animals;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class activity_ListAnimals extends AppCompatActivity {

    private AnimalStorage animalstorage;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_animals);
       // animalstorage = AnimalStorage.getInstance();
        recyclerView = findViewById(R.id.rvAnimalList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new AnimalListAdapter(getApplicationContext(),animalstorage.getAnimals()));
    }
}


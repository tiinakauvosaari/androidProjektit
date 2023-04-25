package com.tiinak.harjoitustyo_animals;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioGroup;

public class activity_moveAnimals extends AppCompatActivity {

    protected Button btnTrain;
    protected RecyclerView recyclerView;
    protected RadioGroup rg;

    AnimalStorage animalstorage = AnimalStorage.getInstance();
    private Context context;
    private AnimalChoiceAdapter adapterChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_animals);
        RecyclerView recyclerView = findViewById(R.id.recycleview);
        btnTrain = findViewById(R.id.btnTrain);
        rg = findViewById(R.id.radioGroup);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new AnimalChoiceAdapter(animalstorage.getAnimals()));
    }

}
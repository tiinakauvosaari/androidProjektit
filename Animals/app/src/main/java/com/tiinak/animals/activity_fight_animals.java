package com.tiinak.animals;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class activity_fight_animals extends AppCompatActivity {

    private ArrayList<Animal> animalmove = new ArrayList<>();

    public ArrayList<Animal> animals;
    protected Button btnFight;
    protected RecyclerView recyclerView;

    protected TextView text;

    ItemClickListener itemClickListener;
    AnimalFightAdapter animalFightAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fight_animals);
        btnFight = findViewById(R.id.btnFightAnimals);
        text = findViewById(R.id.infoFight);
        recyclerView = findViewById(R.id.recycleviewFightPage);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        animalFightAdapter = new AnimalFightAdapter(AnimalStorage.getAnimalsFight(), itemClickListener);
        // recyclerView.setAdapter(new AnimalChoiceAdapter(AnimalStorage.getAnimals(animals), itemClickListener));
        recyclerView.setAdapter(animalFightAdapter);

        itemClickListener = new ItemClickListener() {
            @Override
            public void onClick(String s) {
                animalFightAdapter.notifyDataSetChanged();
                System.out.println(s);
                Toast
                        .makeText(getApplicationContext(), "Selected " + s,
                                Toast.LENGTH_SHORT)
                        .show();
            }

            @Override
            public void selectAnimal(Animal animal) {
                // animalmove.add(animal);
                animalmove.add(animal);
                System.out.println(animal.getName());
                Toast
                        .makeText(getApplicationContext(), "Selected " + animal.getName(),
                                Toast.LENGTH_SHORT)
                        .show();
            }
        };
    }
}
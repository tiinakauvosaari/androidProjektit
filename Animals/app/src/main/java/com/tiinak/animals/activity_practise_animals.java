package com.tiinak.animals;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;

public class activity_practise_animals extends AppCompatActivity {

    private Animal animalmove;

    public ArrayList<Animal> animals;
    protected Button btnTrain;
    protected RecyclerView recyclerView;
    protected TextView text;
    protected TextView text2;
    ItemClickListener itemClickListener;
    AnimalTrainAdapter animalChoiceAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practise_animals);
        recyclerView = findViewById(R.id.recycleviewTrainPage);
        btnTrain = findViewById(R.id.btnTrainAnimals);
        text = findViewById(R.id.infoTrain);
        text2 = findViewById(R.id.infoTrain2);

        itemClickListener = new ItemClickListener() {
            @Override
            public void onClick(String s) {
                animalChoiceAdapter.notifyDataSetChanged();
                Toast
                        .makeText(getApplicationContext(), "Selected " + s,
                                Toast.LENGTH_SHORT)
                        .show();
            }
            @Override
            public void selectAnimal(Animal animal) {
                animalmove = animal;
                Toast
                        .makeText(getApplicationContext(), "Selected " + animal.getName(),
                                Toast.LENGTH_SHORT)
                        .show();
            }
        };

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        animalChoiceAdapter = new AnimalTrainAdapter(AnimalStorage.getAnimalsTrain(), itemClickListener);
        recyclerView.setAdapter(animalChoiceAdapter);
    }

    public void trainAnimal(View v){
        text.setText("Treenataan " + animalmove.getName() + ". Treenatessa attack - pisteet kasvavat." );
        TrainingArea.train(animalmove);
        text2.setText("Practis - pisteet ovat nyt " + animalmove.getPractise() +" ja attack - pisteet ovat nyt " + animalmove.getAttack() );
    }

}


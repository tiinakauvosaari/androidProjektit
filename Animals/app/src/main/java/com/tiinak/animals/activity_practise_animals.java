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

    private ArrayList<Animal> animalmove = new ArrayList<>();

    public ArrayList<Animal> animals;
    protected Button btnTrain;
    protected RecyclerView recyclerView;

    protected TextView text;
    protected TextView text2;

    ItemClickListener itemClickListener;
    AnimalChoiceAdapter animalChoiceAdapter;


   // private Context context;
    // private AnimalChoiceAdapter adapterChoice;

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
                System.out.println(s);

                Toast
                        .makeText(getApplicationContext(), "Selected " + s,
                                Toast.LENGTH_SHORT)
                        .show();
            }
            @Override
            public void selectAnimal(Animal animal) {
                animalmove.add(animal);
                System.out.println("Valittiin " + animal.getName());
                Toast
                        .makeText(getApplicationContext(), "Selected " + animal.getName(),
                                Toast.LENGTH_SHORT)
                        .show();
            }
        };

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        animalChoiceAdapter = new AnimalChoiceAdapter(AnimalStorage.getAnimalsTrain(), itemClickListener);
        // recyclerView.setAdapter(new AnimalChoiceAdapter(AnimalStorage.getAnimals(animals), itemClickListener));
        recyclerView.setAdapter(animalChoiceAdapter);

        btnTrain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        System.out.println("Valittiin" + AnimalStorage.getAnimalsTrain().size());
                        Animal a = animalmove.get(0);
                        a.getName();
                        text.setText("Treenataan " + a.getName());
                        TrainingArea.train(a);
                        text2.setText("Practis - pisteet ovat nyt " + a.getPractise() +" ja attack - pisteet ovat nyt " + a.getAttack() );

                     //   TrainingArea a = (TrainingArea) animalmove.get(0);
                     //   a.train(a);


                       // (TrainingArea)a.train();
                        //trainingArea.train(a);
                        //System.out.println("Aluksi olio on : " + animalmove.get(0));
                        //AnimalStorage.removeFromList(animalmove.get(0));
                        //Animal c = BattleField.createAnimal(new Animal(animalmove.get(0)));
                        //AnimalStorage.addAnimalFight(c);
                        //System.out.println(animalmove.get(0));
                        //System.out.println(AnimalStorage.getAnimalsFight());

                }

            }
        );

    }

}


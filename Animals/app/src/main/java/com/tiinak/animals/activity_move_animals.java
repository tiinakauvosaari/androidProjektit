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
import android.widget.Toast;
import java.util.ArrayList;

public class activity_move_animals extends AppCompatActivity {

    private Animal animalmove;

    public ArrayList<Animal> animals;
    protected Button btnTrain;
    protected RecyclerView recyclerView;
    protected RadioGroup rg;

    ItemClickListener itemClickListener;
    AnimalChoiceAdapter animalChoiceAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_animals);
        recyclerView = findViewById(R.id.recycleview);
        btnTrain = findViewById(R.id.btnTrain);
        rg = findViewById(R.id.radioGroup);

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
                System.out.println(animal.getName());
                Toast
                        .makeText(getApplicationContext(), "Selected " + animal.getName(),
                                Toast.LENGTH_SHORT)
                        .show();
            }
        };

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        animalChoiceAdapter = new AnimalChoiceAdapter(AnimalStorage.getAnimals(), itemClickListener);
        recyclerView.setAdapter(animalChoiceAdapter);


    }
        public void moveAnimal(View v){

                switch (rg.getCheckedRadioButtonId()) {
                    case R.id.rbHome:
                        AnimalStorage.removeFromList(animalmove);
                        Animal a = Home.createAnimal(new Animal(animalmove));
                        AnimalStorage.giveMaxHealth(a);
                        AnimalStorage.addAnimalHome(a);
                        break;

                    case R.id.rbTrain:
                        AnimalStorage.removeFromList(animalmove);
                        Animal b = TrainingArea.createAnimal(new Animal(animalmove));
                        AnimalStorage.addAnimalTrain(b);
                        System.out.println(AnimalStorage.getAnimalsTrain());
                        break;

                    case R.id.rbFight:
                        AnimalStorage.removeFromList(animalmove);
                        Animal c = BattleField.createAnimal(new Animal(animalmove));
                        AnimalStorage.addAnimalFight(c);
                        System.out.println(AnimalStorage.getAnimalsFight());
                        break;
                    default:
                        Toast
                                .makeText(getApplicationContext(), "Valitse minne siirretään",
                                        Toast.LENGTH_SHORT)
                                .show();
                        break;
                }
                Intent intent = new Intent(this,MainActivity.class);
                startActivity(intent);

            }
    }



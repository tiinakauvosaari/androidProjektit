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

  //  private ArrayList<Animal> animalmove = new ArrayList<>();

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
                System.out.println(s);
                Toast
                        .makeText(getApplicationContext(), "Selected " + s,
                                Toast.LENGTH_SHORT)
                        .show();
            }

            @Override
            public void selectAnimal(Animal animal) {
               // animalmove.add(animal);
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
        // recyclerView.setAdapter(new AnimalChoiceAdapter(AnimalStorage.getAnimals(animals), itemClickListener));
        recyclerView.setAdapter(animalChoiceAdapter);
        // btnTrain.setOnClickListener(new View.OnClickListener() {

    }
        public void moveAnimal(View v){
            //@Override
           // public void onClick(View v) {

                switch (rg.getCheckedRadioButtonId()) {
                    case R.id.rbHome:
                       // System.out.println(animalmove.get(0));
                      //  AnimalStorage.removeFromList(animalmove.get(0));
                        AnimalStorage.removeFromList(animalmove);
                      //  Animal a = Home.createAnimal(new Animal(animalmove.get(0)));
                        Animal a = Home.createAnimal(new Animal(animalmove));
                        break;

                    case R.id.rbTrain:
                        AnimalStorage.removeFromList(animalmove);
                       // System.out.println("Aluksi olio on : " + animalmove.get(0));
                      //  AnimalStorage.removeFromList(animalmove.get(0));
                     //    Animal b = TrainingArea.createAnimal(new Animal(animalmove.get(0)));
                       // Animal b = new TrainingArea(animalmove.get(0));
                      //   AnimalStorage.addAnimalTrain(b);
                      //  System.out.println("Nyt on uusi olio " + b);
                       // AnimalStorage.addAnimalTrain(b);
                        Animal b = TrainingArea.createAnimal(new Animal(animalmove));
                        AnimalStorage.addAnimalTrain(b);
                        System.out.println(AnimalStorage.getAnimalsTrain());
                        break;

                    case R.id.rbFight:

                        Animal c = TrainingArea.createAnimal(new Animal(animalmove));
                        AnimalStorage.addAnimalFight(c);
                        //System.out.println(AnimalStorage.getAnimalsFight());
                   //     System.out.println("Aluksi olio on : " + animalmove.get(0));
                   //     AnimalStorage.removeFromList(animalmove.get(0));
                  //      Animal c = BattleField.createAnimal(new Animal(animalmove.get(0)));
                   //     AnimalStorage.addAnimalFight(c);
                   //     System.out.println(animalmove.get(0));
                        System.out.println(AnimalStorage.getAnimalsFight());
                        break;
                    default:
                        Toast
                                .makeText(getApplicationContext(), "Valitse minne siirretään",
                                        Toast.LENGTH_SHORT)
                                .show();
                        break;
                }
                //rg.clearCheck();
                Intent intent = new Intent(this,MainActivity.class);
                startActivity(intent);

            }
       // });
    }



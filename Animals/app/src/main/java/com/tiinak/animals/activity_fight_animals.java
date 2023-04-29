package com.tiinak.animals;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class activity_fight_animals extends AppCompatActivity {

    Context context;
    FighterListener fighterListener;

    private ArrayList<Animal> animalmove = new ArrayList<>();

    public ArrayList<Animal> animals;
    public ArrayList<Animal> animalsmove;
    protected Button btnFight;
    protected RecyclerView recyclerView;

    protected TextView text;

    AnimalFightAdapter animalFightAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fight_animals);
        btnFight = findViewById(R.id.btnFightAnimals);
        text = findViewById(R.id.infoFight);
        recyclerView = findViewById(R.id.recycleviewFightPage);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        fighterListener = new FighterListener() {
            @Override
            public void onFighterChange(ArrayList<Animal> animallist) {
                animalFightAdapter.notifyDataSetChanged();
                System.out.println("Heippa täältä onCreatista");
                animalmove = animallist;

            }
        };
        animalFightAdapter = new AnimalFightAdapter(context, AnimalStorage.getAnimalsFight(), fighterListener);
        // recyclerView.setAdapter(new AnimalChoiceAdapter(AnimalStorage.getAnimals(animals), itemClickListener));
        recyclerView.setAdapter(animalFightAdapter);
    }


       public void fightAnimal(View v) {
           String teksti;
           System.out.println("Moikka vain!");
           System.out.println(animalmove.get(0));
           Animal a = animalmove.get(0);
           System.out.println(animalmove.get(1));
           Animal b = animalmove.get(1);

           teksti = BattleField.fight(a, b);
           text.setText(teksti);
    }


}
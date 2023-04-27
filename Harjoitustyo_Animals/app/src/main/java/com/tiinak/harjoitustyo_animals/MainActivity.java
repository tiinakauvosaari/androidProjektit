package com.tiinak.harjoitustyo_animals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    AnimalStorage animalstorage;
    AnimalListAdapter.Animal animal = null;
    protected Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void switchToAddAnimal(View view) {
        Intent intent = new Intent(this, activity_addanimal.class);
        startActivity(intent);
    }
    public void switchToListAnimals(View view) {
        Intent intent = new Intent(this, activity_ListAnimals.class);
        startActivity(intent);
    }
    public void switchToStart(View view) {
        Intent intent = new Intent(this, activity_play.class);
        startActivity(intent);
    }

    public void switchToMove(View view) {
        Intent intent = new Intent(this, activity_moveAnimals.class);
        startActivity(intent);
    }

}
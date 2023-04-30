package com.tiinak.animals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }

    public void switchToAddAnimal(View view) {
        Intent intent = new Intent(this, activity_add_animal.class);
        startActivity(intent);
    }

    public void switchToListAnimals(View view) {
        Intent intent = new Intent(this, activity_list_animals.class);
        startActivity(intent);
    }

    public void switchToMoveAnimals(View view) {
        Intent intent = new Intent(this, activity_move_animals.class);
        startActivity(intent);
    }

    public void switchToPractiseAnimals(View view) {
        Intent intent = new Intent(this, activity_practise_animals.class);
        startActivity(intent);
    }

    public void switchToFightAnimals(View view) {
        Intent intent = new Intent(this, activity_fight_animals.class);
        startActivity(intent);
    }

}
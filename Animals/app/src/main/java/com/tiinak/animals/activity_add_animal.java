package com.tiinak.animals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

public class activity_add_animal extends AppCompatActivity {

    protected EditText name;
    protected RadioGroup rg;
    protected String nameString;
    protected String species;
    protected int attack,defence, maxHealth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_animal);
        name = findViewById(R.id.addName);
        rg = findViewById(R.id.rg);
    }

    public void addAnimal(View view) {

        nameString = "" + name.getText().toString();
        switch (rg.getCheckedRadioButtonId()) {
            case R.id.animal_lion:
                species = "lion";
                attack= 7;
                defence= 2;
                maxHealth =18;
                break;
            case R.id.animal_crocodile:
                species = "crocodile";
                attack= 9;
                defence= 0;
                maxHealth =16;
                break;
            case R.id.animal_owl:
                species = "owl";
                attack= 8;
                defence= 1;
                maxHealth =17;
                break;
            case R.id.animal_mouse:
                species = "mouse";
                attack= 6;
                defence= 3;
                maxHealth =19;
                break;
            case R.id.animal_snail:
                species = "snail";
                attack= 5;
                defence= 4;
                maxHealth = 20;
                break;
        }
        AnimalStorage.addAnimal(Home.createAnimal(new Animal(nameString, species, attack, defence, maxHealth)));
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);

    }
}


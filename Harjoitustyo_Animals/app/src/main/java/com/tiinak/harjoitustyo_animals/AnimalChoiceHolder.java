package com.tiinak.harjoitustyo_animals;

import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class AnimalChoiceHolder extends RecyclerView.ViewHolder{

    //TextView name, species;
    RadioButton radiobutton;
    AnimalChoiceAdapter.AnimalChoice choice;


    public AnimalChoiceHolder(View itemView,AnimalChoiceAdapter.AnimalChoice choice) {
        super(itemView);
        this.choice = choice;
        radiobutton = itemView.findViewById(R.id.radioButton);
    }
}


package com.tiinak.harjoitustyo_animals;

import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class AnimalChoiceHolder extends RecyclerView.ViewHolder{

    //TextView name, species;
    RadioButton radiobutton;

    public AnimalChoiceHolder(View itemView) {
        super(itemView);
        radiobutton = itemView.findViewById(R.id.radioButton);
    }
}


package com.tiinak.animals;

import android.view.View;
import android.widget.RadioButton;

import androidx.recyclerview.widget.RecyclerView;


public class AnimalChoiceHolder extends RecyclerView.ViewHolder{

        //TextView name, species;
        RadioButton radiobutton;
        ItemClickListener choice;

        public AnimalChoiceHolder(View itemView, ItemClickListener itemClickListener) {
            super(itemView);
            this.choice = itemClickListener;
            radiobutton = itemView.findViewById(R.id.radioButton);
        }
    }


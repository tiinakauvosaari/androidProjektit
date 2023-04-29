package com.tiinak.animals;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class AnimalFightHolder extends RecyclerView.ViewHolder{

    CheckBox checkBox;
    FighterListener choice;

    public AnimalFightHolder(View itemView, FighterListener fighterListener) {
        super(itemView);
        this.choice = fighterListener;
        checkBox = itemView.findViewById(R.id.fighter);
    }
}







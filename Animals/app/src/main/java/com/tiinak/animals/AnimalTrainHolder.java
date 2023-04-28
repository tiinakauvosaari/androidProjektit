package com.tiinak.animals;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class AnimalTrainHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView name, species, attack, defense, maxHealth, practise, winningsNumber, attacksNumber, id;

        public AnimalTrainHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.animal_image);
            name = itemView.findViewById(R.id.nameFight);
            species = itemView.findViewById(R.id.speciesView);
            attack = itemView.findViewById(R.id.attackFight);
            defense = itemView.findViewById(R.id.defenceFight);
            maxHealth = itemView.findViewById(R.id.maxHealthFight);
            practise = itemView.findViewById(R.id.practisView);
            winningsNumber = itemView.findViewById(R.id.WinningsNumberView);
            attacksNumber = itemView.findViewById(R.id.attackNumberView);
            id = itemView.findViewById(R.id.id);
        }
    }


package com.tiinak.animals;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class AnimalFightHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView name, attack, defense, maxHealth;
        ItemClickListener choice;

        public AnimalFightHolder(View itemView, ItemClickListener itemClickListener) {
            super(itemView);
            this.choice = itemClickListener;
            image = itemView.findViewById(R.id.animalFightImage);
             name = itemView.findViewById(R.id.nameFight);
            attack = itemView.findViewById(R.id.attackFight);
            defense = itemView.findViewById(R.id.defenceFight);
            maxHealth = itemView.findViewById(R.id.maxHealthFight);
        }
    }



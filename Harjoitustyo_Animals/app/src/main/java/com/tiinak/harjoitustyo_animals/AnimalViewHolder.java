package com.tiinak.harjoitustyo_animals;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

public class AnimalViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView name, species, attack, defense, maxHealth, practise, winningsNumber, attacksNumber, id;

        public AnimalViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.animalImage);
            name = itemView.findViewById(R.id.nameView);
            species = itemView.findViewById(R.id.speciesView);
            attack = itemView.findViewById(R.id.attackView);
            defense = itemView.findViewById(R.id.defenceView);
            maxHealth = itemView.findViewById(R.id.maxHealth);
            practise = itemView.findViewById(R.id.practisView);
            winningsNumber = itemView.findViewById(R.id.WinningsNumberView);
            attacksNumber = itemView.findViewById(R.id.attackNumberView);
            id = itemView.findViewById(R.id.id);
        }
}

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
/*
        boolean isSelected = false;

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

         /  itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    choice.selectAnimal();
                    choice.onClick(name.getText()
                            .toString());

                }
            });

        }}

            /*itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View view) {
                    choice.onClick(String.valueOf(getAdapterPosition()));
                    return true;
                }

            });
            } */







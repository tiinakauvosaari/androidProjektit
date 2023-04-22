package com.tiinak.harjoitustyo_animals;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.util.ArrayList;

public class AnimalListAdapter extends RecyclerView.Adapter<AnimalViewHolder>  {

    private Context context;
    private ArrayList<Animal> animals;

    public AnimalListAdapter(Context context, ArrayList<Animal> animals) {
        this.context = context;
        this.animals = animals;
    }

    @Override
    public AnimalViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new AnimalViewHolder(LayoutInflater.from(context).inflate(R.layout.animal_view, parent, false));
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(AnimalViewHolder holder, int position) {

        holder.name.setText(animals.get(position).getName());
        holder.species.setText(animals.get(position).getSpecies());
        holder.attack.setText("Attack: " +animals.get(position).getAttack());
        holder.maxHealth.setText("maxHealth "+animals.get(position).getMaxHealth());
        holder.defense.setText("Defence: " +animals.get(position).getDefence());
        holder.practise.setText("Practise: "+animals.get(position).getPractise());
        holder.winningsNumber.setText("Vinnings: "+animals.get(position).getWinningsNumber());
        holder.attacksNumber.setText("Attacks: "+animals.get(position).getAttacksNumber());
        holder.id.setText("id: "+ animals.get(position).getId());
       // holder.attacksNumber.setImageResource(users.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return animals.size();
    }

    public static class Animal implements Serializable {

            protected String name;
            protected String species;
            protected int attack;
            protected int defence;
            protected int maxHealth;
            protected int practise;
            protected int winningsNumber;
            protected int attacksNumber;
            protected int id;

            protected int i = 0;

            public Animal(String name, String species,int attack, int defence, int maxHealth) {
                this.name = name;
                this.species = species;
                this.attack = attack;
                this.defence = defence;
                this.maxHealth = maxHealth;
                this.practise = 0;
                this.attacksNumber = 0;
                this.winningsNumber = 0;
                this.id = idCounter();
            }

            public String getName() {
                return name;
            }

            public String getSpecies() {
                return species;
            }

            public int getAttack() {
                return attack;
            }

            public int getDefence() {
                return defence;
            }

            public int getMaxHealth() {
            return maxHealth;
            }

            public int getAttacksNumber() {
            return attacksNumber;
            }

            public int getPractise() {
            return practise;
            }

            public int getWinningsNumber() {
            return winningsNumber;
            }

            public int getId() {
            return id;
            }

            private int idCounter(){
                return 3;
            }
       }
}


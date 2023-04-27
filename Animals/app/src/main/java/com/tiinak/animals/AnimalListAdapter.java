package com.tiinak.animals;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class AnimalListAdapter extends RecyclerView.Adapter<AnimalViewHolder> {

    private final ArrayList<Animal> animals;

    public AnimalListAdapter(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    @NonNull
    @Override
    public AnimalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.animal_view, parent, false);
        return new AnimalViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder (@NonNull AnimalViewHolder holder, int position) {

        holder.name.setText(animals.get(position).getName());
        holder.species.setText("Species: " + animals.get(position).getSpecies());
        holder.attack.setText("Attack: " + animals.get(position).getAttack());
        holder.maxHealth.setText("maxHealth " + animals.get(position).getMaxHealth());
        holder.defense.setText("Defence: " + animals.get(position).getDefence());
        holder.practise.setText("Practise: " + animals.get(position).getPractise());
        holder.winningsNumber.setText("Winnings: " + animals.get(position).getWinningsNumber());
        holder.attacksNumber.setText("Attacks: " + animals.get(position).getAttacksNumber());
        holder.id.setText("id: " + animals.get(position).getId());
        holder.image.setImageResource(animals.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return animals.size();
    }

}

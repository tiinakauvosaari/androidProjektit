package com.tiinak.animals;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AnimalFightAdapter extends RecyclerView.Adapter<AnimalFightHolder>{

    ItemClickListener itemClickListener;
    protected ArrayList<Animal> animals;
    protected Context context;
    protected static int selectedPosition = -1;

    public AnimalFightAdapter(ArrayList<Animal> animals, ItemClickListener itemClickListener) {
        this.animals = animals;
        this.itemClickListener = itemClickListener;
    }


    @NonNull
    @Override
    public AnimalFightHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.animalfight_view, parent, false);
        return new AnimalFightHolder(view, itemClickListener);
    }


    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull AnimalFightHolder holder, int position) {
        holder.name.setText(animals.get(position).getName());
        holder.image.setImageResource(animals.get(position).getImage());
        holder.attack.setText("Attack: " + animals.get(position).getAttack());
        holder.defense.setText("Defence: " + animals.get(position).getDefence());
        holder.maxHealth.setText("maxHeath: " + animals.get(position).getMaxHealth());
      }

    @Override
    public long getItemId (int position){
        return position;
    }

    @Override
    public int getItemViewType (int position){
        return position;
    }

    @Override
    public int getItemCount() {
        return animals.size();
    }
}

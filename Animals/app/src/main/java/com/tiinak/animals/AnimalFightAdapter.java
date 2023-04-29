package com.tiinak.animals;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AnimalFightAdapter extends RecyclerView.Adapter<AnimalFightHolder>{

    boolean isSelected = false;
    protected ArrayList<Animal> animalfight = new ArrayList<Animal>();
    FighterListener fighterListener;

    protected ArrayList<Animal> animals;
    protected Context context;
    protected static int selectedPosition = -1;

    public AnimalFightAdapter(Context context, ArrayList<Animal> animals, FighterListener fighterListener) {
        this.context = context;
        this.animals = animals;
        this.fighterListener = fighterListener;
    }

    @NonNull
    @Override
    public AnimalFightHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.animalfight_view, parent, false);
        return new AnimalFightHolder(view, fighterListener);
    }


    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull AnimalFightHolder holder, int position) {
        holder.checkBox.setText(animals.get(position).getName() + " (" + animals.get(position).getSpecies() + ")");
        holder.checkBox.setOnCheckedChangeListener(null);
        holder.checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                System.out.println("Klick");
                if(b == true){
                    System.out.println("Klick true");
                    selectedPosition = holder.getAdapterPosition();
                    System.out.println(animals.get(selectedPosition).getName());
                    animalfight.add(animals.get(selectedPosition));
                    fighterListener.onFighterChange(animalfight);
                }
                else{
                    animalfight.remove(animals.get(selectedPosition));
                    System.out.println("böö");
                }
             }
        });
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

package com.tiinak.harjoitustyo_animals;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AnimalChoiceAdapter extends RecyclerView.Adapter<AnimalChoiceHolder> {

    AnimalChoice selectedChoice;
    protected ArrayList<AnimalListAdapter.Animal> animals;
    protected Context context;
    protected static int selectedPosition = -1;

    public AnimalChoiceAdapter(ArrayList<AnimalListAdapter.Animal> animals) {
        this.animals = animals;
    }

    @NonNull
    @Override
    public AnimalChoiceHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.animalchoice_view, parent, false);
        return new AnimalChoiceHolder(view,selectedChoice);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalChoiceHolder holder, final int position) {
        holder.radiobutton.setText(animals.get(position).getName()+ " " + animals.get(position).getSpecies() );
        holder.radiobutton.setChecked(position == selectedPosition);
        holder.radiobutton.setTag(position);

        holder.radiobutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animalCheckChanged(view);
            }
        });
    }
    private void animalCheckChanged(View view) {
        selectedPosition = (Integer)view.getTag();
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return animals.size();
    }

    public interface AnimalChoice{
        void goToAnimalDetails(AnimalListAdapter.Animal animal);
    }


}

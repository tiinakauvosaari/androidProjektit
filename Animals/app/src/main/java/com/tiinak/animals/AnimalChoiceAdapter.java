package com.tiinak.animals;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AnimalChoiceAdapter extends RecyclerView.Adapter<AnimalChoiceHolder> {

    ItemClickListener itemClickListener;
    protected ArrayList<Animal> animals;
    protected Context context;
    protected static int selectedPosition = -1;

    public AnimalChoiceAdapter(ArrayList<Animal> animals, ItemClickListener itemClickListener) {
        this.animals = animals;
        this.itemClickListener = itemClickListener;
    }

    @NonNull
    @Override
    public AnimalChoiceHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.animalchoice_view, parent, false);
        //return new AnimalChoiceHolder(view,selectedChoice);
        return new AnimalChoiceHolder(view, itemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalChoiceHolder holder, final int position) {
        holder.radiobutton.setText(animals.get(position).getName() + " (" + animals.get(position).getSpecies() + ")");
        holder.radiobutton.setChecked(position == selectedPosition);
        holder.radiobutton.setTag(position);

        holder.radiobutton.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (b) {
                            selectedPosition = holder.getAdapterPosition();
                            itemClickListener.onClick(
                                    holder.radiobutton.getText().toString());
                        }
                    }
                }
        );

    }


         /*   holder.radiobutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    animalCheckChanged(view);
                }
            });
        }

        private void animalCheckChanged(View view) {
            selectedPosition = (Integer)view.getTag();
            notifyDataSetChanged();
        } */

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





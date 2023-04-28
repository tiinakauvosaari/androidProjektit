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
    ArrayList<Animal> animalfight = new ArrayList<>();
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
    public void onBindViewHolder(@NonNull AnimalFightHolder holder, final int position) {
        holder.checkBox.setText(animals.get(position).getName() + " (" + animals.get(position).getSpecies() + ")");
       // holder.checkBox.setChecked(animals.get(position).isSelected());
        holder.checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(holder.checkBox.isChecked()){

                  //  boolean b = animals.get(holder.getAdapterPosition()).isSelected();
                    int selectedPosition = holder.getAdapterPosition();
                   // selectedPosition = holder.getAdapterPosition().isSelected();
                   // animalfight.add(animals.get(holder.getAdapterPosition()));
                   // holder.checkBox.setChecked(position == selectedPosition);
                    // holder.checkBox.setChecked(position == selectedPosition);
                  //  animalfight.add(animals.get(selectedPosition));
                    System.out.println(animals.get(selectedPosition).getName());
                    animalfight.add(animals.get(selectedPosition));
                    System.out.println(selectedPosition);

                }
                else{
                    System.out.println("Moi!");
                }
                //    animalfight.remove(animals.get(selectedPosition));
               // }
               // fighterListener.onFighterChange(animalfight);
            }
        });



      //  fighterListener.onFighterChange(animalfight);


     //   holder.name.setText(animals.get(position).getName());
       // holder.image.setImageResource(animals.get(position).getImage());
      //  holder.attack.setText("Attack: " + animals.get(position).getAttack());
     //   holder.defense.setText("Defence: " + animals.get(position).getDefence());
     //   holder.maxHealth.setText("maxHeath: " + animals.get(position).getMaxHealth());
    //   holder.checkBox.setOnClickListener(new View.OnClickListener() {
       /* holder.checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
               @Override
               public void onCheckedChanged(
                       CompoundButton compoundButton,
               boolean b)
               {
                   if (b) {
                       selectedPosition = holder.getAdapterPosition();
                       itemClickListener.selectAnimal(animals.get(selectedPosition));
                       itemClickListener.onClick(holder.checkBox.getText()
                               .toString());
                       ;                        }
                   else{
                       selectedPosition = -1;
                   }
               }
           });
          //  @Override
         //   public void onClick(View view) {
        //        selectedPosition = holder.getAdapterPosition();
                //position;
       //         itemClickListener.selectAnimal(animals.get(selectedPosition));
       //         itemClickListener.onClick(holder.name.getText()
        //                .toString());

                //itemClickListener.onClick(String.valueOf(position));


              /*  itemClickListener.selectAnimal(animals.get(selectedPosition));
                if(animalfight.size() < 2){
                    animalfight.add(animals.get(selectedPosition));
                }
                else{

                }*/

      //      }
      //  });

       /* holder.itemView.setOnClickListener(new View.OnClickListener() {
                                               @Override
               public void onClick(View view) {
                   // isSelected = true;
                    selectedPosition = holder.getAdapterPosition();
                    itemClickListener.selectAnimal(animals.get(selectedPosition));
                    animalfight.add(animals.get(selectedPosition));
                    itemClickListener.onClick(holder.name.getText()
                             .toString());

                                         }
                                           }
                                      ); */

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

package com.tiinak.animals;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;
import java.util.ArrayList;

public class activity_move_animals extends AppCompatActivity {


        public ArrayList<Animal> animals;
        protected Button btnTrain;
        protected RecyclerView recyclerView;
        protected RadioGroup rg;

        public int selectedAnimal;

        ItemClickListener itemClickListener;
        AnimalChoiceAdapter animalChoiceAdapter;
        protected int postion;

        private Context context;
       // private AnimalChoiceAdapter adapterChoice;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_move_animals);
            recyclerView = findViewById(R.id.recycleview);
            btnTrain = findViewById(R.id.btnTrain);
            rg = findViewById(R.id.radioGroup);
            itemClickListener = new ItemClickListener(){
                public void onClick(String animal){
                    recyclerView.post(new Runnable(){
                        @Override
                        public void run(){
                            animalChoiceAdapter.notifyDataSetChanged();

                        }

                    });
                    Toast
                            .makeText(getApplicationContext(), "Selected ",
                                    Toast.LENGTH_SHORT)
                            .show();
                }  };
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            animalChoiceAdapter = new AnimalChoiceAdapter(AnimalStorage.getAnimals(animals),itemClickListener);
            // recyclerView.setAdapter(new AnimalChoiceAdapter(AnimalStorage.getAnimals(animals), itemClickListener));
            recyclerView.setAdapter(animalChoiceAdapter);
            btnTrain.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){

                     //Valittu olio


                            switch (rg.getCheckedRadioButtonId()) {
                                case R.id.rbHome:
                                    // valittu olio siirretään kotiin
                                    Toast
                                            .makeText(getApplicationContext(), "Home selected",
                                                    Toast.LENGTH_SHORT)
                                            .show();
                                    break;
                                case R.id.rbTrain:
                                    // train
                                    Toast
                                            .makeText(getApplicationContext(), "Train selected",
                                                    Toast.LENGTH_SHORT)
                                            .show();
                                    break;
                                case R.id.rbFight:
                                    // Fight
                                    Toast
                                            .makeText(getApplicationContext(), "Fight selected",
                                                    Toast.LENGTH_SHORT)
                                            .show();
                                    break;
                                default:
                                    Toast
                                            .makeText(getApplicationContext(), "Valitse minne siirretäänh",
                                                    Toast.LENGTH_SHORT)
                                            .show();
                                    break;
                            }
            }}); }; //btnListener

           // public void setWhenClickListener(ItemClickListener itemClickListener){
           //         this.listener = listener;
          //          }


            }


            //   Intent intent = new Intent(this, activity_move_animals.class);
            //   startActivity(intent);


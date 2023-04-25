package com.tiinak.harjoitustyo_animals.fragments;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.tiinak.harjoitustyo_animals.AnimalChoiceAdapter;
import com.tiinak.harjoitustyo_animals.AnimalListAdapter;
import com.tiinak.harjoitustyo_animals.AnimalStorage;
import com.tiinak.harjoitustyo_animals.R;

public class Fragment_train extends Fragment implements AnimalChoiceAdapter.AnimalChoice {

    protected TextView text;
    protected Button btnTrain;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    AnimalStorage animalstorage = AnimalStorage.getInstance();
    private Context context;
    private AnimalChoiceAdapter adapterChoice;

    public Fragment_train() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_train, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recycleview);
        text = view.findViewById(R.id.trainText);
        btnTrain = view.findViewById(R.id.btnTrain);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setAdapter(new AnimalChoiceAdapter(animalstorage.getAnimals()));
        btnTrain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //selectedChoice.goToAnimalDetails(animals.get(position));
               // postion = giveInfo();
               // text.setText(animalstorage.getAnimals(position).toString());
            }
        });
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void goToAnimalDetails(AnimalListAdapter.Animal animal){
        //Intent intent = new Intent(this, MainActivity.class);
       // startActivity(intent);


    }

}




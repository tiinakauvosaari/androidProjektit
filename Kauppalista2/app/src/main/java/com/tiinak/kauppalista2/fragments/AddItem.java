package com.tiinak.kauppalista2.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.tiinak.kauppalista2.ItemListAdapter;
import com.tiinak.kauppalista2.ItemStorage;
import com.tiinak.kauppalista2.R;


public class AddItem extends Fragment {

    protected EditText newitem;
    protected EditText newitemextra; //lisätieto
    protected String newitemString;
    protected String newitemextraString;  //lisätieto string - muodossa
    protected CheckBox superimportant;
    protected boolean isImportant = false;
    protected Button button;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View myView =  inflater.inflate(R.layout.fragment_add_item, container, false);
        newitem = myView.findViewById(R.id.newitem);
        newitemextra =myView.findViewById(R.id.newitemextra);
        superimportant =myView.findViewById(R.id.superimportant);
        button = myView.findViewById(R.id.adnewitem);
        button.setOnClickListener(view -> addItem(view));
        return myView;
    }

    public void addItem(View view) {

        if (superimportant.isChecked()) {
            isImportant = true;
        }
        newitemString = newitem.getText().toString();
        newitemextraString = newitemextra.getText().toString();
        ItemStorage.getInstance().addItem(new ItemListAdapter.Item(newitemString, newitemextraString, isImportant));
        newitem.getText().clear();
        newitemextra.getText().clear();
        superimportant.setChecked(false);
        isImportant = false;
    }

}
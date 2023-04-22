package com.tiinak.kauppalistafragment.fragments;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.tiinak.kauppalistafragment.ItemStorage;
import com.tiinak.kauppalistafragment.R;
import com.tiinak.kauppalistafragment.itemListAdapter;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AdNew#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AdNew extends Fragment {


    protected EditText newitem;
    protected EditText newitemextra; //lisätieto
    protected String newitemString;
    protected String newitemextraString;  //lisätieto string - muodossa
    protected CheckBox superimportant;
    protected boolean isImportant = false;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lisaa_uusi, container, false);
    }
}
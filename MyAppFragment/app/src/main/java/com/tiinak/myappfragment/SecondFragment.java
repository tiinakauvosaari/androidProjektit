package com.tiinak.myappfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.tiinak.myappfragment.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {

    // Add RecyclerView member
    private RecyclerView recyclerView;
    private FragmentSecondBinding binding;

    // Add RecyclerView member

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);

        // Add the following lines to create RecyclerView
        recyclerView = view.findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setAdapter(new RandomNumListAdapter(1234));
        return view;
    }
   /* public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentSecondBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }*/

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}

        //binding.buttonSecond.setOnClickListener(new View.OnClickListener() {

          //  public void onClick(View view) {
           //     NavHostFragment.findNavController(SecondFragment.this)
           //             .navigate(R.id.action_SecondFragment_to_FirstFragment);
           // }
       // });
    //}




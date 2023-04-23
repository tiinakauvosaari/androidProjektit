package com.tiinak.harjoitustyo_animals;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.tiinak.harjoitustyo_animals.fragments.Fragment_play;
import com.tiinak.harjoitustyo_animals.fragments.Fragment_train;

public class ActivityPlayAdapter extends FragmentStateAdapter {

    public ActivityPlayAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new Fragment_train();
            case 1:
                return new Fragment_play();
            default:
                return new Fragment_train();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}


package com.tiinak.kauppalista2;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.tiinak.kauppalista2.fragments.AddItem;
import com.tiinak.kauppalista2.fragments.List;
import com.tiinak.kauppalista2.fragments.MainPage;

public class MainActivityAdapter extends FragmentStateAdapter {
    public MainActivityAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        switch (position){
                case 0:
                    return new MainPage();
                case 1:
                    return new AddItem();
                case 2:
                    return new List();
                default:
                    return new MainPage();
            }
        }


    @Override
    public int getItemCount() {
        return 3;
    }
}

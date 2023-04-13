package com.tiinak.kauppalistafragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.tiinak.kauppalistafragment.fragments.AdNew;
import com.tiinak.kauppalistafragment.fragments.List;
import com.tiinak.kauppalistafragment.fragments.Main;

public class MainActivityAdapter extends FragmentStateAdapter {
    public MainActivityAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new Main();
            case 1:
                return new AdNew();
            case 2:
                return new List();
            default:
                return new Main();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}

package com.tiinak.animals;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.tiinak.animals.fragments.fragment_listFight;
import com.tiinak.animals.fragments.fragment_listHome;
import com.tiinak.animals.fragments.fragment_listTrain;

public class ActivityListAdapter extends FragmentStateAdapter {

    public ActivityListAdapter(@NonNull FragmentActivity fragmentActivity) {
            super(fragmentActivity);
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            switch (position){
                case 0:
                    return new fragment_listHome();
                case 1:
                    return new fragment_listTrain();
                case 2:
                    return new fragment_listFight();
                default:
                    return new fragment_listHome();
            }
        }

        @Override
        public int getItemCount() {
            return 3;
        }
    }



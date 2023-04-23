package com.tiinak.harjoitustyo_animals;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;

public class activity_play extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        TabLayout tabLayout = findViewById(R.id.tabarea);
        ViewPager2 fragmentarea = findViewById(R.id.fragmentarea);

        ActivityPlayAdapter playactivityadapter = new ActivityPlayAdapter(this);
        fragmentarea.setAdapter(playactivityadapter);

    // View.OnClickListener listener = new View.OnClickListener() {
     //   @Override
      //  public void onClick(View view) {
           //Fragment fragment;

            tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {

                @Override
                public void onTabSelected(TabLayout.Tab tab) {
                    fragmentarea.setCurrentItem(tab.getPosition());
                }

                @Override
                public void onTabUnselected(TabLayout.Tab tab) {
                }

                @Override
                public void onTabReselected(TabLayout.Tab tab) {
                }
            });

            //getSupportFragmentManager().beginTransaction()
               //     .replace(R.id.frame, fragment)
                //    .commit();

        }
    }


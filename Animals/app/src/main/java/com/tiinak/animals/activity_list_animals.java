package com.tiinak.animals;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;

public class activity_list_animals extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_animals);
        TabLayout tabLayout = findViewById(R.id.tabarea);
        ViewPager2 fragmentarea = findViewById(R.id.fragmentarea);

        ActivityListAdapter listactivityadapter = new ActivityListAdapter(this);
        fragmentarea.setAdapter(listactivityadapter);

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

        fragmentarea.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                tabLayout.getTabAt(position).select();
            }
        });


    }}




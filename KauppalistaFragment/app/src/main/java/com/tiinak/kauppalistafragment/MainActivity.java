package com.tiinak.kauppalistafragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import android.os.Bundle;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

import org.intellij.lang.annotations.JdkConstants;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tabLayout = findViewById(R.id.tabarea);
        ViewPager2 fragmentarea = findViewById(R.id.fragmentarea);
        ViewPager2 fragmentarea2 = findViewById(R.id.fragmentarea2);
        MainActivityAdapter mainActivityadapter = new MainActivityAdapter(this);
        fragmentarea.setAdapter(mainActivityadapter);

        private View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment2;

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

                //  getSupportFragmentManager().beginTransaction()
                //.replace(R.id.frame, fragment)
                //.commit();


            }


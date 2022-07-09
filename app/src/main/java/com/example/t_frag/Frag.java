package com.example.t_frag;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class Frag extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frag);

        TabLayout tabLayout = findViewById(R.id._tab);
        //SharedPreferences pref = getSharedPreferences("base", MODE_PRIVATE);
        ViewPager2 viewPager = findViewById(R.id.viewpager);

        tabLayout.addTab(tabLayout.newTab().setText("Frag 1"), 0);
        tabLayout.addTab(tabLayout.newTab().setText("Frag 2"), 1);
        tabLayout.addTab(tabLayout.newTab().setText("Frag 3"), 2);

        FragmentStateAdapter pagerAdapter = new ScreenSlidePagerAdapter(Frag.this);
        viewPager.setAdapter(pagerAdapter);

        new TabLayoutMediator(tabLayout, viewPager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                if (position==0) tab.setText("Type");
                if (position==1) tab.setText("Flavour");
                if (position==2) tab.setText("Toppings");
            }
        }).attach();

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });

        viewPager.setCurrentItem(0);
    }


    class ScreenSlidePagerAdapter extends FragmentStateAdapter {
        public ScreenSlidePagerAdapter(AppCompatActivity fa) {
            super(fa);
        }

        @Override
        public Fragment createFragment(int position) {
            Fragment frag_new = null;
            if (position==0) frag_new= new fragment1();
            if (position==1) frag_new= new fragment2();
            if (position==2) frag_new= new fragment3();

            return frag_new;
        }

        @Override
        public int getItemCount() {
            return 3;
        }
    }

}
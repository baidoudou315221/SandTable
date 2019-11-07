package com.example.sandtable;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.sandtable.adapter.ViewPagerAdapter;
import com.example.sandtable.fragment.fragmentChange;
import com.example.sandtable.fragment.fragmentSeek;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainPageActivity extends FragmentActivity {
    ViewPager viewPager;
    TabLayout tabLayout;
    TextView titleBar;
    ArrayList<Fragment> fragments;
    ViewPagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        viewPager = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tab);
        titleBar = findViewById(R.id.titleBar);
        fragments = new ArrayList<>();
        fragments.add(new fragmentSeek());
        fragments.add(new fragmentChange());

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Integer position = tab.getPosition();
                int position2 = tab.getPosition();
                switch (position2){
                    case 0:
                        titleBar.setText("查看数据");
                        tab.setText("查看数据");
                        break;
                    case 1:
                        titleBar.setText("调节数据");
                        tab.setText("调节数据");
                        break;
                }
                Log.d("tablayout------->",position.toString());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        adapter = new ViewPagerAdapter(getSupportFragmentManager(),fragments);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabMode(TabLayout.MODE_FIXED);



    }



}

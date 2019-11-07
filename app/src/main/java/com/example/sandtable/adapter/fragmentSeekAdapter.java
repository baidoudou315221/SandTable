package com.example.sandtable.adapter;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
/*
*test document
* try to connect fragment with view
*/
public class fragmentSeekAdapter extends FragmentPagerAdapter {
    View view;

    public fragmentSeekAdapter(@NonNull FragmentManager fm,View view) {
        super(fm);
        this.view = view;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        return null;
    }

    @Override
    public int getCount() {
        return 0;
    }
}

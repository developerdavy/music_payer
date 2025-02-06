package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class fragmentPager extends FragmentStateAdapter {
    public fragmentPager(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
       switch (position) {
           case 0: return new musicFragment();
           case 1: return new playlistFragment();
           case 2: return new liblaryFragment();
           default: return new musicFragment();
       }
    }

    @Override
    public int getItemCount() {
        return 3; // return the number of fragments

    }
}

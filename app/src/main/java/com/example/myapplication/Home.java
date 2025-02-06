package com.example.myapplication;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;


import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Home extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);
//        RecyclerView recyclerView = findViewById(R.id.musicList);

        if (savedInstanceState == null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.frameLayout, new musicFragment())
                    .addToBackStack(null)
                    .commit();
        }

        bottomNavigationView.setOnItemSelectedListener(item -> {
            Fragment selectedFragment = null;
            
            if (item.getItemId() == R.id.music){
                selectedFragment = new musicFragment();
            } else if (item.getItemId() == R.id.playlist){
                selectedFragment = new playlistFragment();
            } else if (item.getItemId() == R.id.liblary) {
                selectedFragment = new liblaryFragment();
            }

            assert selectedFragment != null;
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.frameLayout, selectedFragment)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE) // Choose a transition
                    .commit();


            return true;
        });
//        bottomNavigationView.setOnItemSelectedListener(item -> {
//
//            Fragment selectedFragment = null;
//            if (item.getItemId() == R.id.music){
//                selectedFragment = new musicFragment();
//            } else if (item.getItemId() == R.id.playlist){
//                selectedFragment = new playlistFragment();
//            } else if (item.getItemId() == R.id.liblary) {
//                selectedFragment = new liblaryFragment();
//            }

//             selectedFragment = new musicFragment(); // Replace with your fragment


//        });
    }
}

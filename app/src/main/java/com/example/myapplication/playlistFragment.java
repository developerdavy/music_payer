package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class playlistFragment extends Fragment {

    private PlayListAdapter plalistAdapter;
    private List<PlayList> playLists;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment_playlist, container, false);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) RecyclerView recyclerView = view.findViewById(R.id.play_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        int NumberOfColumns = 3;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.getContext(), NumberOfColumns);
        recyclerView.setLayoutManager(gridLayoutManager);

        playLists = new ArrayList<>();
        playLists.add(new PlayList("Umber Ray", "New song of the year", R.drawable.music_app));
        playLists.add(new PlayList("Trio Mio", "Cheza kama wewe", R.drawable.music_app));
        playLists.add(new PlayList("Bahati", "Love song", R.drawable.music_app));


        plalistAdapter = new PlayListAdapter(playLists);
        recyclerView.setAdapter(plalistAdapter);


        return view;


    }
}
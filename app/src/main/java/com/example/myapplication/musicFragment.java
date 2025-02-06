package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class musicFragment extends Fragment {

private RecyclerView recyclerView;
private Adapter adapter;
private List<Utilities> musicList;

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_music, container, false);

        recyclerView = view.findViewById(R.id.music_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.getContext(),
                LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);

        musicList = new ArrayList<>();
        musicList.add(new Utilities( R.drawable.music_app, "Tite 1", "Description"));
        musicList.add(new Utilities(R.drawable.music_app, "Tite 2 ", "Description 2"));


        adapter = new Adapter(musicList);
        recyclerView.setAdapter(adapter);

        return view;
    }
}
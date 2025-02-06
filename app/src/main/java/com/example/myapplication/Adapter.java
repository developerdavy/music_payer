package com.example.myapplication;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyMusicHolder> {

    private List<Utilities> musicList;

    public Adapter(List<Utilities> musicList) {
        this.musicList = musicList;
    }

    @NonNull
    @Override
    public Adapter.MyMusicHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);

        return new MyMusicHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.MyMusicHolder holder, int position) {
       Utilities utils = musicList.get(position);
       holder.title.setText(utils.getTitle());
       holder.description.setText(utils.getDescription());
       holder.image.setImageResource(utils.getImage());
    }

    @Override
    public int getItemCount() {
        return musicList.size();
    }

    public static class MyMusicHolder extends RecyclerView.ViewHolder {
        TextView title, description;
        ImageView image;
        public MyMusicHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.item_image);
            title = itemView.findViewById(R.id.item_title);
            description = itemView.findViewById(R.id.item_description);

        }
    }
}
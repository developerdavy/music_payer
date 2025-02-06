package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PlayListAdapter extends RecyclerView.Adapter<PlayListAdapter.PlayListHolder> {

    private List<PlayList> playLists;

    public PlayListAdapter(List<PlayList> playLists) {

        this.playLists = playLists;

    }


    @NonNull
    @Override
    public PlayListAdapter.PlayListHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.playlist_list, parent, false);

        return new PlayListHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlayListAdapter.PlayListHolder holder, int position) {
        PlayList playList = playLists.get(position);
        holder.img.setImageResource(playList.getImg());
        holder.tite.setText(playList.getTitle());
        holder.description.setText(playList.getDescription());

    }

    @Override
    public int getItemCount() {
        return playLists.size();
    }

    public static class PlayListHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView tite, description;
        public PlayListHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.item_image);
            tite = itemView.findViewById(R.id.item_title);
            description = itemView.findViewById(R.id.item_description);

        }
    }
}

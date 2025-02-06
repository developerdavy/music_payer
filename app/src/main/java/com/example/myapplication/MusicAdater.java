package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MusicAdater extends RecyclerView.Adapter<MusicAdater.MusicHolder> {

    private List<Music> musicList;

    public MusicAdater(List<Music> musicList) {
        this.musicList = musicList;
    }

    @NonNull
    @Override
    public MusicAdater.MusicHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.library_list, parent, false);

        return new MusicHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MusicAdater.MusicHolder holder, int position) {
        Music music = musicList.get(position);
        holder.duration.setText(music.getDuration());
        holder.title.setText(music.getTitle());
        holder.filepath.setText(music.getFilepath());


    }

    @Override
    public int getItemCount() {
        return musicList.size();
    }

    public class MusicHolder extends RecyclerView.ViewHolder {
        TextView artist;
        TextView filepath;
        TextView title;
        TextView duration;
        public MusicHolder(@NonNull View itemView) {
            super(itemView);

            artist = itemView.findViewById(R.id.item_description);
            filepath =  itemView.findViewById(R.id.item_file_path);
            title = itemView.findViewById(R.id.item_title);
            duration = itemView.findViewById(R.id.item_duration);
        }
    }
}

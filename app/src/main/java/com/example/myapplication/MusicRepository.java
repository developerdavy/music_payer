package com.example.myapplication;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

import java.util.ArrayList;
import java.util.List;

public class MusicRepository {

    public static List<Music> getAllMusic(ContentResolver contentResolver){
        List<Music> musiclist = new ArrayList<>();


        Uri uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;

        String[] projection = {
                MediaStore.Audio.Media.TITLE,
                MediaStore.Audio.Media.ARTIST,
                MediaStore.Audio.Media.DATA,
                MediaStore.Audio.Media.DURATION,
        };

        String selection = MediaStore.Audio.Media.IS_MUSIC + "!=0";

//        Query the MediaStore
        Cursor cursor = contentResolver.query(
                uri,
                projection,
                selection,
                null,
                MediaStore.Audio.Media.TITLE + "ASC" //Sort by title
        );

        if (cursor != null){
            while (cursor.moveToNext()){
                String title = cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.TITLE));
                String duration = String.valueOf(Long.valueOf(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.DURATION))));
                String artist = cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.ARTIST));
                String filepath = cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.DATA));

                musiclist.add(new Music(title, artist, filepath, duration));
            }

            cursor.close();
        }

        return musiclist;
    }
}

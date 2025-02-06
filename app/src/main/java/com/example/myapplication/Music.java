package com.example.myapplication;

public class Music {
//    private int img;
    private String title;
    private String duration;
    private String artist;
    private String filepath;

    public Music(String title, String duration, String artist, String filepath) {
//        this.img = img;
        this.title = title;
        this.duration = duration;
        this.artist = artist;
        this.filepath = String.valueOf(filepath);
    }

//    public int getImg() {
//        return img;
//    }

    public String getTitle() {
        return title;
    }

    public String getDuration() {
        return duration;
    }

    public String getArtist() {
        return artist;
    }

    public String getFilepath() {
        return filepath;
    }
}

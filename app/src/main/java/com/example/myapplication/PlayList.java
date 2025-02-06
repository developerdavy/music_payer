package com.example.myapplication;

public class PlayList {

    private int img;
    private String title;
    private String description;

    public PlayList(String description, String title, int img) {
        this.description = description;
        this.title = title;
        this.img = img;
    }

    public int getImg() {
        return img;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}

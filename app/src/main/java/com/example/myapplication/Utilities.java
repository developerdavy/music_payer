package com.example.myapplication;

public class Utilities {

 private int img;
 private String title;
 private String description;
    public Utilities(int img, String title, String description) {
        this.img =img;
        this.title = title;
        this.description = description;
    }

    public int getImage() {

        return img;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}

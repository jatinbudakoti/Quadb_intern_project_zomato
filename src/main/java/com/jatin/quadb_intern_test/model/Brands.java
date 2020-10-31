package com.jatin.quadb_intern_test.model;

public class Brands {

    private int image;
    private String name;
    private int time;

    public Brands(int image, String name, int time) {
        this.image = image;
        this.name = name;
        this.time = time;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}

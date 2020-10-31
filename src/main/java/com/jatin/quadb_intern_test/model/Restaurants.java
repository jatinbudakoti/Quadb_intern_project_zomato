package com.jatin.quadb_intern_test.model;

public class Restaurants {

    private int image, time;
    private String name, rating;

    public Restaurants(int image, String name, int time, String rating) {
        this.image = image;
        this.time = time;
        this.name = name;
        this.rating = rating;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}

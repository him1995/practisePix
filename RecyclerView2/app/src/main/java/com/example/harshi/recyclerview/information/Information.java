package com.example.harshi.recyclerview.information;

/**
 * Created by Harshi on 24-10-2017.
 */

public class Information {

    private int image;
    private String category;

    public Information(int image, String category) {
        this.image = image;
        this.category = category;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

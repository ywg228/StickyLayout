package com.ywg.stickylayout.entity;

/**
 * Created by Ywg on 2016/6/29.
 */
public class Item {

    private String title;

    private int imageId;

    public Item(String title, int imageId) {
        this.title = title;
        this.imageId = imageId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

}

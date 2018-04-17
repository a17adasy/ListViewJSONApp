package com.example.brom.listviewjsonapp;

/**
 * Created by adamS on 4/17/2018.
 */

public class Mountain {
    public String name;
    public String location;
    public int height;
    public String url;

    Mountain(String name, int height, String location, String url){
        this.name = name;
        this.location = location;
        this.height = height;
        this.url = url;
    }

    public String getName(){
        return name;
    }
    public String getLoc() {
        return location;
    }
    public int getHeight() {
        return height;
    }
}

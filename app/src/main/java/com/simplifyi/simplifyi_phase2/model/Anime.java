package com.simplifyi.simplifyi_phase2.model;

public class Anime {

    private String name ;
    private String image_url;


    public Anime() {
    }

    public Anime(String name, String image_url) {
        this.name = name;
        this.image_url = image_url;
    }


    public String getName() {
        return name;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

}
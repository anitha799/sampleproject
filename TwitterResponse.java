package com.cd.statussaver.model;

import com.google.gson.annotations.serializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TwitterResponse implements Serializable {

 @serializedName("videos")
    private ArrayList<TwitterResponse> videos;

    public ArrayList<TwitterResponse> getVideos() {
        return videos;
    }

    public void setVideos(ArrayList<TwitterResponse> videos) {
        this.videos = videos;
    }
}


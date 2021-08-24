package com.example.songr.model;

public class Albums {

//    declare  variable
    private  String title ;
    private  String artist ;
    private  int songCount ;
    private  int length  ;
    private  String imgUrl ;

//generate getter and setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getSongCount() {
        return songCount;
    }

    public void setSongCount(int songCount) {
        this.songCount = songCount;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

//generate constructor
    public Albums(String title , String artist ,int songCount , int length, String imgUrl) {
        this.title=title ;
        this.artist = artist;
        this.songCount = songCount;
        this.length =length ;
        this.imgUrl =imgUrl ;
    }
}

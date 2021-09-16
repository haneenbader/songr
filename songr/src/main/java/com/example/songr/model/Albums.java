package com.example.songr.model;
import javax.persistence.*;
import java.util.List;


@Entity //
public class Albums {
//    connection with DB
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // declare  variable
    private  String title ;
    private  String artist ;
    private  int songCount ;
    private  int length ;
    private  String imgUrl ;

    //relation one album to many  songs(mappedBy = name of collection on db//attributeName)
    @OneToMany(mappedBy ="albums")
    private List<Song> songs;

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

    public Albums() {  // empty constructor whith out it we cant see result after add DB  to project
    }

    public Albums(String title , String artist , int songCount , int length, String imgUrl) {
        this.title=title ;
        this.artist = artist;
        this.songCount = songCount;
        this.length =length ;
        this.imgUrl =imgUrl ;
    }
}

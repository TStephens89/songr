package com.songr.demo.models;

import javax.persistence.*;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Float getLength() {
        return length;
    }

    public void setLength(Float length) {
        this.length = length;
    }

    public Float getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(Float trackNumber) {
        this.trackNumber = trackNumber;
    }
    @ManyToOne
    public Albums myAlbum;
    public Song(){

    }
    public Song(String title, Float length, Float trackNumber, Albums myAlbum) {
        this.title = title;
        this.length = length;
        this.trackNumber = trackNumber;
    }

    public Albums getMyAlbum() {
        return myAlbum;
    }

    public void setMyAlbum(Albums myAlbum) {
        this.myAlbum = myAlbum;
    }

    public String title;
    public Float length;
    public Float trackNumber;
}

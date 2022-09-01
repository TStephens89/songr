package com.songr.demo.models;
import javax.persistence.*;
import java.util.List;

@Entity
public class Albums {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    public String title;
    public String artist;
    @OneToMany(mappedBy = "myAlbum")
    public List<Song> songsOnThisAlbum;
    protected Albums() {
    }
    public Albums(String title, String artist, String songCount, Double length, String imageUrl) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageUrl = imageUrl;
    }
    public List<Song> getSongsOnThisAlbum(){
        return songsOnThisAlbum;
    }
    public long getID(){
    return id;
}
    public void setId(long id) {
        this.id = id;
    }

//    public void setSongsOnThisAlbum(List<Song> songsOnThisAlbum) {
//        this.songsOnThisAlbum = songsOnThisAlbum;
//    }


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

    public String getSongCount() {
        return songCount;
    }

    public void setSongCount(String songCount) {
        this.songCount = songCount;
    }

    public double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void findByName(String artist){
        this.artist = artist;
    }
    public String songCount;
    public Double length;
    public String imageUrl;


}

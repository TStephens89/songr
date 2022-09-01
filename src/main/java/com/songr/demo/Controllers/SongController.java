package com.songr.demo.Controllers;

import com.songr.demo.models.Albums;
import com.songr.demo.models.Song;
import com.songr.demo.repositories.SongRepository;
import com.songr.demo.repositories.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class SongController {
    @Autowired
    SongRepository songRepository;
    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/songs")
    public String getAllSongs(Model m){
        List<Song> songs = songRepository.findAll();
        m.addAttribute("songs", songs);
        return "/songs";
    }

    @PostMapping("/add-song")
    public RedirectView addSongToAlbum(String title, Float length, Float trackNumber, String album){

        Albums albums = albumRepository.findByTitle(album);
        Song newSong = new Song(title, length, trackNumber, albums);
        songRepository.save(newSong);

        return new RedirectView("/");
    }

}


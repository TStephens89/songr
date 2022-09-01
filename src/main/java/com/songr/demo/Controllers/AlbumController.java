package com.songr.demo.Controllers;

import com.songr.demo.models.Albums;
import com.songr.demo.repositories.SongRepository;
import com.songr.demo.repositories.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class AlbumController {

    @Autowired
    AlbumRepository albumRepository;
    @Autowired
    SongRepository songRepository;

    @GetMapping("/")
    public String getAlbumsAgain(Model m) {
        List<Albums> albums = albumRepository.findAll();
        m.addAttribute("albums", albums);
        return "albumsPage";
    }

    @PostMapping("/")
    public RedirectView createAlbums(String title, String artist, String songCount, Double length, String imageUrl) {
        Albums newAlbum = new Albums(title, artist, songCount, length, imageUrl);
        albumRepository.save(newAlbum);
        return new RedirectView("/");
    }

//    @PostMapping("/seed")
//    public RedirectView seedAlbums() {
//        Albums Album1 = new Albums("My Beautiful Dark Twisted Fantasy", "Kanye West", "13", 68.39, "https://upload.wikimedia.org/wikipedia/en/f/f0/My_Beautiful_Dark_Twisted_Fantasy.jpg");
//        albumRepository.save(Album1);
//        return new RedirectView("/");
//    }
}
//
//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    @ResponseBody
//    public Object[] getAlbums() {
//        Album Album1 = new Album("My Beautiful Dark Twisted Fantasy","Kanye West", "13",68.39,"https://upload.wikimedia.org/wikipedia/en/f/f0/My_Beautiful_Dark_Twisted_Fantasy.jpg" );
//        Album Album2 = new Album("Donda Deluxe Edition","Kanye West", "32",130.52,"https://upload.wikimedia.org/wikipedia/commons/thumb/a/a0/Almost_black_square_020305.png/330px-Almost_black_square_020305.png" );
//        Album Album3 = new Album("Graduation","Kanye West", "13",51.23,"https://upload.wikimedia.org/wikipedia/en/7/70/Graduation_%28album%29.jpg" );
//
//        return new Object[]{Album1,Album2,Album3};




package com.songr.demo.Controllers;


import com.songr.demo.Album;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String getTest() {
        return "Hello World";
    }
@Controller
    @RequestMapping("/capitalize/{name}")
    public class CapitalizeController {
        @RequestMapping(value = "/", method = RequestMethod.GET)
        @ResponseBody
        public String getCaps(@PathVariable String name) {
            return "Hello " +name.toUpperCase() ;
        }
    }
    @Controller
    @RequestMapping("/albums")
    public class AlbumController {
        @RequestMapping(value = "/", method = RequestMethod.GET)
        @ResponseBody
        public Object[] getAlbums() {
            Album Album1 = new Album("My Beautiful Dark Twisted Fantasy","Kanye West", "13",68.39,"https://upload.wikimedia.org/wikipedia/en/f/f0/My_Beautiful_Dark_Twisted_Fantasy.jpg" );
            Album Album2 = new Album("Donda Deluxe Edition","Kanye West", "32",130.52,"https://upload.wikimedia.org/wikipedia/commons/thumb/a/a0/Almost_black_square_020305.png/330px-Almost_black_square_020305.png" );
            Album Album3 = new Album("Graduation","Kanye West", "13",51.23,"https://upload.wikimedia.org/wikipedia/en/7/70/Graduation_%28album%29.jpg" );

            return new Object[]{Album1,Album2,Album3};

        }
    }
}


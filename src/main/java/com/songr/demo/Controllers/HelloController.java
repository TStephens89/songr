package com.songr.demo.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {
    @ResponseBody
@RequestMapping("/hello")
    public String getTest() {
        return "Hello World";
    }
    @RequestMapping("/capitalize/{name}")
        @ResponseBody
        public String getCaps(@PathVariable String name) {
            return "Hello " + name.toUpperCase();
        }
    }



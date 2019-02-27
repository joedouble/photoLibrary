package com.detroitlabs.photolibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PhotoController {

    @RequestMapping("/")
    public String displayPhotos(){
        return "home";
    }
}

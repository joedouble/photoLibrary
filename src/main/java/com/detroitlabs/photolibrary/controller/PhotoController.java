package com.detroitlabs.photolibrary.controller;

import com.detroitlabs.photolibrary.data.PhotoRepository;
import com.detroitlabs.photolibrary.model.Photo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PhotoController {

    @Autowired
    private PhotoRepository photoRepository;

    @RequestMapping("/")
    public String displayPhotos(ModelMap modelMap){
        List<Photo> allPhotos = photoRepository.random5Photos();
        modelMap.put("allPhotos", allPhotos);
        return "home";
    }
}

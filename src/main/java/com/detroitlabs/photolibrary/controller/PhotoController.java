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
    public String display5PhotosOnHome(ModelMap modelMap){
        List<Photo> random5Photos = photoRepository.random5Photos();
        modelMap.put("random5Photos", random5Photos);
        return "home";
    }
}

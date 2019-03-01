package com.detroitlabs.photolibrary.controller;

import com.detroitlabs.photolibrary.data.PhotoRepository;
import com.detroitlabs.photolibrary.model.Photo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
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

    @RequestMapping("/shipdetails/{name}")
    public String shipDetails(@PathVariable String name, ModelMap modelMap){
        Photo photo = photoRepository.findByName(name);
        modelMap.put("photo", photo);
        return "shipdetails";
    }

    @RequestMapping("/allships")
    public String allShips(ModelMap modelMap){
        List<Photo> allPhotos = photoRepository.getAllPhotos();
        modelMap.put("allPhotos", allPhotos);
        return "allships";
    }

    @RequestMapping("/bydate")
    public String shipsByDate(ModelMap modelMap){
        List<Photo> photosByDate = photoRepository.getByDate();
        modelMap.put("photosByDate", photosByDate);
        return "bydate";
    }

    @RequestMapping("/alphabetical")
    public String shipsAlphabetically(ModelMap modelMap){
        List<Photo> photosAlphabetically = photoRepository.getAlphabetically();
        modelMap.put("photosAlphabetically", photosAlphabetically);
        return "alphabetical";
    }

}

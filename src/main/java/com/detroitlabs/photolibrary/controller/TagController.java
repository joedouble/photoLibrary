package com.detroitlabs.photolibrary.controller;

import com.detroitlabs.photolibrary.data.PhotoRepository;
import com.detroitlabs.photolibrary.data.TagRepository;
import com.detroitlabs.photolibrary.model.Photo;
import com.detroitlabs.photolibrary.model.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TagController {

    @Autowired
    private TagRepository tagRepository;

    @Autowired
    private PhotoRepository photoRepository;

    @RequestMapping("/tags")
    public String displayTags(ModelMap modelMap) {
        List<Tag> allTags = tagRepository.getAllTags();
        modelMap.put("allTags", allTags);
        return "tags";
    }

    @RequestMapping("/tag/{id}")
    public String tagDetails(@PathVariable int id, ModelMap modelMap) {

        Tag tag = tagRepository.findByTagId(id);
        modelMap.put("tag", tag);

        List<Photo> photos = photoRepository.findByTagId(id);
        modelMap.put("photos", photos);

        return "tag";
    }

}

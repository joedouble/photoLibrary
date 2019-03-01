package com.detroitlabs.photolibrary.data;

import com.detroitlabs.photolibrary.model.Tag;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class TagRepository {

    private static final List<Tag> ALL_TAGS = Arrays.asList(
            new Tag(1000, "star trek"),
            new Tag(1001, "andromeda"),
            new Tag(1010, "expanse"),
            new Tag(1011, "stargate atlantis"),
            new Tag(1100, "battlestar galactica"),
            new Tag(1111, "halo"));

    public List<Tag> getAllTags(){
        return ALL_TAGS;
    }

    public Tag findByTagId(int tagId){
        for (Tag tag : ALL_TAGS){
            if (tag.getTagId() == tagId){
                return tag;
            }
        }
        return null;
    }
}

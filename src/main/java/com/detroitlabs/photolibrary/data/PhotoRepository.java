package com.detroitlabs.photolibrary.data;

import com.detroitlabs.photolibrary.model.Photo;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class PhotoRepository {

    private static final List<Photo> ALL_PHOTOS = Arrays.asList(
            new Photo()
    );
}

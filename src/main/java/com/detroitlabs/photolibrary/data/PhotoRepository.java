package com.detroitlabs.photolibrary.data;

import com.detroitlabs.photolibrary.model.Photo;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.*;

@Component
public class PhotoRepository {

    private static final List<Photo> ALL_PHOTOS = Arrays.asList(
            new Photo("andromeda", LocalDate.of(2019, 2, 26), "andromeda, ascendant"),
            new Photo("rocinante", LocalDate.of(2019, 2, 26), "corvette class, expanse"),
            new Photo("oneill", LocalDate.of(2019, 2, 26), "daedalus class, stargate atlantic"),
            new Photo("enterprise", LocalDate.of(2019, 2, 26), "galaxy class, star trek"),
            new Photo("voyager", LocalDate.of(2019, 2, 26), "intrepid class, star trek"),
            new Photo("galactica", LocalDate.of(2019, 2, 26), "jupiter class, battlestar galactica"),
            new Photo("nauvoo", LocalDate.of(2019, 2, 26), "mormon generation ship, expanse"),
            new Photo("infinity", LocalDate.of(2019, 2, 26), "unsc infinity class, halo"),
            new Photo("discovery", LocalDate.of(2019, 2, 26), "crossfield class, star trek"),
            new Photo("pegasus", LocalDate.of(2019, 2, 26), "mercury class, battlestar galactica")
            );

    public List<Photo> getAllPhotos() {
        return ALL_PHOTOS;
    }

    public List<Photo> random5Photos(){

        List<Photo> random5 =  new ArrayList<>();
        Collections.shuffle(ALL_PHOTOS);

        for (int i = 0; i < 5; i++){
            random5.add(ALL_PHOTOS.get(i));
        }
        return random5;
    }

}

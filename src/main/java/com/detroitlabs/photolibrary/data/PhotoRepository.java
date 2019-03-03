package com.detroitlabs.photolibrary.data;

import com.detroitlabs.photolibrary.model.Photo;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.*;

@Component
public class PhotoRepository {

    private static final List<Photo> ALL_PHOTOS = Arrays.asList(
            new Photo("andromeda", LocalDate.of(2019, 2, 24), 1001),
            new Photo("rocinante", LocalDate.of(2019, 2, 5), 1010),
            new Photo("oneill", LocalDate.of(2019, 2, 17), 1011),
            new Photo("enterprise", LocalDate.of(2019, 2, 14), 1000),
            new Photo("voyager", LocalDate.of(2019, 2, 27), 1000),
            new Photo("galactica", LocalDate.of(2019, 2, 20), 1100),
            new Photo("infinity", LocalDate.of(2019, 2, 12), 1111),
            new Photo("discovery", LocalDate.of(2019, 2, 1), 1000),
            new Photo("nauvoo", LocalDate.of(2019, 2, 15), 1010),
            new Photo("pegasus", LocalDate.of(2019, 2, 19), 1100));


    public List<Photo> getAllPhotos() {
        return ALL_PHOTOS;
    }

    public List<Photo> random5Photos() {

        List<Photo> random5 = new ArrayList<>();
        Collections.shuffle(ALL_PHOTOS);

        for (int i = 0; i < 5; i++) {
            random5.add(ALL_PHOTOS.get(i));
        }
        return random5;
    }

    public List<Photo> getByDate() {
        List<Photo> photosToSortByDate = new ArrayList<>();
        photosToSortByDate.addAll(getAllPhotos());

        Collections.sort(photosToSortByDate, new Comparator<Photo>() {
            @Override
            public int compare(Photo photo1, Photo photo2) {
                return photo1.getDateUploaded().compareTo(photo2.getDateUploaded());
            }
        });
        return photosToSortByDate;
    }

    public Photo findByName(String name) {
        for (Photo photo : ALL_PHOTOS) {
            if (photo.getName().equalsIgnoreCase(name)) {
                return photo;
            }
        }
        return null;
    }

    public List<Photo> getAlphabetically() {
        List<Photo> photosToSortAlphabetically = new ArrayList<>();
        photosToSortAlphabetically.addAll(getAllPhotos());

        Collections.sort(photosToSortAlphabetically, new Comparator<Photo>() {
            @Override
            public int compare(Photo photo1, Photo photo2) {
                return photo1.getName().compareTo(photo2.getName());
            }
        });
        return photosToSortAlphabetically;
    }

    public List<Photo> findByTagId(int tagId) {

        List<Photo> photosInTag = new ArrayList<>();

        for (Photo photo : ALL_PHOTOS) {
            if (photo.getTagId() == tagId) {
                photosInTag.add(photo);
            }
        }
        return photosInTag;
    }

    public List<Photo> searchByName(String name) {

        List<Photo> searchResultsArray = new ArrayList<>();

        for (Photo photo : ALL_PHOTOS) {
            if (photo.getName().contains(name)) {
                searchResultsArray.add(photo);
            }
        }
        return searchResultsArray;
    }

}

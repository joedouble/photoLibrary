package com.detroitlabs.photolibrary.model;

import java.time.LocalDate;

public class Photo {

    private String name;
    private LocalDate dateUploaded;
    private int tagId;

    public Photo(String name, LocalDate dateUploaded, int tagId) {
        this.name = name;
        this.dateUploaded = dateUploaded;
        this.tagId = tagId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateUploaded() {
        return dateUploaded;
    }

    public void setDateUploaded(LocalDate dateUploaded) {
        this.dateUploaded = dateUploaded;
    }

    public int getTagId() {
        return tagId;
    }

    public void setTagId(int tagId) {
        this.tagId = tagId;
    }
}

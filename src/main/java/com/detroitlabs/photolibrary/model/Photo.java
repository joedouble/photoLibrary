package com.detroitlabs.photolibrary.model;

import java.time.LocalDate;

public class Photo {

    private String name;
    private LocalDate dateUploaded;

    public Photo(String name, LocalDate dateUploaded, String tag) {
        this.name = name;
        this.dateUploaded = dateUploaded;
        this.tag = tag;
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

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String tag;
}

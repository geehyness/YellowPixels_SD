package com.yukisoft.yellowpixels.JavaRepositories.Models;

public class CategoryModel {
    private String id;
    private String imageURL;
    private String name;
    private String details;

    public String getId() {
        return id;
    }
    public String getImageURL() {
        return imageURL;
    }
    public String getName() {
        return name;
    }
    public String getDetails() { return details; }

    public void setId(String id) {
        this.id = id;
    }
    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDetails(String details) { this.details = details; }

    public CategoryModel() {
    }

    public CategoryModel(String imageURL, String name, String details) {
        this.imageURL = imageURL;
        this.name = name;
        this.details = details;
    }
}

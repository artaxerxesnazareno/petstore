package com.example.petstore.models;

public class Pet {
    private String name;
    private String category;
    private String photoUrl;

    public Pet(String name, String category, String photoUrl) {
        this.name = name;
        this.category = category;
        this.photoUrl = photoUrl;
    }

    public Pet() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}

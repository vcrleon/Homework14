package com.example.c4q.homework14.model;

import java.util.List;

/**
 * Created by c4q on 1/15/18.
 */

public class Matches {
    private ImageUrlsBySize imageUrlsBySize;
    private String sourceDisplayName;
    private List<String> ingredients;
    private String id;
    private List<String> smallImageUrls;
    private String recipeName;
    private int totalTimeInSeconds;
    private Attributes attributes;
    private Flavors flavors;
    private int rating;

    public ImageUrlsBySize getImageUrlsBySize() {
        return imageUrlsBySize;
    }

    public String getSourceDisplayName() {
        return sourceDisplayName;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public String getId() {
        return id;
    }

    public List<String> getSmallImageUrls() {
        return smallImageUrls;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public int getTotalTimeInSeconds() {
        return totalTimeInSeconds;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public Flavors getFlavors() {
        return flavors;
    }

    public int getRating() {
        return rating;
    }

}

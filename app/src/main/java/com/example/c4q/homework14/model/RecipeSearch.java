package com.example.c4q.homework14.model;

import java.util.List;

/**
 * Created by c4q on 1/19/18.
 */

public class RecipeSearch {
    private String yield;
    private List<NutritionEstimates> nutritionEstimates;
    private int prepTimeInSeconds;
    private String totalTime;
    private List<Images> images;
    private String name;
    private Source source;
    private String prepTime;
    private String id;
    private List<String> ingredientLines;
    private String cookTime;
    private Attribution attribution;
    private int numberOfServings;
    private int totalTimeInSeconds;
    private Attributes attributes;
    private int cookTimeInSeconds;
    private Flavors flavors;
    private int rating;

    public String getYield() {
        return yield;
    }

    public List<NutritionEstimates> getNutritionEstimates() {
        return nutritionEstimates;
    }

    public int getPrepTimeInSeconds() {
        return prepTimeInSeconds;
    }

    public String getTotalTime() {
        return totalTime;
    }

    public List<Images> getImages() {
        return images;
    }

    public String getName() {
        return name;
    }

    public Source getSource() {
        return source;
    }

    public String getPrepTime() {
        return prepTime;
    }

    public String getId() {
        return id;
    }

    public List<String> getIngredientLines() {
        return ingredientLines;
    }

    public String getCookTime() {
        return cookTime;
    }

    public Attribution getAttribution() {
        return attribution;
    }

    public int getNumberOfServings() {
        return numberOfServings;
    }

    public int getTotalTimeInSeconds() {
        return totalTimeInSeconds;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public int getCookTimeInSeconds() {
        return cookTimeInSeconds;
    }

    public Flavors getFlavors() {
        return flavors;
    }

    public int getRating() {
        return rating;
    }
}

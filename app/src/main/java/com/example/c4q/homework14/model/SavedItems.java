package com.example.c4q.homework14.model;

/**
 * Created by c4q on 1/20/18.
 */

public class SavedItems {
  private String foodrecipe;

    public SavedItems(String foodrecipe) {
        this.foodrecipe = foodrecipe;
    }

    public String getFoodrecipe() {
        return foodrecipe;
    }

    public void setFoodrecipe(String foodrecipe) {
        this.foodrecipe = foodrecipe;
    }
}


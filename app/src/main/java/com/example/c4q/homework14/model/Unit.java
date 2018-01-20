package com.example.c4q.homework14.model;

/**
 * Created by c4q on 1/19/18.
 */

class Unit {
    private String id;
    private String name;
    private String abbreviation;
    private String calories;
    private String plural;
    private String pluralAbbreviation;
    private boolean decimal;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String getCalories() {
        return calories;
    }

    public String getPlural() {
        return plural;
    }

    public String getPluralAbbreviation() {
        return pluralAbbreviation;
    }

    public boolean isDecimal() {
        return decimal;
    }
}

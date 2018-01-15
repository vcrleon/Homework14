package com.example.c4q.homework14.model;

import java.util.List;

/**
 * Created by c4q on 1/14/18.
 */

public class Yummly {
    private Criteria criteria;
    private List<Matches> matches;
//    private FacetCounts facetCounts;
    private int totalMatchCount;
    private Attribution attribution;

    public Criteria getCriteria() {
        return criteria;
    }

    public List<Matches> getMatches() {
        return matches;
    }

    public int getTotalMatchCount() {
        return totalMatchCount;
    }

    public Attribution getAttribution() {
        return attribution;
    }

}

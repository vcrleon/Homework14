package com.example.c4q.homework14.controller;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.c4q.homework14.R;
import com.example.c4q.homework14.model.Matches;
import com.example.c4q.homework14.viewholder.RecipeViewHolder;

import java.util.List;

/**
 * Created by c4q on 1/15/18.
 */

public class RecipeAdapter extends RecyclerView.Adapter<RecipeViewHolder> {

    List<Matches> yummlyList;

    public RecipeAdapter(List<Matches> recipeList) {
        this.yummlyList = recipeList;
    }

    @Override
    public RecipeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View cv = LayoutInflater.from(parent.getContext()).inflate(R.layout.food_itemview, parent, false);
        return new RecipeViewHolder(cv);
    }

    @Override
    public void onBindViewHolder(RecipeViewHolder holder, int position) {
        Matches recipe = yummlyList.get(position);
        holder.onBind(recipe);

    }

    @Override
    public int getItemCount() {
        return yummlyList.size();
    }

}

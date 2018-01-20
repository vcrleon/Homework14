package com.example.c4q.homework14.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.c4q.homework14.R;
import com.example.c4q.homework14.model.Matches;
import com.squareup.picasso.Picasso;

/**
 * Created by c4q on 1/15/18.
 */

public class RecipeViewHolder extends RecyclerView.ViewHolder {
    private ImageView foodImage;
    private TextView recipeName;

    public RecipeViewHolder(View itemView) {
        super(itemView);
        foodImage = itemView.findViewById(R.id.food_image_view);
        recipeName = itemView.findViewById(R.id.food_textview);
    }

    public void onBind(Matches recipe) {
        Picasso.with(itemView.getContext())
                .load(recipe.getImageUrlsBySize().getImage())
                .into(foodImage);

        recipeName.setText(recipe.getRecipeName());

    }


}

package com.example.c4q.homework14.viewholder;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.c4q.homework14.R;
import com.example.c4q.homework14.SavedItemsActivity;
import com.example.c4q.homework14.model.Matches;
import com.squareup.picasso.Picasso;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by c4q on 1/15/18.
 */

public class RecipeViewHolder extends RecyclerView.ViewHolder {
    private Context context;
    private SharedPreferences sharedPrefs;
    private Button savebutton;
    private ImageView foodImage;
    private TextView recipeName;

    public RecipeViewHolder(View itemView) {
        super(itemView);
        foodImage = itemView.findViewById(R.id.food_image_view);
        recipeName = itemView.findViewById(R.id.food_textview);
        savebutton = itemView.findViewById(R.id.food_button);
        context = itemView.getContext();

    }

    public void onBind(Matches recipe) {
        Picasso.with(itemView.getContext())
                .load(recipe.getImageUrlsBySize().getImage())
                .into(foodImage);

        recipeName.setText(recipe.getRecipeName());
        sharedPrefs = itemView.getContext().getSharedPreferences("saves_item", Context.MODE_PRIVATE);
        savebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPrefs.edit();
                Toast.makeText(itemView.getContext(), "Item Saved", Toast.LENGTH_SHORT).show();


                JSONObject recipeObjects = new JSONObject();

                try {
                    JSONObject object = new JSONObject();

                    recipeObjects.put("recipe", object);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                editor.putString("saved", recipeObjects.toString()).commit();

                if (savebutton.isEnabled()){
                    Intent intent = new Intent(context, SavedItemsActivity.class);
                    context.startActivity(intent);


                }





            }
        });


    }


}

package com.example.c4q.homework14;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.c4q.homework14.controller.RecipeAdapter;
import com.example.c4q.homework14.model.Matches;
import com.example.c4q.homework14.model.Yummly;
import com.example.c4q.homework14.network.YummlyService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Yummly JSON?";
    private YummlyService yummlyService;
    RecyclerView foodRecipeRecyclerView;
    RecipeAdapter recipeAdapter;
    List<Matches> yummlyList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        foodRecipeRecyclerView = findViewById(R.id.food_recipe_rv);
        connectYummlyApi();

    }

    public void connectYummlyApi() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.yummly.com/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        yummlyService = retrofit.create(YummlyService.class);

        final Call<Yummly> yummly = yummlyService.getYummly();
        yummly.enqueue(new Callback<Yummly>() {
            @Override
            public void onResponse(Call<Yummly> call, Response<Yummly> response) {
                foodRecipeRecyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
                Yummly yummlyData = response.body();
                yummlyList = yummlyData.getMatches();
                recipeAdapter = new RecipeAdapter(yummlyList);
                foodRecipeRecyclerView.setAdapter(recipeAdapter);


//                Log.d(TAG, "onResponse: " + response.body().toString());
//                Log.d(TAG, "Recipe Name: " + response.body().getMatches().get(0).getRecipeName());
//                Log.d(TAG, "Ingredients: " + response.body().getMatches().get(0).getIngredients());
            }

            @Override
            public void onFailure(Call<Yummly> call, Throwable t) {
                t.printStackTrace();

            }
        });

    }

}

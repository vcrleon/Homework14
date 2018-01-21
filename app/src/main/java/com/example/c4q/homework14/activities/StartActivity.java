package com.example.c4q.homework14.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SearchView;


import com.example.c4q.homework14.R;
import com.squareup.picasso.Picasso;

public class StartActivity extends AppCompatActivity {

    ImageView yummlyLogo;
    Button generalRecipes;
    SearchView searchView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        setUpViews();

        Picasso.with(getApplicationContext()).load("https://static.yummly.co/api-logo.png").into(yummlyLogo);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                if (s != null) {
                    Intent intent = new Intent(StartActivity.this, MainActivity.class);
                    intent.putExtra("search", s);
                    startActivity(intent);
                }
                return true;
            }

            @Override
            public boolean onQueryTextChange(String s) {

                return false;
            }
        });

        generalRecipes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StartActivity.this, SecondActivity.class);
                startActivity(intent);

            }
        });


    }

    private void setUpViews() {
        searchView = (SearchView) findViewById(R.id.search);
        yummlyLogo = findViewById(R.id.yummly_logo);
        generalRecipes = findViewById(R.id.find_recipes_button);
    }

}

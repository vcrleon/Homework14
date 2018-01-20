package com.example.c4q.homework14;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class StartActivity extends AppCompatActivity {

    ImageView yummlyLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        yummlyLogo = findViewById(R.id.yummly_logo);
        Picasso.with(getApplicationContext()).load("https://static.yummly.co/api-logo.png").into(yummlyLogo);


    }
}

package com.example.c4q.homework14.network;

import com.example.c4q.homework14.model.Yummly;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by c4q on 1/15/18.
 */

public interface YummlyService {
    String id = "9f4d6cbe";
    String key = "d01b63cf1668dacc18474430c75e8ea1";

    @GET("api/recipes?_app_id=" + id + "&_app_key=" + key)
    Call<Yummly> getYummly();

    // http://api.yummly.com/v1/api/recipes?_app_id=9f4d6cbe&_app_key=d01b63cf1668dacc18474430c75e8ea1?q=apples

    @GET("api/recipes?_app_id=" + id + "&_app_key=" + key )
    Call<Yummly> getYummlySearch(@Query("q") String s);

}

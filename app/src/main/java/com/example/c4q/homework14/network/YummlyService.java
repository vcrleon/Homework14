package com.example.c4q.homework14.network;

import com.example.c4q.homework14.model.Yummly;


import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by c4q on 1/15/18.
 */

public interface YummlyService {
    String id = "9f4d6cbe";
    String key = "d01b63cf1668dacc18474430c75e8ea1";

    @GET("api/recipes?_app_id=" + id + "&_app_key=" + key)
    Call<Yummly> getYummly();

}

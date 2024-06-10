package com.kelompok2.restokita.api;

import com.kelompok2.restokita.DatabaseHelper.DatabaseHelper;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiService {
    @POST("/register")
    Call<Void> registerUser(@Body DatabaseHelper.User user);

    @POST("/login")
    Call<Void> loginUser(@Body DatabaseHelper.User user);
}

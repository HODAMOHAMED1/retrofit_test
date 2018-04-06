package com.example.hodaco.retrofit_test;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by hoda.CO on 04/04/2018.
 */

public interface service {
    @GET("users/{username}")
    Call<Example> getUser(@Path("username") String username);
}

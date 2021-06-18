package com.example.task_5_booksdata;

import retrofit2.Call;
import retrofit2.http.GET;

public interface EndPointInterface {
    @GET("books/v1/volumes?q=twostates")
    Call<String> getdata();
}

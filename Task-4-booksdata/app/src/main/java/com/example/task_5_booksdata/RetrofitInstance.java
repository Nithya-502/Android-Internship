package com.example.task_5_booksdata;

import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class RetrofitInstance {
    public static final String BASEURL="https://www.googleapis.com/";
    static Retrofit retrofit;
    public static Retrofit getRetrofit()
    {
        if(retrofit==null)
        {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASEURL)
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}

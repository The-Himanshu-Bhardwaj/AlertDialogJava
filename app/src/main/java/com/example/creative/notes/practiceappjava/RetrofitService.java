package com.example.creative.notes.practiceappjava;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public interface RetrofitService {
    String BASE_URL = "https://api.quotable.io/";

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();


    @GET("quotes")
    Call<QuoteModel> getAllQuotes();

}

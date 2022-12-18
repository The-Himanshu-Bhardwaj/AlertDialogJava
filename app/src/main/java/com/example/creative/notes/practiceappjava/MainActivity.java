package com.example.creative.notes.practiceappjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RetrofitService retrofitService;
    ArrayList<Result> resultList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        retrofitService = RetrofitService.retrofit.create(RetrofitService.class);

        loadData();


    }

    private void loadData() {

        Call<QuoteModel> call = retrofitService.getAllQuotes();
        call.enqueue(new Callback<QuoteModel>() {
            @Override
            public void onResponse(Call<QuoteModel> call, Response<QuoteModel> response) {
                QuoteModel model = response.body();

                ArrayList<Result> results = (ArrayList<Result>) model.getResults();

                for (int i = 0; i < response.body().getResults().size(); i++) {
                    resultList.add(new Result(results.get(i).getAuthor(),
                            results.get(i).getContent()));
                }
                for (int i = 0; i < resultList.size(); i++) {
                    Log.d("@@", resultList.get(i).getAuthor());
                }
            }


            @Override
            public void onFailure(Call<QuoteModel> call, Throwable t) {

            }
        });
    }
}
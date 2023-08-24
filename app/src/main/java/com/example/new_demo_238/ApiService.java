package com.example.new_demo_238;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("https://patoliyaitsolution.com/demo/Applist.txt") // Replace with your API endpoint
    Call<DataModel> getData(); // Define YourResponseModel according to your API response// Define YourResponseModel according to your API response

}

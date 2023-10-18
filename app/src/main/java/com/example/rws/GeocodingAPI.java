package com.example.rws;

import com.example.rws.DataModel.GeocodingResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GeocodingAPI {
    @GET("v1/search")
    Call<GeocodingResponse> searchLocation(@Query("name") String cityName);
}

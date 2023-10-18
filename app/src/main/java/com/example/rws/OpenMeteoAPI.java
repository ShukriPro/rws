package com.example.rws;

import com.example.rws.DataModel.GeocodingResponse;
import com.example.rws.DataModel.Location;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface OpenMeteoAPI {

    @GET("v1/forecast")
    Call<Location> getDetailedWeatherData(
            @Query("latitude") double latitude,
            @Query("longitude") double longitude,
            @Query("current") String current,
            @Query("hourly") String hourly,
            @Query("daily") String daily,
            @Query("timezone") String timezone
    );

    @GET("v1/forecast")
    Call<Location> getBasicWeatherData(
            @Query("latitude") double latitude,
            @Query("longitude") double longitude
    );

    @GET("v1/search")
    Call<GeocodingResponse> searchLocation(
            @Query("name") String name
    );

    @GET("weather_endpoint_path_here")
    Call<Location> getWeatherData(
            @Query("latitude") double latitude,
            @Query("longitude") double longitude,
            @Query("current") String currentParams,
            @Query("hourly") String hourlyParams,
            @Query("daily") String dailyParams,
            @Query("units") String units
    );
}

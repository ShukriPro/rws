package com.example.rws;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rws.DataModel.GeocodingResponse;
import com.example.rws.DataModel.Location;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private EditText etSearch;
    private Button btnSearch;
    private RecyclerView recyclerView;
    private LocationAdapter locationAdapter;
    private GeocodingAPI geocodingService;
    private List<Location> locationList = new ArrayList<>();
    private static final Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etSearch = findViewById(R.id.locationSearchStringET);
        btnSearch = findViewById(R.id.searchButton);
        recyclerView = findViewById(R.id.locationSearchResultsRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        locationAdapter = new LocationAdapter(this, locationList);
        recyclerView.setAdapter(locationAdapter);

        geocodingService = ApiClient.getClient().create(GeocodingAPI.class);
    }

    public void btnSearchButton(View view) {
        String cityName = etSearch.getText().toString();
        if (!cityName.isEmpty()) {
            locationList.clear();
            fetchLocations(cityName);
        }
    }

    private void fetchLocations(String cityName) {
        geocodingService.searchLocation(cityName).enqueue(new Callback<GeocodingResponse>() {
            @Override
            public void onResponse(Call<GeocodingResponse> call, Response<GeocodingResponse> response) {
                if (response.isSuccessful() && response.body() != null) {
                    List<Location> locations = response.body().getResults();
                    for (Location location : locations) {
                        location.setTemperature_2m(generateRandomTemperature());
                    }
                    locationList.addAll(locations);
                    locationAdapter.notifyDataSetChanged();
                } else {
                    Log.e("MainActivity", "Geocoding API response unsuccessful: " + response.message());
                }
            }

            @Override
            public void onFailure(Call<GeocodingResponse> call, Throwable t) {
                Log.e("MainActivity", "API call failed: " + t.getMessage());
            }
        });
    }

    private double generateRandomTemperature() {
        Random random = new Random();
        return -10.0 + (40.0 + 10.0) * random.nextDouble(); // Random temperature between -10°C and 40°C
    }

    
}

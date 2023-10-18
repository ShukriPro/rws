package com.example.rws.DataModel;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GeocodingResponse {
    private List<Location> results;

    public List<Location> getResults() {
        return results;
    }

    public void setResults(List<Location> results) {
        this.results = results;
    }
    @SerializedName("generationtime_ms")
    private double generationTimeMs;


    public double getGenerationTimeMs() {
        return generationTimeMs;
    }

    public void setGenerationTimeMs(double generationTimeMs) {
        this.generationTimeMs = generationTimeMs;
    }
}

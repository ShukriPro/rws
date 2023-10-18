package com.example.rws.DataModel;

public class Location {

    private int id;
    private String name;
    private double latitude;
    private double longitude;
    private double elevation;
    private String feature_code;
    private String country_code;
    private int admin1_id;
    private int admin2_id;
    private String timezone;
    private int population;
    private int country_id;
    private String country;
    private String admin1;
    private String admin2;

    // Getter methods for each property
    private double temperature_2m; // Assuming this is already there

// ...

    public double getTemperature_2m() {
        return temperature_2m;
    }

    public void setTemperature_2m(double temperature_2m) {
        this.temperature_2m = temperature_2m;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getElevation() {
        return elevation;
    }

    public String getFeatureCode() {
        return feature_code;
    }

    public String getCountryCode() {
        return country_code;
    }

    public int getAdmin1Id() {
        return admin1_id;
    }

    public int getAdmin2Id() {
        return admin2_id;
    }

    public String getTimezone() {
        return timezone;
    }

    public int getPopulation() {
        return population;
    }

    public int getCountryId() {
        return country_id;
    }

    public String getCountry() {
        return country;
    }

    public String getAdmin1() {
        return admin1;
    }

    public String getAdmin2() {
        return admin2;
    }

    // Setter methods for each property

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setElevation(double elevation) {
        this.elevation = elevation;
    }

    public void setFeature_code(String feature_code) {
        this.feature_code = feature_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public void setAdmin1_id(int admin1_id) {
        this.admin1_id = admin1_id;
    }

    public void setAdmin2_id(int admin2_id) {
        this.admin2_id = admin2_id;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setAdmin1(String admin1) {
        this.admin1 = admin1;
    }

    public void setAdmin2(String admin2) {
        this.admin2 = admin2;
    }

    public String getFeature_code() {
        return feature_code;
    }

    public String getCountry_code() {
        return country_code;
    }

    public int getAdmin1_id() {
        return admin1_id;
    }

    public int getAdmin2_id() {
        return admin2_id;
    }

    public int getCountry_id() {
        return country_id;
    }

    public Location(int id, String name, double latitude, double longitude, double elevation, String feature_code, String country_code, int admin1_id, int admin2_id, String timezone, int population, int country_id, String country, String admin1, String admin2) {
        this.id = id;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.elevation = elevation;
        this.feature_code = feature_code;
        this.country_code = country_code;
        this.admin1_id = admin1_id;
        this.admin2_id = admin2_id;
        this.timezone = timezone;
        this.population = population;
        this.country_id = country_id;
        this.country = country;
        this.admin1 = admin1;
        this.admin2 = admin2;
    }

    // ... Add setter methods for each property if necessary ...

}

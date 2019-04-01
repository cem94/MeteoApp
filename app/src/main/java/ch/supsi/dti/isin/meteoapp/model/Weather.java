package ch.supsi.dti.isin.meteoapp.model;

import android.graphics.Bitmap;

public class Weather {

    private String weatherResourceImage;
    private double temperature;
    private String description;
    private String locationName;
    private String main;
    private Bitmap bitmap;


    public String getWeatherResourceImage() {
        return weatherResourceImage;
    }

    public void setWeatherResourceImage(final String weatherResourceImage) {
        this.weatherResourceImage = weatherResourceImage;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(final double temperature) {
        this.temperature = temperature;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(final String locationName) {
        this.locationName = locationName;
    }

    public String getMain() {
        return main;
    }

    public void setMain(final String main) {
        this.main = main;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(final Bitmap bitmap) {
        this.bitmap = bitmap;
    }
}
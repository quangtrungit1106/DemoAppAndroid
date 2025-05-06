package com.example.demoandroidnetwork.model;

public class WeatherForecastModel {
    private String time;
    private String temperature;
    private String icon;
    private String winSpeed;

    public WeatherForecastModel(java.lang.String time, java.lang.String temperature, java.lang.String icon, java.lang.String winSpeed) {
        this.time = time;
        this.temperature = temperature;
        this.icon = icon;
        this.winSpeed = winSpeed;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getWinSpeed() {
        return winSpeed;
    }

    public void setWinSpeed(String winSpeed) {
        this.winSpeed = winSpeed;
    }
}

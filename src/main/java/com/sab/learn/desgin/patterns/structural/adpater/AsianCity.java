package com.sab.learn.desgin.patterns.structural.adpater;

public class AsianCity implements City {
    private String name;
    private double temperature;
    private volatile boolean hasWarnings;

    public AsianCity(String name, double temperature) {
        this.name = name;
        this.temperature = temperature;
    }

    public String getName() {
        return this.name;
    }

    public double getTemperature() {
        return temperature;
    }

    public String getTemperatureScale() {
        return TemperatureScale.CELSIUS.getScale();
    }

    public boolean getHasWeatherWarning() {
        return hasWarnings;
    }

    public void setHasWeatherWarning(boolean hasWeatherWarning) {
        this.hasWarnings = hasWeatherWarning;
    }
}

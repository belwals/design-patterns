package com.sab.learn.adpater;

public class WeatherWarnings {
    private static final double MAX_TEMPERATURE = 108;
    private static final double MIN_TEMPERATURE = 16;

    public void postWarnings(City city) {
        if (showWarnings(city)) {
            System.out.println("Warning! current temperature in " + city.getName() + ", " + city.getTemperature() + city.getTemperatureScale());
        } else {
            System.out.println("Temperature in city " + city.getName() + " is OK!");
        }
    }

    private boolean showWarnings(City city) {
        double temperature = city.getTemperature();
        return temperature >= MAX_TEMPERATURE || temperature <= MIN_TEMPERATURE;
    }
}

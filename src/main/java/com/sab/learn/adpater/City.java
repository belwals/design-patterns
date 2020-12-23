package com.sab.learn.adpater;

public interface City {
    String getName();

    double getTemperature();

    String getTemperatureScale();

    boolean getHasWeatherWarning();

    void setHasWeatherWarning(boolean hasWeatherWarning);
}

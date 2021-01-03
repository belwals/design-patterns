package com.sab.learn.desgin.patterns.structural.adpater;

public class FahrenheitCityAdapter implements City {

    private City city;

    public FahrenheitCityAdapter(City city) {
        this.city = city;
    }

    public String getName() {
        return city.getName();
    }

    public double getTemperature() {
        if (TemperatureScale.CELSIUS.getScale().equals(city.getTemperatureScale())) {
            double temperatureInCelsius = city.getTemperature();
            return (temperatureInCelsius * 9) / 5 + 32;
        }
        return city.getTemperature();
    }

    public String getTemperatureScale() {
        return TemperatureScale.FAHRENHEIT.getScale();
    }

    public boolean getHasWeatherWarning() {
        return city.getHasWeatherWarning();
    }

    public void setHasWeatherWarning(boolean hasWeatherWarning) {
        city.setHasWeatherWarning(hasWeatherWarning);
    }
}

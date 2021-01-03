package com.sab.learn.desgin.patterns.structural.adpater;

public enum TemperatureScale {
    FAHRENHEIT("Fahrenheit"),
    CELSIUS("Celsius");

    String scale;

    TemperatureScale(String scale) {
        this.scale = scale;
    }

    public String getScale() {
        return scale;
    }
}

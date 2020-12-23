package com.sab.learn.adpater;

public class Application {

    public static void main(String[] args) {
        WeatherWarnings weatherWarnings = new WeatherWarnings();
        NorthAmericaCity chicago = new NorthAmericaCity("Chicago", 16);
        weatherWarnings.postWarnings(chicago);

        NorthAmericaCity phoenix = new NorthAmericaCity("Phoenix", 108);
        weatherWarnings.postWarnings(phoenix);

        NorthAmericaCity portland = new NorthAmericaCity("Portland", 70);
        weatherWarnings.postWarnings(portland);

        AsianCity bangkok = new AsianCity("Bangkok", 50);
        FahrenheitCityAdapter bangkokConverted = new FahrenheitCityAdapter(bangkok);
        weatherWarnings.postWarnings(bangkokConverted);
    }
}

package com.sab.learn.desgin.patterns.creational.abstract_factories;


public class RoadBikeFactory extends BikeFactory {

    @Override
    public Tire createTire() {
        return new RoadBikeTire();
    }

    @Override
    public Handlebar createHandlebar() {
        return new RoadBikeHandlebar();
    }
}

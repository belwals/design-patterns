package com.sab.learn.desgin.patterns.creational.abstract_factories;


public class MountainBikeFactory extends BikeFactory {

    @Override
    public Tire createTire() {
        return new MountainBikeTire();
    }

    @Override
    public Handlebar createHandlebar() {
        return new MountainBikeHandlebar();
    }
}

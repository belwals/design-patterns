package com.sab.learn.desgin.patterns.creational.abstract_factories;


public class FactoryCreator {

    public static BikeFactory createFactory(String type) {
        if (type.equalsIgnoreCase("mountain bike")) {
            return new MountainBikeFactory();
        } else if (type.equalsIgnoreCase("road bike")) {
            return new RoadBikeFactory();
        } else {
            System.out.println("Please specify a valid type");
            return null;
        }
    }
}

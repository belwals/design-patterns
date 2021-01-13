package com.sab.learn.desgin.patterns.creational.abstract_factories;


public class RoadBikeHandlebar extends Handlebar {

    private static String type = "DROP";

    @Override
    public void getDescription() {
        System.out.println("Road bike handlebar. Type: " + type);
    }
}

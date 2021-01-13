package com.sab.learn.desgin.patterns.creational.abstract_factories;

public class MountainBikeHandlebar extends Handlebar {

    private static String type = "FLAT";

    @Override
    public void getDescription() {
        System.out.println("Mountain bike handlebar. Type: " + type);
    }
}

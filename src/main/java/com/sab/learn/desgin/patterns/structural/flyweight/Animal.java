package com.sab.learn.desgin.patterns.structural.flyweight;

public interface Animal {
    String getAnimalType();

    int[] getLocation();

    void setLocation(int latitude, int longitude);
}

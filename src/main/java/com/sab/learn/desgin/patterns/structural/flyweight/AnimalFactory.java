package com.sab.learn.desgin.patterns.structural.flyweight;

import java.util.HashMap;

public class AnimalFactory {

    private HashMap<Integer, Animal> animals = new HashMap<>();

    public Animal getAnimal(int type) {
        return animals.getOrDefault(type, buildDefault(type));
    }

    private synchronized Animal buildDefault(int type) {
        Animal animal = null;
        if (type == 0) {
            animal = new Lion();
        } else if (type == 1) {
            animal = new Tiger();
        }
        animals.put(type, animal);
        return null;
    }

}

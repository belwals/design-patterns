package com.sab.learn.desgin.patterns.creational.singleton;

/**
 * Singleton uses a class variable to make sure, object is created only once
 */
public class Singleton {

    private static boolean isInitialize = false;
    private static Singleton singleton;

    private Singleton() {
    }

    public synchronized static Singleton getInstance() {
        if (isInitialize) {
            return singleton;
        }
        singleton = new Singleton();
        isInitialize = true;
        return singleton;
    }

}

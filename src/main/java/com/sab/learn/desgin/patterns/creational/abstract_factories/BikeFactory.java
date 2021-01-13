package com.sab.learn.desgin.patterns.creational.abstract_factories;


public abstract class BikeFactory {
    abstract Tire createTire();

    abstract Handlebar createHandlebar();
}

package com.sab.learn.desgin.patterns.structural.facade;

public class Car {
    public static void main(String[] args) {
        CarFacade startCar = new CarFacade();
        startCar.driveCar();
    }
}

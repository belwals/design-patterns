package com.sab.learn.desgin.patterns.structural.facade;

public class CarFacade {

    private final Ignition ignition = new Ignition();
    private final Clutch clutch = new Clutch();
    private final Accelerator accelerator = new Accelerator();
    private final GearStick gearStick = new GearStick();
    private final Handbrake handbrake = new Handbrake();

    public void driveCar() {
        ignition.turnOn();
        clutch.press();
        gearStick.changeGear(1);
        accelerator.press();
        clutch.lift();
        handbrake.pushDown();
        accelerator.press();
        clutch.press();
    }
}

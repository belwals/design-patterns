package com.sab.learn.desgin.patterns.structural.facade;

public class GearStick {

  private int gear = 0;

  public void changeGear(int gear) {
    System.out.println("Changing gear to " + gear);
    this.gear = gear;
  }

}

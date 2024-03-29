package com.sab.learn.desgin.patterns.structural.flyweight;

public class Tiger implements Animal {

  private int[] location = new int[2];

  public String getAnimalType() {
    return "Tiger";
  }

  public void setLocation(int latitude, int longitude) {
    location[0] = latitude;
    location[1] = longitude;
  }

  public int[] getLocation() {
    return location;
  }

}

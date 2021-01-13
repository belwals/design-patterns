package com.sab.learn.desgin.patterns.creational.builder;

import java.awt.*;

public class Builder {
    private Dimension dimensions;
    private int ceilingHeight;
    private int floorNumber;
    private Color wallColor;
    private int numberOfWindows;
    private int numberOfDoors;
    private boolean isDouble;
    private boolean hasEnsuite;

    public Builder setDimensions(Dimension dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    public Builder setCeilingHeight(int ceilingHeight) {
        this.ceilingHeight = ceilingHeight;
        return this;
    }

    public Builder setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
        return this;
    }

    public Builder setWallColor(Color wallColor) {
        this.wallColor = wallColor;
        return this;
    }

    public Builder setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
        return this;
    }

    public Builder setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
        return this;
    }

    public Builder setDouble(boolean aDouble) {
        isDouble = aDouble;
        return this;
    }

    public Builder setHasEnsuite(boolean hasEnsuite) {
        this.hasEnsuite = hasEnsuite;
        return this;
    }

    public Bedroom build() {
        return new Bedroom(dimensions, ceilingHeight, floorNumber, wallColor, numberOfWindows, numberOfDoors, isDouble, hasEnsuite);
    }
}

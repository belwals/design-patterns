package com.sab.learn.desgin.patterns.creational.builder;

import java.awt.*;

public class Architect {

    public static void main(String[] args) {
        Bedroom room = new Builder().setDimensions(new Dimension(200, 100))
                .setCeilingHeight(3).setFloorNumber(2)
                .setWallColor(Color.WHITE)
                .setNumberOfWindows(2)
                .setNumberOfDoors(1)
                .setDouble(true)
                .setHasEnsuite(false)
                .build();
        Bedroom room2 = new Builder()
                .setDimensions(new Dimension(300, 250))
                .build();


    }

}

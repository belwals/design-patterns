package com.sab.learn.desgin.patterns.structural.bridge;

public class SmallButton implements SizeOfButton {
    private static final String SIZE = "SMALL";
    @Override
    public String getSize() {
        return SIZE;
    }
}

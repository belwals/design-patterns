package com.sab.learn.desgin.patterns.structural.bridge;

public class MediumButton implements SizeOfButton {
    private static final String SIZE = "MEDIUM";

    @Override
    public String getSize() {
        return SIZE;
    }
}

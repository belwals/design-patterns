package com.sab.learn.desgin.patterns.structural.bridge;

public class LargeButton implements SizeOfButton {
    private static final String SIZE = "LARGE";

    @Override
    public String getSize() {
        return SIZE;
    }
}

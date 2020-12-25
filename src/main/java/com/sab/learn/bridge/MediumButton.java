package com.sab.learn.bridge;

public class MediumButton implements SizeOfButton {
    private static final String SIZE = "MEDIUM";

    @Override
    public String getSize() {
        return SIZE;
    }
}

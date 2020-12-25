package com.sab.learn.bridge;

public class LargeButton implements SizeOfButton {
    private static final String SIZE = "LARGE";

    @Override
    public String getSize() {
        return SIZE;
    }
}

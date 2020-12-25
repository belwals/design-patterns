package com.sab.learn.bridge;

public interface SizeOfButton {
    String getSize();

    default void printSize() {
        String size = this.getSize();
        System.out.println("Setting up the size " + size);
    }
}

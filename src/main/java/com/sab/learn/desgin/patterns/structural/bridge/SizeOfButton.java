package com.sab.learn.desgin.patterns.structural.bridge;

public interface SizeOfButton {
    String getSize();

    default void printSize() {
        String size = this.getSize();
        System.out.println("Setting up the size " + size);
    }
}

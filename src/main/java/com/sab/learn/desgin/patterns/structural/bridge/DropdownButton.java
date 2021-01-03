package com.sab.learn.desgin.patterns.structural.bridge;

public class DropdownButton extends Button {

    private SizeOfButton sizeOfButton;

    public DropdownButton(SizeOfButton sizeOfButton) {
        this.sizeOfButton = sizeOfButton;
    }

    public void draw() {
        sizeOfButton.printSize();
        System.out.println("Drawing a dropdown button.\n");
    }

}

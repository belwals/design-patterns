package com.sab.learn.desgin.patterns.structural.bridge;

public class RadioButton extends Button {

    private SizeOfButton sizeOfButton;

    public RadioButton(SizeOfButton sizeOfButton) {
        this.sizeOfButton = sizeOfButton;
    }

    public void draw() {
        sizeOfButton.printSize();
        System.out.println("Drawing a radio button.\n");
    }

}

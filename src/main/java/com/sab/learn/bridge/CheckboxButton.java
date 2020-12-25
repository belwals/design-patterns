package com.sab.learn.bridge;

public class CheckboxButton extends Button {
    private SizeOfButton sizeOfButton;

    public CheckboxButton(SizeOfButton sizeOfButton) {
        this.sizeOfButton = sizeOfButton;
    }

    public void draw() {
    sizeOfButton.printSize();
    System.out.println("Drawing a checkbox button.\n");
  }

}

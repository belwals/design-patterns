package com.sab.learn.desgin.patterns.structural.composite;

public interface Book {
    boolean isCheckedOut();
    String getName();
    void setCheckedOut(boolean checkedOut);
}

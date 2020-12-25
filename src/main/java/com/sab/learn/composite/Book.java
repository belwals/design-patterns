package com.sab.learn.composite;

public interface Book {
    boolean isCheckedOut();
    String getName();
    void setCheckedOut(boolean checkedOut);
}

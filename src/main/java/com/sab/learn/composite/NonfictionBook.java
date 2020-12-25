package com.sab.learn.composite;

public class NonfictionBook implements Book {
    private String name;
    private boolean checkedOut;

    public NonfictionBook(String name) {
        this.name = name;
        checkedOut = false;
    }

    public String getName() {
        return name;
    }

    @Override
    public synchronized void setCheckedOut(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }

    @Override
    public synchronized boolean isCheckedOut() {
        return this.checkedOut;
    }
}

package com.sab.learn.composite;

public class FictionBook implements Book {

    private String name;
    private boolean checkedOut;
    private boolean isAPlay;

  public String getName() {
    return this.name;
  }

  public boolean isAPlay() {
    return isAPlay;
  }

  public FictionBook(String name, boolean isAPlay) {
        this.name = name;
        this.isAPlay = isAPlay;
        this.checkedOut = false;
    }

  @Override
  public synchronized boolean isCheckedOut() {
    return this.checkedOut;
  }

  @Override
  public synchronized void setCheckedOut(boolean checkedOut) {
    this.checkedOut = checkedOut;
  }
}

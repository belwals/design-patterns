package com.sab.learn.desgin.patterns.structural.decorator;

import java.util.ArrayList;

public interface Pizza {
  ArrayList<String> getToppings();
  String getName();
  String crustName();
}

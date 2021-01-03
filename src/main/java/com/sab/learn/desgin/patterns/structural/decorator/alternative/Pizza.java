package com.sab.learn.desgin.patterns.structural.decorator.alternative;

import java.util.ArrayList;

public interface Pizza {
  ArrayList<String> getToppings();
  PizzaName getName();
  String crustName();
}

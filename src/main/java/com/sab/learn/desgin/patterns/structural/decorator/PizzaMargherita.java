package com.sab.learn.desgin.patterns.structural.decorator;

import java.util.ArrayList;

public class PizzaMargherita implements Pizza {

    private final ArrayList<String> toppings;
    private static final String PIZZA_NAME = "Margherita";
    private final String crustName;

    public PizzaMargherita(String crustName) {
        this.crustName = crustName;
        toppings = new ArrayList<>();
        addDefaultIngredients();
    }

    public void addDefaultIngredients() {
        toppings.add("cheese");
        toppings.add("tomato");
    }


    public ArrayList getToppings() {
        return toppings;
    }

    public String getName() {
        return PIZZA_NAME;
    }

    @Override
    public String crustName() {
        return crustName;
    }
}

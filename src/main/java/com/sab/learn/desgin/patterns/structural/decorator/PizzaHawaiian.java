package com.sab.learn.desgin.patterns.structural.decorator;

import java.util.ArrayList;

public class PizzaHawaiian implements Pizza {
    private final ArrayList<String> toppings;
    private static final String PIZZA_NAME = "Hawaiiian";
    private final String crustName;

    public PizzaHawaiian(String crustName) {
        toppings = new ArrayList<>();
        this.crustName = crustName;
        addDefaultIngredients();
    }

    private void addDefaultIngredients() {
        toppings.add("cheese");
        toppings.add("tomato");
        toppings.add("ham");
        toppings.add("pineapple");
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

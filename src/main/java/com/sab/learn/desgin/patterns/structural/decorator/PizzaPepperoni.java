package com.sab.learn.desgin.patterns.structural.decorator;

import java.util.ArrayList;

public class PizzaPepperoni implements Pizza {
    private final ArrayList<String> toppings;
    private static final String PIZZA_NAME = "Pepperoni";
    private final String crustName;

    public PizzaPepperoni(String crustName) {
        this.crustName = crustName;
        toppings = new ArrayList<>();
        addDefaultIngredients();
    }

    private void addDefaultIngredients() {
        toppings.add("cheese");
        toppings.add("tomato");
        toppings.add("pepperoni");
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

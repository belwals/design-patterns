package com.sab.learn.desgin.patterns.structural.decorator;

import java.util.ArrayList;

public class PizzaWithCheese implements Pizza {

    private final Pizza pizza;
    private final ArrayList<String> toppings;

    public PizzaWithCheese(Pizza pizza) {
        this.pizza = pizza;
        toppings = getToppings();

        addAdditionalToppings();
    }

    private void addAdditionalToppings() {
        toppings.add(" Extra Cheese");
    }


    @Override
    public ArrayList<String> getToppings() {
        return pizza.getToppings();
    }

    @Override
    public String getName() {
        return pizza.getName();
    }

    @Override
    public String crustName() {
        return pizza.crustName();
    }
}

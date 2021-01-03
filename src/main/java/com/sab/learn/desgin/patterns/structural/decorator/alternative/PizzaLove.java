package com.sab.learn.desgin.patterns.structural.decorator.alternative;

import java.util.ArrayList;

public class PizzaLove implements Pizza {

    private final PizzaName pizzaName;
    private final CrustName crustName;
    private final ArrayList<String> toppings;

    public PizzaLove(PizzaName pizzaName, CrustName crustName) {
        this.pizzaName = pizzaName;
        this.crustName = crustName;
        this.toppings = new ArrayList<>();
    }

    @Override
    public ArrayList<String> getToppings() {
        return toppings;
    }

    @Override
    public PizzaName getName() {
        return pizzaName;
    }

    @Override
    public String crustName() {
        return crustName.getCrustName();
    }
}

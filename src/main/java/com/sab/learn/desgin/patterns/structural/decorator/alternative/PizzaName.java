package com.sab.learn.desgin.patterns.structural.decorator.alternative;

import java.util.List;
import java.util.function.Consumer;

public enum PizzaName {
    HAWAIIAN(PizzaRecipe::addHawaiianToppings),
    MARGHERITA(PizzaRecipe::addMargheritaToppings),
    PEPPERONI(PizzaRecipe::addPepperoniToppings);

    Consumer<List<String>> applyToppings;

    public void applyToppingsFunction(List<String> toppings) {
        applyToppings.accept(toppings);
    }

    PizzaName(Consumer<List<String>> applyToppings) {
        this.applyToppings = applyToppings;
    }
}

class PizzaRecipe {
    public static void addMargheritaToppings(List<String> toppings) {
        toppings.add("cheese");
        toppings.add("tomato");
    }

    public static void addHawaiianToppings(List<String> toppings) {
        toppings.add("cheese");
        toppings.add("tomato");
        toppings.add("ham");
        toppings.add("pineapple");
    }

    public static void addPepperoniToppings(List<String> toppings) {
        toppings.add("cheese");
        toppings.add("tomato");
        toppings.add("pepperoni");
    }

}

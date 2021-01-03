package com.sab.learn.desgin.patterns.structural.decorator;

public class Main {
    public static void main(String[] args) {
        order(new PizzaMargherita("Thin Crust"));
        PizzaHawaiian cheese = new PizzaHawaiian("Cheese");
        order(cheese);
        PizzaWithCheese pizzaWithCheese = new PizzaWithCheese(cheese);
        order(pizzaWithCheese);
        order(new PizzaPepperoni("Double Cheese"));

    }

    public static void order(Pizza pizza) {
        System.out.println("You have ordered a " + pizza.getName() +
                " with " + pizza.crustName() +
                " pizza. The toppings are " + pizza.getToppings() + ".");
    }

}

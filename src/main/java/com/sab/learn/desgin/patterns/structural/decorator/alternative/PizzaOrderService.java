package com.sab.learn.desgin.patterns.structural.decorator.alternative;

public class PizzaOrderService {

    public static void main(String[] args) {
        System.out.println("Taking Pizza order");
        PizzaLove hawaiian = new PizzaLove(PizzaName.HAWAIIAN, CrustName.THIN_CRUST);
        PizzaLove margherita = new PizzaLove(PizzaName.MARGHERITA, CrustName.CHEESE_BRUST);
        PizzaLove pepperoni = new PizzaLove(PizzaName.PEPPERONI, CrustName.THIN_CRUST);
        PizzaLove hawaiianWithDoubleCheese = new PizzaLove(PizzaName.HAWAIIAN, CrustName.DOUBLE_CHEESE);

        order(hawaiian);
        order(margherita);
        order(pepperoni);
        order(hawaiianWithDoubleCheese);
    }


    public static void order(Pizza pizza) {
        PizzaName name = pizza.getName();
        name.applyToppingsFunction(pizza.getToppings());
        System.out.println("You have ordered a " + pizza.getName() +
                " with " + pizza.crustName() +
                " pizza. The toppings are " + pizza.getToppings() + ".");
    }
}

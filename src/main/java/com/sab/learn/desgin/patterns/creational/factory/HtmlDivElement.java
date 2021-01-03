package com.sab.learn.desgin.patterns.creational.factory;

public class HtmlDivElement implements HtmlElement {
    @Override
    public void click() {
        System.out.println("Performing click operation on the Div Element");
    }
}

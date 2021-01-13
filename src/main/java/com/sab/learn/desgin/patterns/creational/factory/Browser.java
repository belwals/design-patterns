package com.sab.learn.desgin.patterns.creational.factory;

import java.util.Optional;

public class Browser {
    public static void main(String[] args) {
        DocumentFactory documentFactory = new DocumentFactory();
        Optional<HtmlElement> div = documentFactory.creatElement("div");
        Optional<HtmlElement> button = documentFactory.creatElement("button");
        performClick(div);
        performClick(button);
    }

    private static void performClick(Optional<HtmlElement> element) {
        element.ifPresent(HtmlElement::click);
    }
}

package com.sab.learn.desgin.patterns.creational.factory;

import java.util.Objects;
import java.util.Optional;

public class DocumentFactory {

    public Optional<HtmlElement> creatElement(String tagName) {
        HtmlElement htmlElement = null;
        if (Objects.nonNull(tagName)) {
            if (TagName.BUTTON.name().equalsIgnoreCase(tagName.toUpperCase())) {
                htmlElement = new HtmlButtonElement();
            } else if (TagName.DIV.name().equalsIgnoreCase(tagName.toUpperCase())) {
                htmlElement = new HtmlDivElement();
            } else {
                new RuntimeException("Invalid Tag requested for creation");
            }
        }
        return Optional.ofNullable(htmlElement);
    }
}

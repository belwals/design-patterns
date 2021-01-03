package com.sab.learn.desgin.patterns.structural.decorator.alternative;

public enum CrustName {
    THIN_CRUST("Thin Crust"),
    REGULAR("Regular"),
    CHEESE_BRUST("Cheese brust"),
    DOUBLE_CHEESE("Double cheese");

    private String crustName;

    CrustName(String crustName) {
        this.crustName = crustName;
    }

    public String getCrustName() {
        return crustName;
    }
}

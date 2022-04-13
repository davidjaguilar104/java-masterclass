package com.company;

public class HealthyBurger extends Hamburger {
    private boolean hasJalepenos;
    private boolean hasMushrooms;

    public HealthyBurger(String name, String meat) {
        super(name, meat, "brown rye");
        this.hasJalepenos = false;
        this.hasMushrooms = false;
    }

}

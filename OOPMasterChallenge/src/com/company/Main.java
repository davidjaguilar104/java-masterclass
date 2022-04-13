package com.company;

public class Main {

    public static void main(String[] args) {
        HealthyBurger h = new HealthyBurger("good", "beef");
        h.addToppingsToBurger(6);
        h.getNumberOfToppings();

        Hamburger ha = new Hamburger("geesh", "beef", "white");
        ha.addToppingsToBurger(6);
    }
}

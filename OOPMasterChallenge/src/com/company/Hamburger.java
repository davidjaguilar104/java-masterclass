package com.company;

public class Hamburger {

    private String name;
    private String meat;
    private int price;
    private String breadType;
    // variable to hold price of additional topping
    private int addToppingCost;
    private boolean hasLettuce;
    private boolean hasTomato;
    private boolean hasPickle;
    private boolean hasOnion;

    public Hamburger(String name, String meat, String breadType) {
        this.name = name;
        this.meat = meat;
        this.price = 10;
        this.breadType = breadType;
        this.addToppingCost = 1;
    }

    public void setHasLettuce(boolean hasLettuce) {
        this.hasLettuce = hasLettuce;
    }

    public void setHasTomato(boolean hasTomato) {
        this.hasTomato = hasTomato;
    }

    public void setHasPickle(boolean hasPickle) {
        this.hasPickle = hasPickle;
    }

    public void setHasOnion(boolean hasOnion) {
        this.hasOnion = hasOnion;
    }

    public void getNumberOfToppings() {
        System.out.println("You have " + this.addToppingCost + " toppings");
    }

    public void addToppingsToBurger(int numberOfToppings) {
        this.addToppingCost *= numberOfToppings;
        this.price += this.addToppingCost;

        if (getClass().getSimpleName().equals("Hamburger")) {
            if (numberOfToppings > 4) {
                System.out.println("You need to upgrade to a HealthyBurger to add more than 4 toppings");
                return;
            }
            switch (numberOfToppings) {
                case 1:
                    setHasLettuce(true);
                    break;
                case 2:
                    setHasLettuce(true);
                    setHasTomato(true);
                    break;
                case 3:
                    setHasLettuce(true);
                    setHasTomato(true);
                    setHasPickle(true);
                case 4:
                    setHasLettuce(true);
                    setHasTomato(true);
                    setHasPickle(true);
                    setHasOnion(true);
                default:
                    setHasLettuce(false);
                    setHasTomato(false);
                    setHasPickle(false);
                    setHasOnion(false);

            }
        }
    }
}

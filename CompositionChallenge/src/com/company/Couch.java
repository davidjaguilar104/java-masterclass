package com.company;

public class Couch {
    private String color;

    public Couch(String color) {
        this.color = color;
    }

    public void getColor() {
        System.out.println("Couch -> The couch is " + color);
    }
}

package com.company;

public class Car extends Vehicle {

    private int topSpeed;
    private int zeroToSixty;

    public Car(int year, String model, String make, int topSpeed, int zeroToSixty) {
        super(year, model, make);
        this.topSpeed = topSpeed;
        this.zeroToSixty = zeroToSixty;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getZeroToSixty() {
        return zeroToSixty;
    }

    public void setZeroToSixty(int zeroToSixty) {
        this.zeroToSixty = zeroToSixty;
    }
}

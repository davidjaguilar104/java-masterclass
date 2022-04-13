package com.company;

public class Civic  extends Car {

    private String paintJob;
    private String dealerShip;

    public Civic(int year, String model, String make, int topSpeed, int zeroToSixty, String paintJob, String dealerShip) {
        super(year, model, make, topSpeed, zeroToSixty);
        this.paintJob = paintJob;
        this.dealerShip = dealerShip;
    }

    public String getPaintJob() {
        return paintJob;
    }

    public void setPaintJob(String paintJob) {
        this.paintJob = paintJob;
    }

    public String getDealerShip() {
        return dealerShip;
    }

    public void setDealerShip(String dealerShip) {
        this.dealerShip = dealerShip;
    }
}

package com.company;

public class Printer {

    private int tonerLevel = 50;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if (tonerLevel > 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        this.pagesPrinted = 0;
        this.isDuplex = isDuplex;
    }

    public void fillToner(int amountOfToner) {
        int newTonerLevel = this.tonerLevel += amountOfToner;

        if (newTonerLevel > 100) {
            System.out.println("Choose a smaller amount of toner to add");
            newTonerLevel = this.tonerLevel;
            System.out.println("Toner level is staying at " + newTonerLevel);
        }

    }

    public void printPage(int numberOfPages) {
        this.pagesPrinted += numberOfPages;
        System.out.println("You printed " + numberOfPages + " pages");
    }

    public void getTonerLevel() {
        System.out.println("Toner percentage is at " + this.tonerLevel);
    }

    public void getPagesPrinted() {
        System.out.println("You printed " + this.pagesPrinted + " pages");
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}

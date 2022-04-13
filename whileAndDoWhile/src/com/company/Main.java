package com.company;

public class Main {

    public static void main(String[] args) {

        int number = 4;
        int finishedNumber = 20;
        int evensFound = 0;

        while(number <= finishedNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }

            System.out.println("Even number " + number);
            evensFound++;
            if(evensFound == 5) {
                System.out.println("Total even numbers found = " + evensFound);
                break;
            }
        }

    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
}

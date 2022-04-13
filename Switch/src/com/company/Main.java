package com.company;


public class Main {

    public static void main(String[] args) {

        // byte
        // short
        // char
        // int


        char character = 'E';
        switch (character) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
                System.out.println("A, B, C, D, or E was found");
                System.out.println(character + " was found");
                break;
            default:
                System.out.println("Could not find A, B, C, D, or E");

        }

        String month = "January";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "july":
                System.out.println("My birthday month!");
                break;
            default:
                System.out.println("Month was not January or July.");
        }

        printDayOfTheWeek(5);


    }


    public static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Not a valid day");
                break;
        }

    }
}

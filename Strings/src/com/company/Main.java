package com.company;

public class Main {

    public static void main(String[] args) {
        /* THE EIGHT PRIMITIVE DATA TYPES */
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        /* STRING NOT A PRIMITIVE TYPE, IS A CLASS */

        String myString = "This is a string";

        System.out.println("myString is equal to " + myString);
        myString += " , and this is more.";
        System.out.println("myString is equal to " + myString);
        myString += " \u00A9 2019";
        System.out.println(myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        // Java converted myInt into a String and concatenates it to lastString
        System.out.println("lastString is equal to " + lastString);

        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("lastString is equal to " + lastString);

        /* STRINGS IN JAVA ARE IMMUTABLE A NEW STRING GETS CREATED FOR US */

    }
}

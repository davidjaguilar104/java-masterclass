package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // gets the integers entered and print them

        int min = findMin(readIntegers(5));
        System.out.println("Minimum value in array is " + min);
    }

    public static int[] readIntegers(int count) {
        System.out.println("Count was " + count);
        System.out.println("Enter " + count + " integer values\r");
        int[] values = new int[count];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;

    }

    public static int findMin(int[] array) {
        int minValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }

        return minValue;
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {


        int number = 80;
        System.out.println("The sum of the digits in the number " + number + " is " + sumDigits(number));


    }


    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }


        int sum = 0;

        // 125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5

        while (number > 0) {
            // extract least significant digit
            int digit = number % 10;
            sum += digit;

            // drop least significant digit
            number /= 10;
        }

        return sum;
    }
}

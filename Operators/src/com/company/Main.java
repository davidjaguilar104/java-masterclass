package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        System.out.println("previousResult = " + previousResult);

        result -= 1; // 3 - 1 = 2;
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result *= 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result /= 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result %= 3; // the remainder of 4 % 3 = 1
        System.out.println("4 % 3 = " + result);


        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        boolean isAlien = false;
        if (!isAlien) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens.");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than secondTopScore and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("This is not supposed to happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }


        double doubleVar = 20.00d;
        double secondDoubleVar = 80.00d;
        double resultOfDoubles = (doubleVar + secondDoubleVar) * 100.00d;
        System.out.println("resultOfDoubles = " + resultOfDoubles);
        double remainder = resultOfDoubles % 40.00d;
        System.out.println("remainder = " + remainder);
        boolean isRemainderZero = (remainder == 0) ? true : false;
//        boolean isRemainderZero;
//        if(remainder == 0) {
//            isRemainderZero = true;
//        } else {
//            isRemainderZero = false;
//        }
        System.out.println("isRemainderZero = " + isRemainderZero);
        if (!isRemainderZero) {
            System.out.println("Got some remainder");
        }

    }
}

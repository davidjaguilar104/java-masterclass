package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // My first attempt from lines 11 - 34;

//        Scanner scanner = new Scanner(System.in);
//
//        int count = 1;
//        int goodCount = 0;
//        int sum = 0;
//        while (count < 11) {
//            System.out.println("Enter number " + count);
//            boolean hasNextInt = scanner.hasNextInt();
//            if (!hasNextInt) {
//                System.out.println("Enter a valid number!");
//                continue;
//            }
//            int number = scanner.nextInt();
//            sum += number;
//            System.out.println(sum);
//            count++;
//            goodCount++;
//            if (goodCount == 10) {
//                System.out.println(sum);
//                break;
//            }
//        }
//
//        scanner.close();

        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while (true) {
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");

            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
                if (counter == 10) {
                    break;
                }
            } else {
                System.out.println("Invalid number");
            }

            scanner.nextLine(); // handle end of line (enter key)
        }

        System.out.println("sum = " + sum);
        scanner.close();
    }
}

package com.company;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");

        boolean hasNextInt = scanner.hasNextInt();
        if (!hasNextInt) {
            System.out.println("Unable to parse year of birth");
            // added this to make it prettier, removing shows java exception!
            return;
        }
        int yearOfBirth = scanner.nextInt();

        // After call to nextInt call nextLine() again, this handles hitting enter key issue, enter is a line separator
        // Handle next line character (enter key)
        scanner.nextLine();

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        LocalDate currentDate = LocalDate.now();
        int year = currentDate.getYear();
        int age = year - yearOfBirth;
        if (age >= 0 && age <= 100) {
            System.out.println("Your name is " + name + ", and you are " + age + " years old.");
        } else {
            System.out.println("Invalid year of birth");
        }

        scanner.close();

    }
}

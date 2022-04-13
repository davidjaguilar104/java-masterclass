package com.company;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        if (age < 0 || age > 100) {
            this.age = 0;
        }
    }

    public boolean isTeen() {
        if (age > 12 && age < 20) {
            return true;
        }

        return false;
    }

    public String getFullName() {

        String emptyString = "";
//        if (emptyString.equals(firstName) && emptyString.equals(lastName)) {
//            return emptyString;
//        } else if (emptyString.equals(lastName)) {
//            return firstName;
//        } else if (emptyString.equals(firstName)) {
//            return lastName;
//        }
//
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return emptyString;
        } else if (firstName.isEmpty()) {
            return lastName;
        } else if (lastName.isEmpty()) {
            return firstName;
        }

        return firstName + " " + lastName;
    }
}


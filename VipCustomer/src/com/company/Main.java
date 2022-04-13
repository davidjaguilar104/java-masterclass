package com.company;

public class Main {

    public static void main(String[] args) {

        VipCustomer customer = new VipCustomer("David", "test@test.com", "2600");
        System.out.println(customer.getName());
        System.out.println(customer.getEmail());
        System.out.println(customer.getCreditLimit());

        System.out.println("----------------------------");

        VipCustomer customerNoValues = new VipCustomer();
        System.out.println(customerNoValues.getName());
        System.out.println(customerNoValues.getEmail());
        System.out.println(customerNoValues.getCreditLimit());

        System.out.println("----------------------------");

        VipCustomer customerTwoValues = new VipCustomer("Crichy", "demo@demo.com");
        System.out.println(customerTwoValues.getName());
        System.out.println(customerTwoValues.getEmail());
        System.out.println(customerTwoValues.getCreditLimit());
    }
}

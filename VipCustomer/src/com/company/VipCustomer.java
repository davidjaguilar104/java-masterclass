package com.company;

public class VipCustomer {
    private String name;
    private String creditLimit;
    private String email;

    public VipCustomer() {
        this("Default name", "Default email", "Default credit limit");
        System.out.println("Constructor with no params called, default values set!");
    }

    public VipCustomer(String name, String email) {
        this(name, email, "200");
        System.out.println("Constructor with name and email called, default credit limit set!");
    }

    public VipCustomer(String name, String email, String creditLimit) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}

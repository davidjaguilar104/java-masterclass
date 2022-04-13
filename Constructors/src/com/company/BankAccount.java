package com.company;

public class BankAccount {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private int customerPhone;

    // constructors can be overloaded and can be called from inside another constructor

    //     empty constructor
    public BankAccount() {
        // if called without parameters you can set default
        // using this to call another constructor has to be the first line
        this(56789, 2.50, "Default name", "Default address", 1800);
        System.out.println("Empty constructor called");
    }

    public BankAccount(int accountNumber, double balance, String customerName, String customerEmail, int customerPhone) {
        System.out.println("BankAccount constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public int getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(int customerPhone) {
        this.customerPhone = customerPhone;
    }

    public double depositFunds(double moneyIn) {
        return this.balance += moneyIn;
    }

    public void withdrawFunds(double moneyOut) {
        if (this.balance - moneyOut < 0) {
            System.out.println("You can't withdraw. No money in account!");
        } else {
            this.balance -= moneyOut;
        }
    }
}

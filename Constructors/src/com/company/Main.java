package com.company;

public class Main {

    public static void main(String[] args) {
//        BankAccount bankAccount = new BankAccount(4522, 9750.56, "David", "test@test.com", 706332525);
            BankAccount bankAccount = new BankAccount();

        System.out.println("Bank Account number is " + bankAccount.getAccountNumber());
        System.out.println("Your balance is " + bankAccount.getBalance());
        System.out.println("Your name is " + bankAccount.getCustomerName());
        System.out.println("Your email is " + bankAccount.getCustomerEmail());
        System.out.println("Your number is " + bankAccount.getCustomerPhone());

        bankAccount.withdrawFunds(10000);
        System.out.println("Your new balance after withdraw is " + bankAccount.getBalance());

        bankAccount.depositFunds(4000);
        System.out.println("Your new balance after deposit is " + bankAccount.getBalance());
    }
}

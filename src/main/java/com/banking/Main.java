package com.banking;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100);

        account.deposit(50);
        account.withdraw(30);
        account.withdraw(200);

        System.out.println("Final Balance: " + account.getBalance());
    }
}
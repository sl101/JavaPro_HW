package de.telran.module1.practice.bank_account_15_11.interfaces;

public interface Cashier {
    void deposit(double sum);
    void withdraw(double sum);
    double getBalance();
}
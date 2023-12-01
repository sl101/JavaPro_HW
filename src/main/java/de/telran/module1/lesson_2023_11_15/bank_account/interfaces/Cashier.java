package de.telran.module1.lesson_2023_11_15.bank_account.interfaces;

public interface Cashier {
    void deposit(double sum);
    void withdraw(double sum);
    double getBalance();
}
package de.telran.module1.lecture_15_11.bank_account.interfaces;

public interface Cashier {
    void deposit(double sum);
    void withdraw(double sum);
    double getBalance();
}
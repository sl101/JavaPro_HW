package de.telran.module1.lesson_2023_11_15.bank_account.interfaces.ownerInterfaces;

import de.telran.module1.lesson_2023_11_15.bank_account.interfaces.Cashier;

import java.time.LocalDate;

public interface Owner extends Cashier {
    void closeAccount(LocalDate closingDate);
}

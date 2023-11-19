package de.telran.module1.lecture_15_11.bank_account.interfaces.ownerInterfaces;

import de.telran.module1.lecture_15_11.bank_account.interfaces.Cashier;

import java.time.LocalDate;

public interface Owner extends Cashier {
    void closeAccount(LocalDate closingDate);
}

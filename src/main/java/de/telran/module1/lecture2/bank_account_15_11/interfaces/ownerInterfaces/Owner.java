package de.telran.module1.lecture2.bank_account_15_11.interfaces.ownerInterfaces;

import de.telran.module1.lecture2.bank_account_15_11.interfaces.Cashier;

import java.time.LocalDate;

public interface Owner extends Cashier {
    void closeAccount(LocalDate closingDate);
}

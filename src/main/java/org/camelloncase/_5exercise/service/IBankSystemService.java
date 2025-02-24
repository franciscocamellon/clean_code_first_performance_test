package org.camelloncase._5exercise.service;

import org.camelloncase._5exercise.model.BankAccount;

public interface IBankSystemService {

    void createBankAccount(String owner, double value);

    void transferToOtherAccount(BankAccount bankAccountFrom,
                                BankAccount bankAccountTo, double value);

    BankAccount getBankAccount(String owner);

}

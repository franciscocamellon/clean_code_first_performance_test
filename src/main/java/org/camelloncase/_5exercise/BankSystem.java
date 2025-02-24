package org.camelloncase._5exercise;

import org.camelloncase._5exercise.model.BankAccount;
import org.camelloncase._5exercise.service.BankSystemService;

import java.util.ArrayList;
import java.util.List;

public class BankSystem {

    public static void main(String[] args) {

        List<BankAccount> bankAccounts = new ArrayList<>();

        BankSystemService bankSystemService = new BankSystemService(bankAccounts);

        bankSystemService.createBankAccount("Joseph Snow", 1253.00);
        bankSystemService.createBankAccount("John Doe", 500.00);
        bankSystemService.createBankAccount("Joseph Snow", 1000.00);
        bankSystemService.createBankAccount("Tina Lee", 2000.00);
        bankSystemService.createBankAccount("Karen O'Donnel", 3000.00);

        BankAccount bankAccountFrom = bankSystemService.getBankAccount("Karen O'Donnel");
        BankAccount bankAccountTo = bankSystemService.getBankAccount("John Doe");
        bankSystemService.transferToOtherAccount(bankAccountFrom, bankAccountTo, 1500.00);

        System.out.println(bankAccountFrom.getOwner() + " - " + bankAccountFrom.getBalance());
        System.out.println(bankAccountTo.getOwner() + " - " + bankAccountTo.getBalance());
    }
}

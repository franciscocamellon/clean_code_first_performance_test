package org.camelloncase._5exercise.service;

import org.camelloncase._5exercise.model.BankAccount;

import java.util.List;

public class BankSystemService implements IBankSystemService {

    private final List<BankAccount> bankAccounts;

    public BankSystemService(List<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    @Override
    public void createBankAccount(String owner, double value) {
        BankAccount newBankAccount = new BankAccount(owner, value);
        bankAccounts.add(newBankAccount);
    }

    @Override
    public void transferToOtherAccount(BankAccount bankAccountFrom,
                                       BankAccount bankAccountTo, double value) {

        if (bankAccountFrom == null || bankAccountTo == null) {
            showMessage("Conta não encontrada.");
            return;
        }

        try {
            bankAccountFrom.withdraw(value);
            bankAccountTo.deposit(value);
            showMessage("Transferência finalizada com sucesso.");
        } catch (IllegalArgumentException | IllegalStateException error) {
            showMessage("Erro na transferência: " + error.getMessage());
        }
    }

    @Override
    public BankAccount getBankAccount(String owner) {
        return bankAccounts.stream().filter(
                account -> owner.equals(account.getOwner())
                            ).findFirst().orElse(null);
    }

    public void showMessage(String msg) {
        System.out.println(msg);
    }
}

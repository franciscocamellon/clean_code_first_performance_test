package org.camelloncase._5exercise.model;

public class BankAccount {

    private final String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        if (owner == null || owner.trim().isEmpty()) {
            throw new IllegalArgumentException("Titular não pode ser nulo.");
        }
        if (balance < 0) {
            throw new IllegalArgumentException("O saldo não pode ser negativo.");
        }
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double value) {
        if (value < 0) {
            throw new IllegalArgumentException("O valor não pode ser negativo.");
        }
        this.balance += value;
    }

    public void withdraw(double value) {
        if (value <= 0) {
            throw new IllegalArgumentException("O valor tem que ser maior que zero.");
        }
        if (value > this.balance) {
            throw new IllegalStateException("Saldo insuficiente para o saque.");
        }
        this.balance -= value;
    }

}

package org.camelloncase._7exercise;

public class BankAccount {

    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {

        if(owner == null || owner.trim().isEmpty()){
            throw new IllegalArgumentException("O titular não pode ser nulo ou vazio.");
        }
        if(balance < 0){
            throw new IllegalArgumentException("O saldo inicial não pode ser negativo.");
        }

        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double value) {
        // Design by Contract
        // pré-condição
        if(value <= 0){
            throw new IllegalArgumentException(
                    "O valor do depósito deve ser maior que zero.");
        }

        double beforeBalance = balance;
        balance += value;

        //pós-condição
        assert balance == beforeBalance + value :
                "Erro: O saldo após o depósito não corresponde ao esperado.";
    }

    public void withdraw(double value) {
        // Design by Contract
        // pré-condição
        if(value <= 0){
            throw new IllegalArgumentException("O valor do saque deve ser maior que zero.");
        }

        double beforeBalance = balance;
        balance -= value;

        // pós-condição
        assert balance == beforeBalance - value :
                "Erro: O saldo após o saque não corresponde ao esperado.";
    }

    public double getBalance() {
        assert balance >= 0 : "Erro: O saldo da conta não pode ser negativo.";
        return balance;
    }

    public String getOwner() {
        assert owner != null && !owner.trim().isEmpty() : "Erro: titular inválido";
        return owner;
    }

}

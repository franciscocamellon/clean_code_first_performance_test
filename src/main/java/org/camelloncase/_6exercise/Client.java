package org.camelloncase._6exercise;

public class Client {

    private String name;
    private double balance;

    public Client(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Cliente: " + name + " - Saldo: R$ " + balance;
    }
}

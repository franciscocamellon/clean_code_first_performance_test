package org.camelloncase._7exercise;

public class ContaBancaria {
    private String titular;
    private double saldo;
    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
    public void depositar(double valor) {
        saldo += valor;
    }
    public void sacar(double valor) {
        saldo -= valor;
    }
    public double getSaldo() {
        return saldo;
    }
}

package org.camelloncase._1exercise;

public class ContaBancaria {
    private double saldo;
    private String titular;

    public ContaBancaria(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Conta: ");
        builder.append(titular);
        builder.append(" - Saldo: ");
        builder.append(saldo);

        return builder.toString();
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

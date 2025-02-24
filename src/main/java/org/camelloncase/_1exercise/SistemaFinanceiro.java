package org.camelloncase._1exercise;

import java.util.ArrayList;
import java.util.List;

public class SistemaFinanceiro {

    private List<ContaBancaria> contas = new ArrayList<>();

    public SistemaFinanceiro() {}

    public void adicionarConta(ContaBancaria conta) {
        contas.add(conta);
    }

    public void gerarRelatorio() {
        System.out.println("=== Relatório Financeiro ===");
        for (ContaBancaria conta : contas) {
            System.out.println(conta);
        }
    }

    public void processarPagamentos(double taxa) {
        for (ContaBancaria conta : contas) {
            conta.setSaldo(conta.getSaldo() - taxa);
        }
    }
}

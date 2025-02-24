package org.camelloncase._6exercise;

import java.util.List;

public class RelatorioFinanceiro {
    public void gerarRelatorio(List clientes, List saldos) {
        System.out.println("=== Relatório Financeiro ===");
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println("Cliente: " + clientes.get(i) + " - Saldo: R$ " + saldos.get(i));
        }

    }
}
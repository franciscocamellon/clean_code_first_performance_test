package org.camelloncase._6exercise;

import java.util.List;

public class FinancialReport {

    private final List<Client> clients;

    public FinancialReport(List<Client> clients) {
        this.clients = clients;
    }

    public void generateReport() {
        printReportHeader();
        printClientDetails();
        printReportFooter();
    }

    public void printClientDetails() {
        for (Client client : clients) {
            System.out.println(client.toString());
        }
    }

    public void printReportHeader() {
        System.out.println("=== Relatório Financeiro ===");
    }

    public void printReportFooter() {
        System.out.println("===========================\nFim do Relatório");
    }

}


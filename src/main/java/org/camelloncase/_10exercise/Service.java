package org.camelloncase._10exercise;

public class Service {

    public void processData(String data) {

        if (data == null || data.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Dado inválido! Nenhum processamento foi realizado.");
        }

        System.out.println("Processando: " + data.toUpperCase());
    }

}

package org.camelloncase._2exercise;

public class Processador {
    public void processar(String dado) {
        if (dado != null && !dado.isEmpty()) {
            if (dado.length() > 10) {
                System.out.println("Dado válido: " + dado);
            } else {
                System.out.println("Dado muito curto.");
            }
        } else {
            System.out.println("Dado inválido.");
        }
    }
}

package org.camelloncase._9exercise;

public class Processor {

    public void executeTask(String task) {

        if (task == null) {
            System.out.println("Tarefa inválida! Nenhum processamento realizado.");
            return;
        }

        System.out.println("Processando: " + task);

    }

}

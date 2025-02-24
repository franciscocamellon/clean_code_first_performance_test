package org.camelloncase._2exercise;

public class Processor {

    public void processData(String data) {
        if (data == null || !data.isEmpty()) {
            showMessage("Dado inválido.");
            return;
        }
        classifyData(data);
    }

    public void classifyData(String data) {
        if (data.length() > 10) {
            showMessage("Dado válido: " + data);
        } else {
            showMessage("Dado muito curto.");
        }
    }

    public void showMessage(String msg) {
        System.out.println(msg);
    }
}



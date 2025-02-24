package org.camelloncase._8exercise;

public class Pedido {
    private int id;
    // Identificação do pedido
    private String descricao;
    // Descrição do pedido
    private double valor;
    // Valor do pedido

    // Construtor do pedido
    public Pedido(int id, String descricao, double valor) {
        this.id = id; // Define o ID
        this.descricao = descricao; // Define a descrição
        this.valor = valor; // Define o valor
    }
    // Método que retorna o ID do pedido
    public int getId() {
        return id;
    }
    // Método que define um novo ID para o pedido
    public void setId(int id) {
        this.id = id;
    }
}

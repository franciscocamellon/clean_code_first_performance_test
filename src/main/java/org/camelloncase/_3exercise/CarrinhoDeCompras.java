package org.camelloncase._3exercise;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //data clumps
    private List produtos; //primitive obsession
    private List precos; //primitive obsession
    //rename field
    private List quantidades;

    public CarrinhoDeCompras() {
        produtos = new ArrayList< >();
        precos = new ArrayList < > ();
        quantidades = new ArrayList < > ();
    }
    //change function declaration
    public void adicionarProduto(String produto, double preco, int quantidade) {
        produtos.add(produto);
        precos.add(preco);
        quantidades.add(quantidade);
    }
    //change function declaration
    public void calcularTotal() {
        //method com mais de uma responsabilidade
        double total = 0; //temporary field
        for (int i = 0; i < produtos.size(); i++) {
//            total += precos.get(i) * quantidades.get(i);
        }
        System.out.println("Total da compra: R$ " + total);
    }
}

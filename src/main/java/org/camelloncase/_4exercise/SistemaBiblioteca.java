package org.camelloncase._4exercise;

import java.util.ArrayList;
import java.util.List;

public class SistemaBiblioteca {

    private List livros;
    //a classe não deve gerenciar a disponibilidade
    private List disponibilidade;

    public SistemaBiblioteca() {
        livros = new ArrayList< >();
        disponibilidade = new ArrayList < > ();
    }

    public void adicionarLivro(String titulo) {
        //este método deve somente adicionar um livro a uma lista
        //e não gerenciar a disponibilidade do livro
        livros.add(titulo);
        disponibilidade.add(true);
    }

    public void emprestarLivro(String titulo) {
        //não é responsabilidade deste método gerenciar a disponibilidade do livro
        //e nem imprimir mensagens
        for (int i = 0; i < livros.size(); i++) {
//            if (livros.get(i).equals(titulo) && disponibilidade.get(i)) {
//                disponibilidade.set(i, false);
//                System.out.println("Livro emprestado: " + titulo);
//                return;
//            }
        }
        System.out.println("Livro não disponível.");
    }

    public void devolverLivro(String titulo) {
        //não é responsabilidade deste método gerenciar a disponibilidade do livro
        //e nem imprimir mensagens
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).equals(titulo)) {
                disponibilidade.set(i, true);
                System.out.println("Livro devolvido: " + titulo);
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }
}

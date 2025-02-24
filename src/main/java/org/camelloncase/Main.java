package org.camelloncase;

import org.camelloncase._2exercise.Processor;
import org.camelloncase._3exercise.Product;
import org.camelloncase._3exercise.ShoppingCart;
import org.camelloncase._4exercise.Book;
import org.camelloncase._4exercise.LibrarySystem;
import org.camelloncase._6exercise.Client;
import org.camelloncase._6exercise.FinancialReport;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


//        ContaBancaria conta1 = new ContaBancaria(1000.00, "Joao");
//        ContaBancaria conta2 = new ContaBancaria(100.00, "José");
//        ContaBancaria conta3 = new ContaBancaria(3150.00, "Maria");
//
//        SistemaFinanceiro sf = new SistemaFinanceiro();
//        sf.adicionarConta(conta1);
//        sf.adicionarConta(conta2);
//        sf.adicionarConta(conta3);
//        sf.gerarRelatorio();
//        sf.processarPagamentos(55.23);
//        sf.gerarRelatorio();

//        Processor firstProcessor = new Processor();
//        firstProcessor.processData("");

//        List<Product> products = new ArrayList<>();
//
//        products.add(new Product("Smartphone", 1000.00, 2));
//        products.add(new Product("Laptop", 2500.00, 1));
//        products.add(new Product("Headphones", 150.00, 3));
//
//        for (Product product : products) {
//            System.out.println(product.getName() + " " + product.getPrice());
//        }

//        ShoppingCart shoppingCart = new ShoppingCart(products);
//        shoppingCart.addProductToCart(new Product("Smartwatch", 123.00, 3));
//        shoppingCart.calculateTotalCost();

//        List<Book> books = new ArrayList<>();
//        books.add(new Book("Memórias Póstumas de Brás Cubas", true));
//        books.add(new Book("Grandes Sertões Veredas", false));
//        books.add(new Book("A Fazenda", true));
//        books.add(new Book("Sinhá", false));
//
//        LibrarySystem library = new LibrarySystem(books);
//        library.addBook(new Book("Refactoring", false));
//        library.lendBook("Sinhá");
//        library.lendBook("Memórias Póstumas de Brás Cubas");
//        library.lendBook("Clean Code");
//        library.returnBook("Refactoring");
//        library.returnBook("Clean Code");

        List<Client> clients = new ArrayList<>();
        clients.add(new Client("John", 1000.23));
        clients.add(new Client("Tina", 500.00));
        clients.add(new Client("Andrew", 31000.00));
        clients.add(new Client("Joseph", 1000.00));

        FinancialReport report = new FinancialReport(clients);
        report.generateReport();
    }
}
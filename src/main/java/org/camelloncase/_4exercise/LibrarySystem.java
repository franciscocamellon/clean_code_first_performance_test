package org.camelloncase._4exercise;

import java.util.List;

public class LibrarySystem {

    private final List<Book> books;

    public LibrarySystem(List<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void lendBook(String title) {
        Book bookToLend = getBookByTitle(title);
        if (bookToLend != null && bookToLend.isAvailable()) {
            bookToLend.setAvailable(false);
            showMessage("Livro emprestado: " + title);
            return;
        }
        showMessage("Livro não disponível.");
    }

    public void returnBook(String title) {
        Book bookToReturn = getBookByTitle(title);
        if (bookToReturn != null) {
            bookToReturn.setAvailable(true);
            showMessage("Livro devolvido: " + bookToReturn.getTitle());
            return;
        }
        showMessage("Livro não encontrado.");
    }

    public Book getBookByTitle(String title) {
        return books.stream().filter(
                book -> title.equals(book.getTitle())
                        ).findFirst().orElse(null);
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}

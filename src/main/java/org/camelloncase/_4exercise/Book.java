package org.camelloncase._4exercise;

public class Book {

    private String title;
    private boolean available;

    public Book(String title, boolean available) {
        this.title = title;
        this.available = available;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

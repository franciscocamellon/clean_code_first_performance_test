package org.camelloncase._3exercise;

import java.util.List;

public class ShoppingCart {

    private final List<Product> products;
    private double cartTotalCost = 0;

    public ShoppingCart(List<Product> products) {
        this.products = products;
    }

    public void addProductToCart(Product product) {
        products.add(product);
    }

    public void calculateTotalCost() {
        for (Product product : products) {
            cartTotalCost += product.getProductTotalPrice();
        }
        showMessage("Total da compra: R$ " + cartTotalCost);
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}

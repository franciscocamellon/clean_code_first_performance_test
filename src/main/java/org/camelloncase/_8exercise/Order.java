package org.camelloncase._8exercise;

public class Order {

    private int orderId;
    private String orderDescription;
    private double orderPrice;

    /** Cria um novo pedido com ID, descrição e valor.
     *
     * @param orderId           Identificação única do pedido.
     * @param orderDescription  Breve descrição do pedido.
     * @param orderPrice        Valor total do pedido.
     */

    public Order(int orderId, String orderDescription, double orderPrice) {
        this.orderId = orderId;
        this.orderDescription = orderDescription;
        this.orderPrice = orderPrice;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderDescription() {
        return orderDescription;
    }

    public void setOrderDescription(String orderDescription) {
        this.orderDescription = orderDescription;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
    }
}

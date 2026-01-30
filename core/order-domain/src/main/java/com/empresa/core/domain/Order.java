package com.empresa.core.domain;
import com.empresa.common.api.IOrder;
public class Order {
    private String id;
    private String product;

    public Order(String id, String product) {
        this.id = id;
        this.product = product;
    }


    public String getId() { return id; }


    public void printDetails() {
        System.out.println("Pedido creado correctamente: " + product);
    }
}

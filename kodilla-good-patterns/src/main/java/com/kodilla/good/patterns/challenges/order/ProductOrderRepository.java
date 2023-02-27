package com.kodilla.good.patterns.challenges.order;

public class ProductOrderRepository implements OrderRepository {
    public ProductOrderRepository() {
    }

    public boolean createOrder(OrderRequest orderRequest, boolean isOrdered) {
        System.out.println("Order created");
        return true;
    }
}

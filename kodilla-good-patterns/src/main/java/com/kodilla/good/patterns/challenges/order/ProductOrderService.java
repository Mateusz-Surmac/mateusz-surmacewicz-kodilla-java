package com.kodilla.good.patterns.challenges.order;

public class ProductOrderService implements OrderService {
    public ProductOrderService() {
    }

    public boolean order(OrderRequest orderRequest) {
        System.out.println("Creating order");
        return true;
    }
}

package com.kodilla.good.patterns.challenges.food2door;

public class Order {
    private final Producer producer;
    private final int quantity;

    public Order(final Producer producer, final int quantity) {
        this.producer = producer;
        this.quantity = quantity;
    }

    public Producer getProducer() {
        return producer;
    }

    public int getQuantity() {
        return quantity;
    }
}

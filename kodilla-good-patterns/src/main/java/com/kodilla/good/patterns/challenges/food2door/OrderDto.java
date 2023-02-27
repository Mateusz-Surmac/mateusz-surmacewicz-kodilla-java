package com.kodilla.good.patterns.challenges.food2door;

public class OrderDto {
    private Producer producer;
    private boolean orderProcessed;

    public OrderDto(final Producer producer, final boolean orderProcessed) {
        this.producer = producer;
        this.orderProcessed = orderProcessed;
    }

    public Producer getProducer() {
        return producer;
    }

    public boolean isOrderProcessed() {
        return orderProcessed;
    }
}

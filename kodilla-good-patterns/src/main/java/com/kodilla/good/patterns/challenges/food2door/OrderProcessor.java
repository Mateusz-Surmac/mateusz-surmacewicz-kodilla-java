package com.kodilla.good.patterns.challenges.food2door;

public class OrderProcessor {
    private ServiceInformation serviceInformation;
    private Producer producer;
    
    public OrderProcessor(final ServiceInformation serviceInformation, final Producer producer) {
        this.serviceInformation = serviceInformation;
        this.producer = producer;
    }

    public OrderDto process(final Order order) {
        boolean orderProcessed = producer.process(order);
        if (orderProcessed) {
            serviceInformation.inform();
        }
        return new OrderDto(producer, orderProcessed);
    }
}

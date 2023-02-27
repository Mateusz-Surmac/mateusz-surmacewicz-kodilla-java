package com.kodilla.good.patterns.challenges.food2door;

public class MushroomPickers implements Producer {
    private final String name;
    private final String address;
    private final String product;

    public MushroomPickers(final String name, final String address, final String product) {
        this.name = name;
        this.address = address;
        this.product = product;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getProduct() {
        return product;
    }

    public boolean process(Order order) {
        System.out.println("Producer: " + order.getProducer().getName()
                + "\n Address: " + order.getProducer().getAddress()
                + "\n Product: " + order.getProducer().getProduct()
                + "\n Quantity: " + order.getQuantity());
        return true;
    }
}

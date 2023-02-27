package com.kodilla.good.patterns.challenges.food2door;

public class ExtraFoodShop implements Producer{
    private String name;
    private String address;
    private String product;

    public ExtraFoodShop(String name, String address, String product) {
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

    @Override
    public boolean process(Order order) {
        System.out.println("Producer: " + order.getProducer().getName()
                + "\n Address: " + order.getProducer().getAddress()
                + "\n Product: " + order.getProducer().getProduct()
                + "\n Quantity: " + order.getQuantity());
        return true;
    }
}

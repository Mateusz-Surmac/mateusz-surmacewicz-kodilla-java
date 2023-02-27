package com.kodilla.good.patterns.challenges.food2door;

public interface Producer {
    boolean process(Order order);
    String getName();
    String getAddress();
    String getProduct();
}

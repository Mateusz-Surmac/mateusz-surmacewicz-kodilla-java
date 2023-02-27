package com.kodilla.good.patterns.challenges.food2door;

public class MailService implements ServiceInformation {

    @Override
    public void inform() {
        System.out.println("Order complete");
    }
}

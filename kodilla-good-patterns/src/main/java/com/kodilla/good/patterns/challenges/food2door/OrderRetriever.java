package com.kodilla.good.patterns.challenges.food2door;

public class OrderRetriever {
    public Order retrieve() {
        MushroomPickers mushroomPickers = new MushroomPickers("Forest people", "Deep in the forest",
                "Mushrooms");
        int quantity = 999;

        return new Order(mushroomPickers,quantity);
    }
}

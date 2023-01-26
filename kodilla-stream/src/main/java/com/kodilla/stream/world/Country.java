package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    private final BigDecimal peopleQuantity;
    private final String country;

    public Country(BigDecimal peopleQuantity, String country) {
        this.peopleQuantity = peopleQuantity;
        this.country = country;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }
}

package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {
    private final List<Continent> continents = new ArrayList<>();

    public List<Continent> continentsList() {
        return continents;
    }
    public void addContinent(Continent x) {
        continents.add(x);
    }
    public BigDecimal getPeopleQuantity() {

        return continentsList().stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (s, c) -> s = s.add(c));
    }
}

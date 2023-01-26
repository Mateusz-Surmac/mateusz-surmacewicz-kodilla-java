package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    private final List<Country> countries = new ArrayList<>();

    public void addCountry(Country x) {
        countries.add(x);
    }
    public List<Country> getCountries() {
        return countries;
    }
}

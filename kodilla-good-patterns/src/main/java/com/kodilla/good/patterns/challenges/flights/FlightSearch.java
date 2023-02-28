package com.kodilla.good.patterns.challenges.flights;

import java.util.List;
import java.util.stream.Collectors;

public class FlightSearch {
    public List<Flight> flights(String ToOrFrom, String City) {


        List<Flight> flights = OperatedFlights.flightList().stream()
                .filter(f -> f.getCity(ToOrFrom).equals(City))
                .collect(Collectors.toList());
        return flights;
    }

    public List<Flight> flightThrough(String arrivalCity, String viaCity) {

        List<Flight> flightsThrough = OperatedFlights.flightList().stream()
                .filter(f -> f.getCity("To").equals(arrivalCity))
                .filter(v -> v.getCity("From").equals(viaCity))
                .collect(Collectors.toList());
        return flightsThrough;
    }
}

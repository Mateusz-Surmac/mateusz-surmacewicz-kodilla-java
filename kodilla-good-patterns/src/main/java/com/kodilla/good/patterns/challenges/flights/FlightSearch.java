package com.kodilla.good.patterns.challenges.flights;

import java.util.List;
import java.util.stream.Collectors;

public class FlightSearch {
    public List<Flight> flightsFrom(String departureCity) {

        List<Flight> flightsFrom = OperatedFlights.flightList().stream()
                .filter(f -> f.getDepartureCity().equals(departureCity))
                .collect(Collectors.toList());
        return flightsFrom;
    }

    public List<Flight> flightsTo(String arrivalCity) {

        List<Flight> flightsTo = OperatedFlights.flightList().stream()
                .filter(f -> f.getArrivalCity().equals(arrivalCity))
                .collect(Collectors.toList());
        return flightsTo;
    }

    public List<Flight> flightThrough(String arrivalCity, String viaCity) {

        List<Flight> flightsThrough = OperatedFlights.flightList().stream()
                .filter(f -> f.getArrivalCity().equals(arrivalCity))
                .filter(v -> v.getDepartureCity().equals(viaCity))
                .collect(Collectors.toList());
        return flightsThrough;
    }
}

package com.kodilla.good.patterns.challenges.flights;

public class Flight {
    public String departureCity;
    public String arrivalCity;

    public Flight(String departureCity, String arrivalCity) {
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    @Override
    public String toString() {
        return "\n Flight{" +
                "departureCity='" + departureCity + '\'' +
                ", arrivalCity='" + arrivalCity + '\'' +
                '}';
    }
}

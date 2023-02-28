package com.kodilla.good.patterns.challenges.flights;

public class Flight {
    public String departureCity;
    public String arrivalCity;

    public Flight(String departureCity, String arrivalCity) {
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
    }

    public String getCity(String ToOrFrom) {
        if (ToOrFrom.equals("From")) {
            return departureCity;
        } else if (ToOrFrom.equals("To")) {
            return arrivalCity;
        }
        return "Error";
    }

        @Override
    public String toString() {
        return "\n Flight{" +
                "departureCity='" + departureCity + '\'' +
                ", arrivalCity='" + arrivalCity + '\'' +
                '}';
    }
}

package com.kodilla.good.patterns.challenges.flights;


public class Application {
    public static void main(String[] args) {
        FlightSearch flightSearch = new FlightSearch();

        System.out.println("-------------FLIGHT TO--------------");
        System.out.println(flightSearch.flightsTo("Poznan"));

        System.out.println("-------------FLIGHT FROM--------------");
        System.out.println(flightSearch.flightsFrom("Warszawa"));

        System.out.println("-----------FLIGHT THROUGH----------------");

        System.out.println(flightSearch.flightThrough("Krakow","Poznan"));
    }
}

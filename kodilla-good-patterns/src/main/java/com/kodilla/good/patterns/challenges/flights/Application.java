package com.kodilla.good.patterns.challenges.flights;


public class Application {
    public static void main(String[] args) {
        FlightSearch flightSearch = new FlightSearch();

        System.out.println("-------------FLIGHT TO--------------");
        System.out.println(flightSearch.flights("To","Poznan"));

        System.out.println("-------------FLIGHT FROM--------------");
        System.out.println(flightSearch.flights("From","Warszawa"));

        System.out.println("-----------FLIGHT THROUGH----------------");
       System.out.println(flightSearch.flightThrough("Krakow","Poznan"));
    }
}

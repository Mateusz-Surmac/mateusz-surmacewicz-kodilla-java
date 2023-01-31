package com.kodilla.exception.test;

public class AirportMain {
    public static void main(String[] args) {
        Flight tripOFLive = new Flight("Warsaw","Vilnius");

        CheckingFlights x = new CheckingFlights();

        try {
            x.findFilght(tripOFLive);
            System.out.println("Flight from " + tripOFLive.getDepartureAirport() + " to " + tripOFLive.getArrivalAirport() + " has been booked");
        } catch (RouteNotFoundException e) {
            System.out.println("Sorry we don't serve from this flight");
        } finally {
            System.out.println("Thank you for using the service");
        }
    }
}

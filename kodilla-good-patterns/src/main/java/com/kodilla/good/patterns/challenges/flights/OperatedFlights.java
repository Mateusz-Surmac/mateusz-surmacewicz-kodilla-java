package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;

public class OperatedFlights {
    public static List<Flight> flightList() {

        List<Flight> operatedFlights = new ArrayList<>();
        operatedFlights.add(new Flight("Poznan", "Krakow"));
        operatedFlights.add(new Flight("Krakow", "Poznan"));
        operatedFlights.add(new Flight("Poznan" , "Warszawa"));
        operatedFlights.add(new Flight("Warszawa", "Poznan"));
        operatedFlights.add(new Flight("Gdansk", "Rzeszow"));
        operatedFlights.add(new Flight("Rzeszow","Krakow"));
        operatedFlights.add(new Flight("Warszawa", "Rzeszow"));
        operatedFlights.add(new Flight("Gdansk", "Wroclaw"));
        operatedFlights.add(new Flight("Wroclaw", "Gdansk"));
        operatedFlights.add(new Flight("Inowroclaw", "Wroclaw"));
        operatedFlights.add(new Flight("Bialystok", "Szczecin"));

        return new ArrayList<>(operatedFlights);
    }

}

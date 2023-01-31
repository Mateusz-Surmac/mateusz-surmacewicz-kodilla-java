package com.kodilla.exception.test;

import java.util.HashMap;

public class CheckingFlights {

    public boolean findFilght(Flight flight) throws RouteNotFoundException {
        HashMap<String,Boolean> flightList = new HashMap<>();
        flightList.put("Berlin",true);
        flightList.put("Paris",false);
        flightList.put("London",false);
        flightList.put("Dublin",false);
        flightList.put("Lisbon",false);
        flightList.put("Rome",true);
        flightList.put("Athens",true);
        flightList.put("Warsaw",true);
        flightList.put("Prague",true);
        flightList.put("Vilnius",true);
        if(flightList.containsKey(flight.getArrivalAirport()) && flightList.get(flight.getArrivalAirport())){
            return true;
        }else {
            throw  new RouteNotFoundException();
        }
    }
}

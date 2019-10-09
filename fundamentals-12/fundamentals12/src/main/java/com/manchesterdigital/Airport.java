package com.manchesterdigital;

import javax.swing.text.html.Option;
import java.util.Optional;

public class Airport {
    public static void main(String[] args) {
        FlightService flightService = new FlightService();

        FlightInformation flight = flightService.retrieveFlight("AB123");
        System.out.println("flight.getAirline().getName() = " + flight.getAirline().get().getName());

//        May have a flight info which could be null
        Optional<FlightInformation> flight1 = Optional.of(flight);

//        Value of an optional may be null but it doesn't matter -> false positive
        Optional<FlightInformation> flight2 = Optional.ofNullable(flight);
    }

}

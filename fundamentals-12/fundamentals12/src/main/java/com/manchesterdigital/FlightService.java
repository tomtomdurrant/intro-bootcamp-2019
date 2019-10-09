package com.manchesterdigital;

import java.util.Map;

public class FlightService {
    private static Map<String, FlightInformation> flights;

    static {
        flights = Map.of(
                "AB123", new FlightInformation("AB123"),
                "XY789", new FlightInformation("XY789"),
                "ST009", new FlightInformation("ST009")
        );
    }

    public FlightInformation retrieveFlight(final String flightNo) {
        return flights.get(flightNo);
    }

//    public Airline retrieveAirline(final String flightNo) {
//        FlightInformation flight = retrieveFlight(flightNo);
//
//////        Checks if the Airline is empty or not
////        if (flight.getAirline().isEmpty()) {
////            throw new AirlineNotFoundException();
////        }
//////        .get is the a method from the optional method.
//////        Only to be used when you are 100% sure you will receive a value.
////        return flight.getAirline().get();


    public Airline retrieveAirline(final String flightNo) {
        FlightInformation flight = retrieveFlight(flightNo);
//        Throws exception with no message
//        return flight.getAirline().orElseThrow(AirlineNotFoundException::new);

//        Throws an exception with a specific message
//        return flight.getAirline().orElseThrow(() -> new AirlineNotFoundException("Flight Not Found"));

//        If the airline does not exists, creates a new one.
        return flight.getAirline().orElse(new Airline());

//        If the airline does not exist, use another optional one
//        return flight.getAirline().or(somethingElse);
    }

}

package com.manchesterdigital;

import java.util.Optional;

public class FlightInformation {
    private final String flightNo;
    //These might not have values, might be null
    private String destination;
    private Optional<Airline> airline;

    public FlightInformation(String flightNo) {
        this.flightNo = flightNo;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Optional<Airline> getAirline() {
        return airline;
    }

    public void setAirline(Optional<Airline> airline) {
        this.airline = airline;
    }
}

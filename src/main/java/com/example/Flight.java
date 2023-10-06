package com.example;

import java.util.List;
import java.util.ArrayList;

public class Flight {
    private String flightNumber;
    private String destination;
    private String origin;
    private List<Passenger> passengerlist;

    public Flight(String flightNumber, String destination, String origin) {
        // TODO: Initialize the attributes
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.origin = origin;
        passengerlist= new ArrayList <Passenger>();
    }

    public String getOrigin() {
        return this.origin;
    }

    public String getDestination() {
        return this.destination;
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    // TODO: Implement methods to book a flight for a passenger and cancel a booking
    public void bookPassenger(Passenger passenger) {
        passengerlist.add(passenger);
    }

    public List <Passenger> getPassengers() {
        return this.passengerlist;
    }

}

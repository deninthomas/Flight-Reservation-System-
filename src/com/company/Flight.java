package com.company;

public class Flight {
    String flightNumber;
    String airline;
    int capacity;
    int bookedSeat;

    Flight(String flightNumber,String airline,int capacity, int bookedSeat){
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
        this.bookedSeat = bookedSeat;
    }
    public String getFlightDetails(){
        return "Flight number: " + flightNumber + ", Airline: " + airline + ", Capacity: " + capacity + ", Booked Seats: " + bookedSeat;
    }
    boolean checkAvailability(){
        boolean availability = false;
        if(bookedSeat < capacity) {
            availability = true;
        }
        return availability;
    }

    void incrementBookingCounter(){
        ++bookedSeat;
    }

}

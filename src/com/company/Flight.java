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

    public void setFlightDetails(String[] flightDetails, int capacity, int bookedSeats){
        flightNumber = flightDetails[0];
        airline = flightDetails[1];
        this.capacity = capacity;
        this.bookedSeat = bookedSeats;
        public void setFlightDetails(String[] flightDetails, int capacity, int bookedSeats){
            flightNumber = flightDetails[0];
            airline = flightDetails[1];
            this.capacity = capacity;
            this.bookedSeat = bookedSeats;
        }
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

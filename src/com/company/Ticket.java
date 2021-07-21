package com.company;

public class Ticket {

    String pnr;
    String from;
    String to;
    String flight;
    String departureDateTime;
    String arrivalDateTime;
    String seatNo;
    float price;
    boolean cancelled;

    Ticket(String pnr , String from , String to ,String flight ,String departureDateTime ,String arrivalDateTime,String seatNo, float price,boolean cancelled){
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.flight = flight;
        this.departureDateTime =departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.seatNo = seatNo;
        this.price = price;
        this.cancelled = cancelled;
    }
    public String checkStatus(){
        String status;
        if(cancelled){
            status = "Cancelled";
        }
        else{
            status = "Confirmed";
        }
        return status;
    }

    public int getFlightDuration(){
        int duration = 0;
        return duration;
    }

    public void cancel(){
        cancelled = true;
    }

}

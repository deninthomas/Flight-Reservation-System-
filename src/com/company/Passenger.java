package com.company;

public class Passenger {
    int id;


    Passenger(int id){
        this.id = id;
    }

    public String getContactDetails(){
        return "Name: " + name +  ", Phone: " + phone +  ", Email: " + email + " ";
    }
    String getAddressDetails(){
        return "Address: " + street + ", " + city +  ", " + state + " ";
    }
}

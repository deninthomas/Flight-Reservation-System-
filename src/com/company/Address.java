package com.company;

public class Address {
    String street;
    String city;
    String state;

     Address(String street, String city,String state){
         this.street = street;
         this.city = city;
         this.state = state;
     }
    String getAddressDetails(){
        return "Address: " + street + ", " + city +  ", " + state + " ";
    }
    void updateAddressDetails(String[] addressDetail){
        street = addressDetail[0];
        city = addressDetail[1];
        state = addressDetail[2];
    }
}

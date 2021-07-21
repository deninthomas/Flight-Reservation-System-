package com.company;

public class Passenger {

    int id;
    private Address address;
    private Contact contact;

    //counter attribute
    private static  int idCounter;


    private static class Address {

        private String street;
        private String city;
        private String state;


        public Address(String street, String city, String state) {
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


    private static class Contact {


        private String name;
        private String phone;
        private String email;


        public Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }



        public String getContactDetails(){
            return "Name: " + name +  ", Phone: " + phone +  ", Email: " + email + " ";
        }

        public void updateContactDetails(String[] contactDetails){
            name = contactDetails[0];
            phone = contactDetails[1];
            email = contactDetails[2];
        }
    }


    public Passenger(String street, String city, String state, String name, String phone, String email){
        Address address = new Address(street, city, state);
        this.address = address;
        Contact contact = new Contact(name, phone, email);
        this.contact = contact;

        id = ++idCounter;
    }



    int getPassengerCount(){
        return idCounter;
    }
}

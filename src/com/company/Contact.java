package com.company;

public class Contact {

    String name;
    String number;
    String email;

    Contact(String name, String number, String email){
        this.name = name;
        this.number = number;
        this.email = email;
    }
    public String getContactDetails(){
        return "Name: " + name +  ", Phone: " + number +  ", Email: " + email + " ";
    }

    public void updateContactDetails(String[] contactDetails){
        name = contactDetails[0];
        number = contactDetails[1];
        email = contactDetails[2];
    }

}

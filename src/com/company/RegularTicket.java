package com.company;

public class RegularTicket {

    String specialServices;

    RegularTicket( String spclService){
        this.specialServices = spclService;
    }
    public String getSpecialServices() {
        return specialServices;
    }

    public void setSpecialServices(String specialServices) {
        this.specialServices = specialServices;
    }
}

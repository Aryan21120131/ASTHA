package com.example.astha.Classes;

public class User {
    String Name,
            ContactNumber,
            Address,
            NGOsList,
            EmailID,
            Points;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getContactNumber() {
        return ContactNumber;
    }

    public void setContactNumber(String contactNumber) {
        ContactNumber = contactNumber;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getNGOsList() {
        return NGOsList;
    }

    public void setNGOsList(String NGOsList) {
        this.NGOsList = NGOsList;
    }

    public String getEmailID() {
        return EmailID;
    }

    public void setEmailID(String emailID) {
        EmailID = emailID;
    }

    public String getPoints() {
        return Points;
    }

    public void setPoints(String points) {
        Points = points;
    }
}

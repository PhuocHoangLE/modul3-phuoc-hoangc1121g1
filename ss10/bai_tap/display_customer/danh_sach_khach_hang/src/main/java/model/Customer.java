package model;

public class Customer {
    private String name;
    private String dateOffBirth;
    private String address;
    private String picture;

    public Customer() {
    }

    public Customer(String name, String dateOffBirth, String address, String picture) {
        this.name = name;
        this.dateOffBirth = dateOffBirth;
        this.address = address;
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOffBirth() {
        return dateOffBirth;
    }

    public void setDateOffBirth(String dateOffBirth) {
        this.dateOffBirth = dateOffBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
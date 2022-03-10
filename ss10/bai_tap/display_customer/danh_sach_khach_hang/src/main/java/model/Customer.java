package model;

public class Customer {
    private String Name ;
    private String DateOfBirth ;
    private String Address ;
    private String Picture ;

    public Customer() {
    }

    public Customer(String name, String dateOfBirth, String address, String picture) {
        Name = name;
        DateOfBirth = dateOfBirth;
        Address = address;
        Picture = picture;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPicture() {
        return Picture;
    }

    public void setPicture(String picture) {
        Picture = picture;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "Name='" + Name + '\'' +
                ", DateOfBirth='" + DateOfBirth + '\'' +
                ", Address='" + Address + '\'' +
                ", Picture='" + Picture + '\'' +
                '}';
    }
}


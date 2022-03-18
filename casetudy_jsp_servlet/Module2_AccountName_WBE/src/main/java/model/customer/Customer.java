package model.customer;

public class Customer {
    private int customerId ;
    private String customerName ;
    private String customerBirthDay ;
    private boolean gender ;
    private int customerIdCard;
    private String phone ;
    private String email ;
    private String address ;

    private int customerTypeId ;
    private String customerTypeName ;

    public Customer() {
    }

    public Customer(int customerId, String customerName, String customerBirthDay, boolean gender, int customerIdCard, String phone, String email, String address, int customerTypeId, String customerTypeName) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerBirthDay = customerBirthDay;
        this.gender = gender;
        this.customerIdCard = customerIdCard;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.customerTypeId = customerTypeId;
        this.customerTypeName = customerTypeName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerBirthDay() {
        return customerBirthDay;
    }

    public void setCustomerBirthDay(String customerBirthDay) {
        this.customerBirthDay = customerBirthDay;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getCustomerIdCard() {
        return customerIdCard;
    }

    public void setCustomerIdCard(int customerIdCard) {
        this.customerIdCard = customerIdCard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(int customerTypeId) {
        this.customerTypeId = customerTypeId;
    }

    public String getCustomerTypeName() {
        return customerTypeName;
    }

    public void setCustomerTypeName(String customerTypeName) {
        this.customerTypeName = customerTypeName;
    }
}

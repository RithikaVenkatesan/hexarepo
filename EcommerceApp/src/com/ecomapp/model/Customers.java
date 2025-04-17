package com.ecomapp.model;

public class Customers{

    private int customerID;
    private String name;
    private String email;
    private String password;

    public Customers() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Customers(int customerID, String name, String email, String password) {
        super();
        this.customerID = customerID;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Customers[customerID=" + customerID + ", name=" + name + ", email=" + email + "]";
        // Note: It's generally not a good idea to include passwords in toString().
    }
}

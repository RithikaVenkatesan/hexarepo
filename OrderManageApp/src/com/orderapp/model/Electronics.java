package com.orderapp.model;

public class Electronics extends Product {

    private String brand;
    private int warrantyPeriod; 

    public Electronics() {
        super();
    }

    public Electronics(int productID, String productName, String description, double price,
                       int quantityInStock, String type, String brand, int warrantyPeriod) {
        super(productID, productName, description, price, quantityInStock, type);
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public String toString() {
        return "Electronics [" + super.toString() + ", brand=" + brand + ", warrantyPeriod=" + warrantyPeriod + "]";
    }
}

package com.ecomapp.model;

public class Cart {

    private int cartID;
    private int customerID;
    private int productID;
    private int quantity;

    public Cart() {
        super();
        // Default constructor
    }

    public Cart(int cartID, int customerID, int productID, int quantity) {
        super();
        this.cartID = cartID;
        this.customerID = customerID;
        this.productID = productID;
        this.quantity = quantity;
    }

    public int getCartID() {
        return cartID;
    }

    public void setCartID(int cartID) {
        this.cartID = cartID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Cart[cartID=" + cartID + ", customerID=" + customerID + ", productID=" + productID + ", quantity=" + quantity + "]";
    }
}

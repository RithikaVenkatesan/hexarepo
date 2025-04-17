package com.ecomapp.dao;

import java.util.*;

import com.ecomapp.model.Customers;
import com.ecomapp.model.Products;

public interface OrderProcessorRepository {
    void createProduct(Products product);
    void createCustomer(Customers customer);
    void deleteProduct(int productId);
    void deleteCustomer(int customerId);
    void addToCart(Customers customer, Products product, int quantity);
    void removeFromCart(Customers customer, Products product);
    List<Products> getAllFromCart(Customers customer);
    void placeOrder(Customers customer, List<Map<Products, Integer>> items, String shippingAddress);
    List<Map<Products, Integer>> getOrdersByCustomer(int customerId);
}
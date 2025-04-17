package com.ecomapp.dao;

import com.ecomapp.model.Customers;
import com.ecomapp.model.Products;

import java.util.*;

public class OrderProcessorRepositoryImpl implements OrderProcessorRepository {
    private List<Customers> customers = new ArrayList<>();
    private List<Products> products = new ArrayList<>();
    private Map<Integer, List<Map<Products, Integer>>> cart = new HashMap<>();
    private Map<Integer, List<Map<Products, Integer>>> orders = new HashMap<>();

    @Override
    public void createProduct(Products product) {
        products.add(product);
        System.out.println("Product added: " + product.getName());
    }

    @Override
    public void createCustomer(Customers customer) {
        customers.add(customer);
        System.out.println("Customer added: " + customer.getName());
    }

    @Override
    public void deleteProduct(int productId) {
        products.removeIf(p -> p.getProductID() == productId);
        System.out.println("Product deleted: " + productId);
    }

    @Override
    public void deleteCustomer(int customerId) {
        customers.removeIf(c -> c.getCustomerID() == customerId);
        System.out.println("Customer deleted: " + customerId);
    }

    @Override
    public void addToCart(Customers customer, Products product, int quantity) {
        Map<Products, Integer> entry = new HashMap<>();
        entry.put(product, quantity);
        cart.computeIfAbsent(customer.getCustomerID(), k -> new ArrayList<>()).add(entry);
        System.out.println("Added to cart: " + product.getName() + " x" + quantity);
    }

    @Override
    public void removeFromCart(Customers customer, Products product) {
        List<Map<Products, Integer>> customerCart = cart.get(customer.getCustomerID());
        if (customerCart != null) {
            customerCart.removeIf(map -> map.containsKey(product));
            System.out.println("Removed from cart: " + product.getName());
        }
    }

    @Override
    public List<Products> getAllFromCart(Customers customer) {
        List<Products> cartItems = new ArrayList<>();
        List<Map<Products, Integer>> items = cart.get(customer.getCustomerID());
        if (items != null) {
            for (Map<Products, Integer> entry : items) {
                cartItems.addAll(entry.keySet());
            }
        }
        return cartItems;
    }

    @Override
    public void placeOrder(Customers customer, List<Map<Products, Integer>> items, String shippingAddress) {
        orders.put(customer.getCustomerID(), items);
        cart.remove(customer.getCustomerID()); // clear cart
        System.out.println("Order placed for customer " + customer.getName() + " to " + shippingAddress);
    }

    @Override
    public List<Map<Products, Integer>> getOrdersByCustomer(int customerId) {
        return orders.getOrDefault(customerId, new ArrayList<>());
    }
}
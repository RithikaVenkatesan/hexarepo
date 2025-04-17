package com.ecomapp.main;

import com.ecomapp.dao.OrderProcessorRepository;
import com.ecomapp.dao.OrderProcessorRepositoryImpl;
import com.ecomapp.model.Customers;
import com.ecomapp.model.Products;

import java.util.*;

public class EcomApp {
    public static void main(String[] args) {
        OrderProcessorRepositoryImpl repo = new OrderProcessorRepositoryImpl();

        // Create customer
        Customers c1 = new Customers(1, "Suba", "suba@gmail.com", "1234");
        repo.createCustomer(c1);

        // Create products
        Products p1 = new Products(101, "Laptop", 80000, "Gaming Laptop", 10);
        Products p2 = new Products(102, "Mouse", 500, "Wireless Mouse", 50);
        repo.createProduct(p1);
        repo.createProduct(p2);

        // Add to cart
        repo.addToCart(c1, p1, 1);
        repo.addToCart(c1, p2, 2);

        // Show cart
        List<Products> cartItems = repo.getAllFromCart(c1);
        System.out.println("view cart " + c1.getName() + ":");
        for (Products p : cartItems) {
            System.out.println(p.getName());
        }

        // Place order
        List<Map<Products, Integer>> orderItems = new ArrayList<>();
        Map<Products, Integer> item1 = new HashMap<>();
        item1.put(p1, 1);
        Map<Products, Integer> item2 = new HashMap<>();
        item2.put(p2, 2);
        orderItems.add(item1);
        orderItems.add(item2);

        repo.placeOrder(c1, orderItems, "123 Street, City");
        
     // View order
        List<Map<Products, Integer>> orderHistory = repo.getOrdersByCustomer(c1.getCustomerID());
        System.out.println("View customer order " + c1.getName() + ":");
        for (Map<Products, Integer> order : orderHistory) {
            for (Map.Entry<Products, Integer> e : order.entrySet()) {
                System.out.println(e.getKey().getName() + " x" + e.getValue());
            }
        }

        }
    }
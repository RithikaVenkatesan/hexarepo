package com.orderapp.main;

import com.orderapp.dao.OrderProcessorDaoImpl;
import com.orderapp.model.Electronics;
import com.orderapp.model.User;

public class OrderManagement extends OrderProcessorDaoImpl {
    public static void main(String[] args) {

    	User user = new User(5, "rithika", "1267", "Admina");


        Electronics product = new Electronics(
            10,
            "Samsung Smart TVo",
            "55 inch 4K UHD Smart TVo",
            59999.999,
            250,
            "Electronics0",
            "Samsungo",
            5
        );

       
        OrderManagement repo = new OrderManagement();

        try {
            repo.createUser(user);
            System.out.println("User table created");

            repo.createProduct(product);
            System.out.println("Product added");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
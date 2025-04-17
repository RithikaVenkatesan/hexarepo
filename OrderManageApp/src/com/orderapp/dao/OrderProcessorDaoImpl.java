package com.orderapp.dao;

import com.orderapp.model.Product;
import com.orderapp.model.User;
import com.orderapp.util.DBConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OrderProcessorDaoImpl implements IOrderProcessorDao {

    static Connection connection;

    @Override
    public void createUser(User user) {
        connection = DBConnectionUtil.getConnection();
        String sql = "INSERT INTO Users (user_id, name, password, role) VALUES (?, ?, ?, ?)";


        PreparedStatement statement = null;

        try {
            statement = connection.prepareStatement(sql);
            statement.setInt(1, user.getUserId());
            statement.setString(2, user.getUsername());
            statement.setString(3, user.getPassword());
            statement.setString(4, user.getRole());
            statement.executeUpdate();

            System.out.println("User added.");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if(statement != null) statement.close();
                if(connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void createProduct(Product product) {
        connection = DBConnectionUtil.getConnection();
        // Ensure this matches your DB schema
        String sql = "INSERT INTO Product (product_id, name, description, price,stockquantity,  product_type) VALUES (?, ?, ?, ?, ?, ?)";
        
        PreparedStatement statement = null;

        try {
            statement = connection.prepareStatement(sql);
            statement.setInt(1, product.getProductID());
            statement.setString(2, product.getProductName());
            statement.setString(3, product.getDescription());
            statement.setDouble(4, product.getPrice());
            statement.setInt(5, product.getQuantityInStock());  // This maps to "quantity" in DB
            statement.setString(6, product.getType());
            statement.executeUpdate();

            System.out.println("Product added.");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if(statement != null) statement.close();
                if(connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

package com.ecomapp.util;


import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnectionUtil {

    static Connection connection;

    public static Connection getConnection() {
        try {
            String url = "jdbc:mysql://localhost:3306/project";
            String user = "root";
            String password = "Root";

            if (url == null || user == null || password == null) {
                throw new IllegalStateException("DB credentials not properly initialized.");
            }

            return DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
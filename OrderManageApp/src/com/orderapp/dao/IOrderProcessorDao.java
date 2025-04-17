package com.orderapp.dao;
import com.orderapp.model.Product;
import com.orderapp.model.User;

public interface IOrderProcessorDao {
    void createProduct(Product product);
    void createUser(User user) ;
	
}
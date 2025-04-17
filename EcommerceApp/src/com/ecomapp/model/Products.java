package com.ecomapp.model;

public class Products {

	private int productID;
	private String name;
	private double price;
	private String description;
	private int stockQuantity;
	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Products(int productID, String name,double price, String description, int stockQuantity) {
		super();
		this.productID = productID;
		this.name = name;
		this.price = price;
		this.description = description;
		this.stockQuantity = stockQuantity;
	}

	

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getStockQuantity() {
		return stockQuantity;
	}

	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}
	
	@Override
	public String toString() {
		return "Product [productID=" + productID + ", name=" + name + ", price =" +price
				+ ", description=" + description + ", stockQuantity=" + stockQuantity + "]";
	}
}
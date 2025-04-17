package com.orderapp.model;

public class Product{

	private int productID;
	private String productName;
	private String description;
	private double price;
	private int quantityInStock;
	private String type;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int productID,  String productName,String description, double price, int quantityInStock,String type) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.description = description;
		this.price = price;
		this.quantityInStock = quantityInStock;
	}

	

	  public int getProductID() {
	        return productID;
	    }

	    public void setProductID(int productID) {
	        this.productID = productID;
	    }

	    public String getProductName() {
	        return productName;
	    }

	    public void setProductName(String productName) {
	        this.productName = productName;
	    }

	    public String getDescription() {
	        return description;
	    }

	    public void setDescription(String description) {
	        this.description = description;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }

	    public int getQuantityInStock() {
	        return quantityInStock;
	    }

	    public void setQuantityInStock(int quantityInStock) {
	        this.quantityInStock = quantityInStock;
	    }

	    public String getType() {
	        return type;
	    }

	    public void setType(String type) {
	        this.type = type;
	    }

	    @Override
	    public String toString() {
	        return "Product [productID=" + productID + ", productName=" + productName + ", description=" + description 
	            + ", price=" + price + ", quantityInStock=" + quantityInStock + ", type=" + type + "]";
	    }
	}
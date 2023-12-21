package com.deloitte.java.model;

import java.io.InputStream;

public class Product {
    private int id;
    private String name;
    private double price;
    private String description;
    private double mrpPrice;
    private String status;
    private String category;
    private String fileData; // Assuming file_data is stored as InputStream in the database

    // Constructors (you can have multiple constructors as needed)


    public Product(String name, double price, String description, double mrpPrice, String status, String category,
            String fileData) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.mrpPrice = mrpPrice;
        this.status = status;
        this.category = category;
        this.fileData = fileData;
    }
    
    
    public Product(int id, String name, double price, String description, double mrpPrice, String status,
			String category, String fileData) {
//		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
		this.mrpPrice = mrpPrice;
		this.status = status;
		this.category = category;
		this.fileData = fileData;
	}


	// Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getMrpPrice() {
        return mrpPrice;
    }

    public void setMrpPrice(double mrpPrice) {
        this.mrpPrice = mrpPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getFileData() {
        return fileData;
    }

    public void setFileData(String fileData) {
        this.fileData = fileData;
    }

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", description=" + description
				+ ", mrpPrice=" + mrpPrice + ", status=" + status + ", category=" + category + ", fileData=" + fileData
				+ "]";
	}
    
    
}

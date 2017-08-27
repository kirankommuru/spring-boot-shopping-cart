package com.test.product.domain;

public class Product {
	
	private String id;
	private String category;
	private String name;
	private String image;
	private String description;
	private int quantity;
	private double unitPrice;
	private double total;
	
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	 @Override
	    public String toString() {
	        return String.format(
	                "Product[id=%s,category='%s', name='%s',image='%s',description='%s',quantity='%s',unitPrice='%s']",
	                id,category, name, image,description,quantity,unitPrice);
	    }

}

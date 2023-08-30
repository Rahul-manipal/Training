package com.ey.shop;
/**
 * 	This class represents Prodcuts of our shopping application
 * @name Rahul
 * @version 1.0
 */




public class Product {
	private String name;
	private double price;
	/**
	 * This is the default constructor
	 */

	public Product()
  {
	  /**
	   * This is the parameterised constructor
	   * @param name
	   * @price
	   */
  }

	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	/**
	 * this methods prints the detail of the Product
	 */
	
	public void print()
	{
		System.out.println("Name: " + name + "\tprice: " + price);
	}
	
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}

	public double getPrice()
	{
		return price;
	}
}

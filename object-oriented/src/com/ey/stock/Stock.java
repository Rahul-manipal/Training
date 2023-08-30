package com.ey.stock;

public class Stock implements Exchange {

	@Override
	public void setQuote() {
    System.out.println("Get quote");
	}

	@Override
	public void getQuote() {
		System.out.println("view quote");
	}

	@Override
	public void viewQuote() {
		System.out.println("set quote");		
	}

}

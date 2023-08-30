package com.ey.bank;

public abstract class Accounts implements Bank {
	private int acntNo;
	private String holder;
	protected double balance;
	
	
	private static int counter = 10101;

	public Accounts() {

	}

	public Accounts(String holder, double balance) {
		this.acntNo = counter++;
		this.holder = holder;
		this.balance = balance;
	}

	public void summary() {
		System.out.println("A/C No: " + acntNo);
		System.out.println("Holder: " + holder);
		System.out.println("Balance: " + balance);
	}

	public void deposit(double amount) {
		balance += amount;
	}

	//public abstract void withdraw(double amount);// we can remove this bcz already the abstracts methods is inherited
		
}

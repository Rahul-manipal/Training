package com.ey.bank;

public interface Bank {

	// Application constants
	int INIT_ACCOUNT_NO = 10101;
	double MIN_SAVINGS_BAL = 1000;
	double OPENING_CURRENT_BAL = 5000;
	double MIN_CURRENT_BAL = 0;
	double OVERDRAFT_LIMIT = 10000;
//Application behaviour(API)

	void summary();

	void deposit(double amount);

	void withdraw(double amount) throws BalanceException;
}

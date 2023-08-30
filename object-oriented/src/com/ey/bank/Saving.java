package com.ey.bank;

public class Saving extends Accounts {

	public Saving() {
		
	}

	public Saving(String holder) {
		super(holder, 1000);

	}

	@Override
	public void withdraw(double amount) throws BalanceException {
		if(amount <= (balance - 1000))
			balance-=amount;
		else
			throw new BalanceException("Insufficient balance!");
	}
	
	

	
}

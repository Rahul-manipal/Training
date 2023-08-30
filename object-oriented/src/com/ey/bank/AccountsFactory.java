package com.ey.bank;

public final class AccountsFactory {
	private AccountsFactory()//why are we making it as private
	{
		
	}
    public static Saving createSavingsAccount(String holder) {
    	return new Saving(holder);
    }
    public static Current createCurrentAccount(String holder) {
    	return new Current(holder);
    }
}

import com.ey.bank.AccountsFactory;
import com.ey.bank.BalanceException;
import com.ey.bank.Bank;

//public class TestAccounts {
//	public static void main(String[] args) {
//
//		Bank c1 = AccountsFactory.createCurrentAccount("Sam");
//		try {
//			c1.withdraw(20000);
//		} catch (BalanceException e) {
//			// e.printStackTrace();// for developer to troubleshoot the errors
//			System.out.println(e);// Logging: to audit system behavior
//			System.out.println(e.getMessage());
//		}
//
//	}
//}

public class TestAccounts {
	public static void main(String[] args) {

		Bank s1 = AccountsFactory.createSavingsAccount("Sam");
		try {
			s1.withdraw(10);
		} catch (BalanceException e) {
			// e.printStackTrace();// for developer to troubleshoot the errors
			//System.out.println(e);// Logging: to audit system behavior
			System.out.println(e.getMessage());
		}

	}
}

public class Customer {
	private int custId;
	private String custName;
	private int creditLimit;

	  private static int counter = 101;

	public Customer() {

	}

	public Customer(String custName, int creditLimit) {

		this.custId = counter++;
		this.custName = custName;
		this.creditLimit = creditLimit;

	}

	public void details() {
		System.out.println("cust Id: " + custId);
		System.out.println("cust Name: " + custName);
		System.out.println("Credit Limit: " + creditLimit);
	}

	public int getCreditLimit() {
		return creditLimit;
	}

}
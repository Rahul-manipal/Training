
public class TestCustomer {
	public static void main(String[] args) {
		Customer c1 = new Customer("polo", 4000);
		c1.details();
		System.out.println("Credit Limit: " + c1.getCreditLimit());
		
		Customer c2 = new Customer("polo", 4000);
		c2.details();
	}
	
}


public class Car {
	private String model;
	private String[] features;

	public Car(String model, String... features) { // writing string...(var-args) inplace of string[] just to solve the
													// problem we facing while passing the value in object
		super();
		this.model = model;
		this.features = features;
	}

	public void specs() {
		System.out.println("Features of " + model);
		for (String f : features)
			System.out.println("> " + f);
	}

	public static void main(String[] args) {
		// String[] af = {"Keyless","AC","Powre Window"};
		Car alto = new Car("Suzuki Alto", "Keyless", "AC", "Powre Window");
		alto.specs();
		// String[] sf = {"ABS","Keyless","Auto","SunRoof"};
		Car astor = new Car("MG Astor", "ABS", "Keyless", "Auto", "SunRoof");
		astor.specs();
	}
}

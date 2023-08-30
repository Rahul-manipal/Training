package com.ey.emp;

public class Manager extends Employee {
	private double incentives;

	public Manager() {
		
		//optional bcz by default child class calls the default constructor of parent
		super();
	}

	public Manager(String empName, double salary, double incentives) {
		
		// constructor chainig : calling constructor of parent class with matching signature
		super(empName, salary);
		this.incentives = incentives;
	}

	@Override
	public void payslip() {
		super.payslip(); // calling payslip method of super class
		System.out.println("Incentives: " + incentives);
	}

	@Override
	public double getSalary() {
		return super.getSalary() + incentives;
	}
	
	
	
	

}

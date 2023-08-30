package com.ey.emp;

public abstract class Employee { // here we are using the abstract class as we don't want any body to instantiate the class, still the refrence be can be done of abstract class here bcz of up casting
  private int empNo;
  private String empName;
  private double salary;
  
  private static int counter;
  
  static {  // static initializer block - executes at the time of class loading
	  System.out.println("Account class loaded...");
	  counter = 901;
  }
  
  {
	  System.out.println("Employee object created.."); //happens before calling constructor, it is ghost block
  }
  
  public Employee() {
	
}
  
  public Employee(String empName, double salary) {
	  System.out.println("Employee constructor");
	  this.empNo= counter++;
	  this.empName= empName;
	  this.salary= salary;
	
}
  public void payslip()
  {
	  System.out.println("Emp No: " + empNo);
	  System.out.println("Emp Name: " + empName);
	  System.out.println("Salary: " + salary);
  }

public double getSalary() {
	return salary;
}
  
}

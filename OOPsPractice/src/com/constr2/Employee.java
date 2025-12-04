package com.constr2;

public class Employee {
	
	int id;
	String name;
	String salary;
	
	Employee(int id, String name, String salary){
		
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.display();
		
	}
	
	void display() {
		System.out.println("Employee id = "+id);
		System.out.println("Employee Name = "+name);
		System.out.println("Employee Salary = "+salary);
		System.out.println("----------------------------------");
		
	}
	
	
	
}

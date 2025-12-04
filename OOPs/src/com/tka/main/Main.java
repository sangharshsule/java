package com.tka.main;

import com.sangharsh.employee.Employee;

public class Main {
	public static void main(String[] args) {
		
		Employee emp = new Employee();

		String myName = emp.empName = "Om";
		String myCity = emp.city = "goa";
		int myID = emp.emp_Id = 123465;
		double mySalary = emp.salary = 350000.0;

		System.out.println("Default value print  = " + emp.empName);

		System.err.println("1st Employee Info ... !");
		System.out.println("Employee Name = " + myName);
		System.out.println("Employee City = " + myCity);
		System.out.println("Employee ID = " + myID);
		System.out.println("Employee Salary = " + mySalary);

		System.out.println("Thank u ... ! ");
	}
	

}

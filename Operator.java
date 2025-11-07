package com.tka.sangharsh;

public class Operator {
	public static void main(String[] args) {
		// Relational / Comparison Operator
		int a = 5, b = 5;
		
		System.out.println( a + " is greater than " + b + " = " +(a > b));
		System.out.println( a + " is less than " + b + " = " +(a < b));
		System.out.println( a + " is greater than Equal to " + b + " = " +(a >= b));
		System.out.println( a + " is less than Equal to " + b + " = " +(a <= b ));
		System.out.println( a + " is equal to  " + b + " = " +(a == b));
		System.out.println( a + " is Not Equal to " + b + " = " +(a != b));
		// AND Operator
		
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		// OR Operator
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);		
	}

}

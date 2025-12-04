package com.sangharsh;

public class Day_1_loop {

//	Print the sum of odd numbers from 1 to 100.

//	Print numbers from 1 to 10 using a loop.
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

//		Print numbers from 10 to 1.
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}

//		Print all even numbers between 1 and 50.

//		int i = 2;
//		while (i <= 50) {
//			System.out.println(i);
//			i++;
//			i++;
//
//		}

		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

//		Print all odd numbers between 1 and 50.
		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}

//		Print the table of 5 using a loop.

		for (int i = 1; i <= 10; i++) {
			System.out.println("5 * " + i + " = " + (5 * i));

		}

//		Print the table of any number (e.g., n = 7).
//		int n=35;
//		int i=1;
//		while(i<=10) {
//			System.out.println(n+" * " +i+" = "+(n*i));
//			i++;
//			
//		}

//		Print Hello 10 times.
//		for(int i=1; i<=10; i++) {
//			System.out.println("hello");
//		}
//		
////		Print the sum of first 10 natural numbers.
//		int i=1;
//		int sum = 0;
//		while(i<=10) {
//			sum += i;
//			i++;
//		}
//		System.out.println("Sum of first 10 natural numbers = " + sum);	

//		Print the sum of even numbers from 1 to 100.
		int sum = 0;
		for (int i = 1; i <= 100; i++) {

			if (i % 2 == 0) {
				sum += i;

			}

		}
		System.out.println("Sum of even numbers from 1 to 100 = " + sum);
//

//		int sum = 0;
//		for (int i = 1; i <= 100; i++) {
//
//			if (i % 2 == 1) {
//				sum += i;
//
//			}
//
//		}
//		System.out.println("Sum of Odd numbers from 1 to 100 = " + sum);

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		
		

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
	}
}

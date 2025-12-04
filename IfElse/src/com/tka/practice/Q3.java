package com.tka.practice;

public class Q3 {
	public static void main(String[] args) {

//		int a = 47;
//		if(a >= 90 && a <= 100) {
//			System.out.println("Grade A");
//		}else if(a >= 75 && a <= 89) {
//			System.out.println("Grade B");
//			
//		}else if(a >= 50 && a <= 74) {
//			System.out.println("Grade C");
//		}else if (a >= 35 && a <= 49) {
//			System.out.println("Grade D");
//		}else {
//			System.out.println("Fail");
//		}
		
		
		int day = 5;
		if(day == 1) {
			System.out.println("sunday");
		}else if (day == 2) {
			System.out.println("monday");
		}else if (day == 3) {
			System.out.println("tuesday");
		}else if (day == 4) {
			System.out.println("wednessday");
		}else if (day == 5) {
			System.out.println("thursday");
		}else if (day == 6) {
			System.out.println("friday");
		}else {
			System.out.println("saturday");
		}
		
		
		
		
		int a = 2, b = 3 , c = 2;
		if(a == b && b == c) {
			System.out.println("This is Equilateral Triangle");
		}else if (a == b || b == c || a == c) {
			System.out.println("This is Isosceles Triangle");
		}else {
			System.out.println("This is Scalene Triangle");
		}
		
		
//
//		int age = 59;
//		if(age > 0 && age <=12) {
//			System.out.println("Child");
//		}else if(age >=13 && age<= 19) {
//			System.out.println("Teenager");
//		}else if(age >= 20 && age <= 59) {
//			System.out.println("Adult");
//		}else {
//			System.out.println("Senior Citizen");
//		}
		
		
		
//		Write a program to classify a temperature as Hot, Warm, Cool, or Cold.
		
		int temp = 10;
		if(temp > 25) {
			System.out.println("Hot");
		}else if(temp >= 20 && temp <= 25){
			System.out.println("Warm");
		}else if(temp >= 10 && temp <= 20) {
			System.out.println("Cool");
		}else {
			System.out.println("Cold");
		}
		
		
		
//		Write a program to check whether a number is positive, negative, or zero.
		int num = 0;
		if(num>0) {
			System.out.println(num+" "+"This is Postive Number");
		}else if(num<0) {
			System.out.println(num+" "+"This is Negative Number");
		}else {
			System.out.println("This is Zero");
		}
		
		
		
//		Write a program to check if a person is eligible to vote, and if eligible, check if they can contest in elections (age ≥ 25).
	    
		int age = 25;
		if(age >= 18) {
			System.out.println("They can Vote");
			if(age>=25) {
				System.out.println("They can Vote"+" "+"and also"+" "+"They can contest in elections");
			}
		}else {
			System.out.println("They can not Vote");
		}
		
		
		
//		Write a program to check whether a number is even, and if even, check whether it’s greater than 50.
		
		int number = 40;
		if(number % 2 ==0) {
			System.out.println("this is Even Number");
			if(number >= 50 ) {
				System.out.println("It’s greater than 50");
			}
		}else {
			System.out.println("This is Odd number");
		}
	
	
	}

}

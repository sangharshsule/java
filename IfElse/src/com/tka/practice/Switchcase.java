//package com.tka.practice;
//
//public class Switchcase {
//	public static void main(String[] args) {
//
////		Write a Java program that takes an integer (1–7) and prints the corresponding day name (e.g., 1 → Monday)
//		int day = 7;
//
//		switch (day) {
//		case 1:
//			System.out.println("Sunday");
//			break;
//		case 2:
//			System.out.println("Monday");
//			break;
//		case 3:
//			System.out.println("Tuesday");
//			break;
//		case 4:
//			System.out.println("wednessday");
//			break;
//		case 5:
//			System.out.println("Thursday");
//			break;
//		case 6:
//			System.out.println("Friday");
//			break;
//		case 7:
//			System.out.println("Saturday");
//			break;
//
//		default: {
//			System.out.println("Not Valid");
//		}
////		
//
////		Accept a number (1–12) from the user and print the name of the month using a switch case.
//
//		int month = 11;
//		switch (month) {
//		case 1:
//			System.out.println("January");
//			break;
//		case 2:
//			System.out.println("February");
//			break;
//		case 3:
//			System.out.println("March");
//			break;
//		case 4:
//			System.out.println("April");
//			break;
//		case 5:
//			System.out.println("May");
//			break;
//		case 6:
//			System.out.println("June");
//			break;
//		case 7:
//			System.out.println("Jully");
//			break;
//		case 8:
//			System.out.println("August");
//			break;
//		case 9:
//			System.out.println("September");
//			break;
//		case 10:
//			System.out.println("October");
//			break;
//		case 11:
//			System.out.println("November");
//			break;
//		case 12:
//			System.out.println("December");
//			break;
//		default:
//			System.out.println("Not Valid..!");
//			break;
//		}
//
////		Accept two numbers and an operator (+, -, *, /) from the user and perform the operation using a switch case.
//
//		char operation = '-';
//
//		switch (operation) {
//
//		case '+':
//			int a = 7, b = 4;
//			System.out.println("Addition of " + a + " + " + b + "  is = " + (a + b));
//			break;
//
//		case '-':
//			int c = 8, d = 4;
//			System.out.println("SUB of a - b is =  " + (c - d));
//			break;
//		case '*':
//			int e = 3, f = 4;
//			System.out.println("MUL of a * b is =  " + (e * f));
//			break;
//		case '/':
//			int g = 6, h = 3;
//			System.out.println("DIV of a / b is =  " + (g / h));
//			break;
//		case '%':
//			int i = 3, j = 4;
//			System.out.println("MOD of a % b is =  " + (i % j));
//			break;
//		default:
//
//			System.out.println("Invalid Operation...!");
//
//	}
//
////		4. Take a grade character (A, B, C, D, F) as input and print a message:
////
////			A → Excellent
////			B → Good
////			C → Average
////			D → Poor
////			F → Fail
//		char grade = 'F';
//		switch (grade) {
//		case 'A':
//			System.out.println("Excellent");
//			break;
//		case 'B':
//			System.out.println("Good");
//			break;
//		case 'C':
//			System.out.println("Average");
//			break;
//		case 'D':
//			System.out.println("Poor");
//			break;
//		case 'F':
//			System.out.println("Fail");
//			break;
//		default:
//			System.out.println("Invalid Input");
//			break;
//		}
//
////		5. Input color name (Red, Yellow, or Green) and print the appropriate action:
////
////			Red → Stop
////			Yellow → Ready
////			Green → Go
//
//		String color = "Red";
//		switch(color) {
//		case "Red":
//			System.out.println("Stop");
//		break;
//		case "Yellow":
//			System.out.println("Ready");
//		break;
//		case "Green":
//			System.out.println("Go");
//		break;
//		default:
//			System.out.println("Invalid Signal");
//		break;
//		
//		}
//
////		6. Take a single character input and check whether it is a vowel or consonant using a switch statement.
//
//		char vowel = 'U';
//		switch (vowel) {
//		case 'A':
//			System.out.println('A' + " " + "Its a Vowel");
//			break;
//		case 'E':
//			System.out.println('E' + " " + "Its a Vowel");
//			break;
//		case 'O':
//			System.out.println('O' + " " + "Its a Vowel");
//			break;
//		case 'U':
//			System.out.println('U' + " " + "Its a Vowel");
//			break;
//		case 'I':
//			System.out.println('I' + " " + "Its a Vowel");
//			break;
//		default:
//			System.out.println("Its a Consonant");
//			break;
//
//		}
////		
//
////		7. Use a switch statement to check if a number is even or odd (hint: use number % 2 as the expression)
//
//		int number = 10245288;
//
//		switch (number % 2) {
//		case 0:
//			System.out.println(number + " is Even");
//			break;
//
//		case 1:
//			System.out.println(number + " is Odd");
//			break;
//
//		default:
//			System.out.println("Invalid Input");
//		}
//
////		8. Accept a category type (Domestic, Commercial, Industrial) and print the electricity rate per unit using a switch case.
//
//		String Category = "Industrial";
//		switch (Category) {
//		case "Domestic":
//			System.out.println(Category + " electricity rate per unit is 10$");
//			break;
//		case "Commercial":
//			System.out.println(Category + " electricity rate per unit is 15$");
//			break;
//		case "Industrial":
//			System.out.println(Category + " electricity rate per unit is 20$");
//			break;
//		default:
//			System.out.println("Invalid Category");
//		}
//
////		9. Take month number (1–12) and print the corresponding season:
////
////			Dec–Feb → Winter
////			Mar–May → Summer
////			Jun–Aug → Monsoon
////			Sep–Nov → Autumn
//
//		int month = 6;
//		switch (month) {
//		case 1:
//			System.out.println(month + " january month is in winter");
//			break;
//		case 2:
//			System.out.println(month + " February month is in winter");
//			break;
//		case 3:
//			System.out.println(month + " March month is in Summer");
//			break;
//		case 4:
//			System.out.println(month + " April month is in Summer");
//			break;
//		case 5:
//			System.out.println(month + " May month is in Summer");
//			break;
//		case 6:
//			System.out.println(month + " June month is in Monsoon");
//			break;
//		case 7:
//			System.out.println(month + " Jully month is in Monsoon");
//			break;
//		case 8:
//			System.out.println(month + " August month is in Monsoon");
//			break;
//		case 9:
//			System.out.println(month + " September month is in Autum");
//			break;
//		case 10:
//			System.out.println(month + " October month is in Autum");
//			break;
//		case 11:
//			System.out.println(month + " November month is in Autum");
//			break;
//		case 12:
//			System.out.println(month + " December month is in winter");
//			break;
//		default:
//			System.out.println("Try Again(This is Not a Month)");
//			break;
//
//		}
//
//	}
//}
//}
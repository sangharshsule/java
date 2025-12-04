package com.constr1;

public class Rectangle {

//	Create a class Rectangle with a non-parameterized constructor that sets length = 10 and width = 5. 
//			Print the area.
//			 Create a class Rectangle with a parameterized constructor to set length and width, and print the 
//			area.

	int length;
	int width;

	Rectangle() {
		int length = 10;
		int width = 5;

		System.out.println("Area of " + length + " & " + width + " = " + (length * width));
	}

	Rectangle(int length, int width) {

		this.length = length;
		this.width = width;
		this.display();

	}
	
	
	void display() {
		
		System.out.println("Area of " + length + " & " + width + " = " + (length * width));
	}

}

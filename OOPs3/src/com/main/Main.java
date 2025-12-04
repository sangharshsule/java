package com.main;

import com.Library.Library;

public class Main {
	public static void main(String[] args) {
		 Library b1 = new Library();
	        b1.bookName = "Atomic Habits";
	        b1.author = "James Clear";
	        b1.genre = "Self Help";
	        b1.year = 2018;
	        b1.price = 450;

	        Library b2 = new Library();
	        b2.bookName = "Rich Dad Poor Dad";
	        b2.author = "Robert Kiyosaki";
	        b2.genre = "Finance";
	        b2.year = 1997;
	        b2.price = 399;

	        Library b3 = new Library();
	        b3.bookName = "The Alchemist";
	        b3.author = "Paulo Coelho";
	        b3.genre = "Fiction";
	        b3.year = 1988;
	        b3.price = 350;

	        Library b4 = new Library();
	        b4.bookName = "Wings of Fire";
	        b4.author = "A.P.J. Abdul Kalam";
	        b4.genre = "Autobiography";
	        b4.year = 1999;
	        b4.price = 500;

	        Library b5 = new Library();
	        b5.bookName = "Java: The Complete Reference";
	        b5.author = "Herbert Schildt";
	        b5.genre = "Programming";
	        b5.year = 2022;
	        b5.price = 1200;

	        // PRINT ALL BOOK ENTRIES
	        System.out.println("Book 1: " + b1.bookName + ", " + b1.author + ", " + b1.genre + ", " + b1.year + ", " + b1.price);
	        System.out.println("Book 2: " + b2.bookName + ", " + b2.author + ", " + b2.genre + ", " + b2.year + ", " + b2.price);
	        System.out.println("Book 3: " + b3.bookName + ", " + b3.author + ", " + b3.genre + ", " + b3.year + ", " + b3.price);
	        System.out.println("Book 4: " + b4.bookName + ", " + b4.author + ", " + b4.genre + ", " + b4.year + ", " + b4.price);
	        System.out.println("Book 5: " + b5.bookName + ", " + b5.author + ", " + b5.genre + ", " + b5.year + ", " + b5.price);
	 	}

}

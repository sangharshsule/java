package com.question;



public class Practice {

//    1. Write a method to print your name (no return, no parameters).

	public void myName() {
		System.out.println("My name is Sangharsh Sule");

	}

//    2. Write a method to print the sum of two numbers (no return, with parameters).

	public void sum(int a, int b) {
		System.out.println("Sum of " + a + " and " + b + " = " + (a + b));

	}
//    3. Write a method that returns your age (return type, no parameters).

	public void myAge() {
		int age = 21;
		System.out.println("My age is " + age);
	}
//    4. Write a method that returns the square of a number (return type, with parameters).

	public void mySquare(int num) {
		System.out.println("The Square of " + num + " is " + (num * num));
	}
//    5. Write a method to print the first 10 natural numbers.

	public void myNum() {

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

	}

//    6. Write a method to check whether a number is even or odd.
	public void num(int num) {
		if (num % 2 == 0) {
			System.out.println(num + " This is Even Number");
		} else {
			System.out.println(num + " This is Odd Number");
		}

	}

//    7. Write a method to calculate the factorial of a given number.
	// Method without return type
	public void factorial(int n) {
		int fact = 1;

		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}

		System.out.println("Factorial of " + n + " is: " + fact);
	}

//    8. Write a method to check if a number is prime or not.

	public void prime(int n) {
		int count = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}

		if (count == 2) {
			System.out.println(n + " is Prime");
		} else {
			System.out.println(n + " is Not Prime");
		}
	}

//    9. Write a method to return the largest of three numbers.

	public void findLargest(int a, int b, int c) {
		int largest;

		if (a >= b && a >= c) {
			largest = a;
		} else if (b >= a && b >= c) {
			largest = b;
		} else {
			largest = c;
		}

		System.out.println("Largest Number is: " + largest);
	}

//    10. Write a method to count the number of digits in a number.

	public void count(int n) {
		int count = 0;
		int num = n;

		if (n == 0) {
			count = 1;
		} else {
			while (n != 0) {
				n = n / 10;
				count++;
			}
		}

		System.out.println("Number of digits in " + num + " = " + count);
	}

//	with return type

//	 Write a method that returns the square of a number.

	public int mySqaure(int num) {
		num = num * num;

		System.out.println("Square = " + num);
		return num;
	}

//	 Write a method that returns the cube of a number.

	public int cube(int num) {
		num = num * num * num;
		System.out.println("cube = " + num);
		return num;
	}

//	 Write a method that returns the sum of two numbers.

	public int mySum(int a, int b) {
		int add = a + b;
		System.out.println("Addition of " + a + " and " + b + " " + "is " + add);
		return add;
	}

//	 Write a method that returns the greatest of three numbers

	public int great(int a, int b, int c) {
		int greatest;

		if (a >= b && b >= c) {
			greatest = a;
		} else if (a <= b && b >= c) {
			greatest = b;
		} else {
			greatest = c;
		}

		System.out.println("The greatest number is " + greatest);
		return greatest;
	}

//	 Write a method that returns true if a number is even, else false.

	public int even(int num) {

		if (num % 2 == 0) {
			System.out.println("True");

		} else {
			System.out.println("False");
		}
		return num;
	}

//	 Write a method that returns the factorial of a number. 

	public int fact(int n) {
		int fact = 1;

		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}

		System.out.println(fact);

		return fact;
	}

//	Write a method that returns the reverse of a number.
	public int reverseNumber(int n) {
		int rev = 0;

		while (n != 0) {
			int digit = n % 10; // get last digit
			rev = rev * 10 + digit; // add digit to reverse
			n = n / 10; // remove last digit
		}
		System.out.println(rev);

		return rev;
	}

//	 Write a method that returns whether a number is prime or not.

	public boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		

		return true;
	}

//	 Write a method that returns the count of digits in a number.

	public int countDigits(int n) {
		int count = 0;

		// handle negative numbers
		n = Math.abs(n);

		// if number is 0, it has 1 digit
		if (n == 0) {
			return 1;
		}

		while (n > 0) {
			n = n / 10;
			count++;
		}
		System.out.println(count);

		return count;
	}
	
	
	String fName;
	String mName;
	String lName;
	int age;
	long moNo;
	long aadharNo;
	String panNo;
	String city;
	String prof;
	String hobby;
	
	
	public void myInfo(String fName , String mName , String lName , int age , long moNo , long aadharNo , String panNo , String city , String prof , String hobby) {
		
		this.fName = fName;
		this.mName = mName;
		this.lName = lName;
		this.age = age;
		this.moNo = moNo;
		this.aadharNo = aadharNo;
		this.panNo = panNo;
		this.city = city;
		this.prof = prof;
		this.hobby = hobby;
		
		
		System.err.println("MY INFORMATION");
		System.out.println("first name is "+ fName);
		System.out.println("middle name is "+ mName);
		System.out.println("last name is "+ lName);
		System.out.println(" age = "+ age);
		System.out.println("Mobile number = "+ moNo);
		System.out.println("Adhar number = "+ aadharNo);
		System.out.println("Pan Number =  "+ panNo);
		System.out.println("live in "+ city);
		System.out.println("I am a "+ prof);
		System.out.println("I love  " + hobby);
		
		
	}
	
	
	private String brand; 
	private int model; 
	private int price;
	
//	public void vehicle(String brand, int model , int price) {
//		this.brand = brand;
//		this.model = model;
//		this.price = price;
		
//		System.out.println(brand);
//		System.out.println(model);
//		System.out.println(price);
		
		
	

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	
	
	}
	
	
	
	private String title;

	private String author;
	
	private int pricee;

	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
		
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author=author;
	}
	
	public int getPricee() {
		return pricee;
	}
	
	public void setPricee(int pricee) {
		this.pricee = pricee;
		
	}	
		
		
		
	private String course;
	private String teacher;
	private int paid;
	
	
	public String getCourse() {
		return course;
	}
	
	public void setCourse(String course) {
		this.course = course;
	}
	
	public String getTeacher() {
		return teacher;
	}
	
	public void setTeacher(String teacher) {
		this.teacher= teacher;
	}
	
	public int getPaid() {
		return paid;
	}
	
	public void setPaid(int paid) {
		this.paid = paid;
	}
	
	
	
	
	
	
		
	
}

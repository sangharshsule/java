package com.constr3;

public class Car {

	String model;
	String name;
	int price;

	Car() {
		System.out.println("Car Started !!!");

	}

	Car(String model, String name, int price) {

		this.model = model;
		this.name = name;
		this.price = price;
		this.display();

	}

	void display() {
		System.out.println("Model of Car = " + model);
		System.out.println("Name of Car = " + name);
		System.out.println("Price of Car = " + price);

	}

}

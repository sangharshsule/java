package com.inh1;

public class Parent extends Child1 {
//	11.Create class Parent with method p().
//	Create two child classes Child1 and Child2.
//	Call methods of all classes using objects of each child.
	void p() {
		System.out.println("this is Parent class");
	}
	public static void main(String[] args) {
		Parent p = new Parent();
		p.ShowC1();
		p.ShowC2();
		p.p();
	}

}

package com.inh;

public class C extends B {
	void showC() {
		System.out.println("this is from C");
	}
	
	public static void main(String[] args) {
		
		
		C n = new C();
		n.showA();
		n.showB();
		n.showC();
		
	}
	
	

}

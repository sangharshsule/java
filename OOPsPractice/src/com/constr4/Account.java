package com.constr4;

public class Account {

	int balance;

	Account() {
		int balance = 1000;
		System.out.println("Account balance = " + balance);
	}

	Account(int balance) {
		this.balance = balance;
		this.display();

	}

	void display() {
		System.out.println("User Account Balance " + balance);
	}

}

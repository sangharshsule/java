package com.main;

import com.bank.Bank;

public class Main {
	public static void main(String[] args) {
		Bank b1 = new Bank();
        b1.accountHolder = "Rahul Sharma";
        b1.accountType = "Savings";
        b1.accountNumber = 98765432101L;
        b1.balance = 25000.50;
        b1.branch = "Mumbai";

        Bank b2 = new Bank();
        b2.accountHolder = "Priya Patil";
        b2.accountType = "Current";
        b2.accountNumber = 98765432102L;
        b2.balance = 78000.00;
        b2.branch = "Pune";

        Bank b3 = new Bank();
        b3.accountHolder = "Amit Verma";
        b3.accountType = "Salary";
        b3.accountNumber = 98765432103L;
        b3.balance = 56000.75;
        b3.branch = "Nagpur";

        Bank b4 = new Bank();
        b4.accountHolder = "Sneha Kulkarni";
        b4.accountType = "Savings";
        b4.accountNumber = 98765432104L;
        b4.balance = 92000.10;
        b4.branch = "Nashik";

        Bank b5 = new Bank();
        b5.accountHolder = "Arjun Mehta";
        b5.accountType = "Current";
        b5.accountNumber = 98765432105L;
        b5.balance = 150000.00;
        b5.branch = "Delhi";


        // -------------------------
        // PRINT ALL BANK ENTRIES
        // -------------------------
        System.out.println("Bank 1: " + b1.accountHolder + ", " + b1.accountType + ", " +
                b1.accountNumber + ", " + b1.balance + ", " + b1.branch);

        System.out.println("Bank 2: " + b2.accountHolder + ", " + b2.accountType + ", " +
                b2.accountNumber + ", " + b2.balance + ", " + b2.branch);

        System.out.println("Bank 3: " + b3.accountHolder + ", " + b3.accountType + ", " +
                b3.accountNumber + ", " + b3.balance + ", " + b3.branch);

        System.out.println("Bank 4: " + b4.accountHolder + ", " + b4.accountType + ", " +
                b4.accountNumber + ", " + b4.balance + ", " + b4.branch);

        System.out.println("Bank 5: " + b5.accountHolder + ", " + b5.accountType + ", " +
                b5.accountNumber + ", " + b5.balance + ", " + b5.branch); 	}

}

package com.main;

import com.question.Practice;

public class Main {
	public static void main(String[] args) {

		Practice name = new Practice();
		name.myName();

		Practice add = new Practice();
		add.sum(10, 15);

		Practice age = new Practice();
		age.myAge();

		Practice square = new Practice();
		square.mySquare(5);

		Practice num = new Practice();
		num.myNum();

		Practice no = new Practice();
		no.num(15);

//		Practice fact = new Practice();
//		fact.factorial(5);
//		
//		Practice Pri = new Practice();
//		Pri.prime(22);

		Practice Lar = new Practice();
		Lar.findLargest(32, 323, 389);

		Practice cou = new Practice();
		cou.count(877);

		Practice s = new Practice();
		s.mySqaure(5);

		Practice c = new Practice();
		c.cube(3);

		Practice su = new Practice();
		su.mySum(176, 546);

		Practice g = new Practice();
		g.great(10, 15, 5);

		Practice e = new Practice();
		e.even(11);

		Practice f = new Practice();
		f.fact(5);

		Practice d = new Practice();
		d.reverseNumber(1234);

		Practice p = new Practice();
		p.isPrime(23);
		System.out.println(p.isPrime(7)); // true

		Practice count = new Practice();
		count.countDigits(12345);

		Practice i = new Practice();
		i.myInfo("Sangharsh", "Gautam", "Sule", 22, 7378765262l, 596665740104l, "PLGPS6529N", "PUNE", "STUDENT",
				"CODING");

		Practice veh = new Practice();
//		veh.vehicle("toyota", 2020, 3500000);

		veh.setBrand("maruti");
		System.out.println("brand = "+ veh.getBrand());
		
		veh.setModel(2016);
		System.out.println("Model = "+veh.getModel());
		
		veh.setPrice(450000);
		System.out.println("Price = "+veh.getPrice());
		
		Practice lib = new Practice();
		lib.setTitle("Rich dad poor dad");
		System.out.println(lib.getTitle()+ " is a Title of Book");
		
		lib.setAuthor("Rober Kiyosaki ");
		System.out.println("Written by "+lib.getAuthor());
		lib.setPricee(150);
		System.out.println("Price of book is " + lib.getPricee());
		
		Practice t = new Practice();
		t.setCourse("Course = "+"FULLSTACK JAVA");
		System.out.println(t.getCourse());
		t.setTeacher("Shubham Barse sir");
		System.out.println("teaching by "+t.getTeacher());
		t.setPaid(49999);
		System.out.println("Discounted price only "+ t.getPaid());
		

	}

}

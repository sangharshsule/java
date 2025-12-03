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
		System.out.println(p.isPrime(7));  // true
		
		
		Practice count = new Practice();
		count.countDigits(12345);
		
		Practice i = new Practice();
		i.myInfo("Sangharsh", "Gautam", "Sule", 22, 7378765262l, 596665740104l,"PLGPS6529N", "PUNE", "STUDENT", "CODING");
		
		
	}

}

package com.main;

import com.mobile.Mobile;

public class Main {
	public static void main(String[] args) {
		
		Mobile h1 = new Mobile();
		h1.mobileName = "Iphone";
		h1.model = "15";
		h1.color = "White";
		h1.ram = "8GB";
		h1.storage = 512;
		
		Mobile h2 = new Mobile();
		h2.mobileName = "Motorolla";
		h2.model = "50 fusion";
		h2.color = "Blue";
		h2.ram = "12GB";
		h2.storage = 256;
		
		Mobile h3 = new Mobile();
		h3.mobileName = "Oppo";
		h3.model = "F29";
		h3.color = "White";
		h3.ram = "8GB";
		h3.storage = 512;
		
		Mobile h4 = new Mobile();
		h4.mobileName = "Vivo";
		h4.model = "V60";
		h4.color = "White";
		h4.ram = "8GB";
		h4.storage = 512;
		
		Mobile h5 = new Mobile();
		h5.mobileName = "Pixel";
		h5.model = "10 pro";
		h5.color = "White";
		h5.ram = "8GB";
		h5.storage = 512;
		
		System.out.println("Mobile 1:= "+h1.mobileName+","+h1.model+","+h1.color+","+h1.ram+","+h1.storage);
		System.out.println("Mobile 2:= "+h2.mobileName+","+h2.model+","+h2.color+","+h2.ram+","+h2.storage);
		System.out.println("Mobile 3:= "+h3.mobileName+","+h3.model+","+h3.color+","+h3.ram+","+h3.storage);
		System.out.println("Mobile 4:= "+h4.mobileName+","+h4.model+","+h4.color+","+h4.ram+","+h4.storage);
		System.out.println("Mobile 5:= "+h5.mobileName+","+h5.model+","+h5.color+","+h5.ram+","+h5.storage);


           }

}

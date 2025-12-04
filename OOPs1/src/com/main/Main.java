package com.main;

import com.vehicle.Vehicle;

public class Main {
	public static void main(String[] args) {
		
        Vehicle v1 = new Vehicle();
        v1.brand = "Toyota";
        v1.model = "Fortuner";
        v1.type = "SUV";
        v1.fuelType = "Diesel";
        v1.year = 2022;
        v1.price = 3500000;

        Vehicle v2 = new Vehicle();
        v2.brand = "Maruti Suzuki";
        v2.model = "Swift";
        v2.type = "Hatchback";
        v2.fuelType = "Petrol";
        v2.year = 2021;
        v2.price = 700000;

        Vehicle v3 = new Vehicle();
        v3.brand = "Tata";
        v3.model = "Nexon";
        v3.type = "SUV";
        v3.fuelType = "Electric";
        v3.year = 2023;
        v3.price = 1600000;

        Vehicle v4 = new Vehicle();
        v4.brand = "Hyundai";
        v4.model = "Creta";
        v4.type = "SUV";
        v4.fuelType = "Petrol";
        v4.year = 2020;
        v4.price = 1500000;

        Vehicle v5 = new Vehicle();
        v5.brand = "Honda";
        v5.model = "City";
        v5.type = "Sedan";
        v5.fuelType = "Petrol";
        v5.year = 2019;
        v5.price = 1200000;

        Vehicle v6 = new Vehicle();
        v6.brand = "Mahindra";
        v6.model = "Thar";
        v6.type = "Off-road SUV";
        v6.fuelType = "Diesel";
        v6.year = 2024;
        v6.price = 1900000;

        Vehicle v7 = new Vehicle();
        v7.brand = "Kia";
        v7.model = "Seltos";
        v7.type = "SUV";
        v7.fuelType = "Petrol";
        v7.year = 2022;
        v7.price = 1700000;

        Vehicle v8 = new Vehicle();
        v8.brand = "BMW";
        v8.model = "X5";
        v8.type = "Luxury SUV";
        v8.fuelType = "Diesel";
        v8.year = 2023;
        v8.price = 9000000;

        Vehicle v9 = new Vehicle();
        v9.brand = "Audi";
        v9.model = "A6";
        v9.type = "Luxury Sedan";
        v9.fuelType = "Petrol";
        v9.year = 2021;
        v9.price = 6500000;

        Vehicle v10 = new Vehicle();
        v10.brand = "Royal Enfield";
        v10.model = "Classic 350";
        v10.type = "Motorcycle";
        v10.fuelType = "Petrol";
        v10.year = 2020;
        v10.price = 220000;
        
        
        System.out.println("Vehicle 1: " + v1.brand + ", " + v1.model + ", " + v1.type + ", " + v1.fuelType + ", " + v1.year + ", " + v1.price);
        System.out.println("Vehicle 2: " + v2.brand + ", " + v2.model + ", " + v2.type + ", " + v2.fuelType + ", " + v2.year + ", " + v2.price);
        System.out.println("Vehicle 3: " + v3.brand + ", " + v3.model + ", " + v3.type + ", " + v3.fuelType + ", " + v3.year + ", " + v3.price);
        System.out.println("Vehicle 4: " + v4.brand + ", " + v4.model + ", " + v4.type + ", " + v4.fuelType + ", " + v4.year + ", " + v4.price);
        System.out.println("Vehicle 5: " + v5.brand + ", " + v5.model + ", " + v5.type + ", " + v5.fuelType + ", " + v5.year + ", " + v5.price);
        System.out.println("Vehicle 6: " + v6.brand + ", " + v6.model + ", " + v6.type + ", " + v6.fuelType + ", " + v6.year + ", " + v6.price);
        System.out.println("Vehicle 7: " + v7.brand + ", " + v7.model + ", " + v7.type + ", " + v7.fuelType + ", " + v7.year + ", " + v7.price);
        System.out.println("Vehicle 8: " + v8.brand + ", " + v8.model + ", " + v8.type + ", " + v8.fuelType + ", " + v8.year + ", " + v8.price);
        System.out.println("Vehicle 9: " + v9.brand + ", " + v9.model + ", " + v9.type + ", " + v9.fuelType + ", " + v9.year + ", " + v9.price);
        System.out.println("Vehicle 10: " + v10.brand + ", " + v10.model + ", " + v10.type + ", " + v10.fuelType + ", " + v10.year + ", " + v10.price);

	}

}

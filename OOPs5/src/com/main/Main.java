package com.main;

import com.hospital.Hospital;

public class Main {
	public static void main(String[] args) {
		Hospital h1 = new Hospital();


        h1.hospitalName = "Apollo Hospital";
        h1.location = "Mumbai";
        h1.establishedYear = 1990;
        h1.numberOfBeds = 500;
        h1.specialty = "Cardiology";

        Hospital h2 = new Hospital();
        h2.hospitalName = "Fortis Hospital";
        h2.location = "Delhi";
        h2.establishedYear = 1985;
        h2.numberOfBeds = 450;
        h2.specialty = "Neurology";

        Hospital h3 = new Hospital();
        h3.hospitalName = "AIIMS";
        h3.location = "New Delhi";
        h3.establishedYear = 1956;
        h3.numberOfBeds = 2500;
        h3.specialty = "Multi-Specialty";

        Hospital h4 = new Hospital();
        h4.hospitalName = "Ruby Hall Clinic";
        h4.location = "Pune";
        h4.establishedYear = 1969;
        h4.numberOfBeds = 600;
        h4.specialty = "General Medicine";

        Hospital h5 = new Hospital();
        h5.hospitalName = "Yashoda Hospital";
        h5.location = "Hyderabad";
        h5.establishedYear = 1989;
        h5.numberOfBeds = 700;
        h5.specialty = "Orthopedics";

        Hospital h6 = new Hospital();
        h6.hospitalName = "Narayana Health";
        h6.location = "Bengaluru";
        h6.establishedYear = 2000;
        h6.numberOfBeds = 1200;
        h6.specialty = "Cardiac Surgery";

        Hospital h7 = new Hospital();
        h7.hospitalName = "Max Healthcare";
        h7.location = "Chandigarh";
        h7.establishedYear = 2001;
        h7.numberOfBeds = 350;
        h7.specialty = "Oncology";

        Hospital h8 = new Hospital();
        h8.hospitalName = "Tata Memorial Hospital";
        h8.location = "Mumbai";
        h8.establishedYear = 1941;
        h8.numberOfBeds = 750;
        h8.specialty = "Cancer Treatment";

        Hospital h9 = new Hospital();
        h9.hospitalName = "Columbia Asia Hospital";
        h9.location = "Gurgaon";
        h9.establishedYear = 2008;
        h9.numberOfBeds = 200;
        h9.specialty = "Pediatrics";

        Hospital h10 = new Hospital();
        h10.hospitalName = "Care Hospital";
        h10.location = "Nagpur";
        h10.establishedYear = 1995;
        h10.numberOfBeds = 400;
        h10.specialty = "General Surgery";


        // PRINT ALL ENTRIES
        System.out.println("Hospital 1: " + h1.hospitalName + ", " + h1.location + ", " + h1.establishedYear + ", " + h1.numberOfBeds + ", " + h1.specialty);
        System.out.println("Hospital 2: " + h2.hospitalName + ", " + h2.location + ", " + h2.establishedYear + ", " + h2.numberOfBeds + ", " + h2.specialty);
        System.out.println("Hospital 3: " + h3.hospitalName + ", " + h3.location + ", " + h3.establishedYear + ", " + h3.numberOfBeds + ", " + h3.specialty);
        System.out.println("Hospital 4: " + h4.hospitalName + ", " + h4.location + ", " + h4.establishedYear + ", " + h4.numberOfBeds + ", " + h4.specialty);
        System.out.println("Hospital 5: " + h5.hospitalName + ", " + h5.location + ", " + h5.establishedYear + ", " + h5.numberOfBeds + ", " + h5.specialty);
        System.out.println("Hospital 6: " + h6.hospitalName + ", " + h6.location + ", " + h6.establishedYear + ", " + h6.numberOfBeds + ", " + h6.specialty);
        System.out.println("Hospital 7: " + h7.hospitalName + ", " + h7.location + ", " + h7.establishedYear + ", " + h7.numberOfBeds + ", " + h7.specialty);
        System.out.println("Hospital 8: " + h8.hospitalName + ", " + h8.location + ", " + h8.establishedYear + ", " + h8.numberOfBeds + ", " + h8.specialty);
        System.out.println("Hospital 9: " + h9.hospitalName + ", " + h9.location + ", " + h9.establishedYear + ", " + h9.numberOfBeds + ", " + h9.specialty);
        System.out.println("Hospital 10: " + h10.hospitalName + ", " + h10.location + ", " + h10.establishedYear + ", " + h10.numberOfBeds + ", " + h10.specialty);
    }

}

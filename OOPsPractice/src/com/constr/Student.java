package com.constr;

public class Student {
	String studentName;
	int studentAge;
	int studentRollNo;
	String branch ;
	double percentage ;
	String collegeName;
	String address ;
	long mobileNumber;
	boolean isHostelStudent;
	int i;
	char grade;
	
	
   public Student () {
	   System.out.println("Welcome Students !!! ");
   }
	public Student (String studentName,int studentAge,int studentRollNo,String branch,double percentage,String collegeName,String address,long mobileNumber,boolean isHostelStudent,int i,char grade){
            this.studentName=studentName;
            this.studentAge=studentAge;
            this.studentRollNo=studentRollNo;
            this.branch=branch;
            this.collegeName=collegeName;
            this.address=address;
            this.mobileNumber=mobileNumber;
            this.isHostelStudent=isHostelStudent;
            this.percentage=percentage;
            this.i=i;
            this.grade=grade;
            this.display();
            
	}
	
	
	void display() {
		System.out.println(studentName);
		System.out.println(studentAge);
		System.out.println(studentRollNo);
		System.out.println(branch);
		System.out.println(collegeName);
		System.out.println(address);
		System.out.println(mobileNumber);
		System.out.println(isHostelStudent);
		System.out.println(percentage);
		System.out.println(i);
		System.out.println(grade);
		
	}
	

}

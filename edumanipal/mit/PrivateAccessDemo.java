package edu.manipal.mit;

public class PrivateAccessDemo {
	public static void main(String[] args) {
	    
		 Student2 student = new Student2();

	     student.setName("John Doe");
	     student.setRollNumber(12345);

	     System.out.println("Student Name: " + student.getName());
	     System.out.println("Student Roll Number: " + student.getRollNumber());

	     // System.out.println(student.name);       Compilation Error 
	     // System.out.println(student.roll);		Compilation Error
	 }

}

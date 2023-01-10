package org.student;

import org.department.Department;

public class Student extends Department {
public void studentName() {
	 System.out.println("Student Name is:Priya");

}
public void studentDept() {
	 
	System.out.println("Student Department is:ECE");
}
public void studentId() {
	 
	System.out.println("Student Id is:09ECE21");
}
public static void main(String[] args) {
	Student s1=new Student();
	s1.collegeName();
	s1.collegeCode();
	s1.collegeRank();
	
	s1.deptName();
	
	s1.studentName();
	s1.studentDept();
	s1.studentId();
	
}
}

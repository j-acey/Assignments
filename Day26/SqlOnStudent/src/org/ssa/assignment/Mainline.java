package org.ssa.assignment;

import java.sql.SQLException;
import java.util.ArrayList;

public class Mainline {
	
	public static void main(String[] args) throws SQLException {
//		Students students= new Students();
//	ArrayList<Student>	studentList = Students.getAll();
//	System.out.println("ID" + "\t" + "First Name" + "\t" + "Last Name" +"\t\t" + "SAT" +"\t \t" + "Major ID" +"\t " + "GPA");
//		for(Student st:studentList){
//			String msg= String.format("%3d     %-15s %-20s    %-4d            %d                %f", st.id, st.firstName, st.lastName, st.sat, st.majorId, st.gpa, "/n");
//			System.out.println(msg);
//		}
	
		
		Students students = new Students();
	    // retrieve a single student with id = 1
	    Student aStudent = students.getById(100);
	    // display the student
	    System.out.println(aStudent); // displays the student data in a formatted way
	    System.out.println();
	    // retrieve all the students into a collection
	    ArrayList<Student> allStudents = Students.getAll();
	    // iterate through the collection and display each student data in a formatted way
	    for(Student student : allStudents) {
	        System.out.println(student.toString());
	    }
	    System.out.println();

	    //insert method
	    Student bStudent = students.insert(810, "Bill", "Murray", 1050, 3.8, 2);
	    //ArrayList<Student> allStudents = Students.getAll();
	    allStudents = Students.getAll();
	    for(Student student : allStudents) {
	        System.out.println(student.toString());
	    }
	    System.out.println();

	    Student cStudent = students.delete(810); 
	    allStudents = Students.getAll();
	    for(Student student : allStudents) {
	        System.out.println(student.toString());
	}
	}
}
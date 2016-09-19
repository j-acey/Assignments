package org.ssa.assignment;

import java.sql.SQLException;
import java.util.ArrayList;

public class Mainline {
	
	public static void main(String[] args) throws SQLException {
		Students students= new Students();
	ArrayList<Student>	studentList = students.getAll();
	for(Student st:studentList){
		System.out.println(st.firstName +"        "+ st.lastName);
		
	}
	}

}

package org.ssa.assignment;

import java.sql.SQLException;
import java.util.ArrayList;

public class Students {
	
	static ConnectingDB tr= new ConnectingDB();
	
	public static ArrayList<Student> getAll() throws SQLException{
		
		return tr.getAllStudents();
		
	}

	public static Student getById(int id) throws SQLException{
		
		return tr.getStudentById(id);
		
	}
	
	
	public static Student insert(int id, String first_name, String last_name, int sat, double gpa, int major_id) throws SQLException{
		
		return tr.insertStudent( id, first_name, last_name, sat, gpa, major_id);
		
	}
	
	
	public static Student delete(int id) throws SQLException{
		
		return tr.deleteStudent(id);
		
	}
}

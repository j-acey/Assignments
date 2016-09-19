package org.ssa.assignment;

import java.sql.SQLException;
import java.util.ArrayList;

public class Students {
	
	static ConnectingDB tr= new ConnectingDB();
	
	public static ArrayList<Student> getAll() throws SQLException{
		
		return tr.getAllStudents();
		
	}

//	public static Student getStudentById() throws SQLException{
//		
//		return tr.getAllStudents();
//		
//	}
	
}

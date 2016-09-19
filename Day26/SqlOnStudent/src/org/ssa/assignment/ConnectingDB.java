package org.ssa.assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

public class ConnectingDB {
	
	static Connection myConn=null;
	static PreparedStatement myStmt=null;
	static Statement stmt = null;
	static ResultSet myRs=null;
	

	// Make Connection Method
		public static void makeConnection() throws FileNotFoundException, IOException, SQLException {
			Properties props = new Properties();
			props.load(new FileInputStream("student.properties"));
			String theUser = props.getProperty("user");
			String thePassword = props.getProperty("password");
			String theUrl = props.getProperty("url");
			myConn= (Connection)DriverManager.getConnection(theUrl, theUser, thePassword);
		}
	
		// Close Method
		public static void close() throws SQLException {
			if(myConn!=null)
				myConn.close();
			if(myStmt!=null)
				myStmt.close();
			if(myRs !=null)
				myRs.close();
		}
	
		public static ArrayList<Student> getAllStudents() throws SQLException{
			ArrayList<Student> studentList = new ArrayList<>();
			try{
				
				Student student;
				makeConnection();
				stmt= myConn.createStatement();
			
				myRs=	stmt.executeQuery("select * from student");
			
				while(myRs.next()){
					student = new Student();
					student.setId(myRs.getInt("id"));
					student.setFirstName(myRs.getString("first_name"));
					student.setLastName(myRs.getString("last_name"));
					student.setSat(myRs.getInt("sat"));
					student.setGpa(myRs.getDouble("gpa"));
					student.setMajorId(myRs.getInt("major_id"));
					studentList.add(student);
				}
					
				
			}catch(Exception ex){
				ex.printStackTrace();
			}finally{
				close();
			}
			
			return studentList;
		}
	
		
//		public static Student getStudentById(int){
//			try{
//				
//				Student student = new Student();
//				makeConnection();
//				stmt= myConn.prepareStatement();
//			
//				myRs=stmt.executeQuery("select * from student where id = 100");
//			
//				while(myRs.next()){
//					
//					student.setId(myRs.getInt("id"));
//					student.setFirstName(myRs.getString("first_name"));
//					student.setLastName(myRs.getString("last_name"));
//					student.setSat(myRs.getInt("sat"));
//					student.setGpa(myRs.getDouble("gpa"));
//					student.setMajorId(myRs.getInt("major_id"));
//					studentList.add(student);
//				}
//					
//			}catch(Exception ex){
//				ex.printStackTrace();
//			}finally{
//				close();
//			}
//	
//			return null;
//}
}

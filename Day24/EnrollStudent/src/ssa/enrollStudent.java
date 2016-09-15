package ssa;

import java.sql.*;
import java.io.FileInputStream;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class enrollStudent {
	
	static Connection myConn=null;
	static PreparedStatement myStmt=null;
	static ResultSet myRs=null;
	

	public static void main(String[] args) throws SQLException {

		//enroll();
		//print();
		assignClass();
		
	}
	
	
	// Make Connection Method
	public static void makeConnection() throws FileNotFoundException, IOException, SQLException {
		Properties props = new Properties();
		props.load(new FileInputStream("enroll.properties"));
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
	
		
	// Enroll Method
	public static void enroll() throws SQLException {
		try{
			makeConnection();
			myStmt= myConn.prepareStatement("insert into student values (?, ?, ?, ?, ?, ?)");
			
			// Set Parameter Values
			myStmt.setInt(1, 200);
			myStmt.setString(2,"Adam");
			myStmt.setString(3,"Zapel");
			myStmt.setInt(4, 1200);
			myStmt.setDouble(5, 3.0);
			myStmt.setInt(6, 3);
			myStmt.executeUpdate();
			
			myStmt.setInt(1, 210);
			myStmt.setString(2,"Graham");
			myStmt.setString(3,"Krakir");
			myStmt.setInt(4, 500);
			myStmt.setDouble(5, 2.5);
			myStmt.setInt(6, 7);
			myStmt.executeUpdate();
			
			myStmt.setInt(1, 220);
			myStmt.setString(2,"Ella");
			myStmt.setString(3,"Vader");
			myStmt.setInt(4, 800);
			myStmt.setDouble(5, 3.0);
			//myStmt.setNull(6, java.util.);
			myStmt.executeUpdate();
			
			myStmt.setInt(1, 230);
			myStmt.setString(2,"Stanley");
			myStmt.setString(3,"Kupp");
			myStmt.setInt(4, 1350);
			myStmt.setDouble(5, 3.3);
			myStmt.setInt(6, 5);
			myStmt.executeUpdate();
			
			myStmt.setInt(1, 240);
			myStmt.setString(2,"Lou");
			myStmt.setString(3,"Zar");
			myStmt.setInt(4, 950);
			myStmt.setDouble(5, 3.0);
			myStmt.setInt(6, 6);
			
			// Execute the Query
			myStmt.executeUpdate();
			System.out.println("5 new students have enrolled");
			
		}catch(Exception ex){
		}finally{
			close();
		}
	}
	

	
	// Assign Class Method
	public static void assignClass() throws SQLException {
		try{
			makeConnection();
			myStmt= myConn.prepareStatement("insert into student_class_relationship values (?, ?, ?)");
			
			// First Student
			myStmt.setInt(1, 2);
			myStmt.setInt(2, 200);
			myStmt.setInt(3, 10102);
			myStmt.executeUpdate();
		
			myStmt.setInt(1, 3);
			myStmt.setInt(2, 200);
			myStmt.setInt(3, 10101);
			myStmt.executeUpdate();
		
			myStmt.setInt(1, 4);
			myStmt.setInt(2, 200);
			myStmt.setInt(3, 10103);
			myStmt.executeUpdate();
		
			myStmt.setInt(1, 5);
			myStmt.setInt(2, 200);
			myStmt.setInt(3, 20201);
			myStmt.executeUpdate();
		
			// Second Student
			myStmt.setInt(1, 6);
			myStmt.setInt(2, 210);
			myStmt.setInt(3, 10102);
			myStmt.executeUpdate();
		
			myStmt.setInt(1, 7);
			myStmt.setInt(2, 210);
			myStmt.setInt(3, 10101);
			myStmt.executeUpdate();
		
			myStmt.setInt(1, 8);
			myStmt.setInt(2, 210);
			myStmt.setInt(3, 20201);
			myStmt.executeUpdate();
		
			myStmt.setInt(1, 9);
			myStmt.setInt(2, 210);
			myStmt.setInt(3, 20202);
			myStmt.executeUpdate();
			
			// Third Student
			myStmt.setInt(1, 10);
			myStmt.setInt(2, 220);
			myStmt.setInt(3, 10102);
			myStmt.executeUpdate();
		
			myStmt.setInt(1, 11);
			myStmt.setInt(2, 220);
			myStmt.setInt(3, 20201);
			myStmt.executeUpdate();
		
			myStmt.setInt(1, 12);
			myStmt.setInt(2, 220);
			myStmt.setInt(3, 20202);
			myStmt.executeUpdate();
		
			myStmt.setInt(1, 13);
			myStmt.setInt(2, 220);
			myStmt.setInt(3, 20203);
			myStmt.executeUpdate();
			
			// Fourth Student
			myStmt.setInt(1, 14);
			myStmt.setInt(2, 230);
			myStmt.setInt(3, 10102);
			myStmt.executeUpdate();
		
			myStmt.setInt(1, 15);
			myStmt.setInt(2, 230);
			myStmt.setInt(3, 20201);
			myStmt.executeUpdate();
		
			myStmt.setInt(1, 16);
			myStmt.setInt(2, 230);
			myStmt.setInt(3, 10103);
			myStmt.executeUpdate();
		
			myStmt.setInt(1, 17);
			myStmt.setInt(2, 230);
			myStmt.setInt(3, 30301);
			myStmt.executeUpdate();
			
			// Fifth Student
			myStmt.setInt(1, 18);
			myStmt.setInt(2, 240);
			myStmt.setInt(3, 30301);
			myStmt.executeUpdate();
		
			myStmt.setInt(1, 19);
			myStmt.setInt(2, 240);
			myStmt.setInt(3, 20201);
			myStmt.executeUpdate();
		
			myStmt.setInt(1, 20);
			myStmt.setInt(2, 240);
			myStmt.setInt(3, 30302);
			myStmt.executeUpdate();
		
			myStmt.setInt(1, 21);
			myStmt.setInt(2, 240);
			myStmt.setInt(3, 20202);
			myStmt.executeUpdate();
			//System.out.println("5 new students have enrolled");
			
		}catch(Exception ex){
		}finally{
			close();
		}
	}
	
	public static void print() {
		System.out.println("Education System - Enrollment Process");
		System.out.println("=====================================");
		System.out.println("Enrolled [full name] as a new student.");
		System.out.println("[full name] has an SAT score of [sat].");
		System.out.println("Assigned [full name] to the [major description] which requires a required SAT score of [major sat requried]");
		System.out.println("Enrolled [full name] in the following four classes:");
		System.out.println("1. [class name] required for major");
		System.out.println("2. [class name] required for major");
		System.out.println("3. [class name] elective (not required for major)");
		System.out.println("4. [class name] elective (not required for major)");
	}
	
	
}

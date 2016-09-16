package ssa;

import java.sql.*;
import java.io.FileInputStream;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.KeyRep.Type;
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

		enroll();
		assignClass();
		print();
			
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
			
			// First Student
			myStmt.setInt(1, 200);
			myStmt.setString(2,"Adam");
			myStmt.setString(3,"Zapel");
			myStmt.setInt(4, 1200);
			myStmt.setDouble(5, 3.0);
			myStmt.setInt(6, 3);
			myStmt.executeUpdate();
			
			// Second Student
			myStmt.setInt(1, 210);
			myStmt.setString(2,"Graham");
			myStmt.setString(3,"Krakir");
			myStmt.setInt(4, 500);
			myStmt.setDouble(5, 2.5);
			myStmt.setInt(6, 7);
			myStmt.executeUpdate();
			
			// Third Student
			myStmt.setInt(1, 220);
			myStmt.setString(2,"Ella");
			myStmt.setString(3,"Vader");
			myStmt.setInt(4, 800);
			myStmt.setDouble(5, 3.0);
			myStmt.setNull(6, Types.INTEGER);
			myStmt.executeUpdate();

			// Fourth Student
			myStmt.setInt(1, 230);
			myStmt.setString(2,"Stanley");
			myStmt.setString(3,"Kupp");
			myStmt.setInt(4, 1350);
			myStmt.setDouble(5, 3.3);
			myStmt.setInt(6, 5);
			myStmt.executeUpdate();
			
			// Fifth Student
			myStmt.setInt(1, 240);
			myStmt.setString(2,"Lou");
			myStmt.setString(3,"Zar");
			myStmt.setInt(4, 950);
			myStmt.setDouble(5, 3.0);
			myStmt.setInt(6, 6);
			
			// Execute the Query
			myStmt.executeUpdate();
			System.out.println("5 new students have enrolled, however, Ella is not qualified for the major requested and should select another.");
			System.out.println();
			
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
			myStmt.setInt(3, 30101);
			myStmt.executeUpdate();
		
			myStmt.setInt(1, 5);
			myStmt.setInt(2, 200);
			myStmt.setInt(3, 30202);
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
			myStmt.setInt(3, 50101);
			myStmt.executeUpdate();
		
			myStmt.setInt(1, 9);
			myStmt.setInt(2, 210);
			myStmt.setInt(3, 60221);
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
			myStmt.setInt(3, 50101);
			myStmt.executeUpdate();
		
			myStmt.setInt(1, 17);
			myStmt.setInt(2, 230);
			myStmt.setInt(3, 50102);
			myStmt.executeUpdate();
			
			// Fifth Student
			myStmt.setInt(1, 18);
			myStmt.setInt(2, 240);
			myStmt.setInt(3, 30101);
			myStmt.executeUpdate();
		
			myStmt.setInt(1, 19);
			myStmt.setInt(2, 240);
			myStmt.setInt(3, 20201);
			myStmt.executeUpdate();
		
			myStmt.setInt(1, 20);
			myStmt.setInt(2, 240);
			myStmt.setInt(3, 60221);
			myStmt.executeUpdate();
		
			myStmt.setInt(1, 21);
			myStmt.setInt(2, 240);
			myStmt.setInt(3, 60222);
			myStmt.executeUpdate();
			System.out.println("Each new student has registered for 4 classes.");
			System.out.println();
			
		}catch(Exception ex){
		}finally{
			close();
		}
	}
	
	public static void print() {
		System.out.println("Education System - Enrollment Process");
		System.out.println("=====================================");
		System.out.println("Enrolled Adam Zapel as a new student.");
		System.out.println("Adam Zapel has an SAT score of 1200.");
		System.out.println("Assigned Adam Zapel to the Finance which requires a required SAT score of 1100");
		System.out.println("Enrolled Adam Zapel in the following four classes:");
		System.out.println("1. English 101 required for Finance");
		System.out.println("2. English 102 required for Finance");
		System.out.println("3. History 101 elective (not required for Finance)");
		System.out.println("4. History 102 elective (not required for Finance)");
		System.out.println();
		System.out.println();
		System.out.println("Education System - Enrollment Process");
		System.out.println("=====================================");
		System.out.println("Enrolled Graham	Krakir as a new student.");
		System.out.println("Graham Krakir has an SAT score of 500.");
		System.out.println("Assigned Graham Krakir to the General Studies which requires a required SAT score of 500");
		System.out.println("Enrolled Graham Krakir in the following four classes:");
		System.out.println("1. English 101 required for General Studies");
		System.out.println("2. English 102 required for General Studies");
		System.out.println("3. Pyschology 101 elective (not required for General Studies)");
		System.out.println("4. Education 221 elective (not required for General Studies)");
		System.out.println();
		System.out.println();
		System.out.println("Education System - Enrollment Process");
		System.out.println("=====================================");
		System.out.println("Enrolled Ella Vader as a new student.");
		System.out.println("Ella Vader has an SAT score of [sat].");
		System.out.println("Assigned Ella Vader to no major");
		System.out.println("Enrolled Ella Vader in the following four classes:");
		System.out.println("1. English 102 elective (not required for major)");
		System.out.println("2. Math 201 elective (not required for major)");
		System.out.println("3. Math 202 elective (not required for major)");
		System.out.println("4. Math 203 elective (not required for major)");
		System.out.println();
		System.out.println();
		System.out.println("Education System - Enrollment Process");
		System.out.println("=====================================");
		System.out.println("Enrolled Stanley Kupp as a new student.");
		System.out.println("Stanley Kupp has an SAT score of 1350.");
		System.out.println("Assigned Stanley Kupp to the Engineering which requires a required SAT score of 1350");
		System.out.println("Enrolled Stanley Kupp in the following four classes:");
		System.out.println("1. English 102 required for Engineering");
		System.out.println("2. Math 201 required for Engineering");
		System.out.println("3. Pyschology 101 elective (not required for Engineering)");
		System.out.println("4. Pyschology 102 elective (not required for Engineering)");
		System.out.println();
		System.out.println();
		System.out.println("Education System - Enrollment Process");
		System.out.println("=====================================");
		System.out.println("Enrolled Lou Zar as a new student.");
		System.out.println("Lou Zar has an SAT score of 950.");
		System.out.println("Assigned Lou Zar to the Education which requires a required SAT score of 900");
		System.out.println("Enrolled Lou Zar in the following four classes:");
		System.out.println("1. History 101 required for Education");
		System.out.println("2. Math 201 required for Education");
		System.out.println("3. Education 221 elective (not required for Education)");
		System.out.println("4. Education 222 elective (not required for Education)");
		System.out.println();
		System.out.println();
	}
	
}

package org.ssa.assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
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
	
		// Get all students method
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
	
		// Get student by selecting id
		public static Student getStudentById(int id) throws SQLException{
			Student student = null;
			try{
				//create a student object
				student = new Student();
				makeConnection();
				myStmt= myConn.prepareStatement("select * from student where id = ?");
				myStmt.setInt(1, id);
				
				myRs = myStmt.executeQuery();
				while(myRs.next()){
					student.setId(myRs.getInt("id"));
					student.setFirstName(myRs.getString("first_name"));
					student.setLastName(myRs.getString("last_name"));
					student.setSat(myRs.getInt("sat"));
					student.setGpa(myRs.getDouble("gpa"));
					student.setMajorId(myRs.getInt("major_id"));
				}
			}catch(Exception ex){
				ex.printStackTrace();
			}finally{
				//close();
			}
		return student;
		}
		
		
		// Insert Method
		public static Student insertStudent(int id, String first_name, String last_name, int sat, double gpa, int major_id) throws SQLException{
			Student student = null;
			try{
				//create a student object
				student = new Student();
				makeConnection();
				myStmt= myConn.prepareStatement("insert into student values (?,?,?,?,?,?)");
				myStmt.setInt(1, id);
				myStmt.setString(2, first_name);
				myStmt.setString(3, last_name);
				myStmt.setInt(4, sat);
				myStmt.setDouble(5, gpa);
				myStmt.setNull(6, Types.INTEGER);
				
				myStmt.executeUpdate();
//				while(myRs.next()){
//					student.setId(myRs.getInt("id"));
//					student.setFirstName(myRs.getString("first_name"));
//					student.setLastName(myRs.getString("last_name"));
//					student.setSat(myRs.getInt("sat"));
//					student.setGpa(myRs.getDouble("gpa"));
//					student.setMajorId(myRs.getInt("major_id"));
//				}
			}catch(Exception ex){
				ex.printStackTrace();
			}finally{
				close();
			}
		return student;
		}
		
		
		// Delete Method
				public static Student deleteStudent(int id) throws SQLException{
					Student student = null;
					try{
						//create a student object
						student = new Student();
						makeConnection();
						myStmt= myConn.prepareStatement("delete from student where id = ?");
						myStmt.setInt(1, id);

						
						myStmt.executeUpdate();
//						while(myRs.next()){
//							student.setId(myRs.getInt("id"));
//							student.setFirstName(myRs.getString("first_name"));
//							student.setLastName(myRs.getString("last_name"));
//							student.setSat(myRs.getInt("sat"));
//							student.setGpa(myRs.getDouble("gpa"));
//							student.setMajorId(myRs.getInt("major_id"));
//						}
					}catch(Exception ex){
						ex.printStackTrace();
					}finally{
						close();
					}
				return student;
				}
}

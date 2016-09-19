package ssa;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.*;

public class SqlDB {
	static Connection myConn=null;
	static PreparedStatement myStmt=null;
	static ResultSet myRs=null;
	

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

		public ResultSet executeQuery() {
			// TODO Auto-generated method stub
			return null;
		}
}
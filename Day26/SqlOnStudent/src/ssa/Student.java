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


public class Student {

	public String firstName;
	public int id;
	public String lastName;
	public double gpa;
	public int sat;

	
	@Override
	public String toString() {
		String msg = String.format("%3d %-20s %4.2f %4d",
				this.id,
				this.firstName + " " + this.lastName,
				this.gpa,
				this.sat);
		return msg;
	}
	// private project constructor - call Students.createInstance()
	Student() {
		
	}
	
}

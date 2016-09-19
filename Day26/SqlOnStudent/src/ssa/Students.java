package ssa;

import java.sql.*;
import java.util.*;

public class Students extends HashMap<Integer, Student> {
	static Connection myConn=null;
	static PreparedStatement myStmt=null;
	static ResultSet myRs=null;
	SqlDB db = null;
	
	
	public Student getById(int id) {
		List<Student> students = select("SELECT * from student where id = " + id);
		if(students.isEmpty())
			return null;
		return students.get(0);
	}
	
	public List<Student> getAllStudents() {
		return select("SELECT * from student");
	
		public List<Student> select(String sql) {
			ArrayList<Student> students = new ArrayList<Student>();
			try {
				ResultSet myRs = db.executeQuery();
				while(myRs.next()) {
					Student student = loadStudent(myRs);
					students.add(student);
				}
				return students;
			} catch (Exception ex) { ex.printStackTrace(); }
			return null;
		}
		
		
		private Student loadStudent(ResultSet rs) {
			Student student = new Student();
			try {
				student.id = rs.getInt("id");
				student.firstName = rs.getString("first_name");
				student.lastName = rs.getString("last_name");
				student.gpa = rs.getDouble("gpa");
				student.sat = rs.getInt("sat");
				return student;
			} catch (SQLException ex) { ex.printStackTrace(); }
			return null;
		}
		
}
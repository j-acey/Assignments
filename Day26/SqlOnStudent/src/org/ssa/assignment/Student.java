package org.ssa.assignment;

public class Student {

	public String firstName;
	public int id;
	public String lastName;
	public double gpa;
	public int sat;
	public int majorId;
	
	
	public Student () {
		
	}
	/**
	 * @param firstName
	 * @param id
	 * @param lastName
	 * @param gpa
	 * @param sat
	 */
	public Student(String firstName, int id, String lastName, double gpa, int sat) {
		super();
		this.firstName = firstName;
		this.id = id;
		this.lastName = lastName;
		this.gpa = gpa;
		this.sat = sat;
		
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the gpa
	 */
	public double getGpa() {
		return gpa;
	}
	/**
	 * @param gpa the gpa to set
	 */
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	/**
	 * @return the sat
	 */
	public int getSat() {
		return sat;
	}
	/**
	 * @param sat the sat to set
	 */
	public void setSat(int sat) {
		this.sat = sat;
	}
	/**
	 * @return the majorId
	 */
	public int getMajorId() {
		return majorId;
	}
	/**
	 * @param majorId the majorId to set
	 */
	public void setMajorId(int majorId) {
		this.majorId = majorId;
	}

	
	

}

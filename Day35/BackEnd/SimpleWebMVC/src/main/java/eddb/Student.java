package eddb;

public class Student {

	int id;
	String first_name;
	String last_name;
	int sat;
	double gpa;
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
	 * @return the first_name
	 */
	public String getFirst_name() {
		return first_name;
	}
	/**
	 * @param first_name the first_name to set
	 */
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	/**
	 * @return the last_name
	 */
	public String getLast_name() {
		return last_name;
	}
	/**
	 * @param last_name the last_name to set
	 */
	public void setLast_name(String last_name) {
		this.last_name = last_name;
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
	 * @param id
	 * @param first_name
	 * @param last_name
	 * @param sat
	 * @param gpa
	 */
	public Student(String first_name, String last_name, int sat, double gpa) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.sat = sat;
		this.gpa = gpa;
	}
	
	
	

}

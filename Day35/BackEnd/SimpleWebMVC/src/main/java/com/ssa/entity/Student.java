package com.ssa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="student")
	public class Student {

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="id")
		private int id;
		
		@Column(name="first_name")
		private String first_name;
		
		@Column(name="last_name")
		private String last_name;
		
		@Column(name="gpa")
		private double gpa;
		
		@Column(name="sat")
		private int sat;
		
		@Column(name="major_id")
		private Integer major_id;
		
		
	
	public Student(){}

	/**
	 * @param first_name
	 * @param last_name
	 * @param gpa
	 * @param sat
	 */
	public Student(String first_name, String last_name, double gpa, int sat, Integer major_id) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.gpa = gpa;
		this.sat = sat;
		this.major_id = major_id;
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
	 * @return the major_id
	 */
	public Integer getMajor_id() {
		return major_id;
	}

	/**
	 * @param major_id the major_id to set
	 */
	public void setMajor_id(Integer major_id) {
		this.major_id = major_id;
	}
	
	
	
}

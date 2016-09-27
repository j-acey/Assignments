package ssa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="major")


public class Major {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="description")
	private String description;
	
	@Column(name="req_sat")
	private int req_sat;
	
	
	public Major(){}


	/**
	 * @param id
	 * @param description
	 * @param req_sat
	 */
	public Major(int id, String description, int req_sat) {
		super();
		this.id = id;
		this.description = description;
		this.req_sat = req_sat;
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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}


	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}


	/**
	 * @return the req_sat
	 */
	public int getReq_sat() {
		return req_sat;
	}


	/**
	 * @param req_sat the req_sat to set
	 */
	public void setReq_sat(int req_sat) {
		this.req_sat = req_sat;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Major [id=" + id + ", description=" + description + ", req_sat=" + req_sat + "]";
	}
	
	
	
	
	


}

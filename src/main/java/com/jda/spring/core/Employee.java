package com.jda.spring.core;

public class Employee {
	int id;
	String fname;
	String lname;
	String mailId;
	
	public Employee(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
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
	 * @return the mailId
	 */
	public String getmailId() {
		return mailId;
	}

	/**
	 * @param mailId the mailId to set
	 */
	public void setmailId(String mailId) {
		this.mailId = mailId;
	}

	/**
	 * @return the fname
	 */
	public String getFname() {
		return fname;
	}

	/**
	 * @return the lname
	 */
	public String getLname() {
		return lname;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", fname=" + fname + ", lname=" + lname + ", mailId=" + mailId + "]";
	}
	
	
}

package com.ydev.management.dao;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="clients")

public class Client implements Serializable {



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String lname;
	
	private String fname;
	
	@Column(unique = true)
	private String email;
	
	private String bday;
	
	public Client(int id, String lname, String fname, String email, String bday) {
		super();
		this.id = id;
		this.lname = lname;
		this.fname = fname;
		this.email = email;
		this.bday = bday;
	}

	public Client() {
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", lname=" + lname + ", fname=" + fname + ", email=" + email + ", bday=" + bday
				+ "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBday() {
		return bday;
	}

	public void setBday(String bday) {
		this.bday = bday;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}

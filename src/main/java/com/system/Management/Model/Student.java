package com.system.Management.Model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable = false,length = 40)
	private String admno;
	
	@Column(nullable = false,length = 40)
	private String fname;
	
	@Column(nullable = false,length = 40)
	private String lname;
	
	@Column(nullable = false,length = 40)
	private String addr;
	
	@Column(nullable = false,length = 40)
	private int telno;
	
	@Column(nullable = false,length = 40)
	private String cname;
	
	@Column(nullable = false,length = 40)
	private String gender;

	@Column(nullable = false,length = 40)
	private Date dob;

	public Student() {

	}

	public Student(long id, String admno, String fname, String lname, String addr, int telno, String cname,
			String gender, Date dob) {
		super();
		this.id = id;
		this.admno = admno;
		this.fname = fname;
		this.lname = lname;
		this.addr = addr;
		this.telno = telno;
		this.cname = cname;
		this.gender = gender;
		this.dob = dob;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAdmno() {
		return admno;
	}

	public void setAdmno(String admno) {
		this.admno = admno;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public int getTelno() {
		return telno;
	}

	public void setTelno(int telno) {
		this.telno = telno;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	
}

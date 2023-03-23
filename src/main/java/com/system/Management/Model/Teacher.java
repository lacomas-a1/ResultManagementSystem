package com.system.Management.Model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "teacher")
public class Teacher {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false,length = 40)
	private int idno;
	
	@Column(nullable = false,length = 40)
	private String fname;
	
	@Column(nullable = false,length = 40)
	private String lname;
	
	@Column(nullable = false,length = 40)
	private String email;
	
	@Column(nullable = false,length = 40)
	private String sname;
	
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

	public Teacher() {
		
	}

	public Teacher(Long id, int idno, String fname, String lname, String email, String sname, String addr, int telno,
			String cname, String gender, Date dob) {
		this.id = id;
		this.idno = idno;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.sname = sname;
		this.addr = addr;
		this.telno = telno;
		this.cname = cname;
		this.gender = gender;
		this.dob = dob;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getIdno() {
		return idno;
	}

	public void setIdno(int idno) {
		this.idno = idno;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
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

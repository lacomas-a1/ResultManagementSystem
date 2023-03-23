package com.system.Management.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "result")
public class Result {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false,length = 40)
	private int marks;
	
	@Column(nullable = false,length = 40)
	private String cname;
	
	@Column(nullable = false,length = 40)
	private String sname;

	@Column(nullable = false,length = 40)
	private String ename;
	
	@Column(nullable = false,length = 40)
	private String admno;

	public Result() {

	}

	public Result(Long id, int marks, String cname, String sname, String ename, String admno) {
		this.id = id;
		this.marks = marks;
		this.cname = cname;
		this.sname = sname;
		this.ename = ename;
		this.admno = admno;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getAdmno() {
		return admno;
	}

	public void setAdmno(String admno) {
		this.admno = admno;
	}	

}

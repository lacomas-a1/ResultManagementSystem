package com.system.Management.Model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "exam")
public class Exam {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable = false,length = 40)
	private String cname;
	
	@Column(nullable = false,length = 40)
	private String sname;

	@Column(nullable = false,length = 40)
	private String ename;
	
	@Column(nullable = false,length = 40)
	private Date edate;

	public Exam() {

	}

	public Exam(long id, String cname, String sname, String ename, Date edate) {
		super();
		this.id = id;
		this.cname = cname;
		this.sname = sname;
		this.ename = ename;
		this.edate = edate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public Date getEdate() {
		return edate;
	}

	public void setEdate(Date edate) {
		this.edate = edate;
	}
	
	

}

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
	private String cname;
	
	@Column(nullable = false,length = 40)
	private String ename;
	
	@Column(nullable = false,length = 40)
	private String admno;
	
	//All the subjects
	
	@Column(nullable = false,length = 40)
	private int maths;
	
	@Column(nullable = false,length = 40)
	private int eng;
	
	@Column(nullable = false,length = 40)
	private int kisw;
	
	@Column(nullable = false,length = 40)
	private int soc;
	
	@Column(nullable = false,length = 40)
	private int sci;
	
	@Column(nullable = false,length = 40)
	private double mathsPercent;
	
	@Column(nullable = false,length = 40)
	private double engPercent;
	
	@Column(nullable = false,length = 40)
	private double kiswPercent;
	
	@Column(nullable = false,length = 40)
	private double socPercent;
	
	@Column(nullable = false,length = 40)
	private double sciPercent;
	
	@Column(nullable = false,length = 40)
	private int total;
	
	@Column(nullable = false,length = 40)
	private double average;

	public Result() {

	}

	

}

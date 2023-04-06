package com.system.Management.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "lowerresult")
public class LowerPrimary {
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
	private int eng;
	
	@Column(nullable = false,length = 40)
	private int math;
	
	@Column(nullable = false,length = 40)
	private int kisw;
	
	@Column(nullable = false,length = 40)
	private int env;
	
	@Column(nullable = false,length = 40)
	private int art;
	
	@Column(nullable = false,length = 40)
	private int musc;
	
	@Column(nullable = false,length = 40)
	private int hna;
	
	@Column(nullable = false,length = 40)
	private int ma;
	
	@Column(nullable = false,length = 40)
	private int re;
	
	@Column(nullable = false,length = 40)
	private double mathPercent;
	
	@Column(nullable = false,length = 40)
	private double engPercent;
	
	@Column(nullable = false,length = 40)
	private double kiswPercent;
	
	@Column(nullable = false,length = 40)
	private double envPercent;
	
	@Column(nullable = false,length = 40)
	private double artPercent;
	
	@Column(nullable = false,length = 40)
	private double muscPercent;
	
	@Column(nullable = false,length = 40)
	private double hnaPercent;
	
	@Column(nullable = false,length = 40)
	private double maPercent;
	
	@Column(nullable = false,length = 40)
	private double rePercent;
	
	@Column(nullable = false,length = 40)
	private int total;
	
	@Column(nullable = false,length = 40)
	private double average;
	
	@Column(nullable = false,length = 40)
	private String grade;

	public LowerPrimary() {

	}

	public LowerPrimary(Long id, String cname, String ename, String admno, int eng, int math, int kisw, int env,
			int art, int musc, int hna, int ma, int re, double mathPercent, double engPercent, double kiswPercent,
			double envPercent, double artPercent, double muscPercent, double hnaPercent, double maPercent,
			double rePercent, int total, double average, String grade) {
		this.id = id;
		this.cname = cname;
		this.ename = ename;
		this.admno = admno;
		this.eng = eng;
		this.math = math;
		this.kisw = kisw;
		this.env = env;
		this.art = art;
		this.musc = musc;
		this.hna = hna;
		this.ma = ma;
		this.re = re;
		this.mathPercent = (math / 100.0) * 100.0;
		this.engPercent = (eng / 100.0) * 100.0;
		this.kiswPercent = (kisw / 100.0) * 100.0;
		this.envPercent = (env / 100.0) * 100.0;
		this.artPercent = (art / 100.0) * 100.0;
		this.muscPercent = (musc / 100.0) * 100.0;
		this.hnaPercent = (hna / 100.0) * 100.0;
		this.maPercent = (ma / 100.0) * 100.0;
		this.rePercent = (re / 100.0) * 100.0;
		this.total = math + eng + kisw + env + ma + re + hna + musc + art ;
		this.average = total / 9.0;;
		this.grade = grade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
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

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getKisw() {
		return kisw;
	}

	public void setKisw(int kisw) {
		this.kisw = kisw;
	}

	public int getEnv() {
		return env;
	}

	public void setEnv(int env) {
		this.env = env;
	}

	public int getArt() {
		return art;
	}

	public void setArt(int art) {
		this.art = art;
	}

	public int getMusc() {
		return musc;
	}

	public void setMusc(int musc) {
		this.musc = musc;
	}

	public int getHna() {
		return hna;
	}

	public void setHna(int hna) {
		this.hna = hna;
	}

	public int getMa() {
		return ma;
	}

	public void setMa(int ma) {
		this.ma = ma;
	}

	public int getRe() {
		return re;
	}

	public void setRe(int re) {
		this.re = re;
	}

	public double getMathPercent() {
		return mathPercent;
	}

	public void setMathPercent(double mathPercent) {
		this.mathPercent = mathPercent;
	}

	public double getEngPercent() {
		return engPercent;
	}

	public void setEngPercent(double engPercent) {
		this.engPercent = engPercent;
	}

	public double getKiswPercent() {
		return kiswPercent;
	}

	public void setKiswPercent(double kiswPercent) {
		this.kiswPercent = kiswPercent;
	}

	public double getEnvPercent() {
		return envPercent;
	}

	public void setEnvPercent(double envPercent) {
		this.envPercent = envPercent;
	}

	public double getArtPercent() {
		return artPercent;
	}

	public void setArtPercent(double artPercent) {
		this.artPercent = artPercent;
	}

	public double getMuscPercent() {
		return muscPercent;
	}

	public void setMuscPercent(double muscPercent) {
		this.muscPercent = muscPercent;
	}

	public double getHnaPercent() {
		return hnaPercent;
	}

	public void setHnaPercent(double hnaPercent) {
		this.hnaPercent = hnaPercent;
	}

	public double getMaPercent() {
		return maPercent;
	}

	public void setMaPercent(double maPercent) {
		this.maPercent = maPercent;
	}

	public double getRePercent() {
		return rePercent;
	}

	public void setRePercent(double rePercent) {
		this.rePercent = rePercent;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

}

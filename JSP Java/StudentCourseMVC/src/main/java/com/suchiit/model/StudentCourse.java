package com.suchiit.model;

public class StudentCourse {

	private String sname;
	private String sadd;
	private String email;
	
	private String cname;
	private String cduration;
	private String cfee;
	private int cid;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSadd() {
		return sadd;
	}
	public void setSadd(String sadd) {
		this.sadd = sadd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCduration() {
		return cduration;
	}
	public void setCduration(String cduration) {
		this.cduration = cduration;
	}
	public String getCfee() {
		return cfee;
	}
	public void setCfee(String cfee) {
		this.cfee = cfee;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public StudentCourse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentCourse(String sname, String sadd, String email, String cname, String cduration, String cfee,
			int cid) {
		super();
		this.sname = sname;
		this.sadd = sadd;
		this.email = email;
		this.cname = cname;
		this.cduration = cduration;
		this.cfee = cfee;
		this.cid = cid;
	}
	
	
}

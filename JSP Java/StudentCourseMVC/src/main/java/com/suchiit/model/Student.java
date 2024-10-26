package com.suchiit.model;

public class Student {

	private int sid;
	private String sname;
	private String sadd;
	private String email;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
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
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sid, String sname, String sadd, String email) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sadd = sadd;
		this.email = email;
	}
	
}

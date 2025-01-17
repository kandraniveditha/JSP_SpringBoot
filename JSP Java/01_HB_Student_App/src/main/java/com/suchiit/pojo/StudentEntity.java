package com.suchiit.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT")
public class StudentEntity {
	@Id
	@Column(name="SNO")
private int sno;
	
	@Column(name="SNAME")
private String sname;
	
	@Column(name="SADD")
private String sadd;
public int getSno() {
	return sno;
}
public void setSno(int sno) {
	this.sno = sno;
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
public StudentEntity() {
	super();
	// TODO Auto-generated constructor stub
}
public StudentEntity(int sno, String sname, String sadd) {
	super();
	this.sno = sno;
	this.sname = sname;
	this.sadd = sadd;
}

}

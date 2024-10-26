package com.suchiit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="EMPLOYEE")
@NamedQuery(name="find.all", query="from EmployeeEntity")
public class EmployeeEntity {

	@Id
	@Column(name="ENO")
	@GenericGenerator(name = "myGenerator",strategy="native")
	@GeneratedValue(generator="myGenerator",strategy=GenerationType.AUTO)
	private int eno;
	
	@Column(name="FIRSTNAME")
	private String firstName;
	
	@Column(name="LASTNAME")
	private String lastNanme;

	@Column(name="EMAIL")
	private String email;
	
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastNanme() {
		return lastNanme;
	}
	public void setLastNanme(String lastNanme) {
		this.lastNanme = lastNanme;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public EmployeeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeEntity(int eno, String firstName, String lastNanme, String email) {
		super();
		this.eno = eno;
		this.firstName = firstName;
		this.lastNanme = lastNanme;
		this.email = email;
	}
	
	
}

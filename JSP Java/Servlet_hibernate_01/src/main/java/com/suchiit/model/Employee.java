package com.suchiit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE")
public class Employee {
	
@Id
@Column(name="EID")
		private int eid;

@Column(name="FNAME")
		private String fname;

@Column(name="LNAME")
		private String lname;

@Column(name="EAMIL")
		private String email;

@Column(name="EPHNO")
		private String ephno;

		public int getEid() {
			return eid;
		}
		public void setEid(int eid) {
			this.eid = eid;
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
		public String getEphno() {
			return ephno;
		}
		public void setEphno(String ephno) {
			this.ephno = ephno;
		}
		public Employee(int eid, String fname, String lname, String email, String ephno) {
			super();
			this.eid = eid;
			this.fname = fname;
			this.lname = lname;
			this.email = email;
			this.ephno = ephno;
		}
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		
		
		
	}

}

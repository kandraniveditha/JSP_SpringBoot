package com.suchiit.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COURSE")
public class CourseEntity {

	@Id
	@Column(name="CID")
	private int cid;
	private String cname;
	private String cduration;
	private String cfee;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
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
	public CourseEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CourseEntity(int cid, String cname, String cduration, String cfee) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cduration = cduration;
		this.cfee = cfee;
	}
	
}

package com.mappings;

import javax.persistence.*;

@Entity
public class Students {

	@Id
	private int sId;
	@Column(name ="Student_name")
	private String name;
	private String city;
	@OneToOne
	private Subject subject;
	
	
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public Students(int sId, String name, String city, Subject subject) {
		super();
		this.sId = sId;
		this.name = name;
		this.city = city;
		this.subject = subject;
	}
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Students [sId=" + sId + ", name=" + name + ", city=" + city + ", subject=" + subject + "]";
	}
	
	
}

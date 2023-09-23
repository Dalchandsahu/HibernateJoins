package com.mappings;

import javax.persistence.*;

@Entity
public class Subject {

	@Id
	private int sub_id;
	private String Sub_name;
	
	public int getSub_id() {
		return sub_id;
	}
	public void setSub_id(int sub_id) {
		this.sub_id = sub_id;
	}
	public String getSub_name() {
		return Sub_name;
	}
	public void setSub_name(String sub_name) {
		Sub_name = sub_name;
	}
	public Subject(int sub_id, String sub_name) {
		super();
		this.sub_id = sub_id;
		Sub_name = sub_name;
	}
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Subject [sub_id=" + sub_id + ", Sub_name=" + Sub_name + "]";
	}
	
	
	
	
	
}

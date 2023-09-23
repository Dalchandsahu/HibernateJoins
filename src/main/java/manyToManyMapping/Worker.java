package manyToManyMapping;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Worker {

	@Id
	private int Wid;
	private String name;
	@ManyToMany
	@JoinTable(name ="Work_Poject")
	private List<Project> projects;
	public int getWid() {
		return Wid;
	}
	public void setWid(int wid) {
		Wid = wid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	public Worker(int wid, String name, List<Project> projects) {
		super();
		Wid = wid;
		this.name = name;
		this.projects = projects;
	}
	public Worker() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Worker [Wid=" + Wid + ", name=" + name + ", projects=" + projects + "]";
	}
	
	
}

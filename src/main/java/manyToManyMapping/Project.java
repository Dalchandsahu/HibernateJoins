package manyToManyMapping;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Project {

	@Id
	private int pid;
	private String projectName;
	@ManyToMany(mappedBy = "projects")
	private List<Worker> workers;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public List<Worker> getWorkers() {
		return workers;
	}
	public void setWorkers(List<Worker> workers) {
		this.workers = workers;
	}
	public Project(int pid, String projectName, List<Worker> workers) {
		super();
		this.pid = pid;
		this.projectName = projectName;
		this.workers = workers;
	}
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Project [pid=" + pid + ", projectName=" + projectName + ", workers=" + workers + "]";
	}
	
	
	
}

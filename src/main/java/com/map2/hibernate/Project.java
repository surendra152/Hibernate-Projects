package com.map2.hibernate;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	
	@Id
	private int id;
	
	@Column(name="project_name")
	private String projectName;
	
	@ManyToMany(mappedBy = "project")
	private List<Emp> emps;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return projectName;
	}

	public void setName(String name) {
		this.projectName = name;
	}

	public List<Emp> getEmps() {
		return emps;
	}

	public void setEmps(List<Emp> emps) {
		this.emps = emps;
	}

	public Project(int id, String name, List<Emp> emps) {
		super();
		this.id = id;
		this.projectName = name;
		this.emps = emps;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}

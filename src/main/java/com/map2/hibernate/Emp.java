package com.map2.hibernate;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Emp {
	
	@Id
	private int id;
	private String name;
	
	@ManyToMany
	@JoinTable
	(
			name="emp_learn",
			joinColumns = {@JoinColumn(name="eid")},
			inverseJoinColumns = {@JoinColumn(name="pid")}
	)
	private List<Project> project;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Project> getProject() {
		return project;
	}

	public void setProject(List<Project> project) {
		this.project = project;
	}

	public Emp(int id, String name, List<Project> project) {
		super();
		this.id = id;
		this.name = name;
		this.project = project;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}


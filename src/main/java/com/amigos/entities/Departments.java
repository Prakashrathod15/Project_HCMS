package com.amigos.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Departments")
public class Departments {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="DepartmentID")
	private int departmentId;
	@Column(name="DepartmentName")
	private String departmentName;
	@Column(name="Description")
	private String description;
	
	
	public Departments()
	{
		
	}


	public Departments(int departmentId, String departmentName, String description) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.description = description;
	}


	public int getDepartmentId() {
		return departmentId;
	}


	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}


	public String getDepartmentName() {
		return departmentName;
	}


	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	
	

}

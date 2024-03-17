package com.amigos.entities;

import org.hibernate.annotations.Tables;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Roles")
public class Roles {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column(name="RoleID")
	private int roleId;
	@Column(name="RoleName")
	private String roleName;
	@Column(name="Description")
	private String description;
	
	public Roles()
	{
		
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	

}

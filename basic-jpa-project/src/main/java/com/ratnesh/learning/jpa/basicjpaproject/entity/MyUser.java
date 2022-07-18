package com.ratnesh.learning.jpa.basicjpaproject.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MyUser {
	
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String role;
	
	protected MyUser()
	{
		
	}
	public MyUser(String userName, String userRole) {
		super();
		this.name = userName;
		this.role = userRole;
	}
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getRole() {
		return role;
	}
	@Override
	public String toString() {
		return "MyUser [id=" + id + ", name=" + name + ", role=" + role + "]";
	}

	

}

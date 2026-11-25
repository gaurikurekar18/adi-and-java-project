package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employees_info")
public class Employee {
	
	//it must have primary key column
	@Id
	@Column(name="emp_id")
	private int id;
	
	@Column(name="emp_name")
	private String name;
	
	@Column(name="emp_email",unique=true)
	private String email;
	
	@Column(name="emp_dep")
	private String dep;
	
	@Column(name="emp_salary")
	private double salary;
	
	@Column(name="emp_gender")
	private String gender;

}

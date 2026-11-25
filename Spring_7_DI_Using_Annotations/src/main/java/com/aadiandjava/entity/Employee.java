package com.aadiandjava.entity;

public class Employee {
	
	private int id;
	
	private int name;
	
	private String dep;
	
	private double salary;
	
	private String gender;
	
	private String address;
	
	

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String dep, double salary, String gender, String address) {
		super();
		this.id = id;
		this.name=name;
		this.dep = dep;
		this.salary = salary;
		this.gender = gender;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public int getname() {
     return name;
	}
	public void setname(int name) {
		this.name=name;
	}

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}

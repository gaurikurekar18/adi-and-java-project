package com.List;

public class Teacher {
	
	private int id;
	private String name;
	private int rollNo;
	private int age;
	private String Address;
	private String Branch;
	
	
	public Teacher(int id, String name, int rollNo, int age, String address, String branch) {
		super();
		this.id = id;
		this.name = name;
		this.rollNo = rollNo;
		this.age = age;
		Address = address;
		Branch = branch;
	}


	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", rollNo=" + rollNo + ", age=" + age + ", Address=" + Address
				+ ", Branch=" + Branch + "]";
	}
	
	
	
	
	
	
	

}

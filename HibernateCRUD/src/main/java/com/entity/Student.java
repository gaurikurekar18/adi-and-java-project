//package com.entity;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//
//
//
//@Entity
//public class Student {
//	@Id
//	private int id;
//	private String name;
//	private  String email;
//	private String marks;
//	private String fees;
//	private String address;
//
//}



package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

    @Id
    private int id;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMarks() {
		return marks;
	}

	public void setMarks(String marks) {
		this.marks = marks;
	}

	public String getFees() {
		return fees;
	}

	public void setFees(String fees) {
		this.fees = fees;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	private String name;
    private String email;
    private String marks;
    private String fees;
    private String address;

    public Student() {
    }
}

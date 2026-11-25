package com.List;

public class Student {
	
	private int id;
	
	private String name;
	
	private String address;
	
	//**********METHOD**************
	void display()
	{
		System.out.println("ID:"+id);
		System.out.println("Name:"+name);
		System.out.println("Address:"+address);
		System.out.println("==============================");
	}
	
	
//***********CONSTRUCTOR USE***********
	public Student(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
public Student() {
		// TODO Auto-generated constructor stub
	}


	//*************GETERSETER USE**************
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

  //   object class method
 //	  convert object address into string
 //   @Override
//	  public String toString() {
//	  return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
//	}
	
	

}

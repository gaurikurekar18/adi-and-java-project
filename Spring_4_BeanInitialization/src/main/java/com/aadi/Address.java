package com.aadi;

public class Address {
	
	String areaName;
	
	String city;
	
	String state;
	
	int pincode;
	
	String floor;
	
	String buildingName;

	public void setAreaName(String areaName) {
	    this.areaName = areaName;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	
	void displayAddress()
	{
		System.out.println("Area="+areaName);
		System.out.println("City="+city);
		System.out.println("State="+state);
		System.out.println("Pincode="+pincode);
		System.out.println("Floor="+floor);
		System.out.println("Building="+buildingName);
		
	}

}

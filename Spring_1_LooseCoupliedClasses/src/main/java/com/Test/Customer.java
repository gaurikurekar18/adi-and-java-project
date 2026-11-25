package com.Test;

public class Customer {
	
	private Order order;
	
	public void setOrder(Order order)
	{
		this.order = order;
	}
	
	public void map()
	{
		order.left();
	}

}

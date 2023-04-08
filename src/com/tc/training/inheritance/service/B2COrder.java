package com.tc.training.inheritance.service;

import com.tc.training.inheritance.templates.Order;

public class B2COrder extends Order {

	private String customerName;
	
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	@Override
	public String getOrderType() {
		return "B2COrder";
	}
	
	@Override
	public String toString() {
		return getOrderType() + " was taken from " + customerName + " with id " + getId() + " on " + getDate()
				+ " on the Value of " + getAmount()+".";
	}


}

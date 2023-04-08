package com.tc.training.inheritance.service;

import com.tc.training.inheritance.templates.Order;

public class B2BOrder extends Order {

	private String companyName;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public String getOrderType() {
		return "B2BOrder";
	}

	@Override
	public String toString() {
		return getOrderType() + " was taken from " + companyName + " with id " + getId() + " on " + getDate()
				+ " on the Value of " + getAmount()+".";
	}

}

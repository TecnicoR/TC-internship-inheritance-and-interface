package com.tc.training.inheritance.templates;

import java.time.LocalDate;

public abstract class Order {
	private Integer id;
	private LocalDate date;
	private Integer amount;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	
	public abstract String getOrderType();
	
}

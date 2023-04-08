package com.tc.training.inheritance.service;

import com.tc.training.inheritance.behaviour.Printer;
import com.tc.training.inheritance.templates.Order;

public class ConsolePrinter implements Printer {

	@Override
	public void print(Order input) {
		System.out.println(input);

	}

}
